package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class FrmPrincipalListener implements ActionListener{
	private FrmPrincipal frm;
	
	
	public FrmPrincipalListener() {
		
	}
	
	public FrmPrincipalListener(FrmPrincipal frm) {
		this.frm = frm;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frm.getBtnIniciar()) {
		JOptionPane.showMessageDialog(null, "Presionaste algun boton");
		frm.getLblTitle().setText("2020");
		return;
		}
		if(e.getSource()== frm.getBtnCerrar()) {

			System.exit(0);
		return;
		}
		if(e.getSource() == frm.getBtnBorrar()){
			frm.getLblTitle().setText("");
		}
	
}
}
