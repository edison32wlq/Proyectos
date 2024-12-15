package gui;

import javax.swing.JOptionPane;

/**
 * clase que crea sopa de letras
 * creado el 26 de Febrero, 2023 a las 11:00 horas
 * @author HP Edison Wilfrido Ludeña Quichimbo
 *@version POO - 2023.
 *
 */
public class Principal {

	public static void main(String[] args) {
		String palabra = JOptionPane.showInputDialog(null, "Ingrese una palabra de al menos 3 letras:", "Ingreso", JOptionPane.QUESTION_MESSAGE);
        while (palabra == null || palabra.length() < 3) {
            palabra = JOptionPane.showInputDialog(null, "Palabra inválida. Ingrese una palabra de al menos 3 letras:", JOptionPane.ERROR_MESSAGE);
        }
        
        new FrmSopaLetras(palabra).setVisible(true);
        


	}

}
