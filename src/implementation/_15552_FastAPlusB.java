package implementation;

// 2026.03.20
// 백준 15552
// StringBuilder를 사용해 더 빠르게 처리하는 프로그램

/*
[입력]
3
1 1
12 34
5 500


[출력]
2
46
505
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15552_FastAPlusB {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append('\n');
        }

        // 출력
        System.out.println(sb);
    }
}
