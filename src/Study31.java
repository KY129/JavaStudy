
import java.util.ArrayList;
import java.util.List;

public class Study31 {
    public static void main(String[]args) {
        List<String> list = new ArrayList<>();
        // list.add(1);
        list.add("1");
        // list.add(true);
        list.add("일");
        list.add("one");

        // 문제 영어로 되어 있는 1를 출력하시오.
        System.out.println(list.get(2));


        // 리스트에서 인덱스 1를 삭제 후 영어로 되어 있는 값을 출력하시오.

        list.remove(1);
        System.out.println(list.get(1));
}    
}
