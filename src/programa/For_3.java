package programa;

public class For_3 {
    public static void main(String[] args) {
        //Laço FOR encadeado, um dentro do outro

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
/*                for (int a = 0; a < 10; a++) {
                    for (int b = 0; b < 10; b++)*/
                        System.out.printf("[%d %d]", i, j);
                }
                System.out.println();
            }
        }
    }