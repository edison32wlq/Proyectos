import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class FrmGridLayout extends JFrame{
	private JPanel contentPane;
	
	public FrmGridLayout() {
		super("Mi FlowLayout");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

//		GridLayout layout = new GridLayout(2,3);
//		contentPane = new JPanel(layout);
		
		contentPane = new JPanel(new GridLayout(2,3));
		
		setContentPane(contentPane);
//		JButton btn1 = new JButton("Boton 1");
//		JButton btn2 = new JButton("Boton 2");
//		JButton btn3 = new JButton("Boton 3");
//		contentPane.add(btn1);
//		contentPane.add(btn2);
//		contentPane.add(btn3);
		
		for(int i=0; i<5; i++){
			contentPane.add(new JButton("Btn"+i));
		}
	}
}
