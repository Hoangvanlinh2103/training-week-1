package lab1_easy;

import java.util.*;

class Result {
    public static int designerPdfViewer(List<Integer> h, String word) {
        int maxHeight = 0;
        //duyet từng kí tự trong word
        for (char c : word.toCharArray()) {
            maxHeight = Math.max(maxHeight, h.get(c - 'a')); //tìm chiều cao lớn nhất
        }
        return word.length() * maxHeight; //lay dộ dài mảng x chiều cao nhất
    }
}

public class Solution {
    public static void main(String[] args) {
        //dùng scan thay cho buffedReader
        Scanner sc = new Scanner(System.in);

        List<Integer> h = new ArrayList<>(); // lưu chiều cao
        for (int i = 0; i < 26; i++) h.add(sc.nextInt());

        String word = sc.next();

        int result = Result.designerPdfViewer(h, word);
        System.out.println(result);
        sc.close();
    }
}