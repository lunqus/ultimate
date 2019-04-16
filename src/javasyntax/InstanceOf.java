package javasyntax;

import java.util.Calendar;

public class InstanceOf {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1972);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DATE, 21);
        calendar.set(Calendar.HOUR, 22);
        calendar.set(Calendar.MINUTE, 10);


        System.out.println(calendar.getTimeInMillis());


    }
}
