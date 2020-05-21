
public class MVC_Tiket {
    ViewTiket viewtiket = new ViewTiket();
    ModelTiket modeltiket = new ModelTiket();
    ControllerTiket controllertiket = new ControllerTiket(modeltiket,viewtiket);
}
