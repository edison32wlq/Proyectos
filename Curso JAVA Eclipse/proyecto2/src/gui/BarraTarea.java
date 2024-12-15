package gui;
import javax.swing.*;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;

import java.awt.*;
import java.awt.event.*;

public class BarraTarea extends JToolBar {

private JButton negritaBtn, italicaBtn, subrayadoBtn, colorBtn, tipoletraBtn;

public BarraTarea() {
    
    
    // Crear botones
    negritaBtn = new JButton(new ImageIcon(getClass().getResource("negrita.png")));
    italicaBtn = new JButton(new ImageIcon(getClass().getResource("italica.png")));
    subrayadoBtn = new JButton(new ImageIcon(getClass().getResource("subrayado.png")));
    colorBtn = new JButton(new ImageIcon(getClass().getResource("color.png")));
    tipoletraBtn = new JButton(new ImageIcon(getClass().getResource("tipoletra.png")));
    
    // Agregar tooltips a los botones
    negritaBtn.setToolTipText("Negrita");
    italicaBtn.setToolTipText("Itálica");
    subrayadoBtn.setToolTipText("Subrayado");
    colorBtn.setToolTipText("Color");
    tipoletraBtn.setToolTipText("Tipo de letra");
    
    // Agregar ActionListener a los botones
    negritaBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cambiarEstiloTexto(Font.BOLD);
        }
    });
    
    italicaBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cambiarEstiloTexto(Font.ITALIC);
        }
    });
    
    subrayadoBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            cambiarEstiloSubrayadoTexto(!panelTexto.getStyledDocument().getCharacterElement(panelTexto.getCaretPosition() - 1)
                    .getAttributes().containsAttribute(javax.swing.text.StyleConstants.CharacterConstants.Underline, Boolean.TRUE));
        }
    });
    
    colorBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //cambiarColorTexto();
        }
    });
    
    tipoletraBtn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //cambiarTipoLetraTexto();
        }
    });
    
    // Agregar botones a la barra de herramientas
    add(negritaBtn);
    add(italicaBtn);
    add(subrayadoBtn);
    add(colorBtn);
    add(tipoletraBtn);
}

// Método para cambiar el estilo del texto (negrita o itálica)
private void cambiarEstiloTexto(int estilo) {
    StyledEditorKit kit = new StyledEditorKit();
    MutableAttributeSet attributes = kit.getInputAttributes();
    attributes.addAttributes(panelTexto.getCharacterAttributes());
    StyleConstants.setBold(attributes, estilo == Font.BOLD);
    StyleConstants.setItalic(attributes, estilo == Font.ITALIC);
    panelTexto.setCharacterAttributes(attributes, false);
}

// Método para cambiar el subrayado del texto
private void cambiarEstiloSubrayadoTexto(boolean subrayado) {
    StyledEditorKit kit = new StyledEditorKit();
    MutableAttributeSet attributes = kit.getInputAttributes();
    attributes.addAttributes(panelTexto.getCharacterAttributes());
    StyleConstants.setUnderline(attributes, subrayado);
    panelTexto.setCharacterAttributes(attributes, false);
}
}