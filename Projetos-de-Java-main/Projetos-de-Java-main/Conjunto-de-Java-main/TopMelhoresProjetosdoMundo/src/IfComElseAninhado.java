import javax.swing.*; //chama um pacote java
import java.awt.*; //chama um pacote java

public class IfComElseAninhado { //abre a classe pública IfComElseAnimado
    public static void main(String[] args){ //começa o método principal da classe
        String aux = JOptionPane.showInputDialog("Forneça o número do mês: "); //cria uma variável auxiliar do tipo string - faz com que uma janela apareça pedindo uma resposta ao usuário
        if (aux != null) { //começa um método de repetição if - deixa a variável auxiliar vazia
            try { //começa o método try
                int mes = Integer.parseInt(aux); //cria a variável mes e converte ela em números inteiros apenas
                if (mes == 1){ // começa o método de repetição if
                    aux = "Janeiro"; //esse método segue com os 12 meses do ano, cada um com seu respectivo número
                }
                else if (mes == 2){
                    aux = "Fevereiro";
                }
                else if (mes == 3){
                    aux = "Março";
                }
                else if (mes == 4){
                    aux = "Abril";
                }
                else if (mes == 5){
                    aux = "Maio";
                }
                else if (mes == 6){
                    aux = "Junho";
                }
                else if (mes == 7){
                    aux = "Julho";
                }
                else if (mes == 8){
                    aux = "Agosto";
                }
                else if (mes == 9){
                    aux = "Setembro";
                }
                else if (mes == 10){
                    aux = "Outubro";
                }
                else if (mes == 11){
                    aux = "Novembro";
                }
                else if (mes == 12){
                    aux = "Dezembro";
                }
                else{ //esse else serve para um número que não esteja dentro do método if, ou seja, algum numero que não esteja entre 1 a 12
                    aux = "Mês desconhecido! :/"; //mensagem de erro pro problema da linha anterior
                }
                JOptionPane.showMessageDialog(null, aux); //mostra uma janela com a variável auxiliar, já vazia
            }
            catch (NumberFormatException erro) { //método que mostra o que vai acontecer caso ocorra algum erro
                JOptionPane.showMessageDialog(null, "Digite apenas valores inteiros!\n" + erro ); //mensagem que aparece quando o usuário não digita um número inteiro
            }
        }
        System.exit(0); //fecha as janelas e termina tudo
    }

}
