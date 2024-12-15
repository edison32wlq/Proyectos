package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Listener.FrmPrincipalListener;

public class FrmPrincipal extends JFrame {
	
	private JPanel contentPane;
	private JPanel pnlSur;
	
	private JButton btnCrear;
	private JButton btnGuardar;
	private JButton btnCerrar;
	

	
	public FrmPrincipal() {
		super("Edison Wilfrido Ludeña Quichimbo - 2-1");
		initComponentes();
	}

	
	public void addListeners() {
		btnCrear.addActionListener(new FrmPrincipalListener(this));
	}

	private void initComponentes() {
		setSize(800,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		
		pnlSur = new JPanel(new FlowLayout());
		contentPane.add(pnlSur, BorderLayout.SOUTH);
		
		btnCrear = new JButton("Crear");
		btnGuardar = new JButton("Guardar");
		btnCerrar = new JButton("Cerrar");
		
		pnlSur.add(btnCrear);
		pnlSur.add(btnGuardar);
		pnlSur.add(btnCerrar);
		
	}


	public JButton getBtnCrear() {
		return btnCrear;
	}


	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}


	public JButton getBtnGuardar() {
		return btnGuardar;
	}


	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}


	public JButton getBtnCerrar() {
		return btnCerrar;
	}


	public void setBtnCerrar(JButton btnCerrar) {
		this.btnCerrar = btnCerrar;
	}
	
	
	
}
