import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class controllerawal implements ActionListener {


    Proses proses;


    viewawal viewAwal;
    viewpeminjaman viewPeminjaman;
    viewread viewRead;
    viewjelas viewJelas;
    viewedit viewEdit;
    modawal modAwal;


    public controllerawal(viewawal viewAwal, viewpeminjaman viewPeminjaman, viewread viewRead, viewjelas viewJelas, viewedit viewEdit, modawal modAwal) {
        this.viewAwal = viewAwal;
        this.viewPeminjaman = viewPeminjaman;
        this.viewRead = viewRead;
        this.viewJelas = viewJelas;
        this.viewEdit = viewEdit;
        this.modAwal = modAwal;
        buttonView();
        home();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewAwal.bHome || e.getSource() == viewPeminjaman.bHome ||
                e.getSource() == viewRead.bHome || e.getSource() == viewJelas.bHome){
            home();
        } else if (e.getSource() == viewAwal.bPinjam || e.getSource() == viewPeminjaman.bPinjam ||
                e.getSource() == viewRead.bPinjam || e.getSource() == viewJelas.bPinjam){
            pinjam();
        } else if (e.getSource() == viewAwal.bTampil || e.getSource() == viewPeminjaman.bTampil ||
                e.getSource() == viewRead.bTampil || e.getSource() == viewJelas.bTampil){
            tampil();
        } else if (e.getSource() == viewAwal.bAbout || e.getSource() == viewPeminjaman.bAbout ||
                e.getSource() == viewRead.bAbout || e.getSource() == viewJelas.bAbout) {
            about();
        } else if (e.getSource() == viewAwal.bLogout || e.getSource() == viewPeminjaman.bLogout ||
                e.getSource() == viewRead.bLogout || e.getSource() == viewJelas.bLogout){
            logout();
        } else if (e.getSource() == viewPeminjaman.bTambah){
            pinjamTambah();
        } else if (e.getSource() == viewPeminjaman.bBatal){
            pinjamBatal();
        } else if (e.getSource() == viewRead.bHapus){
            tampilHapus();
        } else if (e.getSource() == viewRead.bEdit){
            edit(proses);
        } else if (e.getSource() == viewEdit.bBatal) {
            tampil();
        } else if (e.getSource() == viewEdit.bEdit) {
            editEdit();
        }
    }


    public void home(){
        resetView();
        viewAwal.setVisible(true);
    }


    public void pinjam(){
        resetView();
        viewPeminjaman.setVisible(true);
    }


    public void tampil(){
        resetView();
        viewRead.setVisible(true);
        tampilReset();
    }


    public void about(){
        resetView();
        viewJelas.setVisible(true);
    }


    public void edit(Proses proses){
        resetView();
        viewEdit.setVisible(true);


        viewEdit.lId.setText(proses.getId());
        viewEdit.tfIdAnggota.setEnabled(false);
        viewEdit.tfIdAnggota.setText(proses.getMemberId());
        viewEdit.tfNama.setText(proses.getMemberName());
        viewEdit.tfIdBuku.setText(proses.getBookId());
        viewEdit.tfJudulBuku.setText(proses.getBookName());
    }


    public void resetView(){
        viewAwal.setVisible(false);
        viewPeminjaman.setVisible(false);
        viewRead.setVisible(false);
        viewJelas.setVisible(false);
        viewEdit.setVisible(false);
    }


    public void buttonView(){
        viewAwal.bHome.addActionListener(this);
        viewAwal.bPinjam.addActionListener(this);
        viewAwal.bTampil.addActionListener(this);
        viewAwal.bAbout.addActionListener(this);
        viewAwal.bLogout.addActionListener(this);


        viewPeminjaman.bTambah.addActionListener(this);
        viewPeminjaman.bBatal.addActionListener(this);
        viewPeminjaman.bHome.addActionListener(this);
        viewPeminjaman.bPinjam.addActionListener(this);
        viewPeminjaman.bTampil.addActionListener(this);
        viewPeminjaman.bAbout.addActionListener(this);
        viewPeminjaman.bLogout.addActionListener(this);


        viewRead.bHapus.addActionListener(this);
        viewRead.bEdit.addActionListener(this);
        viewRead.bHome.addActionListener(this);
        viewRead.bPinjam.addActionListener(this);
        viewRead.bTampil.addActionListener(this);
        viewRead.bAbout.addActionListener(this);
        viewRead.bLogout.addActionListener(this);
        viewRead.table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                viewRead.bHapus.setEnabled(true);
                viewRead.bEdit.setEnabled(true);


                int row = viewRead.table.getSelectedRow();
                String id = viewRead.table.getValueAt(row, 0).toString();
                String memberId = viewRead.table.getValueAt(row, 1).toString();
                String memberName = viewRead.table.getValueAt(row, 2).toString();
                String bookId = viewRead.table.getValueAt(row, 3).toString();
                String bookName = viewRead.table.getValueAt(row, 4).toString();


                proses = new Proses(id, memberId, memberName, bookId, bookName);
            }
        });


        viewJelas.bHome.addActionListener(this);
        viewJelas.bPinjam.addActionListener(this);
        viewJelas.bTampil.addActionListener(this);
        viewJelas.bAbout.addActionListener(this);
        viewJelas.bLogout.addActionListener(this);


        viewEdit.bBatal.addActionListener(this);
        viewEdit.bEdit.addActionListener(this);
    }


    public void pinjamBatal(){
        viewPeminjaman.tfIdAnggota.setText("");
        viewPeminjaman.tfNama.setText("");
        viewPeminjaman.tfIdBuku.setText("");
        viewPeminjaman.tfJudulBuku.setText("");
    }


    public void pinjamTambah(){
        String memberId = viewPeminjaman.getIdAnggota();
        String memberName = viewPeminjaman.getNama();
        String bookId = viewPeminjaman.getIdBuku();
        String bookName = viewPeminjaman.getJudulBuku();


        if (memberId.equals("") || memberName.equals("") || bookId.equals("") || bookName.equals("")){
            JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
        } else {
            if (modAwal.pinjamTambah(memberId, memberName, bookId, bookName) == 1){
                JOptionPane.showMessageDialog(null, "Berhasil Menambahkan");
                pinjamBatal();
            } else {
                JOptionPane.showMessageDialog(null, "Gagal Menambahkan");
            }
        }
    }


    public void tampilReset(){
        viewRead.bHapus.setEnabled(false);
        viewRead.bEdit.setEnabled(false);


        String[][] data = modAwal.getAllData();
        viewRead.table.setModel(new JTable(data, viewRead.coloumnName).getModel());
        viewRead.table.getColumnModel().getColumn(0).setMinWidth(0);
        viewRead.table.getColumnModel().getColumn(0).setMaxWidth(0);
        viewRead.table.getColumnModel().getColumn(0).setWidth(0);
    }


    public void tampilHapus() {
        int input = JOptionPane.showConfirmDialog(null, "Yakin ? ", "HAPUS", JOptionPane.YES_NO_OPTION);
        if (input == 0){
            if (modAwal.tampilHapus(proses) == 1) {
                JOptionPane.showMessageDialog(null, "Berhasil Menghapus");
                tampilReset();
            }
        }
    }


    public void editEdit(){
        String id = viewEdit.getId();
        String memberId = viewEdit.getIdAnggota();
        String memberName = viewEdit.getNama();
        String bookId = viewEdit.getIdBuku();
        String bookName = viewEdit.getJudulBuku();


        System.out.println(id);
        if (memberId.equals("") || memberName.equals("") || bookId.equals("") || bookName.equals("")){
            JOptionPane.showMessageDialog(null, "Form Tidak Boleh Kosong");
        } else {
            proses = new Proses(id, memberId, memberName, bookId, bookName);
            if (modAwal.editEdit(proses) == 1){
                JOptionPane.showMessageDialog(null, "Edit Berhasil");
                tampil();
            }
        }
    }


    public void logout(){
        int input = JOptionPane.showConfirmDialog(null, "Yakin ? ", "LOGOUT", JOptionPane.YES_NO_OPTION);
        if (input == 0) {
            resetView();
            new MVClogin();
        }
    }
}

