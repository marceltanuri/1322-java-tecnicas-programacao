package desafio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DiasDeAulaFP {

    public static final int NUMERO_DE_AULAS = 9;
    private static int count = 1;

    public static void main(String[] args) {
        int dia = Integer.parseInt(args[0]);
        int mes = Integer.parseInt(args[1]);
        int ano = Integer.parseInt(args[2]);

        LocalDate dataInicial = LocalDate.of(ano, mes, dia);

        Predicate<DayOfWeek> isDiaValido = dayOfWeek ->
                switch (dayOfWeek) {
                    case FRIDAY, MONDAY, WEDNESDAY -> true;
                    default -> false;
                };

        if (isDiaValido.negate().test(dataInicial.getDayOfWeek())) {
            throw new IllegalArgumentException("A data inicial não é um dia válido de aula.");
        }

        Stream.iterate(dataInicial, x -> count <= NUMERO_DE_AULAS, date -> date.plusDays(1))
                .filter(date -> isDiaValido.test(date.getDayOfWeek()))
                .forEach(date -> System.out.println("Aula" + next() + " (" + date + ")"));
    }

    private static int next() {
        return count++;
    }
}
