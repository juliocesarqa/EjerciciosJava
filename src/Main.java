import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 1 -5: "));

        switch (numero){
            case 1: JOptionPane.showMessageDialog(null,"Es el número 1");
                break;
            case 2: JOptionPane.showMessageDialog(null,"Es el número 2");
                break;
            case 3: JOptionPane.showMessageDialog(null,"Es el número 3");
                break;
            case 4: JOptionPane.showMessageDialog(null,"Es el número 4");
                break;
            case 5 :JOptionPane.showMessageDialog(null,"Es el número 5");
                break;
            default:JOptionPane.showMessageDialog(null,"El número esta fuera del rango");


        }


    }
}