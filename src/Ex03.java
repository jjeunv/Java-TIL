// 기초 문법
public class Ex03 {
    public static void main(String[] args) {
        /*
        <변수>
        자바에서 변수명 지을 때 규칙
        - 대소문자를 구분하고 길이 제한이 없다.
        - 숫자로 시작 x
        - 특수문자는 _와 $만 허용
        - 공백 x
        - 키워드 사용 x

        변수를 선언한다고 바로 메모리 공간이 할당되지 않는다.
        -> 프로그램에서 변수에 데이터를 넣으면 데이터가 변수에 저장되고, 이때 메모리가 할당된다.
        -> 따라서 변수를 초기화해야 메모리가 할당되기에 사용전에는 반드시 초기화가 필요하다.

        자바에서의 코드 작성 규칙
        변수명 : 카멜 표기법 -> 첫 글자는 소문자로 시작하고 첫 단어를 제외한 각 단어의 첫 글자를 대문자로 표기
        클래스명 : 파스칼 표기법 -> 모든 단어의 첫 글자를 대문자로 표기
        */
        int a;
        // System.out.println(a); << 초기화를 안해서 오류 발생
        int b = 10;
        a = 10;
        System.out.println(a);
        System.out.println(b);
        int n1 = 0, n2 = 3; // 여러 변수 한 번에 선언 및 초기화 가능

        /*
        <자료형>
        기본 자료형 : 값을 저장
        - 정수형 : byte(1바이트), short(2), int(4), long(8)
        - 실수형 : float(4), double(8)
        - 문자형 : char(2)
        - 논리형 : boolean(1)

        그 외 -> 참조 자료형 : 값이 저장된 주소를 저장

        타입 추론(type inference) : Java 10부터 자료형을 명시하지 않고 var로 변수를 선언 가능
        - var 사용
        */
        int intNum = 123;
        long longNum = 45678910L; // long일 때 값 뒤에 L 또는 l을 붙여 구분한다.
        float floatNum = 123.4F; // float일 때 값 뒤에 F 또는 f를 붙여 구분한다.
        double doubleNum = 123.4;
        char charTxt = 'a';
        char charNum = '1';
        boolean isTrue = true;
        var c = 10; // 컴파일러가 값을 보고 자료형을 추론해 정수형 변수를 선언한다.

        /*
        <printf()로 서식 지정해서 출력하기>
        형식 : System.out.printf("서식_지정자", 값);
        -> 서식 지정자(형식 지정자)에 정해진 형식에 맞춰 값을 출력한다.
        -> 줄 바꿈 기능이 없어 결과가 한 줄로 출력된다.
        - %d : 정수
        - %f : 실수
        - %c : 문자
        - %s : 문자열
        - %b(논리형 값), %t(시간과 날짜), %n(줄 바꿈), %%(% 기호)
        */
        System.out.println("--------------------");
        System.out.printf("이름: %s%n", "기요미");
        System.out.printf("나이: %d\n", 4);
        System.out.printf("취미: %s", "코딩..\n");
        System.out.printf("이름: %s%n나이: %d\n취미: %s", "기요미", 4, "코딩..\n");
        System.out.printf("%7d%n", 11111); // 오른쪽 정렬, 빈자리 공백 채움
        System.out.printf("%-7d%n", 11111); // 왼쪽 정렬, 빈자리 공백 채움
        System.out.printf("%07d%n", 11111); // 오른쪽 정렬, 빈자리 0 채움
        System.out.printf("%,7d%n", 11111); // 천 단위로 구분 기호 삽입, 빈자리 공백 채움
        System.out.printf("%.4f", 123.45f); // 소수점 이하 자릴수 출력, 빈자리 0 채움

        /*
        <상수와 리터럴>
        상수 : 저장한 값이 바뀌지 않는 변수로 선언 시 final 키워드를 붙인다.
        - 형식 : final 자료형 변수명 = 값;
        - 상수로 선언 시 선언과 동시에 초기화하고 이후 값을 변경할 수 없다.
        - 상수의 이름은 대문자로 작성한다.
        리터럴
        - 변수 선언 시 값을 넣을 때 값을 정확히 표현하면 리터럴(literal)이라고 한다.
        */
        final int START_YEAR = 2025; // 상수 선언
        int number = 123; // 123은 리ㄹ터럴이다.

        /*
        <연산자>
        - 대입 연산자(할당 연산자) '=' :값을 대입
        - 산술 연산자 : +, -, *(곱셈), /(몫), %(나머지)
        - + 연산자 : 문자열에 사용하면 문자열을 하나로 연결하는 기능을 한다.
        */
        System.out.println("\n--------------------");
        System.out.println(100 + 3);
        System.out.println(100 - 3);
        System.out.println(100 * 3);
        System.out.println(100 / 3);
        System.out.println(100 % 3);
        System.out.println("123" + 4);
        int age = 21;
        System.out.println("나는 올해 " + age + "살이야. ");

        /*
        <형변환>
        형변환(type conversion) : 어떤 자료형의 값을 다른 자료형으로 바꾸는 것
        - 형식 : (자료형)변수;

        강제 형변환(명시적 형변환) : 변환할 자료형을 정확히 표시해 형변환하는 것
        - 범위가 큰 자료형에서 범윅가 작은 자료형으로의 변환도 허용하는데 값은 일부 손실될 수 있다.

        자동 형변환(묵시적 형변환) : 바꿀 자료형을 명시하지 않아도 값의 범위를 파악해 자동으로 자료형이 바뀌는 것
        - 범위가 작은 자료형에서 범위가 큰 자료형으로의 변환만 허용
        - 자바 컴파일러에서 자동으로 수행하며 값이 최대한 소실되지 않게 이뤄진다.
         */
        System.out.println("--------------------");
        int d = 100;
        int e = 3;
        float div1 = (float)d / (float)e;
        System.out.println(div1); // float형 변수가 담을 수 있는 값의 크기에 제한이 있기에 6자리까지만 표기
        double div2 = (double)d / (double)e;
        System.out.println(div2); // 15자리까지 표시
    }

}
