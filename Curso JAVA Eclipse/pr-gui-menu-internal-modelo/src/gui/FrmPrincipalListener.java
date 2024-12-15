package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;

public class FrmPrincipalListener implements ActionListener {

	private FrmPrincipal frm;
	
	public FrmPrincipalListener(FrmPrincipal frm) {
		this.frm = frm;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frm.getMniNuevo()) {
			IFrmPersona ifrm = new IFrmPersona();

			ifrm.setVisible(true);
			frm.getDesktop().add(ifrm);
			return;
		}
		if(e.getSource() == frm.getMniSalir()) {
			System.exit(0);
		}

	}

}
