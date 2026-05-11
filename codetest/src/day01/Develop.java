package day01;

import java.util.*;

public class Develop {

    public static void main(String[] args) {

     int[] a = {93, 30, 55};
     int[] speed = {1,30,5};

     var test =solution(a, speed);

     for (var i : test) {
         System.out.println(i);
     }

    }

    public static int[] solution(int[] progresses, int[] speeds){
        int[] answer = new int[100];


        Queue<Integer> queue = new ArrayDeque<>();


        int a = 0;
        int index =0;
        for(int i = 0; i < progresses.length; i++){

           int remain = 100 - progresses[i];

           var time = Math.round(remain/speeds[i]);

            if(i ==0){
                a = time;
                answer[index] = 1;
            }
            else
            {
                if(a >= time){
                    answer[index]++;
                }
                else{

                    a = time;
                    index++;
                    answer[index] = 1;

                }
            }

        }



        return Arrays.stream(answer)
                .filter(value -> value != 0)
                .toArray();
    }
}
