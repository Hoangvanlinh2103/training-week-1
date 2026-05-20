package lab2_easy;

import java.util.*;

class Result {
    //bill danh sách món ăn, k là món ana k ăn, b là số tiền tính cho ana
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;

        for (int price : bill) {
            total += price;
        }

        int actual = (total - bill.get(k)) / 2; //lấy tổng tiền - k(món ana k ăn) / 2
        //kiểm tra
        if (actual == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actual);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> bill = new ArrayList<>();
        for (int i = 0; i < n; i++) bill.add(sc.nextInt()); //đọc giá món ăn và add vô danh sách

        int b = sc.nextInt();

        Result.bonAppetit(bill, k, b);
        sc.close();
    }
}