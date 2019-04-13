package db;

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


}
