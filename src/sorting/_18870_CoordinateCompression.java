package sorting;

// 26.04.07
// 백준 18870
// 좌표의 상대적 순서를 이용해 값을 압축하는 프로그램

/*
[입력]
5
2 4 -10 4 -9

[출력]
2 3 0 3 1
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _18870_CoordinateCompression {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        int[] sorted = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sorted[i] = arr[i];
        }

        // 정렬
        Arrays.sort(sorted);

        // 값 → 순서 저장
        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, idx++);
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(map.get(num)).append(" ");
        }
        System.out.println(sb);
    }
}