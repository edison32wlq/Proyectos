package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmPrincipal extends JFrame{
	private JPanel contentPane;

	
	public FrmPrincipal(){
		super("Evento tipo anonimo");
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
		JButton btnIniciar = new JButton("Iniciar");
		pnlSur.add(btnIniciar);
		
		//AGREGANDO EL ESCUHANDO AL BOTON 
		
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Presionaste Iniciar");
			}
		});
		
		JButton btnCerrar = new JButton("Cerrar");
		pnlSur.add(btnCerrar);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		
	}
}
