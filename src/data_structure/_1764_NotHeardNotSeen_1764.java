package data_structure;

// 26.04.08
// 백준 1764
// 듣도 못한 사람과 보도 못한 사람의 교집합을 구하는 프로그램

/*
[입력]
3 4
ohhenrie
charlie
baesangwook
obama
baesangwook
ohhenrie
clinton

[출력]
2
baesangwook
ohhenrie
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1764_NotHeardNotSeen_1764 {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 로직
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            set.add(s);
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if(set.contains(s)){
                list.add(s);
            }
        }
        Collections.sort(list);

        // 출력
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}