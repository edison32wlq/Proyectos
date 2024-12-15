package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FrmPrincipal extends JFrame{
	private JPanel contentPane;
	private JButton btnIniciar;
	private JButton btnCerrar;
	private JButton btnBorrar;
	private JLabel lblTitle;
	
	public FrmPrincipal(){
		super("Evento tipo anonimo");
		initComponent();
		//agrego los escuchadores
		addListeners();
	}
	
	private void addListeners() {
		FrmPrincipalListener listener = new FrmPrincipalListener(this);
		
		btnIniciar.addActionListener(listener);
		btnBorrar.addActionListener(listener);
		btnCerrar.addActionListener(listener);
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
		

		btnBorrar = new JButton("Borrar");
		pnlSur.add(btnBorrar);
		
		
		
		
		btnCerrar = new JButton("Cerrar");
		pnlSur.add(btnCerrar);
		
		
		lblTitle = new JLabel("...");
		contentPane.add(lblTitle,BorderLayout.NORTH);
		
	}


	public JButton getBtnIniciar() {
		return btnIniciar;
	}


	public void setBtnIniciar(JButton btnIniciar) {
		this.btnIniciar = btnIniciar;
	}


	public JButton getBtnCerrar() {
		return btnCerrar;
	}


	public void setBtnCerrar(JButton btnCerrar) {
		this.btnCerrar = btnCerrar;
	}


	public JButton getBtnBorrar() {
		return btnBorrar;
	}


	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}


	public JLabel getLblTitle() {
		return lblTitle;
	}


	public void setLblTitle(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}
	
	
}
