package cap03; //cria o pacote cap03
import javax.swing.JOptionPane; //chama o pacote que cria janelas
public class IfResumido { //cria a classe IfResumido
    public static void main(String[] args) { //começa o método principal da classe
        int a = 10, b = 15, maior; //cria a variável 'a' e 'b', já adicionando um valor a elas
        if (a > b) { //começa um método if simples, onde é verificado qual das variável tem o maior número
            maior = a;
        } else {
            maior = b;
        }
        JOptionPane.showMessageDialog(null, "Usando um if comum: " + maior); //cria uma janela que mostra o resultado do if, que nesse caso, mostra que a 'b' é maior

        int c = 10, d = 8; //cria outra variavel parecida com a anterior, mas com número e valores diferentes
        maior = (c > d) ? c : d; //é um if reduzido, basicamente, pegando a variável maior (o ? pode servir como um if, o : como um else).
        JOptionPane.showMessageDialog(null, "Usando um if resumido: " + maior); //a mesma coisa que a janela anterior, mas com essa nova maneira de construir um if

    }
}
