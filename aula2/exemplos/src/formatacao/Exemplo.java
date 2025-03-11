package formatacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Exemplo {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dateAsString = "13/04/2024";

        LocalDate localDate = LocalDate.parse(dateAsString, formatter);
        System.out.println(localDate);

    }

}
