package InterfazGUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class Ejecucion_INT extends JFrame {

    private Panel_Datos panelDatos;
    private Panel_Botones panelBotones;
    private Panel_Tabla panelTabla;

    public Ejecucion_INT() {
        cargar_Componentes();
    }

    public void cargar_Componentes() {
        panelDatos = new Panel_Datos();
        panelBotones = new Panel_Botones();
        panelTabla = new Panel_Tabla();

        add(panelBotones, BorderLayout.WEST);
        add(panelDatos, BorderLayout.CENTER);
        add(panelTabla, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evento) {
                cerrarAplicacion();
            }
        });

    }

    public void cerrarAplicacion() {
        int respuesta = JOptionPane.showOptionDialog(this,
                "¿Esta seguro que desea cerrar el panel de contraseñas?",
                "Terminar programa", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new String[]{"Si", "No"}, "default");

        if (respuesta == JOptionPane.OK_OPTION) {
            dispose();// Método heredado de la clase Window que libera los
        }	      // recursos asignados por el SO a una ventana y sus
        // componentes
    }
    
        static void crearYMostrarGUI(String actionCommand) {
        try {
            // Se establece el aspecto de la interfaz gráfica de acuerdo
            // al sistema operativo (SO) en el que se ejecuta la aplicación.
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
                    .getSystemLookAndFeelClassName());
        } catch (Exception exc) {
        }

        Ejecucion_INT ventana = new Ejecucion_INT();
        ventana.setVisible(true);
    }

}
