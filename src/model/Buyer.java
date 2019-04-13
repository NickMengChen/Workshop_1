package model;

import java.util.List;

public class Buyer {
    private int ID;
    private double wallet;
    private List<Material> owned;
//    private List<> shopping cart;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public List<Material> getOwned() {
        return owned;
    }

    public void setOwned(List<Material> owned) {
        this.owned = owned;
    }
}
