package data_structure;

// 26.04.08
// 백준 1620
// 이름과 번호를 서로 빠르게 찾기 위해 HashMap을 사용하는 프로그램

/*
[입력]
26 5
Bulbasaur
Ivysaur
Venusaur
Charmander
Charmeleon
Charizard
Squirtle
Wartortle
Blastoise
Caterpie
Metapod
Butterfree
Weedle
Kakuna
Beedrill
Pidgey
Pidgeotto
Pidgeot
Rattata
Raticate
Spearow
Fearow
Ekans
Arbok
Pikachu
Raichu
25
Raichu
3
Pidgey
Kakuna

[출력]
Pikachu
26
Venusaur
16
14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _1620_PokemonMaster {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 로직
        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[N + 1];
        // 도감 입력
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, i);
            arr[i] = name;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            // 숫자인지 판별
            if (Character.isDigit(input.charAt(0))) {
                int num = Integer.parseInt(input);
                sb.append(arr[num]).append("\n");
            } else {
                sb.append(map.get(input)).append("\n");
            }
        }

        // 출력
        System.out.print(sb);
    }
}
