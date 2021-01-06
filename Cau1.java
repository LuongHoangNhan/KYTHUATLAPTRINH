package LuongHoangNhan_IT20A3B;

import java.util.Scanner;


public class Cau1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số cần kiểm tra n:");
        n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn!");
        } else {
            System.out.println(n + " là số lẻ");
        }
    }
}

