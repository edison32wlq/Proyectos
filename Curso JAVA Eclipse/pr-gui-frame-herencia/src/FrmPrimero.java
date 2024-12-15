//import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;

import javax.swing.JFrame;


public class FrmPrimero extends JFrame{
	private JPanel contentPane;
	
	public FrmPrimero() {
		super("Mi primer frame personalizado");
		setSize (500,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
//		contentPane.setBackground(Color.RED);
		JButton btnAceptar  = new JButton("Aceptar");
 		contentPane.add(btnAceptar);
 		JButton btnCancelar  = new JButton("Cancelar");
 		contentPane.add(btnCancelar);

	}

}
