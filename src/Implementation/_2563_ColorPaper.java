package Implementation;

// 26.03.30
// 백준 2563
// 색종이 프로그램

import java.util.Scanner;

public class _2563_ColorPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean[][] paper = new boolean[100][100];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 10x10 칠하기
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
        System.out.println(area);
    }
}
