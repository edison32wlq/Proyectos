package gui;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class IFrmPersona extends JInternalFrame{

	private JPanel contentPane;
	
	public IFrmPersona() {
		super("Mi ventana Interna");
		initComponents();
	}
	
	private void initComponents() {
		contentPane = new JPanel();
		setContentPane(contentPane);
		setSize(300,200);
		setLocation(200,200);
		setMaximizable(true);
		setIconifiable(true);
		setResizable(true);
		setClosable(true);
	}
}
