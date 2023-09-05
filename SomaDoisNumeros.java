import javax.swing.JOptionPane;
//pacote padrão: java.lang: importado automaticamente
public class SomaDoisNumeros {
    public static void main(String [] args) {
        //Declaração de variáveis 
        double po1;
        double po2;
        double resultado;

        //Entrada
        po1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro operando"));

        po2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo operando"));      
        //Processamento
        resultado = po1 + po2;
        
        //Saida
        JOptionPane.showMessageDialog(null, resultado);
    }
}