package cap03; //chama o pacote de java cap03
import javax.swing.JOptionPane; //chama o pacote java que permite mostrar janelas
public class GetMessageEPrintStackTrace { //abre a classe GetMessageEPrintStackTrace
    public static void main(String args[]) { //começa o método principal da classe
        int x = Integer.parseInt(JOptionPane.showInputDialog("Forneça um número!: ")); //abre uma variável - abre uma janela pedindo para que o usuário forneça um número
        try { //abre o método try
            int y = x / 0; // abre uma variável - essa variável pega o resultado da variável anterior e divide por zero
        } catch (Exception erro) { //começa o método catch, que mostra o que acontece quando acontece algum erro
            JOptionPane.showMessageDialog(null, erro.getMessage()); //reproduz alguma mensagem de erro
            erro.printStackTrace(); //reproduz uma mensagem de erro - funciona junto da linha anterior
        }
    }
}
