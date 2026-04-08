package data_structure;

// 26.04.08
// 백준 10816
// 숫자의 등장 횟수를 HashMap으로 저장해 빠르게 개수를 구하는 프로그램

/*
[입력]
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10

[출력]
3 0 0 1 2 0 0 2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _10816_NumberCard2 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        // 입력된 숫자들의 등장 횟수를 map에 누적해서 저장하는 반복문 
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1); // 키 값이 이미 존재하면 값을 가져오고, 없다면 0을 반환하는 코드
        }
        // 입력된 값이 앞서 입력된 값에서 몇번 반복되었는지 확인하는 반복문
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st2.nextToken());
            sb.append(map.getOrDefault(num, 0))
                    .append(" ");
        }

        // 출력
        System.out.println(sb);
    }
}
