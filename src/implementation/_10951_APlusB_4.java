package implementation;

// 26.03.23
// 백준 10951
// 두 정수 A와 B를 입력 받은 다음, A+B를 출력하는 프로그램

/*
[입력]
1 1
2 3
3 4

[출력]
2
5
7
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10951_APlusB_4 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 로직
        String line;
        while ((line = br.readLine()) != null) { // 입력된 값이 null일 경우 반복문 종료
            StringTokenizer st = new StringTokenizer(line);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");
        }

        // 출력
        System.out.print(sb);
    }
}
