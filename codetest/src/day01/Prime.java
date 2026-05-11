package day01;

public class Prime {
    public static void main(String[] args) {
        int answer = 0;
        int[] nums = {1,2,3,4};
        // 3개의 숫자를 선택하는 모든 조합
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    boolean prime = true;

                    for (int n = 2; n < sum; n++) {
                        if (sum % n == 0) {
                            prime = false;
                            break;
                        }
                    }

                    if (prime) {
                        answer++;
                    }
                }
            }
        }

    }
}
