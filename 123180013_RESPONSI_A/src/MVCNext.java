
public class MVCNext {


    viewawal viewAwal = new viewawal();
    viewpeminjaman viewPeminjaman = new viewpeminjaman();
    viewread viewRead = new viewread();
    viewjelas viewJelas = new viewjelas();
    viewedit viewEdit = new viewedit();
    modawal modAwal = new modawal();
    controllerawal controllerAwal = new controllerawal(viewAwal, viewPeminjaman, viewRead, viewJelas, viewEdit, modAwal);
}
