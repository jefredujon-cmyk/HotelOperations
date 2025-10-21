package com.pluralsight;

public class Room {
    private int numberofbeds;
    private double price;
    private boolean itsoccupied;
    private boolean itsdirty;
    private boolean itsavailable;

    public Room(int numberofbeds, double price, boolean itsoccupied, boolean itsdirty) {
        this.numberofbeds = numberofbeds;
        this.price = price;
        this.itsoccupied = itsoccupied;
        this.itsdirty = itsdirty;
        this.itsavailable = itsavailable;
    }

    public int getNumberofbeds() {
        return numberofbeds;
    }

    public void setNumberofbeds(int numberofbeds) {
        this.numberofbeds = numberofbeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isItsoccupied() {
        return itsoccupied;
    }

    public void setItsoccupied(boolean itsoccupied) {
        this.itsoccupied = itsoccupied;
    }

    public boolean isItsdirty() {
        return itsdirty;
    }

    public void setItsdirty(boolean itsdirty) {
        this.itsdirty = itsdirty;
    }

    public boolean isItsavailable() {
        return itsavailable;
    }

    public void setItsavailable(boolean itsavailable) {
        this.itsavailable = itsavailable;
    }

    public String isAvailable() {
    }
}
