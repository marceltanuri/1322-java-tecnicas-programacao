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

# **Aula 2: Formatação e Conversão de Datas**
## Turma 1322
### Professor(a): Marcel Tanuri
### Data: 10/03

---
## **Objetivos da Aula**
### 📅 O que vamos aprender hoje?
✅ Formatar datas para diferentes padrões  
✅ Converter `String` para `LocalDate` e vice-versa  
✅ Trabalhar com fusos horários (`ZonedDateTime`)  
✅ Configurar formatações personalizadas  

---
## **Por que a formatação de datas é importante?**
📌 Datas podem ser exibidas de diferentes formas em aplicações e bancos de dados.  
📌 É comum a necessidade de converter uma `String` para um objeto `LocalDate` ou `LocalDateTime`.  
📌 A API `java.time.format.DateTimeFormatter` permite personalizar o formato das datas.  

---
## **`DateTimeFormatter`: Formatação de Datas**
### 📌 Como formatar datas em Java?
```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatandoDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        String dataFormatada = hoje.format(formato);
        System.out.println("Data formatada: " + dataFormatada);
    }
}
```
📌 **Saída esperada:** `Data formatada: 10/03/2024`

---
## **Formatos Padrão (`ISO_DATE`)**
O `DateTimeFormatter` possui formatos padrão ISO já definidos:

| Formato | Exemplo |
|---------|---------|
| `ISO_DATE` | `2024-03-10` |
| `ISO_LOCAL_DATE_TIME` | `2024-03-10T14:30:00` |
| `ISO_ZONED_DATE_TIME` | `2024-03-10T14:30:00-03:00[America/Sao_Paulo]` |

Exemplo de uso:
```java
DateTimeFormatter formatoISO = DateTimeFormatter.ISO_DATE;
String dataISO = hoje.format(formatoISO);
System.out.println("Data ISO: " + dataISO);
```

---
## **Conversão de `String` para `LocalDate`**
### 📌 Como transformar um texto em um objeto `LocalDate`?
```java
String dataTexto = "10/03/2024";
DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
LocalDate dataConvertida = LocalDate.parse(dataTexto, formato);

System.out.println("Data convertida: " + dataConvertida);
```
📌 **Saída esperada:** `Data convertida: 2024-03-10`

---
## **Conversão de `String` para `LocalDateTime`**
📌 Caso a `String` contenha horário, usamos `LocalDateTime`:
```java
String dataHoraTexto = "10/03/2024 14:30";
DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
LocalDateTime dataHoraConvertida = LocalDateTime.parse(dataHoraTexto, formato);

System.out.println("Data e Hora convertida: " + dataHoraConvertida);
```
📌 **Saída esperada:** `Data e Hora convertida: 2024-03-10T14:30`

---
## **Trabalhando com Fusos Horários**
📌 Para lidar com fusos horários, usamos `ZonedDateTime`:

```java
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class FusoHorario {
    public static void main(String[] args) {
        ZonedDateTime agoraSP = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Hora em São Paulo: " + agoraSP);
    }
}
```
📌 **Saída esperada:** `Hora em São Paulo: 2024-03-10T14:30-03:00[America/Sao_Paulo]`

---
## **Lista de Fusos Horários**
Podemos listar todos os fusos horários disponíveis no Java:

```java
import java.time.ZoneId;

public class ListarFusos {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }
}
```
📌 Isso exibe todos os fusos suportados no Java, como `America/New_York`, `Europe/London`.

---
## **Exercícios Práticos** ✍️
### 🔹 Teste seus conhecimentos:
1️⃣ Escreva um programa que exiba a **data atual formatada como "dd-MM-yyyy"**.  
2️⃣ Converta a `String` `"07/03/2024"` para um `LocalDate` e exiba o resultado.  
3️⃣ Escreva um código que exiba a hora exata em **São Paulo** e em **Londres**.  

---
## **Desafio: Validando Datas** 🎓
### 📌 **Enunciado**
Crie um programa que receba uma data de nascimento como `String` e converta para `LocalDate`. O programa deve validar se a data inserida **é válida** e, caso seja inválida, solicitar uma nova entrada.

### 🔹 **Requisitos**
✅ O usuário insere a data no formato `"dd/MM/yyyy"`.  
✅ Se a data for inválida, o programa exibe uma mensagem de erro.  
✅ O programa continua pedindo a data até que uma válida seja informada.  

---
## **Conclusão** 🎯
✅ Aprendemos como **formatar** datas no Java.  
✅ Vimos como **converter `String` para `LocalDate` e `LocalDateTime`**.  
✅ Entendemos a importância dos **fusos horários** e como manipulá-los.

📢 **Na próxima aula:** Introdução à **Programação Funcional** com Java!

🚀 **Dúvidas? Vamos discutir!**
