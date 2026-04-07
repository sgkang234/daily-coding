package sorting;

// 26.04.06
// 백준 1427
// 숫자의 각 자릿수를 내림차순으로 정렬하는 프로그램

/*
[입력]
2143

[출력]
4321
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1427_SortInside {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);

        // 로직
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = n%10;
            n /= 10;
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
        }

        // 출력
        System.out.println(sb);
    }
}
