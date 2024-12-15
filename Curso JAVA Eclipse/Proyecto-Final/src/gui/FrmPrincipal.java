package gui;
import listeners.FrmPrincipalListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;

/**
 * clase que crea la ventana contenedora
 * creado el 02 de Marzo del 2023 a las 21:00 horas
 * @author Edison Wilfrido Ludeña Quichimbo
 * @author Francisco Javier Calderon Moran
 * @version POO - 2023.
 */
public class FrmPrincipal extends JFrame {
		
	private String titulo;
	private JPanel contentPane;
	private JScrollPane spnlAreaTexto;
	private JTextPane txtPane;
	private JMenuBar menuBar;
	private JPanel pnlWest;
	private JPanel pnlEast;
	private JPanel pnlSouth;
	private JPanel pnlCentro;
	private JMenu mnArchivo;
	private JMenu mnAyuda;
	private JMenuItem mniNuevo;
	private JMenuItem mniAbrir;
	private JMenuItem mniGuardar;
	private JMenuItem mniGuardarCm;
	private JMenuItem mniAutores;
	
	
	/**
	 * metodo vacion en el cual se ingresan los datos
	 */
	public FrmPrincipal() {
		super("nuevo" + "DRY-TXT");
		initComponents();

	}
	public FrmPrincipal(String titulo) {
		super(titulo + "DRY-TXT");
		this.titulo = titulo;
		initComponents();
	}
	/**
	 * Metodo en el cual se adicionaran los listener 
	 */
	private void addListeners() {
		FrmPrincipalListener listener = new FrmPrincipalListener(this);

	}

	
	/**
	 * metodo el cual es usado para recilcar codigo
	 * y en donde se encuentra las especificaciones de la ventana
	 */
	private void initComponents() {
		setSize (800,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		txtPane = new JTextPane();
		spnlAreaTexto = new JScrollPane(txtPane);
		
		pnlWest = new JPanel();
		pnlEast = new JPanel();
		pnlSouth = new JPanel();

        contentPane = new JPanel(new BorderLayout());
        contentPane.add(spnlAreaTexto, BorderLayout.CENTER);
        
        contentPane.add(pnlWest, BorderLayout.WEST);
        pnlWest.setPreferredSize(new Dimension(200, 800));
        contentPane.add(pnlEast, BorderLayout.EAST);
        pnlEast.setPreferredSize(new Dimension(200, 800));
        contentPane.add(pnlSouth, BorderLayout.SOUTH);
        pnlSouth.setPreferredSize(new Dimension(800, 25));
        setContentPane(contentPane);
        
        
        menuBar = new JMenuBar();
		contentPane.add(menuBar);
		
		
				


		
	}
	
	
	


	
	
}
