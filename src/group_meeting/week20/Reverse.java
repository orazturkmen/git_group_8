package group_meeting.week20;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static List<String> reverse(List<String> list){
        List<String> str = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            str.add(list.get(i));
        }
        return str;
    }
}
