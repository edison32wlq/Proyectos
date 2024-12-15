package gui;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class FrmPrincipal extends JFrame{
	private JPanel contentPane;
	private JPanel pnlSur;
	private JPanel pnlCentro;
	
	FrmPrincipal(String titulo){
		super(titulo);
		initComponents();
	}
	
	public FrmPrincipal() {
		super("Ventana de Paneles");
		initComponents();
	}
	private void initComponents() {
		setSize(400,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		contentPane = new JPanel(new BorderLayout());
		setContentPane(contentPane);
		
		pnlSur = new JPanel();//layout por defecto
		contentPane.add(pnlSur, BorderLayout.SOUTH);
		
		
		JButton btnAceptar = new JButton("Aceptar");
		JButton btnCancelar = new JButton("Cancelar");
		pnlSur.add(btnAceptar,BorderLayout.SOUTH);
		pnlSur.add(btnCancelar,BorderLayout.SOUTH);
		
		
		//centro
		
		pnlCentro = new JPanel(new GridLayout(3,2));
		contentPane.add(pnlCentro,BorderLayout.CENTER);
		JLabel lblNombre = new JLabel("Nombre");
		pnlCentro.add(lblNombre);
		JTextField txtNombre = new JTextField();
		pnlCentro.add(txtNombre);
		JLabel lblApellidos = new JLabel("Apellidos");
		pnlCentro.add(lblApellidos);
		JTextField txtApellidos = new JTextField();
		pnlCentro.add(txtApellidos);
		
		//AGREGANDO FECHA
		JLabel lblFechaNacimiento = new JLabel("Fecha de Nacimiento");
		pnlCentro.add(lblFechaNacimiento);
		
		JPanel pnlFechaNacimiento = new JPanel();
		pnlCentro.add(pnlFechaNacimiento);
		
		JLabel lblDia = new JLabel("DD");
		pnlFechaNacimiento.add(lblDia);
		JTextField txtDia = new JTextField(2);
		pnlFechaNacimiento.add(txtDia);
		
		JLabel lblMes = new JLabel("MM");
		pnlFechaNacimiento.add(lblMes);
		JTextField txtMes = new JTextField(2);
		pnlFechaNacimiento.add(txtMes);
		
		JLabel lblAnio = new JLabel("AAAA");
		pnlFechaNacimiento.add(lblAnio);
		JTextField txtAnio = new JTextField(2);
		pnlFechaNacimiento.add(txtAnio);
	}
	
}
	
