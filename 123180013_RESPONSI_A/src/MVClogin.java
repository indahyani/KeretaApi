public class MVClogin {


    viewlogin viewLogin = new viewlogin();
    viewsignup viewSignUp = new viewsignup();
    modlogin modLogin = new modlogin();
    controllerlogin controllerLogin = new controllerlogin(viewLogin, viewSignUp, modLogin);
}
