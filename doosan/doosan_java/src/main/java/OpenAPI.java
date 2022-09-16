import retrofit2.Call;

import java.io.IOException;

/**
 네트워킹 - OpenAPI
 SPXMDNJZM ROSUA
 OpenAPI를 활용하는것
 공공데이터 API를 어떻게 활용하는지알아보겠다.
 네트워크의 기본적인 개념
 클라이언트(Client)/ 서버(Server) (컴퓨터간의 관계를 역하로 구분)
  - 서버: 서비스를 제공하는 컴퓨터, 요청에 응답하는 컴퓨터
  - 클라이언트 : 서비스를 사용하게 되는 컴퓨터, 요청을 하는 컴퓨터
  IP : 컴퓨터를 구별하는데 사용되는 고유한 값
    Retrofit 라이브러리를 활용하여 API 호출하기
  왜 Retrofit 라이브러리를 사용해야 할까?
   Retrofit 라이브러리 실습 준비 단계
 Restrofit을 사용하기 위해서는 아래의 3가지 라이브러리가 필요합니다. build.gradle 파일의
 dependencies{} 코드 블럭에 넣어주세요!
 (다른 곳에 구현된 코드를 라이브러리(library)라고 합니다.
 라이브러리는 빌드 도구인 Gradle을 통해서 import 됩니다.
 즉, 우리가 Retrofit 라이브러리를 사용한다고 했으니 필요한 라이브러리를 import 하는것입니다.)

 */

public class OpenAPI {
    public static void main(String[] args) {
        Call<Object> result = RetrofitClient.getApi().getUsers(2);

        try{
            System.out.println(result.execute().body());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
