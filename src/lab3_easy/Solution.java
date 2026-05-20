package lab3_easy;

import java.util.*;

class Result {
    public static List<Integer> breakingRecords(List<Integer> scores) {

        int maxRecord = scores.get(0); //lấy điểm đầu tiên làm kỉ lục cao nhất
        int minRecord = scores.get(0); //lấy điểm đầu tiên làm kỉ lục thấp nhất
        int maxCount = 0;
        int minCount = 0;

        for (int i = 1; i < scores.size(); i++) {

            int score = scores.get(i);

            if (score > maxRecord) {
                maxCount++;
            }
            if (score < minRecord) {
                minCount++;
            }
            maxRecord = Math.max(maxRecord, score);
            minRecord = Math.min(minRecord, score);
        }

        return Arrays.asList(maxCount, minCount);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nhập số lượng game
        int n = sc.nextInt();

        // nhập danh sách điểm
        List<Integer> scores = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scores.add(sc.nextInt());
        }

        List<Integer> result = Result.breakingRecords(scores);

        // in kết quả
        System.out.println(result.get(0) + " " + result.get(1));

        sc.close();
    }
}