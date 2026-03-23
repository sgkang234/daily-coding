package Implementation;

// 2026.03.22
// 백준 11021
// 두 정수 A, B를 입력받아 Case #x: "를 출력한 다음, A+B를 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11021_APlusB_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #")
                    .append(i + 1)
                    .append(": ")
                    .append(a + b)
                    .append("\n");
        }
        System.out.println(sb);
    }
}
