import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Reservation implements Reservationy {

    private int lengthOfCode;

    public Reservation(int lengthOfCode) {
        this.lengthOfCode = 8;
    }

    //Also, the DOW is randomly ordered to the bookings from an array.
    //DOW stands for Day of the Week (MON, TUE, etc.)
    @Override
    public String getDowBooking() {


        return String;
    }

    @Override
    public String getCodeBooking() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        StringBuilder sb = new StringBuilder(lengthOfCode);
        for (int i = 0; i < lengthOfCode; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(i));
        }
        return sb.toString();
    }
}
