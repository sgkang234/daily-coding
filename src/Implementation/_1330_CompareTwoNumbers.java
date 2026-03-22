package Implementation;

// 26.03.17
// 백준 1330
// 두 수 비교하는 프로그램

import java.util.Scanner;

public class _1330_CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
