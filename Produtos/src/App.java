import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de produtos: ");
        int n = sc.nextInt();

        String[] nomes = new String[n];
        double[] precos = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o nome do %dº produto: ", i+1);
            nomes[i] = sc.next();

            System.out.printf("Digite o preço do %dº produto: ", i+1);
            precos[i] = sc.nextDouble();
        }

        double media = 0;
        for (double preco : precos) {
            media += preco;
        }
        media /= n;

        System.out.printf("Preço médio dos produtos: %.2f", media);
        
        sc.close();
    }
}
