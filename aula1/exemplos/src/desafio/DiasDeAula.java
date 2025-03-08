package desafio;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
Desafio Extra
    Um curso começa em uma data específica e possui 9 aulas, acontecendo às segundas quartas e sextas-feiras. O desafio é criar um programa em Java que calcule as datas de cada uma das aulas automaticamente.

    Como entrada o programa receberá apenas a data da primeira aula.

    Caso a data da primeira aula não seja um dia válido de aula o programa de ve retornar um erro e interromper o processamento.
*/
public class DiasDeAula {
    public static final int NUMERO_DE_AULAS = 9;

    //obter entrada:
    // Scanner uma unica entrada, separar por split
    // Scanner 3x pedindo um param por vez
    // String args[] recebi por param do terminal

    // Verificar se é um dia valido? seg, qua, sex
    // throw IllegalArgumentException

    // dias de aula = 9

    // encontrar as datas dentro dos dias de aula (seg, qua, sex)

    // dataAula + 1 dia, verificar se é um dia valido (seg, qua, sex)

    // se valido, imprime
    // senao, +1 tenta de novo

    // loop i até


    //"07 03 2025"
    //["07", "03", "2025"]
    public static void main(String[] args) {

        int dia = Integer.parseInt(args[0]);
        int mes = Integer.parseInt(args[1]);
        int ano = Integer.parseInt(args[2]);

        LocalDate diaDeAula = LocalDate.of(ano, mes, dia);

        if(!isDiaValido(diaDeAula.getDayOfWeek())){
            throw new IllegalArgumentException("Aula deve iniciar em Seg, Qua ou Sex");
        }

        int count = 1;

        while (count<= NUMERO_DE_AULAS){
            if(isDiaValido(diaDeAula.getDayOfWeek())){
                System.out.println("Aula"+count + " (" + diaDeAula + ")");
                count++;
            }
            diaDeAula = diaDeAula.plusDays(1);
        }
    }

    private static boolean isDiaValido(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case MONDAY, WEDNESDAY, FRIDAY -> true;
            default -> false;
        };
    }

}