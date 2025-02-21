public class Operadoes {
    public static void main(String[] args) throws Exception {


        //Operadores Aritméticos
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b)); // Soma
        System.out.println("a - b = " + (a - b)); // Subtração
        System.out.println("a * b = " + (a * b)); // Multiplicação
        System.out.println("a / b = " + (a / b)); // Divisão inteira
        System.out.println("a % b = " + (a % b)); // Resto da divisão



        //Operadores Relacionais

        int x = 5;
        int y = 10;

        System.out.println("x == y: " + (x == y)); // Igual a
        System.out.println("x != y: " + (x != y)); // Diferente de
        System.out.println("x > y: " + (x > y));   // Maior que
        System.out.println("x < y: " + (x < y));   // Menor que
        System.out.println("x >= y: " + (x >= y)); // Maior ou igual a
        System.out.println("x <= y: " + (x <= y)); // Menor ou igual a

        //Operadores Lógicos


        boolean c = true;
        boolean d = false;

        System.out.println("a && b: " + (c && d)); // AND lógico
        System.out.println("a || b: " + (c || d)); // OR lógico
        System.out.println("!a: " + (!c));         // NOT lógico



        //Operadores de Atribuição

        int w = 10; // Troquei x por w
        w += 5; // Equivalente a w = w + 5
        System.out.println("w += 5: " + w);

        w -= 3; // Equivalente a w = w - 3
        System.out.println("w -= 3: " + w);

        w *= 2; // Equivalente a w = w * 2
        System.out.println("w *= 2: " + w);

        w /= 4; // Equivalente a w = w / 4
        System.out.println("w /= 4: " + w);

        w %= 3; // Equivalente a w = w % 3
        System.out.println("w %= 3: " + w);




        //Operadores de Incremento e Decremento

        int e = 5; // Troquei a por e

        System.out.println("e++: " + (e++)); // Pós-incremento (usa o valor e depois incrementa)
        System.out.println("e: " + e);

        System.out.println("++e: " + (++e)); // Pré-incremento (incrementa e depois usa o valor)
        System.out.println("e: " + e);

        System.out.println("e--: " + (e--)); // Pós-decremento (usa o valor e depois decrementa)
        System.out.println("e: " + e);

        System.out.println("--e: " + (--e)); // Pré-decremento (decrementa e depois usa o valor)
        System.out.println("e: " + e);




        //OPERADOR TERNARIO

        int idade = 18;
        String status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("Status: " + status);

    }
}
