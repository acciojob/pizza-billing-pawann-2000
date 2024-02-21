package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    boolean isBill=false;
    private boolean addExtraCheese=false;
    private boolean addExtraToppings=false;
    private boolean addTakeaway=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        price = (isVeg) ? 300 : 400;
        this.bill += "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!addExtraCheese){
            addExtraCheese = true;
            price += 80;
            this.bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!addExtraToppings){
            addExtraToppings = true;

            if(!isVeg){
                price += 120;
                this.bill += "Extra Toppings Added: 120\n";
            }
            else{
                price += 70;
                this.bill += "Extra Toppings Added: 70\n";
            }

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!addTakeaway){
            addTakeaway = true;
            price += 20;

            this.bill += "Paperbag Added: 20\n";

        }
    }

    public String getBill(){
        // your code goes here

        if(!isBill){
            isBill = true;
            this.bill += "Total Price: " + this.price+"\n";
        }

        return this.bill;
    }
}
