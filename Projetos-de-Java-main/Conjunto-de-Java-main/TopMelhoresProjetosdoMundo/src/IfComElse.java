import javax.swing.*; //pacote java (importando todos os complementos do pacote javax.swing)

public class IfComElse { //abre a classe IfComElse
    public static void main(String[] args){ //começa o método principal da classe
        String aux = JOptionPane.showInputDialog("Forneça o número do mês: "); //abre uma variável - essa variável abre uma janela, pedindo para o usuário fornecer um número
        if (aux != null) { //abre o método de repetição if
            try { //abre o método de repetição try
                int mes = Integer.parseInt(aux); //abre a variável que armazena o valor do número que o usuário escolheu anteriormente (tem que ser um número inteiro)
                if (mes >=1 && mes <= 12){ //o número tem que ser de 1 a 12. quando o usuário escolhe algum desses números, a mensagem da linha abaixo aparece em uma janela
                    JOptionPane.showMessageDialog(null, "Número do mês válido!!\n " + mes);
                } else{ // o else (senão) mostra o que acontece caso dê erro (quando o usuário não escolhe um número entre 1 a 12)
                    JOptionPane.showMessageDialog(null, "Número do mês inválido! :/\n" + mes);
                }
            } catch (NumberFormatException erro) { //o método de repetição catch vai mostrar o que fazer caso aconteça algum erro
                JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!" + erro); // mensagem que aparecerá quando o usuário colocar números quebrados
            }
        }
        else{ //esse else continua o primeiro if, fechando ele (o da linha 6)
            JOptionPane.showMessageDialog(null, "Opção cancelada."); //a mensagem que aparece quando o usuário cancela a ação, antes de confirmar um número
        }
        System.exit(0); //retira as janelas e termina as operações
    }
}
