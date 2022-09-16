import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.List;

class Sale {
    String fruitName;
    int price;
    float discount;

    public Sale(String fruitName, int price, float discount) {
        this.fruitName = fruitName;
        this.price = price;
        this.discount = discount;
    }
}

public class Stream04 {
    public static void main(String[] args) {
        List<Sale> sales = Arrays.asList(
                new Sale("Apple",5000,0.05f),
                new Sale("Orange",4000,0.2f),
                new Sale("Grape",2000,0)
        );
        sales.stream()
                .map(sale-> Pair.of(sale.fruitName,sale.price*(1-sale.discount)))
                .forEach(pair -> System.out.println(pair.getLeft() + " 실구매가: " + pair.getRight() + "원 입니다."));
        /**
         그래서 이렇게 클래스를 활용해서 내가 원하는 형식으로
         이 스트림 안에서 자유롭게 형변환 할 수도 있고
         다른 타입으로 바꿀 수 있고, 계산까지도 할 수 있습니다.
         */
    }
}