package listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import gui.BrTarea;
import gui.PanelTexto;

/**
* Clase que controla los eventos de la Barra de Tareas
* creado el 4 de Marzo, 2023, 14:00 horas
* @author Joseph Gutierrez Murillo
* @author Harry  Ordoñez Alava 
* @version poo - 2023
 */
public class BrTareaListener implements ChangeListener,ActionListener {
		private PanelTexto pnlText;
		private BrTarea brTarea;
		
		
		/**
		 * Constuctor que recive parametros
		 * @param pnlText una clase PanelTexto que extiende de JTextPane
		 * @param brTarea una clase BrTarea que extiende de JToolBar
		 */
	    public BrTareaListener(PanelTexto txt,BrTarea brTarea) {
	    	this.pnlText = txt;
	    	this.brTarea=brTarea;
		
	    }

		@Override
		public void stateChanged(ChangeEvent e) {
			if(e.getSource()==brTarea.getSpinner()) {
				MutableAttributeSet attrs = pnlText.getInputAttributes();
				StyleConstants.setFontSize(attrs,Integer.parseInt(String.valueOf(brTarea.getSpinner().getValue())));
				pnlText.setCharacterAttributes(attrs, false);
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==brTarea.getBtnNegrita()) {
				MutableAttributeSet attrs = pnlText.getInputAttributes();
		        boolean bold = StyleConstants.isBold(attrs);
		        if (bold) {
		            StyleConstants.setBold(attrs, false);
		        } else {
		            StyleConstants.setBold(attrs, true);
		        }
		        pnlText.setCharacterAttributes(attrs, false);
			}
			
			if(e.getSource()==brTarea.getFontComboBox()) {
				MutableAttributeSet attrs = pnlText.getInputAttributes();
				StyleConstants.setFontFamily(attrs, String.valueOf(brTarea.getFontComboBox().getSelectedItem()));	
		        pnlText.setCharacterAttributes(attrs, false);
			}
			if(e.getSource()==brTarea.getBtnItalica()) {
				MutableAttributeSet attrs = pnlText.getInputAttributes();
		        boolean bold = StyleConstants.isItalic(attrs);
		        if (bold) {
		            StyleConstants.setItalic(attrs, false);
		        } else {
		            StyleConstants.setItalic(attrs, true);
		        }
		        pnlText.setCharacterAttributes(attrs, false);		
			}			
			if(e.getSource()==brTarea.getBtnSubrayado()) {
				MutableAttributeSet attrs = pnlText.getInputAttributes();
		        boolean bold = StyleConstants.isUnderline(attrs);
		        if (bold) {
		            StyleConstants.setUnderline(attrs, false);		         
		        } else {
		        	StyleConstants.setUnderline(attrs, true);
		        }
		        pnlText.setCharacterAttributes(attrs, false);
			}
			if(e.getSource()==brTarea.getBtncolor()) {
				Color newColor = JColorChooser.showDialog(null, "Seleccionar color", pnlText.getForeground());
				MutableAttributeSet attrs = pnlText.getInputAttributes();
				StyleConstants.setForeground(attrs, newColor);
				pnlText.setCharacterAttributes(attrs, false);				
			}
			

		}
	}
