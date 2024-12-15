package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.StyledDocument;
import gui.FrmDlgAutor;
import gui.BrMenu;
import gui.PanelTexto;
import gui.FrmPrincipal;
/**
* Clase que controla los eventos del menu
* creado el 6 de Marzo, 2023, 23:00 horas
* @author Joseph Gutierrez Murillo
* @author Harry  Ordoñez Alava 
* @version poo - 2023
 */
public class BrMenuListener implements ActionListener{
	private PanelTexto txt;
	private BrMenu mn;
	private FrmPrincipal vtn;
	
	/**
	 *Constructor que recive parametros 
	 * @param txt una clase PanelTexto que extiende de JTextPane
	 * @param mn una clase BrMenu que extiende de JMenuBar
	 * @param vtn una Clase FrmPrincipal que extiende de JFrame
	 */
	public BrMenuListener(PanelTexto txt,BrMenu mn,FrmPrincipal vtn) {
		this.txt = txt;
		this.mn=mn;
		this.vtn=vtn;
		
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mn.getmINuevo()) {
			txt.setText(" ");
			
		}
		if(e.getSource()==mn.getmINuevoVentana()) {
			//bandera para salir del bucle
			boolean bandera=true;
			String titulo;
			do {
				titulo = JOptionPane.showInputDialog("ingrese titulo del documento");
				if (titulo != null && !titulo.isEmpty()) {
					new FrmPrincipal(titulo).setVisible(true);
					bandera=false;
				} else {
				
			}
			}while(bandera);
		}
		
		if(e.getSource()==mn.getmIAbrir()) {
			abrir();
		}
		if(e.getSource()==mn.getmIGuardar()) {
			guardadoPlano();
		}
		if(e.getSource()==mn.getmIGuardarComo()) {
			guardarComo();
		}
		if(e.getSource()==mn.getAcercaDe()) {
			FrmPrincipal v = new FrmPrincipal();
			FrmDlgAutor dlg = new FrmDlgAutor(v,"INFORMACION: AUTORES", true);
			dlg.setVisible(true);
		}
		
	}
	//Metodo que guarda el contenido del texto en el escritorio
	private void guardadoPlano() {
		if(vtn.getTitulo()!= null) {
			try {
				String userHomeDir = System.getProperty("user.home");
				String desktopDir = userHomeDir + "/Desktop/";
				ObjectOutputStream objSalida = new ObjectOutputStream(new FileOutputStream(desktopDir+vtn.getTitulo() +".ctrc"));
				objSalida.writeObject(txt.getStyledDocument());
				objSalida.close();
				System.out.println("Archivo guardado con nombre");
			} catch (IOException e) {e.printStackTrace();}
			return;
			
		}else {
			try {
				String userHomeDir = System.getProperty("user.home");
				String desktopDir = userHomeDir + "/Desktop/";
				ObjectOutputStream objSalida = new ObjectOutputStream(new FileOutputStream(desktopDir+"nuevo" +".ctrc"));
				objSalida.writeObject(txt.getStyledDocument());
				objSalida.close();
				System.out.println("Archivo guardado sin nombre");
			} catch (IOException e) {e.printStackTrace();}
			return;
		}
	}
	//Metodo que permite seleccionar el directorio donde se guardara el archivo
	private void guardarComo() {
		JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar archivo");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto .ctc", "ctrc");
		fileChooser.setFileFilter(filter);
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // El usuario seleccionó guardar el archivo
            File fileToSave = fileChooser.getSelectedFile();

            try {
    			ObjectOutputStream objSalida = new ObjectOutputStream(new FileOutputStream(fileToSave +".ctrc"));
    			objSalida.writeObject(txt.getStyledDocument());
    			objSalida.close();
    			System.out.println("Archivo guardado");
    		} catch (IOException e) {e.printStackTrace();}
        }
	}

	//Metodo que permite seleccionar el archivo que desea abrir 
	private void abrir() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Seleccionar archivo");
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto .ctrc", "ctrc");
		fileChooser.setFileFilter(filter);
		int userSelection = fileChooser.showOpenDialog(null);

		if (userSelection == JFileChooser.APPROVE_OPTION) {
		    // El usuario seleccionó un archivo
		    File fileToOpen = fileChooser.getSelectedFile();

		    try {	       
		    	ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileToOpen));
		    	StyledDocument doc = (StyledDocument) ois.readObject();
		        ois.close();
		        txt.setStyledDocument(doc);

		    } catch (IOException | ClassNotFoundException e) {
		        e.printStackTrace();
		    }
		}
	}
	
	
	
}
