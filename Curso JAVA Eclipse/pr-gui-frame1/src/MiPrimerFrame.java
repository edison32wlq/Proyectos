import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MiPrimerFrame {
	public static void main(String [] args) {
		JFrame miFrame = new JFrame();
		miFrame.setTitle("Mi primer frame");
		
  		miFrame.setSize(500,200);
//		miFrame.setLocation(100,200);
		
//		miFrame.setBounds(100,200,500,200);
		miFrame.setLocationRelativeTo(null);
		
		miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miFrame.getContentPane().setBackground(Color.red);
		JButton btnAceptar = new JButton("Aceptar");
		miFrame.getContentPane().add(btnAceptar);
		miFrame.setVisible(true);
		

	}
}
