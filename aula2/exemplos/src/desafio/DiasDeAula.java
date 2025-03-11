package desafio;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/*
Desafio Extra
    Um curso começa em uma data específica e possui 9 aulas, acontecendo às segundas quartas e sextas-feiras. O desafio é criar um programa em Java que calcule as datas de cada uma das aulas automaticamente.

    Como entrada o programa receberá apenas a data da primeira aula.

    Caso a data da primeira aula não seja um dia válido de aula o programa de ve retornar um erro e interromper o processamento.
 */
public class DiasDeAula {

    public static final int NUMERO_DE_AULAS = 9;
    private static final int NUMERO_DE_DIAS_PARA_PROVA = 15;

    public static void main(String[] args) {

        String dataDeInicio = args[0];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate diaDeAula = LocalDate.parse(dataDeInicio, formatter);
        

        if (!isDiaValido(diaDeAula.getDayOfWeek())) {
            throw new IllegalArgumentException("Aula deve iniciar em Seg, Qua ou Sex");
        }

        List<LocalDate> diasDeAula = new ArrayList<>();

        int count = 1;
        while (count <= NUMERO_DE_AULAS) {
            if (isDiaValido(diaDeAula.getDayOfWeek())) {
                diasDeAula.add(diaDeAula);
                count++;
            }
            diaDeAula = diaDeAula.plusDays(1);
        }

        LocalDate dataDaUltimaAula = diasDeAula.get(NUMERO_DE_AULAS - 1);
        LocalDate diaDaProva = calculaDiaDaProva(dataDaUltimaAula);
        diasDeAula.add(diaDaProva);

        imprimirResultado(diasDeAula, formatter);

    }

    private static LocalDate calculaDiaDaProva(LocalDate localDate) {
        int diasParaAdicionar = localDate.getDayOfWeek() == DayOfWeek.FRIDAY ? (NUMERO_DE_DIAS_PARA_PROVA + 2) : NUMERO_DE_DIAS_PARA_PROVA;
        return localDate.plusDays(diasParaAdicionar);
    }

    private static boolean isDiaValido(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, WEDNESDAY, FRIDAY ->
                true;
            default ->
                false;
        };
    }

    private static void imprimirResultado(List<LocalDate> diasDeAula, DateTimeFormatter formatter) {
            for (int i = 0; i < diasDeAula.size() - 1; i++) {
                System.out.println("Aula" + (i + 1) + " (" + diasDeAula.get(i).format(formatter) + ")");
        }
        System.out.println("Dia da prova (" + diasDeAula.get(diasDeAula.size() - 1).format(formatter) + ")");
    }

}