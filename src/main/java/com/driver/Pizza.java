package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;
    private int takeAway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            setPrice(300);
        } else {
            setPrice(400);
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.cheese = 80;
    }

    public void addExtraToppings(){
        // your code goes here
        this.toppings = isVeg ? 70 : 120;
    }

    public void addTakeaway(){
        // your code goes here
        this.takeAway = 20;
    }

    public String getBill(){
        // your code goes here
        this.bill = "Base Price Of The Pizza: "+ this.price + "\n" +
                "Extra Cheese Added: " + this.cheese + "\n" +
                "Extra Toppings Added: " + this.toppings + "\n" +
                (this.takeAway!=0 ? ("Paperbag Added: " + this.takeAway + "\n" + "Total Price: " + (this.price + this.cheese + this.toppings + this.takeAway)) : "Total Price: " + (this.price + this.cheese + this.toppings + this.takeAway));
        return this.bill;
    }
}
