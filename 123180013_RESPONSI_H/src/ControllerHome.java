

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ControllerHome {
    ModelHome modelhome;
    ViewHome viewhome;
    
    public ControllerHome(ModelHome modelhome, ViewHome viewhome) {
        this.modelhome = modelhome;
        this.viewhome = viewhome;
        
       viewhome.btnTiketPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new MVC_Tiket();
            }
        });
       viewhome.btnKeretaPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new MVC_Kereta();
            }
        });
    }
 
    
   
        
}
