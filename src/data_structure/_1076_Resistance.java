package data_structure;

// 26.04.12
// 백준 1076
// 저항 색깔을 이용해 저항값을 계산하는 프로그램

/*
[입력]
yellow
violet
red

[출력]
4700
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _1076_Resistance {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();

        // 로직
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);

        sb.append(map.get(color1)).append(map.get(color2));
        int num = map.get(color3);
        for (int i = 0; i < num; i++) {
            sb.append("0");
        }
        System.out.println(sb);
    }
}
