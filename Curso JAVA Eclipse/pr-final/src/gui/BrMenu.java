package gui;
import listeners.BrMenuListener;
import java.awt.Color;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


/**
* Clase que contiene los elementos de la barra de menu
* creado el 18 de Febrero, 2023, 10:00 horas
* @author Joseph Gutierrez Murillo
* @author Harry  Ordoñez Alava 
* @version poo - 2023
 */
public class BrMenu extends JMenuBar  {

	private JMenu menuArchivo;
	private JMenu menuAyuda;
	private JMenuItem mINuevo;
	private JMenuItem mINuevoVentana;
	private JMenuItem mIAbrir;
	private JMenuItem mIGuardarComo;
	private JMenuItem mIGuardar;
	private JMenuItem acercaDe;
	private PanelTexto pnltxt;
	private FrmPrincipal vtn;
	/**
	 * Constructor sin parametros 
	 */
	public BrMenu() {
		initComponentsBrM();
	}
	/**
	 * contructor que recibe la intancia de un panel de texto y del Jframe en ejecucion 
	 * @param pnltxt corresponde a un JTextPane
	 * @param vtn es el JFrame en ejecucion
	 */
	public BrMenu(PanelTexto pnltxt,FrmPrincipal vtn) {
		this.pnltxt=pnltxt;
		this.vtn=vtn;
		initComponentsBrM();

	}
	/**
	 * metodo que no recive parametros e inicializa la barra de menu
	 */
	public void initComponentsBrM() {
		
		menuArchivo = new JMenu("Archivo");
		menuAyuda = new JMenu("Ayuda");
		mINuevo = new JMenuItem(" Nuevo  ");
		mINuevoVentana = new JMenuItem(" Nueva Ventana ");
		mIAbrir = new JMenuItem(" Abrir ");
		mIGuardarComo = new JMenuItem(" Guardar como ");
		mIGuardar = new JMenuItem(" Guardar");
		acercaDe = new JMenuItem("  acerca De             ");
		// añaniendo elementos a la barra de menu
		add(menuArchivo);
		add(menuAyuda);
		//añadiendo elementos al menu Archivo
		menuArchivo.add(mINuevo);	
		menuArchivo.add(mINuevoVentana);
		menuArchivo.add(mIAbrir);
		menuArchivo.add(mIGuardar);
		menuArchivo.add(mIGuardarComo);
		//añadiendo elementos al menu ayuda
		menuAyuda.add(acercaDe);
		//color de la barra de menu
		setBackground(Color.WHITE);
		
		//eventos
		mINuevo.addActionListener(new BrMenuListener(pnltxt, this,vtn));
		mINuevoVentana.addActionListener(new BrMenuListener(pnltxt, this,vtn));
		mIAbrir.addActionListener(new BrMenuListener(pnltxt, this,vtn));
		mIGuardar.addActionListener(new BrMenuListener(pnltxt, this,vtn));
		mIGuardarComo.addActionListener(new BrMenuListener(pnltxt, this,vtn));
		acercaDe.addActionListener(new BrMenuListener(pnltxt, this,vtn));
		
	}
	
	
	//accesores getter y setter 
	public JMenuItem getmINuevo() {
		return mINuevo;
	}
	public void setmINuevo(JMenuItem mINuevo) {
		this.mINuevo = mINuevo;
	}
	
	public JMenuItem getmINuevoVentana() {
		return mINuevoVentana;
	}
	public void setmINuevoVentana(JMenuItem mINuevoVentana) {
		this.mINuevoVentana = mINuevoVentana;
	}
	public JMenuItem getmIAbrir() {
		return mIAbrir;
	}
	public void setmIAbrir(JMenuItem mIAbrir) {
		this.mIAbrir = mIAbrir;
	}
	
	public JMenuItem getmIGuardarComo() {
		return mIGuardarComo;
	}
	public void setmIGuardarComo(JMenuItem mIGuardarComo) {
		this.mIGuardarComo = mIGuardarComo;
	}
	public JMenuItem getmIGuardar() {
		return mIGuardar;
	}
	public void setmIGuardar(JMenuItem mIGuardar) {
		this.mIGuardar = mIGuardar;
	}
	public JMenuItem getAcercaDe() {
		return acercaDe;
	}
	public void setAcercaDe(JMenuItem acercaDe) {
		this.acercaDe = acercaDe;
	}
	
	
	
}
