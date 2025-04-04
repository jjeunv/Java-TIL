// 입출력 다루기

import java.io.IOException;
import java.util.Scanner;

/*
System 클래스
자바 프로그램은 JVM 위에서 실행되기 때문에 프로그램에서 직접 운영체제에 접근할 수 없다.
-> 프로그램에서 운영체제의 기능인 키보드 입력, 화면 출력 등을 사용하려면 연결 고리가 필요하다.
-> 자바에서는 System 클래스가 이 연결 고리를 담당한다.
-> 입출력도 운영체제의 기능이므로 출력 명령어 앞에 System 클래스를 연결해 사용한다.
*/
public class Ex02 {
    public static void main(String[] args) throws IOException {
        /*
        출력 시 소괄호 안 내용이 하나로 합쳐져서 출력된다.
        print() 명령어가 내용을 출력한 후 줄을 바꾸지 않기 때문
        -> 개행 문자를 사용하여 줄 바꿈
         */
        System.out.print("Hello");
        System.out.print("Java");
        System.out.print("\nHello\n");
        System.out.print("Java\n");

//  ---------------------------------------
        /*
        println() 명령어는 출력하고 자동으로 줄을 바꾼다.
        ln: line, println : '프린트라인'
        가독성이 좋기에 print()보다 println()을 주로 사용한다.
         */
        System.out.println("Hello");
        System.out.println("Java");

//  ---------------------------------------
        /*
        System.in.read() : 키보드로 값을 입력받으라는 뜻
        -> 코드 작성 시 'Unhandled exception: java.io.IOException : 예외 처리를 하지 않았다는 뜻
        -> 'import java.io.Exception;', 'throws IOException' 두개의 예외 처리 코드를 추가하여 해결

        read() : 1바이트만 읽어오고 이를 아스키코드로 받는다.
        -> (char)를 추가하면 입력한 그대로 출력된다. (숫자 1 -> 문자 1 변환)
        System.out.println((char)System.in.read());
        -> read() 대신 주로 Scanner 클래스를 사용
         */
        // System.out.println(System.in.read()); // 1 입력 결과와 123 입력 결과가 같다.
        // 아래 코드 실행을 위해 주석 처리

//  ---------------------------------------
        /*
        자바는 입출력이 스트림을 통해 이루어진다.
        - 스트림(stream) : 입출력 장치와 프로그램을 연결하는 통로
        -> 입력 장치로 입력한 값은 입력 스트림을 통해, 프로그램을 실행한 결과는 출력 스트림을 통해 출력 장치에 표시된다.
        -> 스트림은 한 방향으로만 전달 가능하기에 입력/출력 스트림이 따로 존재한다.
        - 입력 스트림 : System.in
        - 출력 스트림 : System.out

        Scanner 클래스 : 다양한 형태의 값을 입력받을 수 있다.
        - 값을 저장할 변수가 필요
        - Scanner 클래스가 다른 패키지에 있기에 'import java.util.Scanner;' 필요
        - nextLine() : 값을 한 줄 단위로 입력받을 수 있다.
        - next() : 입력받은 내용 중 공백 문자 전까지만 출력
        - nextInt() : 정수만 입력받아 문자나 문자열을 입력하면 오류 발생
        - close() : 입력 스트림을 닫지 않으면 계속해서 자원을 사용하는 상태가 되어 메모리가 낭비되기에 사용이 끝나면 닫아준다.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine()); // '안녕하세요' 입력 -> 한 줄 단위, 즉 Enter를 누를 때까지 내용을 입력받는다.
        System.out.println(scan.next()); // 'Hello Java' 입력 -> 공백 문자 전인 'Hello'만 출력
        scan.close(); // 입력 스트림 닫기
    }
}
