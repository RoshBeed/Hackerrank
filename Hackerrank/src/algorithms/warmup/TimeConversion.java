package algorithms.warmup;

import java.util.*;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        in.close();
        System.out.println(ConvertTo24H(time));
    }
    public static String ConvertTo24H(String time) {
        String[] time_parts = time.substring(0, time.length() - 2).split(":"); 
        int hours = Integer.parseInt(time_parts[0]);
        String meridiem = time.substring(time.length() -2);
        if (meridiem.equals("PM") && hours < 12)
            time_parts[0] = Integer.toString(hours +  12);
        else if (meridiem.equals("AM") && hours == 12)
            time_parts[0] = "00";
        return time_parts[0] + ":" + time_parts[1] + ":" + time_parts[2];        
    }
}
