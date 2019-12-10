import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Reservation reservation1 = new Reservation();
        Reservation reservation2 = new Reservation();
        Reservation reservation3 = new Reservation();
        Reservation reservation4 = new Reservation();
        Reservation reservation5 = new Reservation();

        List<Reservation> reservation = new ArrayList<>();

        reservation.add(reservation1);
        reservation.add(reservation2);
        reservation.add(reservation3);
        reservation.add(reservation4);
        reservation.add(reservation5);

        for (Reservation r : reservation){
            System.out.printf("Booking# %s for %s\n", r.getCodeBooking(), r.getDowBooking());;
        }


    }
}
