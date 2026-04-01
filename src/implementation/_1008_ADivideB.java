package implementation;

// 26.03.14
// 백준 1008
// 두 정수 A와 B를 입력 받은 다음, A/B를 출력하는 프로그램

/*
[입력]
1 3

[출력]
0.33333333333333333333333333333333
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1008_ADivideB {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // StringTokenizer 통해 입력된 문자열 한 줄을 통째로 읽고,
        double a = Integer.parseInt(st.nextToken()); // nextToken() 통해 띄어쓰기 기준으로 나눈다.
        double b = Integer.parseInt(st.nextToken());

        // 로직
        double divide = a/b;

        // 출력
        System.out.println(divide);
    }
}
