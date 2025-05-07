// import java.util.Scanner;

// public class VendingMachine {
//     public static void main(String[] args) {
//         // 음료와 가격 배열
//         String[] 음료 = {"코카콜라", "밀키스", "칠성사이다", "환타", "삼다수"};
//         int[] 음료가격 = {2000, 1800, 2100, 1800, 1000};

//         // Scanner 객체 생성
//         Scanner scanner = new Scanner(System.in);

//         // 인사말 출력
//         System.out.println("=== 자판기 프로그램 ===");
//         System.out.println("원하시는 음료를 선택하세요. (EXIT 입력 시 종료)");

//         // 프로그램 실행 반복문
//         while (true) {
//             // 메뉴 출력
//             System.out.println("\n=== 메뉴 ===");
//             for (int i = 0; i < 음료.length; i++) {
//                 System.out.println((i + 1) + ". " + 음료[i] + " - " + 음료가격[i] + "원");
//             }
//             System.out.println("EXIT: 프로그램 종료");

//             // 사용자 입력
//             System.out.print("음료 이름을 입력하세요: ");
//             String 입력값 = scanner.nextLine();

//             // 프로그램 종료 조건
//             if (입력값.equalsIgnoreCase("EXIT")) {
//                 System.out.println("프로그램을 종료합니다. 이용해 주셔서 감사합니다.");
//                 break;
//             }

//             // 음료 검색 및 처리
//             boolean 음료존재 = false;
//             for (int i = 0; i < 음료.length; i++) {
//                 if (입력값.equals(음료[i])) {
//                     System.out.println(음료[i] + "를 선택하셨습니다. 가격은 " + 음료가격[i] + "원입니다.");
//                     음료존재 = true;
//                     break;
//                 }
//             }

//             // 음료가 없는 경우 메시지 출력
//             if (!음료존재) {
//                 System.out.println("해당 음료는 자판기에 없습니다. 다시 선택해주세요.");
//             }
//         }

//         // Scanner 자원 해제
//         scanner.close();
//     }
// }