package cap03; //cria o pacote cap03
import java.io.IOException; //importa o pacote java io
import javax.swing.JOptionPane; //importa o pacote que cria janelas
public class InstrucaoThrows { // abre a classe pública InstrucaoThrows
    public static void main(String args[]) throws IOException { //abre o método principal com um throw (serve para criar erros, basicamente)
        try { //abre o método try
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade")); //cria a variável idade
            if (idade < 18) { // começa o método if com uma condição
                throw new Exception("Menor de idade, entrada não permitida!!"); //serve para criar o erro do método, que antes não existia
            } else {
                JOptionPane.showMessageDialog(null, "Idade válida, seja bem vindo!"); //abre uma janela mostrando o que acontece caso o usuário seja maior de idade
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString()); //janela que mostra o erro do código, mas não tem a ver com o throw - este erro serve apenas para quando uma ação é cancelada por exemplo.
        }
    }
}
