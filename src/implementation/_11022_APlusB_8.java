package implementation;

// 2026.03.22
// 백준 11022
// 두 정수 A와 B를 입력받은 다음, 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력하는 프로그램

/*
[입력]
2
1 1
2 3

[출력]
Case #1: 1 + 1 = 2
Case #2: 2 + 3 = 5
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11022_APlusB_8 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i)
                    .append(": ")
                    .append(A).append(" + ").append(B)
                    .append(" = ")
                    .append(A + B)
                    .append('\n');
        }

        // 출력
        System.out.println(sb);
    }
}