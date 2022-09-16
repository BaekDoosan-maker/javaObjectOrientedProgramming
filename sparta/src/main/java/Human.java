/**
 * 퀴즈 : 객체지향
 * 요구사항
 * 1. 사람은 자식, 부모님, 조부모님이 있다.
 * 2. 모든 사람은 이름, 나이 , 현재 장소정보 (x,y좌표)가 있다.
 * 3. 모든 사람은 걸을 수 있다. 장소(x,y좌표)로 이동한다.
 * 4.자식과 부모님은 뛸 수 있다. 장소(x,y좌표)로 이동한다.
 * 5. 조부모님의 기본속도는 1이다. 부모의 기본속도는 3, 자식의 기본 속도는 5이다.
 * 6. 뛸때는 속도가 기본속도 대비 +2 빠르다.
 * 7. 수영할때는 속도가 기본속도대비 +2 빠르다.
 * 8. 자식만 수영을 할 수 있다. 장소(x,y좌표)로 이동한다.
 * 위 요구사항을 만족하는 클래스들을 바탕으로, Main함수를 다음 동작을 출력(System.out.println)하며 실행하도록 작성하시오.
 * 이동하는 동작은 각자 순서가 맞아야 합니다.
 * 1. 모든 종류의 사람의 인스턴스트 1개씩 생성한다.
 * 2. 모든 사람의 처음 위치는 x,y 좌표가 (0,0)이다.
 * 3. 모든 사람의 이름, 나이 속도, 현재위치를 확인한다.
 * 4. 걸을수 있는 모든 사람이 (1,1) 위치로 걷는다.
 * 5. 뛸수 있는 사람은 (2,2)로 뛰어간다.
 * 6. 수영할 수 있는 모든 살마은 (3,-1) 위치로 수영해서 간다.
 **/

public class Human {
    String name;
    int age;
    int speed;
    int x, y;

    public Human(String name, int age, int speed, int x, int y) {
        this.name = name;
        this.age = age;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public Human(String name, int age, int speed) {
        this(name, age, speed, 0, 0);
    }

    public String getLocation() {
        return "(" + x + "," + y + ")";
    }

    protected void printWhoAmI() {
        System.out.println("My name is " + name + "," + age + "aged.");

    }
}


