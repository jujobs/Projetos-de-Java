package cap03; //cria o pacote cap03
import javax.swing.JOptionPane; //importa o pacote que cria janelas
public class TryCatch { //cria a classe pública TryCatch
    public static void main(String args[]) { //inicia o método principal da classe
        try { //inicia o método try
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1° número!: "); //cria a variável auxiliar que pega o valor do primeiro numero que o usuario escolher
            int num1 = Integer.parseInt(aux1); //cria a variavel que pega o valor que o usuário escolheu na linha anterior
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2° número!: "); //o mesmo que na linha 6 mas pro segundo numero
            int num2 = Integer.parseInt(aux2); //o mesmo que na linha 7 mas pro segundo numrero
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2)); //mostra em janela o resultado dos dois numeros na soma
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2)); //resultado da subtração
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2)); //resultado da multiplicação
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2)); //resultado da divisão
        } catch (ArithmeticException erro) { //começa o método de erro
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE); //mensagem em janela para quando um dos números escolhidos é 0
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de conversão\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE); //erro de conversão
        } catch (NullPointerException erro) {
            JOptionPane.showMessageDialog(null, "Tecla Cancel pressionada\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE); //quando o usuário cancela a operação
        } finally {
            JOptionPane.showMessageDialog(null, "Final da execução."); //termina a execução do código
        }
        System.exit(0); //termina a operação
    }
}
