import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class Reservation implements Reservationy {

    private int numberOfCharacters;

    @Override
    public String getDowBooking() {         // Day Of The Week (MON, THU, WED...)
        List<DayOfWeek> days = new ArrayList<>();

        return days.toString();
    }

    @Override
    public String getCodeBooking() {
        generateCode();
    }
}
