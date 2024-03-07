package group_meeting.week18;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("Was it a car or a cat i saw"));
        System.out.println(palindrome("Summer"));
        System.out.println(palindrome("Radar"));
        System.out.println(palindrome(""));

    }

    public static boolean palindrome(String string){
        string = string.toLowerCase().trim().replace(" ", "");
        if (string.isEmpty()) return true;

        String[] array = string.split("");
        String str = "";
        for (int i = array.length - 1; i >= 0; i--) {
            str += array[i];
        }
        if (!string.equals(str)) return false;
        return true;
    }

}
