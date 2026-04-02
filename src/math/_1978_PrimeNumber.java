package math;

// 26.04.01
// 백준 1978
// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램

/*
[입력]
4
1 3 5 7

[출력]
3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1978_PrimeNumber {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 로직
        int count = 0; // 소수의 개수
        // 소수인지 아닌지 확인하는 반복문
        for (int i = 0; i < num; i++) {
            int prime = Integer.parseInt(st.nextToken());
            if (prime == 1) continue;
            boolean isPrime = true;
            for (int j = 2; j <prime; j++) {
                if(prime%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }

        // 출력
        System.out.println(count);
    }
}
