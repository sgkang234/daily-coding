package implementation;

// 26.03.23
// 백준 10871번
// 정수 N개로 이루어진 수열 A와 정수 X가 주어질 때 A에서 X보다 작은 수를 모두 출력하는 프로그램

/*
[입력]
10 5
1 10 4 9 2 3 8 5 7 6

[출력]
1 4 2 3
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10871_LessThanX {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        // 로직
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(a < x){
                sb.append(a).append(" ");
            }
        }

        // 출력
        System.out.println(sb);
    }
}
