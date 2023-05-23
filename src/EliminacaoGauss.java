import java.util.Scanner;

public class EliminacaoGauss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz (n): ");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n + 1];

        // Preenchendo a matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print("Digite o elemento da posição (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nMatriz inserida:");
        imprimirMatriz(matriz);

        double[] solucao = gauss(matriz);

        System.out.println("\nSolução:");
        for (int i = 0; i < n; i++) {
            System.out.println("x" + (i + 1) + " = " + (int) solucao[i]);
        }
    }

    public static double[] gauss(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            // Encontrando o pivô
            int maxIndex = i;
            for (int k = i + 1; k < n; k++) {
                if (Math.abs(matriz[k][i]) > Math.abs(matriz[maxIndex][i])) {
                    maxIndex = k;
                }
            }
        }
        return solucao;
    }

    public static void imprimirMatriz(double[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                System.out.print((int) matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}