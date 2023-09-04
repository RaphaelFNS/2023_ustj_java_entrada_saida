import java.util.Scanner;
//pacote padrão: java.lang: importado automaticamente
public class SomaDoisNumeros {
    public static void main(String [] args) {
        //Declaração de variáveis 
        Scanner leitor = new Scanner(System.in);
        double po1;
        double po2;
        double resultado;

        //Entrada
        System.out.println("Digite o primeiro properando");
        po1 = leitor.nextDouble();

        System.out.println("Digite o segundo operando");
        po2 = leitor.nextDouble();        
        //Processamento
        resultado = po1 + po2;
        //Saida
        System.out.print(resultado);
    }
}