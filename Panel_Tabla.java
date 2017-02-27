package InterfazGUI;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luis
 */
public class Panel_Tabla extends JPanel {

    private DefaultTableModel modelo;
    private JTable tabla;
    
    public Panel_Tabla() {
        cargar_Componentes();
    }

    public void cargar_Componentes() {

        setLayout(new GridLayout(1, 1));

        tabla = new JTable();

        modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        add(tabla);
        
        setBorder(BorderFactory.createTitledBorder("Resultado"));

    }
}
