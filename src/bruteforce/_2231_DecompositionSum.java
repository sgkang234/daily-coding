package bruteforce;

// 26.04.05
// 백준 2231
// 어떤 수의 생성자(각 자리수 합을 더해 원래 수가 되는 값)를 찾는 완전탐색 프로그램

/*
[입력]
216

[출력]
198
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231_DecompositionSum {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        for (int i = 1; i < n; i++) {
            int sum = i;
            int temp = i;

            // 자릿수 분해
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == n) {
                System.out.println(i);
                return; // 가장 작은 생성자니까 바로 종료
            }
        }

        // 생성자 없으면 0
        System.out.println(0);
    }
}