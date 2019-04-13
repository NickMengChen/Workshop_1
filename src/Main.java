import model.Buyer;
import model.Material;
import model.Warehouse;

public class Main {

    public static void main (String [] args)
    {
        Warehouse warehouse = new Warehouse();
//        List<Material> materials;
////        warehouse
//        private String name;
//        private double price;
//        private String type;
        Material ma1 = new Material("Iron", 1.5, "hahaha");
        Material ma2 = new Material("Gold", 1.5, "lalala");
        //warehouse.CheckStroge();
        warehouse.addMerials(ma1,5);
        warehouse.addMerials(ma2,5);
        warehouse.addMerials(ma2,5);
        warehouse.PrintStorgeReport();
        warehouse.decreaseMaterials(ma1, 3);
        warehouse.PrintStorgeReport();
        Buyer by1 = new Buyer();
        warehouse.CheckStroge();

    }
}
