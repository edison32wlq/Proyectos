package gui;
import javax.swing.*;
import java.awt.*;
public class VentanaContenedora extends JFrame {
	private PanelTexto paneltexto;
	private BarraTarea barratarea;
	public VentanaContenedora() {
		 super ("Ventana Contenedora");
		 this.paneltexto = new PanelTexto();
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(800, 600);
	        setLocationRelativeTo(null);
	        setTitle("Mi ventana contenedora");

	        // Creamos el panel principal con GridLayout de 2 filas y 1 columna
	        JPanel panelPrincipal = new JPanel(new GridLayout(2, 1));

	        // Creamos el panel superior
	        JPanel panelSuperior = new JPanel();
	        panelSuperior.setMaximumSize(new Dimension(Integer.MAX_VALUE, 10));

	        // Creamos el panel inferior con GridLayout de 1 fila y 3 columnas
	        JPanel panelInferior = new JPanel(new GridLayout(1, 3));

	        // Agregamos los paneles al panel principal
	        panelPrincipal.add(panelSuperior);
	        panelPrincipal.add(panelInferior);
	        // Agregamos el panel de texto en la segunda fila, columna del medio
	        panelInferior.add(new JPanel()); // primera columna
	        panelInferior.add(paneltexto); // segunda columna
	        panelInferior.add(new JPanel()); // tercera columna

	        // Agregamos el panel principal a la ventana
	        add(panelPrincipal);
	        this.barratarea = new BarraTarea();
	     // Agregamos la BarraTarea al panel superior en la fila 1
	        panelSuperior.add(barratarea);
	        setVisible(true);
	}
	public static void main (String[] args) {
		VentanaContenedora vc = new VentanaContenedora();
		
	}
}
