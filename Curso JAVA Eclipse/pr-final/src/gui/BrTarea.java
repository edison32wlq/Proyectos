package gui;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JToolBar;
import javax.swing.SpinnerNumberModel;
import listeners.BrTareaListener;


/**
* Clase que contien la barra de tareas
* creado el 18 de Febrero, 2023, 12:00 horas
* @author Joseph Gutierrez Murillo
* @author Harry  Ordoñez Alava 
* @version poo - 2023
 */

public class BrTarea extends JToolBar {

	private JButton btnNegrita;
	private JButton btnItalica;
	private JButton btnColor;
	private JButton btnSubrayado;
	private JSpinner TamanioLetra;
	private JColorChooser colorChooser;
	private PanelTexto pnlText;
	private String[] fontNames;
	private JComboBox<String> fontComboBox;
	
	/**
	 * constructor que no recive parametros 
	 */
	public BrTarea() {
		initComponentsTB();
	}
	
	/**
	 * constuctor recive como parametro un panel de texto 
	 * @param pnlText un panel de texto de tipo PanelTexto que extiende de JTextPane
	 */
	public BrTarea(PanelTexto pnltxt) {
		this.pnlText= pnltxt;
		initComponentsTB();
	}
	/**
	 * metodo que no recive parametros e inicaliza la barra de tareas
	 */
	public void initComponentsTB() {
		
		colorChooser = new JColorChooser();
		btnNegrita = new JButton("<html><p> Negrita <p><html>");
		btnItalica = new JButton("<html><em>Italica<em><html>");
		btnColor = new JButton("<html><p style=\"color: #EF4545;\">Color</p><html>");
		btnSubrayado = new JButton("<html><u>Subrayar<u><html>");
		TamanioLetra = new JSpinner(new SpinnerNumberModel(12, 1, 100, 1));
		setOrientation(HORIZONTAL);
		colorChooser.setPreferredSize(new Dimension(400, 100));
		colorChooser.setPreviewPanel(new JPanel());
		fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();//obtiene todas las fuentes que tengo instaladas
		fontComboBox = new JComboBox<String>(fontNames);
		fontComboBox.setPreferredSize(new Dimension(150,30));
		//panel 
		setLayout(new GridLayout(1,6));
		
		//añadiendo botones a la barra de tareas
		add(btnNegrita);
		add(btnColor);
		add(btnItalica);
		add(btnSubrayado);
		add(TamanioLetra);
		add(fontComboBox);
		
		
		//evetos de los botones 
		TamanioLetra.addChangeListener(new BrTareaListener(pnlText,this));
		btnNegrita.addActionListener(new BrTareaListener(pnlText,this));
		btnItalica.addActionListener(new BrTareaListener(pnlText,this));
		btnSubrayado.addActionListener(new BrTareaListener(pnlText,this));
		btnColor.addActionListener(new BrTareaListener(pnlText,this));
		fontComboBox.addActionListener(new BrTareaListener(pnlText,this));
		
		
	}
	
	
	//accesores getter y setter
	public JButton getBtnNegrita() {
		return btnNegrita;
	}

	public void setBtnNegrita(JButton btnNegrita) {
		this.btnNegrita = btnNegrita;
	}
	
	
	public JButton getBtnItalica() {
		return btnItalica;
	}

	public void setBtnItalica(JButton btnItalica) {
		this.btnItalica = btnItalica;
	}

	public JButton getBtncolor() {
		return btnColor;
	}

	public void setBtncolor(JButton btncolor) {
		this.btnColor = btncolor;
	}

	public JButton getBtnSubrayado() {
		return btnSubrayado;
	}

	public void setBtnSubrayado(JButton btnSubrayado) {
		this.btnSubrayado = btnSubrayado;
	}

	

	public JComboBox<String> getFontComboBox() {
		return fontComboBox;
	}

	public void setFontComboBox(JComboBox<String> fontComboBox) {
		this.fontComboBox = fontComboBox;
	}

	public JSpinner getSpinner() {
		return TamanioLetra;
	}

	public void setSpinner(JSpinner spinner) {
		this.TamanioLetra = spinner;
	}
}