package com.example;

public class Car {
    private String manufacturer;    //メーカー
    private int sales;                //販売数
    private int ranking;           //順位

    public Car(String manufacturer, int sales) {
        this.manufacturer = manufacturer;
        this.sales = sales;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSales() {
        return sales;
    }

    public int getRanking(){
        return ranking;
    }

    public void setRanking(int ranking){
        this.ranking = ranking;
    }

    public String toString(){
        return manufacturer + ": No. " + ranking +  ( " ("+ sales + " units)");
    }
}
