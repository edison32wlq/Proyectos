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

import modelo.Persona;

import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipal extends JFrame {
	private JPanel contentPane;
	private JTable tblDatos;
	private JScrollPane spnlTabla;
	private JTextArea txtaOutput;
	
	final String[] columnNames = {"Nombre",
            "Apellidos",
            "Edad"};
	private JPanel panel;
	private JButton btnNuevo;
	
	
	public FrmPrincipal(){
		super("Tabla básica");
		initComponents();
	}
	
	
	private void initComponents() {
		setSize(500,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//reemplazando el contentPane por defecto
		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		//creando el panel con barras
		spnlTabla = new JScrollPane();
		spnlTabla.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(spnlTabla, BorderLayout.NORTH);
		//agregando una etiqueta al sur del contentPane
		txtaOutput = new JTextArea();
		contentPane.add(new JScrollPane(txtaOutput),BorderLayout.CENTER);
		//creando la tabla con la columna y los datos
//		modeloTabla = new MyTableModel(Arrays.asList(columnNames));
		tblDatos = new JTable(modeloTabla);
		spnlTabla.setViewportView(tblDatos);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Persona p = new Persona("Juan","Pérez",20);
				modeloTabla.addRow(p);
			}
		});
		panel.add(btnNuevo);
		
		
		tblDatos.getSelectionModel().addListSelectionListener(new RowListener());
		tblDatos.getColumnModel().getSelectionModel().
            addListSelectionListener(new ColumnListener());
	}
	
	 private void outputSelection() {
	        txtaOutput.append(String.format("Lead: %d, %d. ",
	                    tblDatos.getSelectionModel().getLeadSelectionIndex(),
	                    tblDatos.getColumnModel().getSelectionModel().
	                        getLeadSelectionIndex()));
	        txtaOutput.append("Rows:");
	        for (int c : tblDatos.getSelectedRows()) {
	            txtaOutput.append(String.format(" %d", c));
	        }
	        txtaOutput.append(". Columns:");
	        for (int c : tblDatos.getSelectedColumns()) {
	            txtaOutput.append(String.format(" %d", c));
	        }
	        txtaOutput.append(".\n");
	    }

	private class RowListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                return;
            }
            txtaOutput.append("ROW SELECTION EVENT. ");
    		outputSelection();
        }
    }
 
    private class ColumnListener implements ListSelectionListener {
        public void valueChanged(ListSelectionEvent event) {
            if (event.getValueIsAdjusting()) {
                return;
            }
            txtaOutput.append("COLUMN SELECTION EVENT. ");
    		outputSelection();
        }
    }
 
	//Modelo de tabla: Toma los datos del modelo general de la tabla y de médico, y genera un registro con los datos que le envíen.
	private GenericDomainTableModel<Persona> modeloTabla = new GenericDomainTableModel<Persona>(Arrays.asList(columnNames))
	{
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
			}
			throw new ArrayIndexOutOfBoundsException(columnIndex);
		}

		/**
		 * Recibe los datos de la instancia
		 */
	    @Override
	    public Object getValueAt(int rowIndex, int columnIndex) 
	    {
	    	Persona persona = getDomainObject(rowIndex);
	        switch(columnIndex){
	            case 0: return persona.getNombre();
				case 1: return persona.getApellidos();
				case 2: return persona.getEdad();
						
	            default: throw new ArrayIndexOutOfBoundsException(columnIndex);
	        }
	    }

	    /**
	     *  Carga los valores en la tabla
	     */
	    @Override
	    public void setValueAt(Object aValue, int rowIndex, int columnIndex)
	    {
	    	
	        Persona persona = getDomainObject(rowIndex);
	        switch(columnIndex) 
	        {
	            case 0: persona.setNombre((String)aValue); break;
				case 1: persona.setApellidos((String)aValue); break;
				case 2: persona.setEdad((int)aValue); break;
	            
	            default: throw new ArrayIndexOutOfBoundsException(columnIndex);
	        }
	        notifyTableCellUpdated(rowIndex, columnIndex);
	    }
	};
	
}
