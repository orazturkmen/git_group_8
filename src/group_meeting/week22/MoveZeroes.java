package group_meeting.week22;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,5,0,7,0};

        System.out.println(Arrays.toString(moveZero(new int[]{0,1,0,4,6,0})));
        System.out.println(Arrays.toString(moveZero(arr)));
        System.out.println(Arrays.toString(moveZero(new int[]{0,1,0,3,12})));
        System.out.println("*************************************************");

        int[] a = {0,1,0,7,0,5,0};
        moveZero2(a);
        System.out.println(Arrays.toString(a));

    }
    public static int[] moveZero(int[] array){
        int left = 0, right = array.length-1;
        int[] arr = new int[array.length];
        for (int j : array) {
            if (j != 0) {
                arr[left] = j;
                left++;
            } else {
                arr[right] = 0;
                right--;
            }
        }
        return arr;
    }

    public static void moveZero2(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                if (i != index) {
                    nums[i] = 0;
                }
                index++;
            }
        }
        }
}
