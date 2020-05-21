
public class MVC_Kereta {
    ViewKereta viewkereta = new ViewKereta();
    ModelKereta modelkereta = new ModelKereta();
    ControllerKereta controllerkereta = new ControllerKereta(modelkereta,viewkereta);
    
}
