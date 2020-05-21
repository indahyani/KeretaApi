
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class ControllerKereta {
     ModelKereta modelkereta;
    ViewKereta viewkereta;
    
    public ControllerKereta(ModelKereta modelkereta, ViewKereta viewkereta) {
        this.modelkereta = modelkereta;
        this.viewkereta = viewkereta;

        if (modelkereta.getBanyakData() != 0) {
            String datapelanggan[][] = modelkereta.readpelanggan();
            viewkereta.tabel.setModel((new JTable(datapelanggan, viewkereta.namaKolom)).getModel());
            listenerTabel();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewkereta.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id_kereta = viewkereta.getId();
                String nama_kereta = viewkereta.getNama_kereta();
                String kelas = viewkereta.getKelas();
             
                modelkereta.insertkereta(id_kereta,nama_kereta, kelas);

                String datapelanggan[][] = modelkereta.readpelanggan();
                viewkereta.tabel.setModel(new JTable(datapelanggan, viewkereta.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewkereta.btnEditPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String id_kereta = viewkereta.getId();
                String nama_kereta = viewkereta.getNama_kereta();
                String kelas = viewkereta.getKelas();
             
                modelkereta.insertkereta(id_kereta,nama_kereta, kelas);

                
                String datapelanggan[][] = modelkereta.readpelanggan();
                viewkereta.tabel.setModel(new JTable(datapelanggan, viewkereta.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        viewkereta.btnHapusPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String id_kereta = viewkereta.getId();
                String nama_kereta = viewkereta.getNama_kereta();
                String kelas = viewkereta.getKelas();
             
               


                modelkereta.deletepelanggan(id_kereta);
                
                String datapelanggan[][] = modelkereta.readpelanggan();
                viewkereta.tabel.setModel(new JTable(datapelanggan, viewkereta.namaKolom).getModel());
                resetForm();
                listenerTabel();
            }
        });
        
        viewkereta.btnBatalPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetForm();
                
                String datapelanggan[][] = modelkereta.readpelanggan();
                viewkereta.tabel.setModel(new JTable(datapelanggan, viewkereta.namaKolom).getModel());
                listenerTabel();
            }
        });
        
        
}
public void listenerTabel() {
        String data[][] = modelkereta.readpelanggan();
        String datapelanggan[][] = modelkereta.readpelanggan();
        viewkereta.tabel.setModel(new JTable(datapelanggan, viewkereta.namaKolom).getModel());
        viewkereta.tabel.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewkereta.tabel.getSelectedRow();
                int col = viewkereta.tabel.getSelectedColumn();

                viewkereta.tfId.setText(data[row][0].toString());
                viewkereta.tfId.setEnabled(false);
                viewkereta.tfNama.setText(data[row][1].toString());
                viewkereta.tfKelas.setText(data[row][2].toString());
                
               
            }
        });
    }
    
    public void resetForm(){
        viewkereta.tfId.setText("");
        viewkereta.tfNama.setEnabled(true);
        viewkereta.tfKelas.setText(""); 
       
        
    }
}