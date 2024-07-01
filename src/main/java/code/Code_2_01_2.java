package code;

import java.util.Scanner;

public class Code_2_01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        int n3 = sc.nextInt();
//        System.out.println(n1 + n2 + n3);

        int[] a = new int[3];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();

        int result = 0;
        for (int i : a) {
            result += i;
        }
        System.out.println(result);
    }
}
