// 배열
public class Ex06 {
    public static void main(String[] args) {
        /*
        <배열>
        배열(array) : 같은 자료형의 값 여러 개를 변수 하나로 묶어 관리하는 것

        - 형식
        자료형[] 배열명; << 권장
        자료형 배열명[];

        - 배열 초기화
        1. 선언과 동시에 초기화하기
        : 자료형[] 배열명 = {값1, 값2, ...};
        2. 크기를 지정해 배열을 생성하는 방법으로 new 키워드를 사용한다.
           - 자료형의 기본값으로 초기화된다.
        : 자료형[] 배열명 = new 자료형[배열_크기];
         */

        int[] scoreArray = {80, 90, 100, 70}; // 선언과 동시에 초기화하기
        int[] ScoreArray2 = new int[4]; // 크기를 지정해 배열을 생성하기

        /*
        <접근과 변경>
        배열의 요소(element): 배열의 저장된 값
        인덱스를 사용하여 원하는 요소에 접근한다.
        - 인덱스는 항상 0부터 시작한다. (마지막 인덱스 : 배열의 크기 - 1)
        - 형식
        배열명[인덱스]

        배열의 값 바꾸기
        -형식
        배열명[인덱스] = 새로운_값;

        배열의 크기 : length 속성 사용
         */
        System.out.println("1번 학생의 점수: " + scoreArray[0]); // 접근

        scoreArray[0] = 50; // 값 변경하기
        System.out.println("변경된 1번 학생의 점수 " + scoreArray[0]);


        // 반복문을 사용해 학생 점수를 순서대로 출력하기
        System.out.println("--------------------");
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.println((i + 1) + "번 학생의 점수: " + scoreArray[i]);
        }

        /*
        <이차원 배열>
        선언하기
        1. 선언할 때 직접 값을 넣어 초기화하기
        : 자료형[][] 배열명 = {{값1, 값2, ...}, {값1, 값2, ...}, ...};
        2. 배열 크기로 생성하는 방법으로 new 키워드 사용
        : 자료형[][] 배열명 = new 자료형[행_크기][열_크기];

        접근하기
        - 형식
        배열명[행_인덱스][열_인덱스]
         */
        int[][] arr2 = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int[][] arr3 = new int[3][3];

        // 배열에 값을 저장하고 출력하기
        int x = 1;
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                arr3[i][j] = x;
                x++;
            }
        }
        System.out.println("--------------------");
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        // 이차원 배열로 구구단 프로그램 만들기
        System.out.println("--------------------");
        int[][] gugudan = new int[9][9];
        for (int i = 0; i < 9; i++) {
            System.out.println("< " + (i + 1) + "단 >");
            for (int j = 0; j < 9; j++) {
                gugudan[i][j] = (i + 1) * (j + 1);
                System.out.println((i + 1) + " x " + (j + 1) + " = " + gugudan[i][j]);
            }
        }
    }
}
