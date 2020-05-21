import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class controllerlogin implements ActionListener{


    viewlogin viewLogin;
    viewsignup viewSignUp;
    modlogin modLogin;
    public controllerlogin(viewlogin viewLogin, viewsignup viewSignUp, modlogin modLogin) {
        this.viewLogin = viewLogin;
        this.viewSignUp = viewSignUp;
        this.modLogin = modLogin;

        viewLogin.setVisible(true);


        viewLogin.bLogin.addActionListener(this);
        viewLogin.bDaftar.addActionListener(this);
        viewLogin.bExit.addActionListener(this);
        viewSignUp.bDaftar.addActionListener(this);
        viewSignUp.bBatal.addActionListener(this);
        viewSignUp.bExit.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewLogin.bLogin){
            login();
        } else if (e.getSource() == viewLogin.bDaftar){
            viewLogin.setVisible(false);
            viewSignUp.setVisible(true);
            reset();
        } else if (e.getSource() == viewLogin.bExit){
            exit();
        } else if (e.getSource() == viewSignUp.bDaftar) {
            daftar();
        } else if (e.getSource() == viewSignUp.bBatal){
            viewSignUp.setVisible(false);
            viewLogin.setVisible(true);
            reset();
        } else if (e.getSource() == viewSignUp.bExit) {
            exit();
        }
    }


    public void login(){
        String username = viewLogin.getUsername();
        String password = viewLogin.getPassword();


        if (modLogin.getCountForSignIn(username, password) > 0){
            JOptionPane.showMessageDialog(null, "Berhasil Login");
            viewLogin.setVisible(false);
            viewSignUp.setVisible(false);
            new MVCNext();
        } else {
            JOptionPane.showMessageDialog(null, "Gagal Login");
        }
    }


    public void daftar() {
        String username = viewSignUp.getUsername();
        String password = viewSignUp.getPassword();


        if (modLogin.insertAccount(username, password) == 1){
            JOptionPane.showMessageDialog(null, "Berhasil Daftar");
            viewSignUp.setVisible(false);
            viewLogin.setVisible(true);
            reset();
        } else {
            JOptionPane.showMessageDialog(null, "Username telah terdaftar");
        }
    }


    public void reset(){
        viewLogin.tfUsername.setText("");
        viewLogin.tfPassword.setText("");
        viewSignUp.tfUsername.setText("");
        viewSignUp.tfPassword.setText("");
    }


    public void exit(){
        int input = JOptionPane.showConfirmDialog(null, "Yakin ? ", "EXIT" ,JOptionPane.YES_NO_OPTION);
        if (input == 0){
            System.exit(0);
        }
    }
}
