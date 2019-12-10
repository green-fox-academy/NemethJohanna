public class Reservation implements Reservationy {

    private int lengthOfCode;

    public Reservation() {
        this.lengthOfCode = 8;
    }

    @Override
    public String getDowBooking() {
        int nrOfDays = (int) (Math.random() * 7);
        String name = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"}[nrOfDays];
        return name;
    }

    @Override
    public String getCodeBooking() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
        StringBuilder sb = new StringBuilder(lengthOfCode);
        for (int i = 0; i < lengthOfCode; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }
}
