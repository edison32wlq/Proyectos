import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class FrmBorderLayout extends JFrame{
	private JPanel contentPane;
	
	public FrmBorderLayout() {
		super("Mi BorderLayout");
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		BorderLayout layout = new BorderLayout();
		contentPane = new JPanel();
		contentPane.setLayout(layout);
		setContentPane(contentPane);
		JButton btnNorth = new JButton("Boton 1");
		contentPane.add(btnNorth,BorderLayout.NORTH);

		JButton btnCenter = new JButton("Boton 2");
		contentPane.add(btnCenter,BorderLayout.CENTER);
		JTextField txtSur = new JTextField(10);
		contentPane.add(txtSur,BorderLayout.SOUTH);
		JLabel lblwest = new JLabel("West");
		contentPane.add(lblwest,BorderLayout.WEST);
		JCheckBox chkEast = new JCheckBox("ON/OFF");
		contentPane.add(chkEast,BorderLayout.EAST);
		
	}
}
