public class E06_CodingHours {
    public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //


        int dailyHours = 6;
        int semesterWeeks = 17;
        int workDays = 5;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println("Attendees spend: " + semesterWeeks * workDays * dailyHours + " hours coding in a semester.");

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int averageWorkHours = 52;
        int weekCoding = dailyHours * workDays;
        System.out.println("The average % of coding hours is: " + (double)weekCoding / averageWorkHours * 100 + "%");

    }
}
