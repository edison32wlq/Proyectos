package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Cliente;

public class FrmPrincipalListener extends MouseAdapter implements ActionListener, KeyListener{
	private FrmPrincipal frm;
	private Cliente cliente;
	private List<Cliente> lstClientes;
	
	public FrmPrincipalListener(FrmPrincipal frm) {
		this.frm = frm;
		cliente = null;
		lstClientes = leerDatos();
		frm.getModeloTabla().addRows(lstClientes);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frm.getTxtNombre()) {
			frm.getTxtApellidos().requestFocus();
			return;
		}
		if(e.getSource() == frm.getBtnNuevo()) {
			nuevo();
			return;
		}
		if(e.getSource() == frm.getBtnAgregar()) {
			agregar();
			return;
		}
		if(e.getSource() == frm.getMniGuardar()) {
			guardar();
			return;
		}
		if(e.getSource() == frm.getMniSalir()) {
			System.exit(0);
		}
		
	}
	
	private void guardar() {
		try {
			ObjectOutputStream objSalida = new ObjectOutputStream(new FileOutputStream("./src/salida2023.poo"));
			objSalida.writeObject(frm.getModeloTabla().getDomainObjects());
			objSalida.close();
			JOptionPane.showMessageDialog(frm, "Archivo guardado!!!!");
		}catch (IOException e) {e.printStackTrace();}
	}

	
	private List<Cliente> leerDatos() {
		List<Cliente> lstCliente = null;
		try {
			ObjectInputStream objEntrada = new ObjectInputStream(new FileInputStream("./src/salida2023.poo"));
			lstCliente = (List<Cliente>) objEntrada.readObject();
			objEntrada.close();
		}catch(IOException e) {e.printStackTrace();}catch(ClassNotFoundException e) {e.printStackTrace();}
		return lstCliente;
	}
	private void agregar() {
		String nombre = frm.getTxtNombre().getText();
		String apellidos = frm.getTxtApellidos().getText();
		int edad = Integer.parseInt(frm.getTxtEdad().getText());
		boolean vip = frm.getChkVip().isSelected();
		Cliente cliente = new Cliente();
		cliente.setNombre(nombre);
		cliente.setApellidos(apellidos);
		cliente.setEdad(edad);
		cliente.setEsVip(vip);
		frm.getModeloTabla().addRow(cliente);
		nuevo();
	}
		
	private void nuevo() {
		frm.getTxtNombre().setText("");
		frm.getTxtApellidos().setText("");
		frm.getTxtEdad().setText("");
		frm.getChkVip().setSelected(false);
		frm.getTxtNombre().requestFocus();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_ENTER && e.getSource() == frm.getBtnAgregar()) {
			agregar();
			return;
		}
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
	private void loadCliente() {
		frm.getTxtNombre().setText(cliente.getNombre());
		frm.getTxtApellidos().setText(cliente.getApellidos());
		frm.getTxtEdad().setText(Integer.toString(cliente.getEdad()));
		frm.getChkVip().setSelected(cliente.isEsVip());
		frm.getTxtNombre().requestFocus();
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		int viewIndex = frm.getTblDatos().getSelectedRow();
		int modelIndex = frm.getTblDatos().convertRowIndexToModel(viewIndex);
		cliente = frm.getModeloTabla().getDomainObject(modelIndex);
		loadCliente();
	}
	
}

