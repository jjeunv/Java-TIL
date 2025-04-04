// 조건문

import java.util.Scanner;

public class Ex04 {
    public static <string> void main(String[] args) {
        /*
        비교 연산자 : ==. !=, >, <, >=, <=
        논리 연산자 : &&, ||, !
        삼항 연산자 : 조건의 결과가 true이면 A, false이면 B를 선택
        - 형식 : (조건) ? A : B
         */

        // 입력받은 정수가 짝수면 '짝수', 홀수면 '홀수'라고 출력하기
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // 90점 이상(A), 80점 이상(B), 70점 이상(C), 그 외(D) 학점 출력하기
        System.out.println("--------------------");
        int score = scan.nextInt();
        if (score >= 90) {
            System.out.println("A학점입니다.");
        } else if (score >= 80) {
            System.out.println("B학점입니다.");
        } else if (score >= 70) {
            System.out.println("C학점입니다.");
        } else {
            System.out.println("D학점입니다.");
        }

        // 4학년이 점수가 90점 이상이라면 장학금을 지급할 때 이를 선발하는 코드 작성하기
        System.out.println("--------------------");
        System.out.println("학년을 입력하세요.");
        int grade = scan.nextInt();
        if (grade == 4) {
            System.out.println("점수를 입력하세요.");
            int score2 = scan.nextInt();
            if (score2 >= 90) {
                System.out.println("장학금 지급 대상입니다.");
            } else {
                System.out.println("장학금 지급 대상이 아닙니다.");
            }
        } else {
            System.out.println("장학금 지급 학년이 아닙니다.");
        }

        /*
        숫자를 입력받아 양수인지 확인하고 양수일 경우 홀수라면 '홀수', 짝수라면 '짝수'를 출력합니다.
        양수가 아니라면 양수를 입력하라고 출력합니다.
        */
        System.out.println("--------------------");
        System.out.println("양수를 입력하세요.");
        int num2 = scan.nextInt();
        if (num2 >= 0) {
            if (num % 2 == 0) {
                System.out.println("홀수");
            } else {
                System.out.println("짝수");
            }
        } else {
            System.out.println("양수가 아닙니다. 양수를 입력하세요.");
        }

        // 삼항연산자를 사용하여 90점 이상이면 A학점, 아니면 B학점을 주는 코드를 작성하기
        System.out.println("--------------------");
        System.out.println("점수를 입력하세요");
        int num3 = scan.nextInt();
        System.out.println(num3 >= 90 ? "A학점" : "B학점");

        /*
        알파벳 소문자를 입력받아 대문자로 변환해 출력하는 프로그램을 switch문으로 작성하세요.
        a, b, c 외 다른 문자를 입력받으면 일치하는 알파벳이 없다고 출력하고 switch 문을 종료합니다.
         */
        Scanner scan2 = new Scanner(System.in);
        System.out.println("알파벳 소문자를 입력하세요.");
        String str = scan2.next();
        switch (str){
            case("a"):
                System.out.println("A");
                break;
            case("b"):
                System.out.println("B");
                break;
            case("c"):
                System.out.println("C");
                break;
            default:
                System.out.println("일치하는 알파벳이 없습니다.");
                break;
        }

        scan.close();
        scan2.close();
    }
}