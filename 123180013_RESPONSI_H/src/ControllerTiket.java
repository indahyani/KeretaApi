
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class ControllerTiket {
    
    ModelTiket modeltiket;
    ViewTiket viewtiket;
    
     public ControllerTiket(ModelTiket modeltiket, ViewTiket viewtiket) {
        this.modeltiket = modeltiket;
        this.viewtiket = viewtiket;

        if (modeltiket.getBanyakData() != 0) {
            String datapelanggan[][] = modeltiket.readpelanggan();
            viewtiket.tabel.setModel((new JTable(datapelanggan, viewtiket.namaKolom)).getModel());
            listenerTabel();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewtiket.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String nama = viewtiket.getNama();
                String jk = viewtiket.getGender();
                String stasiun = viewtiket.getStasiun();
                String id_kereta = viewtiket.getKereta();
                modeltiket.inserttiket(nama,jk, stasiun,id_kereta);

                String datapelanggan[][] = modeltiket.readpelanggan();
                viewtiket.tabel.setModel(new JTable(datapelanggan, viewtiket.namaKolom).getModel());
                listenerTabel();
            }
        });
        
         viewtiket.btnTambahPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String nama = viewtiket.getNama();
                String jk = viewtiket.getGender();
                String stasiun = viewtiket.getStasiun();
                String id_kereta = viewtiket.getKereta();
                modeltiket.inserttiket(nama,jk, stasiun,id_kereta);

                String datapelanggan[][] = modeltiket.readpelanggan();
                viewtiket.tabel.setModel(new JTable(datapelanggan, viewtiket.namaKolom).getModel());
                listenerTabel();
            }
        });
        
       
}
      public void listenerTabel() {
        String data[][] = modeltiket.readpelanggan();
        String datapelanggan[][] = modeltiket.readpelanggan();
        viewtiket.tabel.setModel(new JTable(datapelanggan, viewtiket.namaKolom).getModel());
        viewtiket.tabel.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int row = viewtiket.tabel.getSelectedRow();
                int col = viewtiket.tabel.getSelectedColumn();

               
                viewtiket.tfNama.setText(data[row][0]);
                viewtiket.cmbGender.setSelectedItem(data[row][1]);
                viewtiket.cmbStasiun.setSelectedItem(data[row][2]);
                viewtiket.cmbKereta.setSelectedItem(data[row][3]);
               
            }
        });
    }
        
        public void resetForm(){
     
        viewtiket.tfNama.setText(""); 
        viewtiket.cmbGender.setSelectedItem("--Pilih--");
        viewtiket.cmbStasiun.setSelectedItem("--Pilih--");
        viewtiket.cmbKereta.setSelectedItem("--Pilih--");
        
        
    }
}
