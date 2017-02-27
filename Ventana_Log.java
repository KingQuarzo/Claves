package InterfazGUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luis
 */
public class Ventana_Log extends JFrame implements ActionListener {

    private Panel_Log panel_Log;
    private Ejecucion_INT ventana_Datos;

    public Ventana_Log() {
        cargar_Log();
    }

    public void cargar_Log() {
        
        panel_Log = new Panel_Log();
        add(panel_Log, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(300, 100);
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

    public static void crearYMostrarLog() {
        try {
            // Se establece el aspecto de la interfaz gráfica de acuerdo
            // al sistema operativo (SO) en el que se ejecuta la aplicación.
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager
                    .getSystemLookAndFeelClassName());
        } catch (Exception exc) {
        }

        Ventana_Log ventanaLog = new Ventana_Log();
        ventanaLog.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Ejecucion_INT.crearYMostrarGUI(e.getActionCommand());
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evento) {
                dispose();
            }
        });
        
    }

    public static void main(String[] arg) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                crearYMostrarLog();
            }
        });

    }
}
