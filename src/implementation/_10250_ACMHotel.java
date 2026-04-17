package implementation;

// 26.04.17
// 백준 10250
// 손님 번호에 따라 호텔 방 배정을 규칙대로 계산하는 프로그램

/*
[입력]
2
6 12 10 // 층 수, 각 층의 방의 개수, N번째 손님
30 50 72

[출력]
402
1203
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10250_ACMHotel {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 로직
        StringBuilder sb = new StringBuilder();
        // 전체 반복문
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); // floor
            int W = Integer.parseInt(st.nextToken());// room
            int N = Integer.parseInt(st.nextToken()); // guest

            int floor = 0;
            int room = 0;
            int count = 1; // 0번 방은 없기에

            outer:
            // 호수(1)먼저 돌고 그 다음 층을 바꾼다.
            for (int j = 0; j < W; j++) {
                for (int k = 0; k < H; k++) {
                    if (count == N) {
                        floor = k + 1;
                        room = j + 1;
                        break outer;
                    }
                    count++;
                }
            }

            sb.append(floor * 100 + room).append("\n");
        }

        // 출력
        System.out.println(sb);
    }
}
