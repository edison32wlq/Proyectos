package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;

public class FrmPrincipal extends JFrame{

	private JPanel contentPane;
	private JScrollPane spnlAreaTexto;
	private JTextArea txtaDescripcion;
	
	public FrmPrincipal() {
		
		super("Ventana de ScrollPane");
		initComponents();
	}
	
	private void initComponents() {
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		setSize(300,300);
		
		spnlAreaTexto = new JScrollPane();
		contentPane.add(spnlAreaTexto, BorderLayout.CENTER);
		spnlAreaTexto.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		txtaDescripcion = new JTextArea();
		spnlAreaTexto.setViewportView(txtaDescripcion);
		txtaDescripcion.setLineWrap(true);
}
}