package introducao;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExemplosComDatas {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getDayOfWeek());

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.getNano());

        LocalDateTime dateTime = LocalDateTime.now();

    }



}
