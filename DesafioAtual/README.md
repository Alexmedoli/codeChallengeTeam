# Desafio de Código: Jogo Fizz Buzz em Java

## Descrição

Crie uma classe Java que simule o jogo 'Fizz Buzz'. O jogo 'Fizz Buzz' é comumente usado como um desafio de programação. A regra é simples: a classe receberá um número inteiro como parâmetro e, em seguida, imprimirá no console números de 1 até o número fornecido, aplicando as seguintes regras:

- Se o número for múltiplo de 3, imprima "Fizz" em vez do número.
- Se o número for múltiplo de 5, imprima "Buzz" em vez do número.
- Se o número for múltiplo de ambos 3 e 5, imprima "FizzBuzz".
- Caso contrário, imprima o número.

## Requisitos

- Crie uma classe chamada `FizzBuzz` com um método que aceita um número inteiro como parâmetro e imprime os resultados no console.
- A classe deve ser capaz de jogar o jogo de 1 até o número fornecido.
- Lembre-se de tratar casos especiais, como números múltiplos de 3 e 5, corretamente.

## Exemplo

Suponha que o número fornecido seja 15:

**Entrada de exemplo:**
```java
FizzBuzz jogo = new FizzBuzz();
jogo.jogar(15);
```

**Saída de exemplo:**
```Bash
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

# Testes Unitários
Aqui estão alguns casos de teste que você pode usar para verificar a implementação:

```java
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testeFizz() {
        // Teste para número múltiplo de 3
        FizzBuzz jogo = new FizzBuzz();
        jogo.jogar(9);
    }

    @Test
    public void testeBuzz() {
        // Teste para número múltiplo de 5
        FizzBuzz jogo = new FizzBuzz();
        jogo.jogar(10);
    }

    @Test
    public void testeFizzBuzz() {
        // Teste para número múltiplo de 3 e 5
        FizzBuzz jogo = new FizzBuzz();
        jogo.jogar(15);
    }
}


