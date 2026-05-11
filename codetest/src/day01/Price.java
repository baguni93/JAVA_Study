package day01;

import java.util.Arrays;

public class Price {

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = new int[prices.length];
        for(int i = 0 ; i < prices.length; i++) {
            int check = 0;
            for (int j = i + 1; j < prices.length; j++) {


                check++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            answer[i]= check;
        }

        System.out.println(Arrays.toString(answer));

    }

}
