package Implementation;

// 2026.03.22
// 백준 11022
// 두 정수 A와 B를 입력받은 다음, 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11022_APlusB_8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
        }
    }
}