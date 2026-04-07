package sorting;

// 26.04.07
// 백준 1181
// 단어를 길이순으로 정렬하고, 길이가 같으면 사전순으로 정렬하는 프로그램

/*
[입력]
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours

[출력]
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1181_WordSort {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>(); // 중복을 허용하지 않기에
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        // 로직
        String[] arr = set.toArray(new String[0]);
        Arrays.sort(arr, (a, b) -> {
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        // 출력
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s).append('\n');
        }
        System.out.print(sb);
    }
}