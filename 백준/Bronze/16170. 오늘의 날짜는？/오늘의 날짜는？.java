import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Main {
	public static void main (String[] args) {
    	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String[] date = simpleDateFormat.format(Calendar.getInstance().getTime()).split("-");
        System.out.println(date[0]);
        System.out.println(date[1]);
        System.out.println(date[2]);
    }
}