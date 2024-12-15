package listeners;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import gui.PanelTexto;
import gui.FrmPrincipal;

/**
* Clase que controla lo eventos al cerrar la ventana
* creado el 9 de Marzo, 2023, 23:00 horas
* @author Joseph Gutierrez Murillo
* @author Harry  Ordoñez Alava 
* @version poo - 2023
 */
public class FrmPrincipalListener extends WindowAdapter{

	private PanelTexto txt;
	private String  contenidoActual;
	private String contenidoGuardado;
	private FrmPrincipal vtn;
	/**
	 * Constructor que recive parametos
	 * @param txt una clase PanelTexto que extiende de JTextPane
	 * @param vtn una clase FrmPrincipal que extiende de JFrame
	 */
	public FrmPrincipalListener(PanelTexto txt,FrmPrincipal vtn) {
		this.txt=txt;
		this.vtn=vtn;
	}
	@Override
	public void windowClosing(WindowEvent e) {
		super.windowClosing(e);
			guardarCerar();
	}
		
		//metodo que permite guardar cuando se cierra la ventana
		private void guardarCerar() {
			contenidoActual = txt.getText();
			if (!contenidoActual.equals(contenidoGuardado)) {
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea guardar los cambios?", "Guardar cambios", JOptionPane.YES_NO_CANCEL_OPTION);
		        
		        if (respuesta == JOptionPane.YES_OPTION) {
		        	JFileChooser fileChooser = new JFileChooser();
		            fileChooser.setDialogTitle("Guardar archivo");
		            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto .ctrc", "ctrc");
		            fileChooser.setFileFilter(filter);
		            int userSelection = fileChooser.showSaveDialog(null);

		            	if (userSelection == JFileChooser.APPROVE_OPTION) {
		            		File fileToSave = fileChooser.getSelectedFile();
			                try {
			        			ObjectOutputStream objSalida = new ObjectOutputStream(new FileOutputStream(fileToSave +".ctrc"));
			        			objSalida.writeObject(txt.getStyledDocument());
			        			objSalida.close();
			        			System.out.println("Archivo guardado");
			        			contenidoGuardado = contenidoActual;
			        			vtn.dispose();
			        			vtn.setDefaultCloseOperation(3);
			        		} catch (IOException e1) {e1.printStackTrace();}
		                
		            	}
		        } else if (respuesta == JOptionPane.NO_OPTION) {
					 vtn.dispose();
				  }
			}
			
		}
	
		
		
}

