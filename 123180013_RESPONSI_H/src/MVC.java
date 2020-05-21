
public class MVC {
    ViewHome viewhome = new ViewHome();
    ModelHome modelhome = new ModelHome();
    ControllerHome controllerkereta = new ControllerHome(modelhome,viewhome);
}
