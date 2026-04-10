package math;

// 26.04.10
// 백준 1929
// 주어진 범위에서 소수를 모두 구하는 프로그램

/*
[입력]
3 16

[출력]
3
5
7
11
13
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1929_PrimeRange {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int last = Integer.parseInt(st.nextToken());

        // 로직
        boolean[] isPrime = new boolean[last + 1];
        Arrays.fill(isPrime, true);
        // 0과 1은 소수가 아님
        isPrime[0] = isPrime[1] = false;

        // 에라토스테네스의 체
        // i * i <= N 까지만 확인해도 충분
        for (int i = 2; i*i <= last; i++) {
            if (isPrime[i]) {
                // j += i를 통해 i의 배수만 false로
                for (int j = i * i; j <= last; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = first; i <= last; i++) {
            if (isPrime[i]) {
                sb.append(i).append('\n');
            }
        }

        // 출력
        System.out.print(sb);
    }
}
