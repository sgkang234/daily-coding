package bruteforce;

// 26.04.05
// 백준 2798
// N과 숫자 M을 입력하고, 둘째 줄에 카드에 쓰여 있는 수를 입력한 뒤 M을 넘지 않으며 M에 가장 가까운 카드 3장의 합을 출력하는 프로그램

/*
[입력]
5 21
5 6 7 8 9

[출력]
21
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2798_Blackjack {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 로직
        int max = 0;
        // 삼중 반복문을 사용해 모든 조합을 탐색
        for (int i = 0; i < n-2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= m && sum > max) {
                        max = sum;
                    }
                }
            }
        }
        // 출력
        System.out.println(max);
    }
}
