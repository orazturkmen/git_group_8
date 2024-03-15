package group_meeting.week19;


import java.util.Arrays;

public class MaxNumber {
    public static void main(String[] args) {
        int[] array = {1,5,3,10,500,9,7,45};
        int maxNumber = findMax(array);
        System.out.println("Maximum number: " + maxNumber);

        System.out.println("Maximum number: " + maxNumWithStream1(array));


        System.out.println("Maximum number: " + maxNumWithStream2(array));

    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0]; // Assume the first element is the maximum

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // Update max if a larger element is found
            }
        }
        return max;
    }

    public static int maxNumWithStream1(int[] array){
        return Arrays.stream(array).max()
                .orElseThrow(()->new IllegalArgumentException("Array must not be null or empty"));
    }

    public static int maxNumWithStream2(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        return Arrays.stream(array).reduce(Integer::max).getAsInt();
    }
}
