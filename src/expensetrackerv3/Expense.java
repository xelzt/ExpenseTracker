package expensetrackerv3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xezt
 */
public class Expense {
    
    private String name, category, date;
    private double price;

    public Expense(String name, String category, String date, double price) {
        this.name = name;
        this.category = category;
        this.date = date;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getName() + "   " + this.getPrice() + " " + this.getCategory() + "  " + this.getDate() + "\n"; //To change body of generated methods, choose Tools | Templates.
    }


    
}
