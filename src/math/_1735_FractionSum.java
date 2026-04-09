package math;

// 26.04.09
// 백준 1735
// 두 분수를 더한 뒤 기약분수로 나타내는 프로그램
/*
a b
c d

a / b + c / d 의 기약분수
*/

/*
[입력]
2 7
3 5

[출력]
31 35
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1735_FractionSum {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());

        // 로직
        int bot = a * d + b * c;
        int top = b * d;
        int gcd = gcd(bot, top);
        bot = bot/gcd;
        top = top/gcd;

        // 출력
        System.out.println(bot + " " + top);
    }
    // 최대공약수 구하는 메서드
    static int gcd(int a, int b){
        while (b !=0 ){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }
}
