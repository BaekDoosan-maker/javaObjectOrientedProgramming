import java.util.Arrays;
import java.util.List;

/**
 Quiz. '이'씨 성을 가진 사람들의 수를 세볼려고 합니다. 스트림을 활용해서 코드를 만들어보세요!
 이름 : ["김정우","김호정","이하늘","이정희","박정우","박지현","정우석","이지수"]
 힌트! 다음 Javadoc (자바의 클래스 명세)를 확인하시고 참고해 보세요.
 https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#startsWith-java.lang.String-

 */
public class Stream06_quiz {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");
        System.out.println("이씨성을 가진 친구들: " + names.stream()
                                                    .filter(name -> name.startsWith("이"))
                                                    .count());
    }
}
