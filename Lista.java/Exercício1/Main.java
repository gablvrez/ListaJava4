import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.print("digite o segundo número: ");
        int num2 = leitor.nextInt();

        System.out.println("Escolha a operação:");
        System.out.println("escreva 1 para somar");
        System.out.println("escreva 2 pra subtrair");
        System.out.println("escreva 3 pra multplicação");
        System.out.println("escreva 4 pra divisao");
        int oper = leitor.nextInt();

        int resolucao = 0;
        switch (oper) {
            case 1:
                resolucao = Calculadora.soma(num1, num2);
                break;
            case 2:
                resolucao = Calculadora.subtracao(num1, num2);
                break;
            case 3:
                resolucao = Calculadora.multiplicacao(num1, num2);
                break;
            case 4:
                try {
                    resolucao = Calculadora.divisao(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("erro!");
                return;
        }

        System.out.printf("resultado: %d", resolucao);

        
    }
}