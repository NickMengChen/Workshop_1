package model;

import model.Material;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Warehouse {

    private HashMap<Material, Integer> Materials = new HashMap<>();

    public Map<Material, Integer> getMaterials() {
        return Materials;
    }

    public void setMaterials(Map<Material, Integer> materials) {
        //Materials = materials;
    }

    public void addMerials(Material material, int stock)
    {


    }

    public boolean checkIsExist(Material material){

        Iterator<Map.Entry<Material, Integer>>
                iterator = Materials.entrySet().iterator();
        // flag to store result
        boolean isKeyPresent = false;

        // Iterate over the HashMap
        while (iterator.hasNext()) {

            // Get the entry at this iteration
            Map.Entry<Material, Integer>
                    entry
                    = iterator.next();

            // Check if this key is the required key
            if (material == entry.getKey()) {

                isKeyPresent = true;
            }
        }
        return isKeyPresent;

    }

    public boolean checkavaliable(Material material){

        Iterator<Map.Entry<Material, Integer>>
                iterator = Materials.entrySet().iterator();
        // Iterate over the HashMap
        while (iterator.hasNext()) {

            // Get the entry at this iteration
            Map.Entry<Material, Integer>
                    entry
                    = iterator.next();

            // Check if this key is the required key
            if (material == entry.getKey()) {

                if (entry.getValue() > 0)
                    return true;
                else
                    return false;
            }
        }
        return false;
    }

    public void PrintStorgeReport() throws Exception{
        //System.out.println(Materials.toString());
        //items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
    }

    public void CheckStroge() throws Exception{
        System.out.println(Materials.toString());


    }


}
