public class NotasDecimais {
    public static void main(String[] args) {
        System.out.println("Programa que realize a média de duas notas decimais e exiba o resultado.");

        double nota1 = 5.5;
        double nota2 = 6.5;
        double mediaDasNotas = (nota1 + nota2) /2;

        System.out.println("A média das notas " +  nota1 + " com "+ nota2 + " foi: " + mediaDasNotas);

        double peso = 68.8;

        int idade = (int) peso; // Casting de double para int

        System.out.println("Peso (double): " + peso);
        System.out.println("Idade (int): " + idade);;


        char letra = 'A';
        String nome = "Alailson";

        System.out.println("Olá sou o " + nome + "a primeira letra do meu nome começa com " + letra);

        double precoProduto = 156;
        int quantidade = 5;

        double valorTotal = precoProduto * quantidade;
        System.out.println("O resultado foi: " + valorTotal);

        double valorEmDolares = 1;
        double cotacaoDoDolar = 4.94;
        double valorEmReais = valorEmDolares * cotacaoDoDolar;

        System.out.printf("A conversão de %.2f dólares para reais foi: %.2f%n", valorEmDolares, valorEmReais);


        double precoOriginal = 1399;
        double percentualDesconto = 50;

        double calculoValorDesconto = precoOriginal * percentualDesconto /100;

        System.out.println("O novo preço do produto com desconto foi: " + calculoValorDesconto);

    }
}
