import java.time.*;

public class DateTimeAPI {
    public static void main(String[] args) {

        System.out.println(LocalDate.now()); // Gives date from System clock
        LocalDate mybirthday=LocalDate.of(2024, 05, 11);
        System.out.println(mybirthday.getDayOfWeek() + " " + mybirthday.getDayOfYear());
        System.out.println(mybirthday.plusMonths(29));
// ---------- LOCAL TIME -----------------------------------
        System.out.println(LocalTime.now()); // Gives time from System clock
        LocalTime timetoday=LocalTime.of(18, 46, 30);
        System.out.println(timetoday);
        System.out.println(timetoday.compareTo(LocalTime.now()));
        System.out.println(LocalTime.parse("15:29:54")); // Converts time in String to time format
        System.out.println(timetoday.plusSeconds(6000));
// ---------- LOCAL DATE TIME -----------------------------------
        System.out.println(LocalDateTime.now()); // Gives time from System clock
        LocalDateTime datetimetoday=LocalDateTime.of(2024, 10, 10, 12, 00);
        System.out.println(datetimetoday);
        System.out.println(datetimetoday.compareTo(LocalDateTime.now()));
        System.out.println(LocalDateTime.parse("2029-07-27T14:00:56"));
     //  ----------- ZONED DATE TIME -----------------------------------
                System.out.println(ZoneId.getAvailableZoneIds());
        ZonedDateTime zonedate= ZonedDateTime.of(2025, 10, 20, 22, 46, 30, 6500,ZoneId.of("America/Tegucigalpa"));
        System.out.println(zonedate);

    }
}
