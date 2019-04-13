package model;

import model.Material;

import java.util.Map;

public class Warehouse {

    private Map<Material, Integer> Materials;

    public Map<Material, Integer> getMaterials() {
        return Materials;
    }

    public void setMaterials(Map<Material, Integer> materials) {
        Materials = materials;
    }

    public void addMerials()
    {


    }

    public boolean checkavaliable(){

        return true;
    }

    public void PrintStorgeReport() throws Exception{
        //System.out.println(Materials.toString());
        //items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
    }

    public void CheckStroge() throws Exception{
        System.out.println(Materials.toString());


    }


}
