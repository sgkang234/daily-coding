package implementation;

// 26.04.17
// 백준 2475
// 주어진 수들의 제곱의 합을 이용해 검증 수를 구하는 프로그램

/*
[입력]
0 4 2 5 6

[출력]
1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2475_VerificationNumber {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 로직
        int sum = 0;
        for (int i = 0; i <5 ; i++) {
            int num = Integer.parseInt(st.nextToken());
            sum += num * num;
        }
        int result = sum % 10;

        // 출력
        System.out.println(result);
    }
}
