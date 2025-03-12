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
# **Aula 3: Introdução à Programação Funcional**
## Turma 1322
### Professor(a): Marcel Tanuri
### Data: 12/03
---

## **📌 Objetivos da Aula**
- Compreender os fundamentos da **Programação Funcional**.
- Introduzir o conceito de **funções lambda** e sua aplicação em Java.
- Explorar as interfaces funcionais básicas (`Function`, `BiFunction`, `Consumer`, `Supplier`).

---

## **📖 O que é Programação Funcional?**
A **Programação Funcional** é um paradigma de programação baseado no uso de funções puras e na imutabilidade dos dados. Seus principais conceitos incluem:

✔ **Funções como cidadãos de primeira classe**: funções podem ser passadas como parâmetros, retornadas e armazenadas em variáveis.

✔ **Imutabilidade**: evita efeitos colaterais e facilita a concorrência.

✔ **Funções puras**: para um mesmo conjunto de entradas, sempre retorna a mesma saída.

---

## **📝 Funções Lambda**
No Java, **expressões lambda** permitem escrever funções anônimas de maneira concisa. A sintaxe geral é:

```java
(parametros) -> { corpo_da_funcao }
```

### **Exemplos de expressões lambda**
```java
// Exemplo 1: Lambda para somar dois números
BiFunction<Integer, Integer, Integer> soma = (a, b) -> a + b;
System.out.println(soma.apply(5, 3)); // Saída: 8

// Exemplo 2: Lambda para verificar se um número é par
Predicate<Integer> isPar = x -> x % 2 == 0;
System.out.println(isPar.test(10)); // Saída: true
```

---

## **🔍 Interfaces Funcionais em Java**
O Java fornece **interfaces funcionais** na biblioteca `java.util.function`:

| Interface        | Descrição |
|-----------------|-----------|
| `Function<T, R>` | Recebe um argumento do tipo `T` e retorna um valor do tipo `R` |
| `BiFunction<T, U, R>` | Recebe dois argumentos (`T`, `U`) e retorna `R` |
| `Consumer<T>` | Recebe um argumento `T`, mas não retorna nada (usado para efeitos colaterais) |
| `Supplier<T>` | Não recebe argumentos, mas retorna um valor `T` |
| `Predicate<T>` | Recebe um argumento `T` e retorna um booleano |

---

## **📌 Exemplos Práticos**
### **Usando `Function`**
```java
Function<String, Integer> tamanhoString = s -> s.length();
System.out.println(tamanhoString.apply("Java")); // Saída: 4
```

### **Usando `Consumer`**
```java
Consumer<String> imprimir = s -> System.out.println("Olá, " + s);
imprimir.accept("Mundo"); // Saída: Olá, Mundo
```
---

### **Usando `Supplier`**
```java
Supplier<Double> aleatorio = () -> Math.random();
System.out.println(aleatorio.get()); // Saída: número aleatório
```

### **Usando `Predicate`**
```java
Predicate<String> contemJava = s -> s.contains("Java");
System.out.println(contemJava.test("Amo Programação em Java")); // Saída: true
```

---

## **✏️ Exercícios**
1. **Criar uma `Function<Integer, Integer>` que recebe um número e retorna o seu quadrado.**
2. **Criar um `Predicate<String>` que verifica se uma string tem mais de 5 caracteres.**
3. **Criar um `Consumer<String>` que imprime a string em maiúsculas.**
4. **Criar um `Supplier<List<Integer>>` que retorna uma lista de números de 1 a 5.**

---

## **📌 Conclusão**
- A **Programação Funcional** torna o código mais expressivo e menos verboso.
- **Lambdas** ajudam a escrever código mais conciso e claro.
- As **interfaces funcionais** permitem estruturar código de forma reutilizável.

📝 **Próxima Aula**: Streams com Arquivos e Collections 🚀

---
## **📚 Referências**
- [Documentação Java SE 17 - java.util.function](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/function/package-summary.html)
- [Baeldung - Functional Programming in Java](https://www.baeldung.com/java-functional-programming)
- Livro: "Java Efetivo" (Joshua Bloch) - Capítulo sobre Lambdas e Streams


