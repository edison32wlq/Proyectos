package gui;



import java.awt.BorderLayout;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.Cliente;
import modelo.GenericDomainTableModel;

import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;

public class FrmPrincipal extends JFrame {
	private JPanel contentPane;
	private JTable tblDatos;
	private JScrollPane spnlTabla;
	
	final String[] columnNames = {"Nombre",
            "Apellidos",
            "Edad",
            "VIP"};
	private JPanel pnlEast;
	private JButton btnNuevo;
	
	
	public FrmPrincipal(){
		super("Tabla básica");
		initComponents();
	}
	
	
	private void initComponents() {
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//reemplazando el contentPane por defecto
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		//creando el panel con barras
		spnlTabla = new JScrollPane();
		spnlTabla.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(spnlTabla, BorderLayout.CENTER);
		//creando la tabla con la columna y los datos
//		modeloTabla = new MyTableModel(Arrays.asList(columnNames));
		tblDatos = new JTable(modeloTabla);
		spnlTabla.setViewportView(tblDatos);
		
		pnlEast = new JPanel();
		contentPane.add(pnlEast, BorderLayout.EAST);
		
		pnlEast.setLayout(new BorderLayout(0, 0));
		
		pnlEastCenter = new JPanel();
		pnlEast.add(pnlEastCenter, BorderLayout.CENTER);
		pnlEastCenter.setLayout(new GridLayout(4, 0, 0, 0));
		
		pnlEastCenter1 = new JPanel();
		FlowLayout fl_pnlEastCenter1 = (FlowLayout) pnlEastCenter1.getLayout();
		fl_pnlEastCenter1.setAlignment(FlowLayout.LEFT);
		pnlEastCenter.add(pnlEastCenter1);
		
		lblNombre = new JLabel("Nombre:");
		pnlEastCenter1.add(lblNombre);
		
		txtNombre = new JTextField();
		pnlEastCenter1.add(txtNombre);
		txtNombre.setColumns(10);
		
		pnlEastCenter2 = new JPanel();
		FlowLayout fl_pnlEastCenter2 = (FlowLayout) pnlEastCenter2.getLayout();
		fl_pnlEastCenter2.setAlignment(FlowLayout.LEFT);
		pnlEastCenter.add(pnlEastCenter2);
		
		lblApellidos = new JLabel("Apellidos:");
		pnlEastCenter2.add(lblApellidos);
		
		txtApellidos = new JTextField();
		pnlEastCenter2.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		pnlEastCenter3 = new JPanel();
		FlowLayout fl_pnlEastCenter3 = (FlowLayout) pnlEastCenter3.getLayout();
		fl_pnlEastCenter3.setAlignment(FlowLayout.LEFT);
		pnlEastCenter.add(pnlEastCenter3);
		
		lblEdad = new JLabel("Edad:");
		pnlEastCenter3.add(lblEdad);
		
		txtEdad = new JTextField();
		pnlEastCenter3.add(txtEdad);
		txtEdad.setColumns(10);
		
		pnlEastCenter4 = new JPanel();
		FlowLayout fl_pnlEastCenter4 = (FlowLayout) pnlEastCenter4.getLayout();
		fl_pnlEastCenter4.setAlignment(FlowLayout.LEFT);
		pnlEastCenter.add(pnlEastCenter4);
		
		chkVip = new JCheckBox("VIP");
		pnlEastCenter4.add(chkVip);
		
		pnlEastSouth = new JPanel();
		btnNuevo = new JButton("Nuevo");
		pnlEastSouth.add(btnNuevo);
		
		pnlEast.add(pnlEastSouth, BorderLayout.SOUTH);
		
		btnGuardar = new JButton("Guardar");
		pnlEastSouth.add(btnGuardar);
		
		btnEliminar = new JButton("Eliminar");
		pnlEastSouth.add(btnEliminar);
		
	}
	 
	//Modelo de tabla: Toma los datos del modelo general de la tabla y de médico, y genera un registro con los datos que le envíen.
	private GenericDomainTableModel<Cliente> modeloTabla = 
			new GenericDomainTableModel<Cliente>(Arrays.asList(columnNames)){
		@Override
		public Class<?> getColumnClass(int columnIndex) 
		{
			/**
			 * tipo de datos que recibe la tabla
			 */
			switch(columnIndex){
				case 0: return String.class;
				case 1: return String.class;
				case 2: return Integer.class;
				case 3: return Boolean.class;
			}
			throw new ArrayIndexOutOfBoundsException(columnIndex);
		}

		/**
		 * Recibe los datos de la instancia
		 */
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex){
	    	Cliente obj = getDomainObject(rowIndex);
	        switch(columnIndex){
	            case 0: return obj.getNombre();
				case 1: return obj.getApellidos();
				case 2: return obj.getEdad();
				case 3: return obj.isEsVip();
						
	            default: throw new ArrayIndexOutOfBoundsException(columnIndex);
	        }
	    }

	    /**
	     *  Carga los valores en la tabla
	     */
	    @Override
	    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
	    	
	        Cliente obj = getDomainObject(rowIndex);
	        switch(columnIndex) 
	        {
	            case 0: obj.setNombre((String)aValue); break;
				case 1: obj.setApellidos((String)aValue); break;
				case 2: obj.setEdad((int)aValue); break;
				case 3: obj.setEsVip((boolean)aValue);break;
	            
	            default: throw new ArrayIndexOutOfBoundsException(columnIndex);
	        }
	        notifyTableCellUpdated(rowIndex, columnIndex);
	    }
	};
	private JPanel pnlEastCenter;
	private JPanel pnlEastSouth;
	private JButton btnEliminar;
	private JButton btnGuardar;
	private JPanel pnlEastCenter4;
	private JPanel pnlEastCenter1;
	private JPanel pnlEastCenter2;
	private JPanel pnlEastCenter3;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblApellidos;
	private JTextField txtApellidos;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JCheckBox chkVip;
	
}
