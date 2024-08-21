import javax.swing.*; //chama um pacote
import javax.swing.JOptionPane; //chama um pacote (esse mostra uma janela pro usuário)

public class If { //abrindo a classe If
    public static void main(String[] args) { //inicia o método principal da classe
        Object[] op = {"Masculino", "Feminino"}; //variável com duas opções (essas opções serão mostradas pro usuário como uma escolha)
        String resp = (String) JOptionPane.showInputDialog(null,
                "Selecione o sexo:\n", "Pesquisa", JOptionPane.PLAIN_MESSAGE,
                null, op, "Masculino"); //basicamente, abre uma janela com as opções citadas anteriormente, pedindo para que o usualho escolha uma das duas
        if (resp == null) { //abre um método de repetição (o null significa que o usuário cancelou a ação)
            JOptionPane.showMessageDialog(null, "Você pressionou cancel!"); //janela mostrando o que acontece com uma resposta vazia
        }
        if (resp.equals("Masculino")){
            JOptionPane.showMessageDialog(null, "Você é homem :("); //janela mostrando a mensagem da escolha "masculino"
        }
        if (resp.equals("Feminino")){
            JOptionPane.showMessageDialog(null, "Você é mulher! :3"); //janela mostrando a mensagem da escolha "feminino"
        }
        System.exit(0); //faz com que a janela se feche
    }

}
