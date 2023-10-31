# Desafio de Código: Formatação em CamelCase

## Descrição

Neste desafio, o objetivo é criar uma função que formate uma string em CamelCase. CamelCase é uma convenção de escrita em que as palavras são unidas sem espaços, e a primeira letra de cada palavra, exceto a primeira, é maiúscula.

## Requisitos

* Crie uma função chamada `formatCamelCase` que recebe uma string como entrada.
* A função deve retornar a string no formato CamelCase.
* As palavras na string de entrada são separadas por um ou mais espaços.
* A primeira letra de cada palavra deve ser maiúscula, e as demais letras minúsculas.
* Remova espaços extras entre as palavras na saída.

**Exemplo**

**Entrada de Exemplo:**

```java
formatCamelCase("hello world")
formatCamelCase("hello-world")
formatCamelCase("hello_world")

```

**Saída de Exemplo:**

```java
"HelloWorld"
```

## Testes Unitários

Você pode usar os seguintes testes unitários como referência para verificar se a função `formatCamelCase` está funcionando corretamente:

```java
public class DesafioTest {

   @Test
   public void testeFormatCamelCase() {
       assertEquals("HelloWorld", MinhaClasse.formatCamelCase("hello world"));
       assertEquals("ThisIsATest", MinhaClasse.formatCamelCase("this_is_a_test"));
       assertEquals("CodingInJava", MinhaClasse.formatCamelCase("coding-in-Java"));
   }

}
```

# Dicas

* Utilize métodos de manipulação de strings para dividir a entrada em palavras e depois formatá-las.
* Lembre-se de que a primeira letra de cada palavra deve ser maiúscula.
* Evite usar soluções prontas e procure a documentação relevante para manipulação de strings na linguagem de programação escolhida.
