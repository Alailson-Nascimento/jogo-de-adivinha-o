import java.util.Scanner;

public class LerDaDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String sobreNome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer após ler a idade
        System.out.println("Digite seu ano de Nascimento: ");
        int dataDeNascimento = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer após ler o ano de nascimento (boa prática)

        System.out.printf("Meu primeiro nome é %s e meu sobrenome é %s, tenho %d de idade e nasci no ano de %d%n", nome, sobreNome, idade, dataDeNascimento);
        scanner.close();
    }
}