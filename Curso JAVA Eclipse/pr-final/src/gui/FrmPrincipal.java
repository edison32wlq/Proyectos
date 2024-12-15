package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import listeners.FrmPrincipalListener;
/**
* Clase que contiene el JFrame principal
* creado el 18 de Febrero, 2023, 11:00 horas
* @author Joseph Gutierrez Murillo
* @author Harry  Ordoñez Alava 
* @version poo - 2023
 */
public class FrmPrincipal extends JFrame  {

	private String titulo;
	private JPanel contentPane;
	private JPanel pnlNorth;
	private JPanel pnlCentro;
	private PanelTexto pnlTexto;
	private BrTarea brTarea;
	private BrMenu menu1;
	private JScrollPane scrolPane;
	
	/**
	 * Constructor por defecto
	 */
	public FrmPrincipal() {
		super("nuevo"+ " -Dry(TXT)");
		iniComponent();
	}

	/**
	 * Constructor que recive parametros
	 * @param titulo el titulo del documento , es de tipo String
	 */
	public FrmPrincipal(String titulo) {
		super(titulo + " -Dry(TXT)");
		this.titulo = titulo;
		iniComponent();
	}
	
	/**
	 * Metodo que no recive parametros y contiene los componentes para inicializar la ventana
	 */
	public void iniComponent() {
		//cambia el icono del JFrame
//		Image icon = Toolkit.getDefaultToolkit().getImage(".\\src\\icon.png");
//		setIconImage(icon);
		//inicializacion de variabres 
		pnlTexto = new PanelTexto();
		brTarea = new BrTarea(pnlTexto);
		menu1 = new BrMenu(pnlTexto,this);
		pnlNorth = new JPanel();
		pnlCentro = new JPanel();
		contentPane = new JPanel(new BorderLayout(5,5));
		scrolPane = new JScrollPane(pnlTexto);
		// ajustes del jframe
		setSize (900,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setExtendedState(MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(930,700));
		scrolPane.setPreferredSize(new Dimension(600,500));
		//reemplanzando el contentPane por defecto
		setContentPane(contentPane);
		// barra de menu
		setJMenuBar(menu1);
		//añadiendo elementos al panel
		contentPane.add(pnlCentro);
		contentPane.add(pnlNorth,BorderLayout.NORTH);
		pnlCentro.add(scrolPane);
		//configuracion de la barra de scroll
		scrolPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrolPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		//agregando barra de tarea
		pnlNorth.add(brTarea);
		addWindowListener(new FrmPrincipalListener(pnlTexto,this));
	}
	//accesores getter y setter
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
	

}
