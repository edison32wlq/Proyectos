package gui;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenu mnAyuda;
	private JMenuItem mniAbrir;
	private JMenuItem mniNuevo;
	private JMenuItem mniSalir;
	private JMenu mnWindow;
	private JMenu mnPerspective;
	private JMenu mnOpenPerspective;
	private JMenuItem mniDebug;
	private JDesktopPane desktop;
	
	
	public FrmPrincipal()  {
		super("Ventana con Menus e ventanas internas");
		initComponentes();
		addListeners();
		
	}
	
	private void addListeners() {
		mniNuevo.addActionListener(new FrmPrincipalListener(this));
	}
	
	
	private void initComponentes() {
		setSize(500,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Reemplazando el contentPane por defecto
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		
		//agregandop la barra de menu
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mniNuevo = new JMenuItem("Nuevo");
		mnArchivo.add(mniNuevo);
		
		mniAbrir = new JMenuItem("Abrir");
		mnArchivo.add(mniAbrir);
		
		mniSalir = new JMenuItem("Salir");
		mnArchivo.add(mniSalir);
		
		mnWindow = new JMenu("Window");
		mnPerspective = new JMenu("Perspective");
		mnOpenPerspective = new JMenu("Open Perspective");
		mniDebug = new JMenuItem("Debug");
		
		menuBar.add(mnWindow);
		mnWindow.add(mnPerspective);
		mnPerspective.add(mnOpenPerspective);
		mnOpenPerspective.add(mniDebug);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		//agrefgando un escritorio virtual al contentPane
		desktop = new JDesktopPane();
		contentPane.add(desktop, BorderLayout.CENTER);
		
	
	}

	public JMenuItem getMniNuevo() {
		return mniNuevo;
	}

	public void setMniNuevo(JMenuItem mniNuevo) {
		this.mniNuevo = mniNuevo;
	}

	public JMenuItem getMniSalir() {
		return mniSalir;
	}

	public void setMniSalir(JMenuItem mniSalir) {
		this.mniSalir = mniSalir;
	}

	public JDesktopPane getDesktop() {
		return desktop;
	}

	public void setDesktop(JDesktopPane desktop) {
		this.desktop = desktop;
	}

	
	
	
	
}
