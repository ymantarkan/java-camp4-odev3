
package Entitiies;

import Interfaces.EntityService;

public class Campaign implements EntityService{
    private int id;
    private String name;
    private double discountAmount;

    public Campaign(int id, String name, double discountAmount) {
        this.id = id;
        this.name = name;
        this.discountAmount = discountAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
    
    
    
    
}
