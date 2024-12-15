package listeners;

import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;

import gui.BarraTarea;
import gui.PanelTexto;

public class BrTareaListener implements ChangeListener,ActionListener{

	private JTextPane pnlText;
	private JToolBar brTarea;
	
	public BrTareaListener (JTextPane pnlText,JToolBar brTarea) {
    	this.pnlText = pnlText;
    	this.brTarea = brTarea;
    }
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource()==brTarea.getTamanioLetra()) {
			MutableAttributeSet attrs = txt.getInputAttributes();
			StyleConstants.setFontSize(attrs,Integer.parseInt(String.valueOf(brTarea.getSpinner().getValue())));
			txt.setCharacterAttributes(attrs, false);
		}
	}
	
}
