---
marp: true
theme: default
class:
  - lead
  - invert 
style: |
  table {
    font-size: 0.95em;
  }
---

# **Aula 1: Datas com Java**
## Turma 1322
### Professor(a): Marcel Tanuri
### Data: 07/03

---
## **Introdução**
### 📅 Por que trabalhar com datas em Java?
- Aplicações frequentemente precisam manipular datas e horários.
- Agendamento de eventos, logs, cálculos de diferença entre datas.
- Antes do Java 8, a manipulação de datas era feita com `java.util.Date` e `java.util.Calendar`, que apresentavam limitações.
- O pacote `java.time` introduziu uma API mais robusta e intuitiva para lidar com datas.

---
## **Classes Principais do `java.time`**
### 📌 Classes fundamentais:
- `LocalDate` → Representa uma data sem horário.
- `LocalTime` → Representa apenas um horário.
- `LocalDateTime` → Combina data e horário.
- `ZonedDateTime` → Inclui fuso horário.
- `Period` → Calcula diferença entre datas em anos, meses e dias.
- `Duration` → Mede tempo entre instantes (horas, minutos, segundos).

---
## **Exemplo: Criando Datas**
### 📝 Código básico para criar e exibir datas:
```java
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DatasJava {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();
        LocalDateTime dataHoraAtual = LocalDateTime.now();

        System.out.println("Data Atual: " + dataAtual);
        System.out.println("Hora Atual: " + horaAtual);
        System.out.println("Data e Hora Atual: " + dataHoraAtual);
    }
}
```

---
## **Manipulação de Datas**
### 📌 Como modificar datas?
- Adicionar ou remover dias, meses, anos:

```java
LocalDate hoje = LocalDate.now();
LocalDate futuro = hoje.plusDays(10);
LocalDate passado = hoje.minusMonths(2);
System.out.println("Data atual: " + hoje);
System.out.println("10 dias depois: " + futuro);
System.out.println("2 meses antes: " + passado);
```

---
## **Comparação de Datas**
### 📌 Como comparar datas em Java?
- Métodos como `isBefore()`, `isAfter()`, `isEqual()`

```java
LocalDate data1 = LocalDate.of(2024, 3, 7);
LocalDate data2 = LocalDate.of(2024, 3, 10);

System.out.println("data1 é antes de data2? " + data1.isBefore(data2));
System.out.println("data1 é depois de data2? " + data1.isAfter(data2));
System.out.println("As datas são iguais? " + data1.isEqual(data2));
```

---

## **Exemplo: Diferença entre Datas com `Period`**
### 📝 Calculando idade e diferença entre datas:
```java
import java.time.LocalDate;
import java.time.Period;

public class DiferencaDatas {
    
    public static void main(String[] args) {
        
        LocalDate dataNascimento = LocalDate.of(2000, 3, 6);
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        
        System.out.println("Idade: " + periodo.getYears() 
            + " anos, " + periodo.getMonths() 
            + " meses e " + periodo.getDays() + " dias");
    }
}
```

---
## **Exemplo: Diferença entre Horários com `Duration`**
### 📝 Calculando intervalo de tempo entre horários:
```java
import java.time.LocalTime;
import java.time.Duration;

public class DiferencaHoras {
    
    public static void main(String[] args) {
        
        LocalTime inicio = LocalTime.of(14, 30);
        LocalTime fim = LocalTime.of(18, 45);
        Duration duracao = Duration.between(inicio, fim);
        
        System.out.println("Duração: " + duracao.toHours() 
            + " horas e " + (duracao.toMinutes() % 60) 
            + " minutos");
    }
}
```

---
## **Prática** ✍️
### 🔹 Exercícios:
1️⃣ Crie uma aplicação Java que exiba a data e hora atuais no formato `dd/MM/yyyy HH:mm:ss`.
2️⃣ Implemente um código que adicione 15 dias à data atual e exiba o novo valor.
3️⃣ Compare duas datas e exiba qual delas é mais antiga.

---
## **Desafio: Validação de Maioridade** 🎓
### 📌 **Enunciado:**
Desenvolva um programa em Java que receba a **data de nascimento** de uma pessoa como entrada e determine se ela é **maior de idade** (18 anos ou mais). Utilize a classe `Period` do pacote `java.time` para calcular a idade com base na data atual.

### 🔹 **Requisitos:**
1️⃣ O programa deve solicitar ao usuário que insira a data de nascimento. Serão 3 entradas para compor a data. Começando pelo dia, mês e ano de nascimento.
2️⃣ Deve calcular a idade e verificar se a pessoa tem **18 anos ou mais**.
3️⃣ Exibir uma mensagem informando se a pessoa é maior ou menor de idade.

---
## **Desafio Extra** 🚀
### 📌 **Problema:**
Um curso começa em uma data específica e possui 9 aulas, acontecendo às **segundas, quartas e sextas-feiras**. O desafio é criar um programa em Java que **calcule as datas de cada uma das aulas** automaticamente. 

- Como entrada o programa receberá apenas a data da primeira aula.
- Caso a data da primeira aula não seja um dia válido de aula o programa de ve retornar um erro e interromper o processamento.

---
## **Conclusão** 🎯
- O pacote `java.time` simplifica a manipulação de datas.
- Permite criar, modificar e comparar datas de forma eficiente.
- A prática é essencial para dominar essas funcionalidades.

📢 **Na próxima aula:** Formatação e conversão de datas.

🚀 **Dúvidas? Vamos discutir!**
