package lerCincoNumeros;

import javax.swing.*;
import java.util.Scanner;

public class LerCincoNumeros {
    public static void main(String[] args) {

        int N;
        double valor, soma, media, maior, menor;
        String resp = "SIM";
        N = 0;
        soma = 0;
        media = 0;
        maior = -99999;
        menor = 99999;
        int i;
        for(i = 0; i < 5; i++) {
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número", "VALOR", JOptionPane.INFORMATION_MESSAGE));
            soma += valor;//soma = soma + valor;
            if (valor > maior) {
                maior = valor;
            }

            if(valor < menor) {
                menor = valor;
            }
        }

        media = soma / i;
        JOptionPane.showMessageDialog(null, "O maior número é: " + maior);
        JOptionPane.showMessageDialog(null, "O menor número é: " + menor);
        JOptionPane.showMessageDialog(null, "A média é: " + media);

    }
}
