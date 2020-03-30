/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author harold
 */
public class Restaurant {
           
    private String name;
    private int restoId;
    private int cap;
    private int ratings;
    private MenuItems menu;
    private WorkQueue wq;
    private static int count = 1;

    public Restaurant(String name, int cap){
        this.restoId = count;
        this.name = name;
        this.cap = cap;
        menu = new MenuItems();
        this.wq = new WorkQueue();
        this.count++;
    }

    public WorkQueue getWq() {
        return wq;
    }

    public void setWq(WorkQueue wq) {
        this.wq = wq;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRestoId() {
        return restoId;
    }

    public void setRestoId(int restoId) {
        this.restoId = restoId;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
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
        Restaurant.count = count;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public MenuItems getMenu() {
        return menu;
    }

    public void setMenu(MenuItems menu) {
        this.menu = menu;
    }
    
    
    
    
}
