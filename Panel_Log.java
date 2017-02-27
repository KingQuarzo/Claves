/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author luis
 */
public class Panel_Log extends JPanel implements ActionListener{

    private JLabel etiqueta_clave;
    private JTextField clave;
    private JButton cargar;
    private Ejecucion_INT datos;

    public Panel_Log() {
        cargar_Componentes();
    }

    public final void cargar_Componentes() {
        setLayout(new GridLayout(2, 2));

        etiqueta_clave = new JLabel("Ingrese Passworld", SwingConstants.CENTER);

        clave = new JPasswordField();
        clave.setHorizontalAlignment(JTextField.CENTER);

        cargar = new JButton("Cargar");
        cargar.setToolTipText("Cargar");

        add(etiqueta_clave, 0);
        add(clave, 1);
        add(new JLabel(), 2);
        add(cargar, 3);
        
        cargar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      Ejecucion_INT.crearYMostrarGUI(e.getActionCommand());
    }
    
    
    
    

}
