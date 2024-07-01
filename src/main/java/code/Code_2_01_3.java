package code;

import java.util.Scanner;

public class Code_2_01_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int answer = 0;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            answer += A[i];
        }

        System.out.println(answer);

    }
}
