package lab4_medium;

import java.util.*;
import java.math.BigInteger;

class Result {
    public static void extraLongFactorials(int n) {

        // Khởi tạo BigInteger với giá trị 1
        BigInteger factorial = BigInteger.ONE;

        // Vòng lặp tính giai thừa từ 1 đến n
        for (int i = 1; i <= n; i++) {
            // Nhân dồn và gán lại vào biến factorial
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorial);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập số nguyên n
        int n = sc.nextInt();

        // gọi hàm tính và in giai thừa
        Result.extraLongFactorials(n);

        sc.close();
    }
}