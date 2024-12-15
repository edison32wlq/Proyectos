package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmPrincipal extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JButton btnIniciar;

	
	public FrmPrincipal(){
		super("Evento tipo clase propia");
		initComponent();
	}
	
	
	private void initComponent() {
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		
		JPanel pnlSur = new JPanel();
		contentPane.add(pnlSur, BorderLayout.SOUTH);
		btnIniciar = new JButton("Iniciar");
		pnlSur.add(btnIniciar);
		btnIniciar.addActionListener(this);
		
		
		JButton btnCerrar = new JButton("Cerrar");
		pnlSur.add(btnCerrar);
		btnCerrar.addActionListener(this);
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnIniciar) {
			JOptionPane.showMessageDialog(null, "Presionaste Inciar");
			return;
		}
		
		
		
//		JOptionPane.showMessageDialog(null,"Presionaeste Iniciar");
//		System.exit(0);
	}
}
