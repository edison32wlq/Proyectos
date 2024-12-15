import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class FrmFlowLayout extends JFrame{
	private JPanel contentPane;
	
	public FrmFlowLayout() {
		super("Mi FlowLayout");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		FlowLayout layout = new FlowLayout();
//		layout.setAlignment(FlowLayout.CENTER);
//		contentPane = new JPanel(layout);
		
		
//		contentPane = new JPanel(new FlowLayout(FlowLayout.CENTER,0,0));
		contentPane = new JPanel();
		setContentPane(contentPane);
		JButton btn1 = new JButton("Boton 1");
		JButton btn2 = new JButton("Boton 2");
		JButton btn3 = new JButton("Boton 3");
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
	}
}
