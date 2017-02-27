    package InterfazGUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author luis
 */
public class Panel_Datos extends JPanel {

    private JLabel etiqueta_nombre;
    private JLabel etiqueta_definicion;
    private JLabel etiqueta_contrasenia;
    private JLabel etiqueta_tipo;

    private JTextField nombre;
    private JTextField definicion;
    private JTextField contrasenia;
    private JTextField tipo;

    public Panel_Datos() {
        cargar_Componentes();
    }

    public void cargar_Componentes() {
        setLayout(new GridLayout(8, 2));

        etiqueta_nombre = new JLabel("Nombre de contraseña", SwingConstants.CENTER);
        etiqueta_definicion = new JLabel("Definicion de contraseña", SwingConstants.CENTER);
        etiqueta_contrasenia = new JLabel("Contraseña", SwingConstants.CENTER);
        etiqueta_tipo = new JLabel("Tipo de contraseña", SwingConstants.CENTER);

        nombre = new JTextField();
        definicion = new JTextField();
        contrasenia = new JTextField();
        tipo = new JTextField();

        nombre.setHorizontalAlignment(JTextField.CENTER);
        definicion.setHorizontalAlignment(JTextField.CENTER);
        contrasenia.setHorizontalAlignment(JTextField.CENTER);
        tipo.setHorizontalAlignment(JTextField.CENTER);

        
        add(etiqueta_nombre, 0);
        add(nombre, 1);
        add(new JLabel(), 2);
        add(new JLabel(), 3);
        add(etiqueta_contrasenia, 4);
        add(contrasenia, 5);
        add(new JLabel(), 6);
        add(new JLabel(), 7);
        add(etiqueta_tipo, 8);
        add(tipo, 9);
        add(new JLabel(), 10);
        add(new JLabel(), 11);
        add(etiqueta_definicion, 12);
        add(definicion, 13);
        add(new JLabel(), 14);
        add(new JLabel(), 15);

        
        
        setBorder(BorderFactory.createTitledBorder("Datos"));
    }

}
