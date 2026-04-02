package implementation;

// 26.03.30
// 백준 2563
// 색종이 프로그램

/*
[입력]
3
3 7
15 7
5 2

[출력]
260
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2563_ColorPaper {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] paper = new boolean[100][100];

        // 로직
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 10x10
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    paper[j][k] = true;
                }
            }
        }
        int area = 0;

        // 전체 넓이 계산
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    area++;
                }
            }
        }

        // 출력
        System.out.println(area);
    }
}