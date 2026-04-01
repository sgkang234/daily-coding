package implementation;

// 26.03.18
// 백준 2525
// 현재 시간에서 특정 시간을 더하면 몇시인지 맞추는 프로그램

/*
[입력]
14 30
20

[출력]
14 50
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2525_OvenClock {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int addTime = Integer.parseInt(br.readLine());

        // 로직
        int time = ( ((h * 60) + m + addTime) + (24*60))  % (24*60);
        h = time /60;
        m = time %60;

        // 출력
        System.out.print(h + " " + m);
    }
}
