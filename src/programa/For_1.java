package programa;

public class For_1 {
    public static void main(String[] args) {
        //O FOR é um laço que tras uma estrutura melhor e mais adequada para repetições determinadas
        //Sintaxe basica do FOR: parte A, parte B, parte (Definição de variavel, expressão, incremento)

      /*  int contador = 0;

        while (contador <= 20) {
            System.out.printf("i = %d \n", contador);
            contador += 3;
        }*/

        for (int contador = 0;contador <= 20;contador += 2){
            System.out.printf("i = %d \n", contador);
        }
    }
}
