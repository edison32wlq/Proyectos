package gui;

import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Autor;
/**
* Clase que controla las acciones del JDialog de los lstAu 
* creado el 18 de Febrero, 2023, 12:00 horas
* @author Joseph Gutierrez Murillo
* @author Harry  Ordoñez Alava 
* @version poo - 2023
 */
public class FrmDlgAutor extends JDialog {
	private List<Autor> lstAu;
	private JLabel lblFoto1;
	private JLabel lblAutor1;
	private JLabel lblAutor2;
	private JLabel lblFoto2;
	/**
	 * Constructor por defecto 
	 */
	public FrmDlgAutor() {
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		mostrar();
	}
	/**
	 * Constructor 
	 * @param ventana recive un JFrme como parametro
	 * @param titulo Nombre que tendra el JDialog
	 * @param modal establece si la ventana sera modal o no , valores aceptados true/false 
	 */
	public FrmDlgAutor(FrmPrincipal ventana,String titulo, boolean modal) {
		super(ventana,titulo,modal);
		setSize(400, 300);
		setLocationRelativeTo(ventana);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		mostrar();
		
	}

	/**
	 * Metodo que no recive parametros y carga los componentes del JDialog
	 */
	public void mostrar() {
		//inicializacion de variables
		lstAu = new ArrayList<Autor>();
		lstAu.add(new Autor("Edison Lude�a", new ImageIcon(".\\iconos\\Ludenia.jpeg"), "edison.ludena@ug.edu.ec"));
		lstAu.add(new Autor("Francisco Calderon",new ImageIcon(".\\iconos\\Francisco.jpg"), "francisco.calderonmor@ug.edu.ec"));
		lblAutor1 = new JLabel("<html>"+"  "+lstAu.get(0).getNombre()+"<br>"+lstAu.get(0).getEmail()+"<html>");
		lblAutor2 = new JLabel("<html>"+"  "+lstAu.get(1).getNombre()+"<br>"+lstAu.get(1).getEmail()+"<html>");
		lblFoto1 = new JLabel();
		lblFoto2 = new JLabel();
		//redimencionando imagenes 
		Image imgLudenia = lstAu.get(0).getFoto().getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon newLudenia = new ImageIcon(imgLudenia);
		Image imgCalderon = lstAu.get(1).getFoto().getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		ImageIcon newCalderon = new ImageIcon(imgCalderon);
		//añado imagen al JLabel
		lblFoto1.setIcon(newLudenia);
		lblFoto2.setIcon(newCalderon);
		//cambiando el layout por de defecto por un GridLayout 2x2
		JPanel panel = new JPanel(new GridLayout(2,2));
		setContentPane(panel);
        // Agregar componentes al JPanel
        panel.add(lblAutor1);
        panel.add(lblFoto1);
        panel.add(lblAutor2);
        panel.add(lblFoto2);
	}
	
	// Metodos accesores get y set
	public List<Autor> getAutores() {
		return lstAu;
	}

	public void setAutores(List<Autor> autores) {
		this.lstAu = autores;
	}

}
