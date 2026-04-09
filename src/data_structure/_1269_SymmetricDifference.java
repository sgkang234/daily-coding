package data_structure;

// 26.04.08
// 백준 1269
// 두 집합의 대칭 차집합의 크기를 구하는 프로그램 (두 배열에서 같은 것을 제한 것의 합)

/*
[입력]
3 5
1 2 4
2 3 4 5 6

[출력]
4
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _1269_SymmetricDifference {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 로직
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(st1.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st2.nextToken());
            if(set.contains(num)){
                set.remove(num);
            } else{
                set.add(num);
            }
        }

        // 출력
        System.out.println(set.size());
    }
}