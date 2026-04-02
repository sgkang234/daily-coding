package implementation;

// 26.03.30
// 백준 2738
// N*M 크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램

/*
[입력]
3 3
1 1 1
2 2 2
0 1 0
3 3 3
4 4 4
5 5 100

[출력]
4 4 4
6 6 6
5 6 100
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2738_MatrixAddition {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 행
        int m = Integer.parseInt(st.nextToken()); // 열

        // 로직
        int[][] A = new int[n][m];
        int[][] B = new int[n][m];

        // 첫 번째 행렬 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 두 번째 행렬 입력
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(A[i][j] + B[i][j]).append(" ");
            }
            sb.append("\n");
        }

        // 출력
        System.out.print(sb);
    }
}
