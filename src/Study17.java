public class Study17 {

public static void main(String[] args) {
    
    for (int i = 1; i <= 9; i++) { // 2단부터 9단까지
        for (int j = 1; j <= 9; j++) { // 각 단의 1~9
            System.out.println(i + " * " + j + " = " + (i * j));
        }
        System.out.println(); // 단 사이에 빈 줄 추가
    }
}
}
