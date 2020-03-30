/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    private String name;
    private int id;
    private int ratings;
    private String userName;
    private String pwd;
    
    private static int count = 1;

    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        DeliveryMan.count = count;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    
    
    
}
