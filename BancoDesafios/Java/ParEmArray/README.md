# Desafio de Código: Encontrar um Par com a Soma Dada em um Array

## Descrição
Neste desafio, o objetivo é criar uma função que, dada uma matriz de inteiros não ordenados e um valor de destino, encontre um par de elementos na matriz cuja soma seja igual ao valor de destino.

## Requisitos
Implemente uma função chamada findPairWithSum que aceita como entrada uma matriz de inteiros e um valor de destino.
A função deve encontrar um par de elementos na matriz cuja soma seja igual ao valor de destino.
A função deve retornar o par encontrado no formato "(x, y)" ou indicar que nenhum par foi encontrado.
Exemplo

**Entrada de Exemplo:**

```java
findPairWithSum([8, 7, 2, 5, 3, 1], 10)
```

**Saída de Exemplo:**

```java
"Par encontrado (8, 2)" ou "Par encontrado (7, 3)"
```

**Entrada de Exemplo:**

```java
findPairWithSum([5, 2, 6, 8, 1, 9], 12)
```

**Saída de Exemplo:**

```java
"Par não encontrado"
```

## Testes Unitários
Aqui estão alguns testes unitários que você pode usar como referência para verificar se a função findPairWithSum está funcionando corretamente:

```java

public class DesafioTest {

   @Test
   public void testeFindPairWithSum() {
       assertEquals("Pair found (8, 2)", MinhaClasse.findPairWithSum(new int[]{8, 7, 2, 5, 3, 1}, 10));
       assertEquals("Pair found (7, 3)", MinhaClasse.findPairWithSum(new int[]{7, 3, 5, 2, 8, 1}, 10));
       assertEquals("Pair not found", MinhaClasse.findPairWithSum(new int[]{5, 2, 6, 8, 1, 9}, 12));
   }

}
```
