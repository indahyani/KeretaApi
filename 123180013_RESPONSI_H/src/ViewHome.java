
import javax.swing.*;


public class ViewHome extends JFrame {
     JPanel panel = new JPanel();
     
     JLabel lTitle = new JLabel("Kereta Api");
     JButton btnTiketPanel =new JButton("Daftar Tiket");
     JButton btnKeretaPanel =new JButton("Daftar Kereta");
     
    public ViewHome() {
        setTitle("TUTUTUTUUTTUU");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400,600);
      
        add(lTitle);
        add(btnTiketPanel);
        add(btnKeretaPanel);
        
         lTitle.setBounds(100,100,150,30);
         lTitle.setFont(new java.awt.Font("Times New Roman", 0, 30));
         btnTiketPanel.setBounds(100,250,150,50);
         btnKeretaPanel.setBounds(100,360,150,50);
        
 
        
    }

   
}
