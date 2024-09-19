package fundamentos.Atividades.ConversorTemperatura;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
       //definindo as variaveis das duas temperaturas
        final int Fahrenheit = 32;

        //obtendo as temperaturas para conversão
        Scanner obtertemperatura = new Scanner(System.in);
        System.out.println("Informe a temperatura em Fahrenheit para a conversão");
        int temperatura1 = obtertemperatura.nextInt();

        double resultadoConversao = temperatura1 - Fahrenheit * 5/9.0 ;
        DecimalFormat df = new DecimalFormat("#");

        System.out.println("O resultado da sua temperatura em Celsius é de " + df.format(resultadoConversao));

    }






}
