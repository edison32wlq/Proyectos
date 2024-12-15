package gui;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import modelo.Autor;


/**
 * clase en la cual se tendra las funciones para el JDialog
 * creado el 02 de Marzo del 2023 a las 21:00 horas
 * @author Edison Wilfrido Ludeña Quichimbo
 * @author Francisco Javier Calderon Moran
 * @version POO - 2023.
 *
 */
public class FrmDlgAutor extends JDialog {
	
	private List<Autor> lstautores;
	private JLabel lblAutor1;
	private JLabel lblAutor2;
	private JLabel lblFoto1;
	private JLabel lblFoto2;
	
	
	
	public FrmDlgAutor() {
		setSize(500,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	public FrmDlgAutor(FrmPrincipal frm, String titulo, boolean modal) {
		super(frm,titulo,modal);
		setLocationRelativeTo(frm);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		mostrar();
		
	}
	
	public void mostrar() {
		lblAutor1 = new JLabel("<html>"+"  "+lstautores.get(0).getNombre()+"<br>"+lstautores.get(0).getEmail()+"<html>");
		lblAutor2 = new JLabel("<html>"+"  "+lstautores.get(1).getNombre()+"<br>"+lstautores.get(1).getEmail()+"<html>");
		lblFoto1 = new JLabel();
		lblFoto2 = new JLabel();
		JPanel pane = new JPanel(new GridLayout(2,2));
		setContentPane(pane);
        // Agregar componentes al JPanel
        pane.add(lblAutor1);
        pane.add(lblFoto1);
        pane.add(lblAutor2);
        pane.add(lblFoto2);
	}
	public List<Autor> getLstautores() {
		return lstautores;
	}
	public void setLstautores(List<Autor> lstautores) {
		this.lstautores = lstautores;
	}
	
	
}
