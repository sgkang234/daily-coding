package implementation;

// 26.03.19
// 백준 10950
// 각 값을 더하는 프로그램

/*
[입력]
5
1 1
2 3
3 4
9 8
5 2

[출력]
2
5
7
17
7
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class _10950_APlusB_3 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b)
                    .append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}