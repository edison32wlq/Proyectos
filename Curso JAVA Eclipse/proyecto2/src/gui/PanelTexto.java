package gui;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
import javax.swing.JTextPane;
//import javax.swing.text.StyledEditorKit;
public class PanelTexto extends JTextPane {
	String contenido;
    public PanelTexto() {
    	  setFont(new Font("Arial", Font.PLAIN, 12));
          setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
          // Establecer el tamaño en píxeles
          int width = (int) (21 * 96 / 2.54);
          int height = (int) (29.7 * 96 / 2.54);
          setPreferredSize(new Dimension(width, height));
          // Agregar un DocumentListener para detectar cambios en el texto
          getDocument().addDocumentListener(new DocumentListener() {
              @Override
              public void insertUpdate(DocumentEvent e) {
                  actualizarContenido();
              }

              @Override
              public void removeUpdate(DocumentEvent e) {
                  actualizarContenido();
              }

              @Override
              public void changedUpdate(DocumentEvent e) {
                  actualizarContenido();
              }
          });
      }

      // Actualizar el atributo contenido con el nuevo texto
      private void actualizarContenido() {
          try {
              contenido = getDocument().getText(0, getDocument().getLength());
          } catch (BadLocationException ex) {
              ex.printStackTrace();
          }
      }

      public String getContenido() {
          return contenido;
      }
   }

