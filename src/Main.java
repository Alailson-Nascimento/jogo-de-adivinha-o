public class Main {
    public static void main(String[] args){
        System.out.println("Ess é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        // Adicionar um sufixo (f) ao número para indicá-lo como .
        // Tipos primitivos int,boolean,double
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        // Média calculada pelas 3 notas
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        // Text blocks
        sinopse = """
                Filme top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de Lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
        //casting explícito
        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}
