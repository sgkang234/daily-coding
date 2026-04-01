package math;

// 2026.03.20
// 백준 8393
// 1부터 n까지 합을 구하는 프로그램

/*
[입력]
3

[출력]
6
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _8393_SumOfN {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+= i;
        }

        // 출력
        System.out.println(sum);
    }
}
