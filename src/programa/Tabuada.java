package programa;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Para retornar a tabuada, digite qualquer numero: ");
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++){
            int resultado = n * i;
            System.out.print("\n" + i + ": ");
            System.out.println(i + " x " + n + " = " + resultado);
        }
        input.close();
    }
}
