public class Main {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2}, {3,4}, {5, 6}}; //3 linhas e 2 colunas
        int[][] novaMatriz = new int[2][3]; //2 linhas e 3 colunas

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                novaMatriz[j][i] = matriz [i][j];
            }
        }

        for (int i = 0; i < 2; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(novaMatriz[i][j] + " ");
            }
        }
    }
}