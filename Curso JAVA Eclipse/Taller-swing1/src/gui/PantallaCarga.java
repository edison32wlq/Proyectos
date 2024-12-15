package gui;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
* Clase que contiene a la pantalla de carga 
* creado el 10 de Marzo, 2023, 16:00 horas
* @author Joseph Gutierrez Murillo
* @author Harry  Ordoñez Alava 
* @version poo - 2023
 */
public class PantallaCarga extends JFrame implements Runnable {
	private JProgressBar progressBar;
	/**
	 * Constructor por defecto
	 */
    public PantallaCarga() {
        progressBar = new JProgressBar(0, 100);//0 - 100 el rango de la barra de progreso
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setUndecorated(true);//quita el decorado al JFrame
        setLayout(new BorderLayout());
        JLabel label = new JLabel(new ImageIcon("C:\\joseph-gutierrez-murillo\\Tr-final-2da-entrega\\src\\logo2.png"));
        add(label, BorderLayout.CENTER);
        add(progressBar, BorderLayout.SOUTH);
        pack();//ajusta automáticamente el tamaño de una ventana para que se ajuste a su contenido
        setLocationRelativeTo(null);
        setVisible(true);
        
        }
    
    public void run() {
    	 for (int i = 0; i <= 100; i++) {
             progressBar.setValue(i);//progresion de la barra de tareas
        try {
            Thread.sleep(50);//tiempo que se ejecutara el thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    	//cierra esta ventana
        dispose();
        //llama a la ventana principal
        FrmPrincipal iniciar = new FrmPrincipal();
		iniciar.setVisible(true);
       
    }
}
 