package InterfazGUI;


import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luis
 */
public class Panel_Botones extends JPanel implements ActionListener {

    private JButton btn_registrar;
    private JButton btn_buscar;
    private JButton btn_editar;
    private JButton btn_eliminar;
    private Ejecucion_INT ventana;
    
    public Panel_Botones(){
        cargarComponentes();
    }
    public void cargarComponentes(){
        setLayout(new GridLayout(2, 2));
        
        
        btn_registrar = new JButton("Registrar");
        btn_buscar = new JButton("Buscar");
        btn_editar = new JButton("Editar");
        btn_eliminar = new JButton("Eliminar");
        
        btn_registrar.setToolTipText("Registrar");
        btn_buscar.setToolTipText("Buscar");
        btn_editar.setToolTipText("Editar");
        btn_eliminar.setToolTipText("Eliminar");
        
        add(btn_registrar);
        add(btn_buscar);
        add(btn_editar);
        add(btn_eliminar);
        setBorder(BorderFactory.createTitledBorder("Funciones"));
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
