package desafio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DiasDeAulaFP {

    public static void main(String[] args) {
        int dia = Integer.parseInt(args[0]);
        int mes = Integer.parseInt(args[1]);
        int ano = Integer.parseInt(args[2]);

        LocalDate dataAula = LocalDate.of(ano, mes, dia);

        Predicate<DayOfWeek> isDiaValido = dayOfWeek -> switch (dayOfWeek) {
            case FRIDAY, MONDAY, WEDNESDAY -> true;
            default -> false;
        };

        if (!isDiaValido.test(dataAula.getDayOfWeek())) {
            throw new IllegalArgumentException("A data inicial não é um dia válido de aula.");
        }

        AtomicInteger count = new AtomicInteger(1);

        Stream.iterate(dataAula, date -> date.plusDays(1))
                .filter(date -> isDiaValido.test(date.getDayOfWeek()))
                .limit(9)
                .forEachOrdered(date -> System.out.println("Aula" + count.getAndIncrement() + " (" + date + ")"));
    }
}
