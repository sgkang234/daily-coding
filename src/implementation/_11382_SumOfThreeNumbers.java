package implementation;

// 26.03.16
// 백준 11382
// A+B+C를 출력 (1 ≤ A, B, C ≤ 10^12) 하는 프로그램

/*
[입력]
77 77 7777
[출력]
7931
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11382_SumOfThreeNumbers {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        // 로직
        long sum = a+b+c;

        // 출력
        System.out.println(sum);
    }
}
