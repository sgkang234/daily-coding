package data_structure;

// 26.04.08
// 백준 14425
// 문자열 집합을 만들어 특정 문자열이 존재하는지 개수를 세는 프로그램

/*
[입력]
5 11
baekjoononlinejudge
startlink
codeplus
sundaycoding
codingsh
baekjoon
codeplus
codeminus
startlink
starlink
sundaycoding
codingsh
codinghs
sondaycoding
startrink
icerink

[출력]
4
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class _14425_StringSet {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 로직
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        int count = 0;

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(set.contains(s)){
                count++;
            }
        }

        // 출력
        System.out.println(count);
    }
}