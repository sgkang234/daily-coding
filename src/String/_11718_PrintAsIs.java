package String;

// 26.03.28
// 백준 5622
// 받은 그대로 출력하며, 빈 문자열이 입력됬을 경우 종료하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11718_PrintAsIs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}