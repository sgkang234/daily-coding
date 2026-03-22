package Implementation;

// 26.03.14
// 백준 1008번
// 두 정수 A와 B를 입력 받은 다음, A/B를 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1008_ADivideB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());

        System.out.println(a/b);
    }
}
