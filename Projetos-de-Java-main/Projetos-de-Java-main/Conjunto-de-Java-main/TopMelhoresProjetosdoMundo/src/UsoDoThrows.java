package cap03; //cria o cap03
import java.io.*; //importa o pacote java.io
import javax.swing.JOptionPane; //importa o javax
public class UsoDoThrows { //cria a classe pública UsoDoThrows
    public static void main(String args[]) throws IOException { //abre o método principal da classe
        String frase = JOptionPane.showInputDialog("Entre com uma frase: "); //cria a variavel que pede para que o usuário digitar uma frase
        try { //começa o método de erro
            FileWriter file = new FileWriter("c:/temp/frases.txt", true); //escreve o que o usuário inseriu num arquivo de texto
            PrintWriter out = new PrintWriter(file); //cria o arquivo de texto
            out.println(frase); //imprime a frase na tela
            file.close(); //fecha o arquivo
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!"); //abre uma janela mostrando que deu tudo certo
        } catch (FileNotFoundException erro) { //começa o método de erro
            JOptionPane.showMessageDialog(null, "Erro, verifique se a pasta c:/temp existe!"); //mensagem de erro para quando a pasta não existe
        }
    }
}
