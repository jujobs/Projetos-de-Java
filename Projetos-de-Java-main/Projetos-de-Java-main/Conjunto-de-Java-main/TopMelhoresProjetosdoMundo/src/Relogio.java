package cap03; //cria o pacote cap03
public class Relogio { //cria a classe pública Relogio
    public static void main(String args[]) { //abre o método principal da classe
        int horas, minutos, segundos; // cria as variáveis correspondentes as horas, minutos e segundos
        for (horas = 0; horas < 24; horas++) { // cria um loop correspondente aos valores das horas, minutos e segundos nas linhas 5, 6 e 7
            for (minutos = 0; minutos < 60; minutos++) {
                for (segundos = 0; segundos < 60; segundos++) {
                    System.out.println(horas + "h:" + minutos + "min:" + segundos + "s"); //mostra o resultado das horas de acordo com as três linhas passadas
                    try { //começa um método try
                        Thread.sleep(1000); //serve para dar delay
                        if (segundos == 10) { //caso os segundos forem igual a 10...
                            System.exit(0); //... o programa se encerra
                        }
                    } catch (Exception erro) { //começa o método de erro
                        erro.toString();
                    }
                }
            }
        }
        System.exit(0); //para tudo e encerra o programa
    }
}
