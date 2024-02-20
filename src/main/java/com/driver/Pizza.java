package com.driver;

public class Pizza {

    private Integer price;
    private Boolean isVeg;
    private String bill;
    private Integer cheese;
    private Integer toppings;
    private Integer takeAway;


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

    public Integer getCheese(){
        return this.cheese!=null ? this.cheese : null;
    }

    public void addExtraToppings(){
        // your code goes here
        this.toppings = isVeg ? 70 : 120;
    }

    public Integer getToppings(){
        if(this.toppings!=null){
            return this.toppings;
        }
        return 0;
    }

    public void addTakeaway(){
        // your code goes here
        this.takeAway = 20;
    }

    public Integer getTakeaway(){
        if(this.takeAway!=null){
            return this.takeAway;
        }
        return 0;
    }

    public String getBill(){
        // your code goes here
        this.bill = "Base Price Of The Pizza: "+ this.price + "\n" +
                (getCheese()>0 ? "Extra Cheese Added: " + this.cheese + "\n" : "") +
                (getToppings()>0 ? "Extra Toppings Added: " + this.toppings + "\n" : "") +
                (getTakeaway()>0 ? "Paperbag Added: " + this.takeAway + "\n" : "") +
                "Total Price: " + (getPrice() + getCheese() + getToppings() + getTakeaway()) + "\n";

        return this.bill;
    }
}
