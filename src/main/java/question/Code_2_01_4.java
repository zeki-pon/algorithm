package question;

import java.util.Scanner;

public class Code_2_01_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[3];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();

        int answer = 1;
        for (int i : A) {
            answer *= i;
        }

        System.out.println(answer);

    }
}
