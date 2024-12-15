package gui;

import java.awt.Font;
import java.io.Serializable;
import javax.swing.JTextPane;
/**
* Clase que contiene el panel de texto 
* creado el 18 de Febrero, 2023, 11:00 horas
* @author Joseph Gutierrez Murillo
* @author Harry  Ordoñez Alava 
* @version poo - 2023
 */
public class PanelTexto extends JTextPane implements Serializable{

	private String contents;
	/**
	 * constructor por defecto 
	 */
	public PanelTexto() {
		setText(contents);
		Font defaultFont = getFont();
		setFont(new Font(defaultFont.getName(), Font.PLAIN, 14));
	}
	

	
	// accesores get y set
	public String getContenido() {
		return contents;
	}

	public void setContenido(String contenido) {
		this.contents = contenido;
	}

}
