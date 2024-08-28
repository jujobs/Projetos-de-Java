package cap03; //cria o pacote cap03
import javax.swing.*; //importa o pacote javax
public class SwitchCase { //cria a classe pública SwitchCase
    public static void main(String args[]) { //abre o método público principal
        String mes = (String) JOptionPane.showInputDialog("Forneça o número do mês: "); //cria a variavel mes e pede para que o usuário
        if (mes != null) { //começa o método de loop if - verifica se a variavel essa vazia
            switch (mes) { //começa um método de comparação de valores
                case "1":; //caso o usuário escolha o número 1 ...
                    mes = "Janeiro"; //... o valor da variável vira o mes correspondente ao número
                    break; //separa o caso para começar outro
                case "2":; //todos os numeros e meses são igual ate chegar em 12/dezembro
                    mes = "Fevereiro";
                    break;
                case "3":;
                    mes = "Março";
                    break;
                case "4":;
                    mes = "Abril";
                    break;
                case "5":;
                    mes = "Maio";
                    break;
                case "6":;
                    mes = "Junho";
                    break;
                case "7":;
                    mes = "Julho";
                    break;
                case "8":;
                    mes = "Agosto";
                    break;
                case "9":;
                    mes = "Setembro";
                    break;
                case "10":;
                    mes = "Outubro";
                    break;
                case "11":;
                    mes = "Novembro";
                    break;
                case "12":;
                    mes = "Dezembro";
                    break;
                default: //serve para qualquer outro valor
                    mes = "Mês desconhecido!!"; //a variável fica com esse valor, já que não existem mais meses
            }
            JOptionPane.showMessageDialog(null, mes); //uma janela aparece mostrando a variável "mes"
        }
        System.exit(0); //encerra o programa
    }
}
