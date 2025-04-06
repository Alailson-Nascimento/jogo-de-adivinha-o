import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {

        int numeroAleatorio = new Random().nextInt(100);

        Scanner adivinha = new Scanner(System.in);
        int tentativas = 0;
        int tentativaDoJogador = 0; 
        int limiteDeTentativas = 5;

        System.out.println("Tente adivinhar o número em até " + limiteDeTentativas + " tentativas");

        while (tentativas < limiteDeTentativas) {
            System.out.print("Digite sua tentativa: ");
            tentativaDoJogador = adivinha.nextInt();
            tentativas++;

            if (tentativaDoJogador == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (tentativaDoJogador > numeroAleatorio) {
                System.out.println("O número digitado é muito alto. Tentativas restantes: " + (limiteDeTentativas - tentativas));
            } else {
                System.out.println("Erro o numero digitado esta incorreto, suas tentativas foram: " + tentativas);
            }
        }

        if (tentativas == limiteDeTentativas && tentativaDoJogador != numeroAleatorio) {
            System.out.println("Você excedeu o número de tentativas. O número correto era: " + numeroAleatorio);
        }

        adivinha.close();
    }
}