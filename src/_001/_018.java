package _001;

// 26.03.18
// 백준 2525
// 오븐 시계, 현재 시간에서 특정 시간을 더하면 몇시인지 맞추는 프로그램

import java.util.Scanner;

public class _018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int addTime = scanner.nextInt();

        int time = ( ((h * 60) + m + addTime) + (24*60))  % (24*60);
        h = time /60;
        m = time %60;
        System.out.println(h);
        System.out.println(m);
    }
}
