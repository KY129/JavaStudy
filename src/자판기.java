// import java.util.Scanner;

// public class 자판기 {

//     public static void main(String[] args) {
//         // 음료 목록과 각 음료의 가격 데이터를 표시
//         String[] 음료 = {"코카콜라", "밀키스", "칠성사이다", "환타", "삼다수"};                         
//         int[] 음료가격 = {2000, 1800, 2100, 1800, 1000};                                             
        
//         // 사용자 입력을 받기 위한 Scanner 객체 생성
//         Scanner scanner = new Scanner(System.in);                                                   
        
//         // 프로그램 시작 인사말 출력
//         System.out.println("안녕하세요! 자판기입니다.");                                            
        
//         // 무한 루프를 사용하여 사용자가 EXIT를 입력할 때까지 반복
//         while (true) {
//             // 음료 목록 출력
//             System.out.println("\n==== 음료 목록 ====");                                           
//             for (int i = 0; i < 음료.length; i++) {
//                 // 각 음료와 가격을 출력
//                 System.out.println((i + 1) + ". " + 음료[i] + " - " + 음료가격[i] + "원");           
//             }
//             // 사용자에게 음료 번호를 입력하도록 안내
//             System.out.println("원하는 음료의 번호를 입력하세요. (종료하려면 EXIT 입력)");

//             // 사용자 입력 받기
//             String 입력 = scanner.nextLine();                                                       
            
//             // 입력이 "EXIT"이면 프로그램 종료
//             if (입력.equalsIgnoreCase("EXIT")) {                                      
//                 System.out.println("프로그램을 종료합니다.");
//                 break;  // while 루프를 종료하여 프로그램을 종료
//             }

//             // 입력된 값이 숫자일 경우 해당 음료를 선택한 것으로 처리
//             int 선택된번호 = Integer.parseInt(입력) - 1;  // 음료 번호는 1부터 시작하므로 배열 인덱스는 0부터 시작           
//             if (선택된번호 >= 0 && 선택된번호 < 음료.length) {
//                 // 유효한 음료 번호가 입력되었을 경우                                                  
//                 System.out.println(음료[선택된번호] + "을 선택하셨습니다.");                    
//                 System.out.println("금액: " + 음료가격[선택된번호] + "원");
//             } else {
//                 // 잘못된 번호를 입력한 경우
//                 System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
//             }
//         }
        
//         // Scanner 객체 닫기 (리소스 해제)
//         scanner.close();
//     }
// }