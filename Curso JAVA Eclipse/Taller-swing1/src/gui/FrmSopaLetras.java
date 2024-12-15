package gui;

import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * clase que crea sopa de letras
 * creado el 26 de Febrero, 2023 a las 11:00 horas
 * @author HP Edison Wilfrido Ludeña Quichimbo
 *@version POO - 2023.
 */
public class FrmSopaLetras extends JFrame {

    private String palabra;
    private int n;
    private JButton[][] matriz;
    /**
     * constructor vacio
     */
    public FrmSopaLetras() {
    }
    
    /**
     * constructor que ingresa un String, y ademas ingresar lo necesario para la 
     * ventana principal
     * @param palabra sera la palabra ingresada
     */
    public FrmSopaLetras(String palabra) {
        this.palabra = palabra;
        this.n = palabra.length();
        setTitle("Sopa de letras");

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(n, n));
        matriz = new JButton[n][n];
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = new JButton();
                if (i == j) {
                	matriz[i][j].setText(Character.toString(palabra.charAt(i)).toUpperCase());
                } else {
                	matriz[i][j].setText(Character.toString((char) (new Random().nextInt(26) + 65)).toUpperCase());
                }
                add(matriz[i][j]);
            }
        }
        pack();
    }

}
 