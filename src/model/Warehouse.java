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

    public void addMerials(Material material, int stock)
    {
        if (!checkIsExist(material))
        {
            Materials.put(material, stock);
            return;
        }


        Materials.replace(material, Materials.get(material)+stock);

    }

    public boolean decreaseMaterials(Material material, int number)
    {
        if (Materials.get(material) - number >= 0){
            Materials.replace(material, Materials.get(material)-number);
            return true;
        }
        return false;

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

    public void PrintStorgeReport(){

        Iterator<Map.Entry<Material, Integer>>
                iterator = Materials.entrySet().iterator();
        // Iterate over the HashMap
        while (iterator.hasNext()) {

            // Get the entry at this iteration
            Map.Entry<Material, Integer>
                    entry
                    = iterator.next();
            System.out.print(entry.getKey().getName() + " ");
            System.out.println(entry.getValue());
        }

    }

    public void CheckStroge(){
        Iterator<Map.Entry<Material, Integer>>
                iterator = Materials.entrySet().iterator();
        // Iterate over the HashMap
        while (iterator.hasNext()) {

            // Get the entry at this iteration
            Map.Entry<Material, Integer>
                    entry
                    = iterator.next();
            System.out.println(entry.getKey().getName() + entry.getKey().getPrice() + entry.getKey().getType());
        }
    }


}
