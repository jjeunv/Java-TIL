// 반복문

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        /*
        <for 문>
        - 형식
        for(초깃값; 조건식; 증감식){
            실행문; // 반복 실행할 명령문
        }
        - 증감 연산자 : i++, i--, ++i, --i
        */

        // 1부터 10까지 출력하는 코드 작성하기
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // 1부터 100까지의 합 구하기
        System.out.println("--------------------");
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 구구단 3단을 출력하는 코드 작성하기
        System.out.println("--------------------");
        for (int i = 1; i < 10; i++) {
            System.out.println("3 x " + i + " = " + 3 * i);
        }

        // 2단부터 9단까지 출력하기
        System.out.println("--------------------");
        for (int i = 2; i < 10; i++) {
            System.out.println("< " + i + "단 >");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }

        /*
        <while 문>
        - 형식
        while(조건식){
            실행문; // 반복 실행할 명령문
        }
        */

        // 1부터 10까지 출력하기
        System.out.println("--------------------");
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        // 2단부터 9단까지 출력하기
        System.out.println("--------------------");
        int dan = 2;
        while (dan <= 9) {
            System.out.println("< " + dan + "단 >");
            int n = 1;
            while (n <= 9) {
                System.out.println(dan + " x " + n + " = " + dan * n);
                n++;
            }
            dan++;
        }

        /*
        <do-while 문>
        - 형식
        do{
            실헹문;
        } while(조건식);
        - 조건을 만족하지 않아도 중괄호 안 명령문을 무조건 한 번은 실행한다.
        - 어떤 명령을 한 번 수행한 후 반복 여부를 결정할 때 주로 사용
         */

        // 구구단 3단을 출력하기
        System.out.println("--------------------");
        int num2 = 1;
        do {
            System.out.println("3 x " + num2 + " = " + 3 * num2);
            num2++;
        } while (num2 <= 9);

        /*
        <무한 반복문>
        - for문으로 무한 반복문을 만들 때에는 소괄호 안에 세미콜론만 남긴다.
            - for(;;) { }
        - while문의 조건식에 true(boolean 값)를 넣으면 항상 조건이 참이므로 무한 반복한다.

        <반복문 탈출하기>
        - break : 조건과 상관없이 반복문을 탈출한다.
        - continue : 반복문을 탈출하지 않고 특정 구간만 건너뛴다.
         */

        // 숫자를 입력받아 더한 후 결과를 출력하다가 더한 값이 10,000을 넘으면 종료하는 프로그램 만들기
        System.out.println("--------------------");
        Scanner scan = new Scanner(System.in);
        int sum2 = 0;
        for (; ; ) {
            System.out.print("숫자를 입력하세요 -> ");
            int n = scan.nextInt();
            sum2 += n;
            System.out.println("결과: " + sum2);
            if (sum2 > 10000) {
                break;
            }
        }
        System.out.println("반복문을 탈출했습니다.");

        // 위의 프로그램에서 입력값이 짝수일 때만 값을 더하는 조건을 추가하기
        System.out.println("--------------------");
        int sum3 = 0;
        while (true) {
            System.out.print("숫자를 입력하세요 -> ");
            int n2 = scan.nextInt();
            if (n2 % 2 != 0) {
                System.out.println("홀수입니다. 짝수를 입력해 주세요.");
                continue;
            }
            sum3 += n2;
            System.out.println("결과: " + sum3);
            if (sum3 > 10000) {
                break;
            }
        }
        System.out.println("반복문을 탈출했습니다.");

        // 구구단 프로그램 만들기 (0을 입력받으면 종료)
        System.out.println("--------------------");
        System.out.println("구구단 프로그램을 시작합니다.");
        System.out.println("종료하려면 0을 입력하세요");
        while (true) {
            System.out.println("몇 단을 출력할까요?");
            int input = scan.nextInt();
            if (input == 0) {
                break;
            }
            for (int i = 1; i < 10; i++) {
                System.out.println(input + " x " + i + " = " + input * i);
            }
        }
        System.out.println("구구단 프로그램을 종료합니다.");
    }
}
