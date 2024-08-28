package cap03; // cria um pacote java
import javax.swing.JOptionPane; //chama um pacote java (que cria janelas)
public class ContadorWhile { //abre a classe pública ContadorWhile
    public static void main(String args[]) { //abre o método principal da classe
        try { //abre o método de repetição try
            int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade!: ")); //cria uma variável que pede informações para o usuário
            int contador = limite; //abre uma variável que pega a resposta da variável anterior
            while (contador >= 0) { //abre outro método de repetição, esse sendo o while
                System.out.println(contador); //mostra a variavel na tela
                contador--; //tira um número do contador
            }
            System.out.println("Fim do contador regressivo\n"); //mostra na tela a mensagem final
            contador = 0; //o contador fica zerado
            do {
                System.out.println(contador); //mostra o contador zerado na tela
                contador++; //adiciona um numero ao contador
            } while (contador <= limite); //enquanto o contador não chega ao limite...
            System.out.println(("Fim do contador progressivo.")); //mostra outra mensagem final
        } catch (NumberFormatException erro) { //começa um método de erro
            System.out.println("Não foi encontrado um número inteiro válido!\n" + erro.toString()); // se o argumento for inválido
        }
        System.exit(0); //termina o código e encerra o programa
    }
}
