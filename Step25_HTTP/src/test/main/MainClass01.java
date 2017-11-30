package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainClass01 {
	public static void main(String[] args) throws IOException {
		System.out.println("메인 시작");
		String requestUrl="http://192.168.0.82/index.html";
		URL url=null;
		//URLConnection은 HttpURLConnection의 부모타입
		HttpURLConnection conn=null;
		
		try {
			//요청 URL 객체 생성
			url=new URL(requestUrl);
			conn=(HttpURLConnection)url.openConnection();
            conn.setConnectTimeout(10000); //세션 지속 시간
            conn.setDoOutput(true); //데이터를 전송할수 있도록
            conn.setRequestMethod("GET"); //get 방식으로 전송하기 위해
            conn.setDefaultUseCaches(false); //캐시 노사용

            int responseCode=conn.getResponseCode(); //반드시 써줘야한다.
            System.out.println("응답코드: "+responseCode);
            //서버에서 출력하는 문자열을 누적시킬 객체
            StringBuilder builder=null;
            
            //단일 서버가 성공적으로 응답했다면 
            if(responseCode==HttpURLConnection.HTTP_OK){
                builder=new StringBuilder(); //객체 생성
                //InputStreamReader 객체 얻어오기
                InputStreamReader isr=
                        new InputStreamReader(conn.getInputStream());	
                BufferedReader br=new BufferedReader(isr);
                //반복문 돌면서 읽어오기
                while(true){
                    String line=br.readLine();
                    if(line==null)break;
                    //읽어온 문자열을 객체에 저장
                    builder.append(line+"\r\n");
                }
                isr.close();
                br.close();
            }
            //응답은 모든 문자열을 String 타입으로 받기
            String resultMsg=builder.toString();
            System.out.println(resultMsg);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} finally {
			if(conn!=null)conn.disconnect();
		}
	}
}
