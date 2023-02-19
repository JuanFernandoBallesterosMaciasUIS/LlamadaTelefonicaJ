package ejecutable;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {

        /*
         * ingresar el tiempo de duración de una llamada telefonica y
         * determinar la cantidad a pagar segun lo siguiente:
         * - toda llamada que dure 3 minutos o menos tiene un costo de 300 pesos
         * - cada minuto adicional cuesta 50 pesos
         */

        // declaración de variables

        int mIngresados;
        int costo;

        // input
        mIngresados = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los minutos de la llamada:"));

        // processing
        if (mIngresados <= 3) {
            JOptionPane.showMessageDialog(null,
                    "Ya que la llamada duro 3 minutos o menos el valor de la llamada es de:  " + 300 + " pesos",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {

            costo = ((mIngresados - 3) * 50) + 500;

            JOptionPane.showMessageDialog(null,
                    "La llamada duro " + mIngresados + " minutos el valor es de:  " + costo + " pesos",
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}