package code;

import java.util.Scanner;

/**
 * １０進法の数値n10をN進法に変換するプログラム
 *
 */
public class Code_2_01_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder answer = new StringBuilder();
        int N = sc.nextInt();
        int n10 = sc.nextInt();

        while (n10 >= 1) {
            answer.insert(0, n10 % N);
            n10 = n10 / N;
        }

        System.out.println(answer);

    }
}
