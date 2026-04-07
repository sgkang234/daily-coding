package sorting;

// 26.04.06
// 백준 10989
// 수의 범위를 이용해 카운팅 정렬로 빠르게 정렬하는 프로그램

/*
[입력]
10
5
2
3
1
4
2
3
5
1
7

[출력]
1
1
2
2
3
3
4
5
5
7
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10989_SortNumbers3 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            sb.append(arr[i])
                    .append("\n");
        }

        // 출력
        System.out.print(sb);
    }
}
