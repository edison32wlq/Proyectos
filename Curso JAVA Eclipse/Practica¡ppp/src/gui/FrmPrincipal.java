package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JToolBar;

public class FrmPrincipal extends JFrame {
	
	private JPanel contentPane;
	private JScrollPane spnlAreaTxt;
	private JTextPane txtPane;
	private JMenuBar menuBar;
	private JLabel lbljk;
	private JMenu mnArchivo;
	private JMenuItem mniGuardar;
	private JMenuItem mniCargar;
	private JToolBar mnTarea;
	
	private JButton btnSopa;
	
	
	public FrmPrincipal() {
		super("Vamos a pasar!!!!!");
		initComponents();
	}
	
	
	private void addListeners() {
		
	}
	
	private void initComponents() {
		setSize(800,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
        contentPane = new JPanel(new BorderLayout());
        setContentPane(contentPane);

        spnlAreaTxt = new JScrollPane();
        txtPane = new JTextPane();
        menuBar = new JMenuBar();
        mnArchivo = new JMenu("Archivo");
        mniGuardar = new JMenuItem("Guardar");
        mniCargar = new JMenuItem("Cargar");

        contentPane.add(spnlAreaTxt, BorderLayout.CENTER);

        spnlAreaTxt.setViewportView(txtPane);
        
        
        setJMenuBar(menuBar);
        
        menuBar.add(mnArchivo);
        
        mnArchivo.add(mniGuardar);
        
        mnArchivo.add(mniCargar);
      
        
    }
		
}

