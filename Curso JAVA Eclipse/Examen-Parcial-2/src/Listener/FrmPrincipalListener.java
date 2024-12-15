package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import gui.FrmPrincipal;

public class FrmPrincipalListener implements ActionListener{

	private FrmPrincipal frm;
	
	public FrmPrincipalListener(FrmPrincipal frm) {
		this.frm = frm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == frm.getBtnCrear()) {
			System.exit(0);
		}
		
		if(e.getSource() == frm.getBtnCerrar()) {
			System.exit(0);
		}
		
	}


}


