package condicional;

import javax.swing.*;

public class miniCajero {

    /* Hacer programa que simule un cajero automático
        con saldo inicial de 1000 dólares y que realice las siguientes operaciones:
        1.Ingresar dinero
        2.Retirar dinero
        3. Salir
     */
    public static void main (String[] args){
        final int SALDO_INICIAL = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automático \n" +
                "1. Ingresar dinero a la cuenta\n" +
                "2. Retirar dinero\n" +
                "3.Salir"));

        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desee ingresar: "));
                    saldoActual = SALDO_INICIAL + ingreso;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                    break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desee retirar: "));
                if (retiro > SALDO_INICIAL){
                    JOptionPane.showMessageDialog(null,"No cuenta con saldo suficiente");
                }else{
                    saldoActual = SALDO_INICIAL - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldoActual);
                    break;
                }

                break;
            case 3: break;
            default: JOptionPane.showMessageDialog(null, "Se equivocó de opción");
            break;
        }


    }



}
