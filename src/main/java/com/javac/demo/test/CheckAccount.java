package com.javac.demo.test;

public class CheckAccount {
    private double price;
    private String code;

    public CheckAccount(double price) {
        this.price = price;
    }

    public  void saveMoney(double money){
        this.price+=money;
    }
    public void outMoney(double money){
        if(this.price<money){
            System.out.println("余额不足，该卡额度只有:"+this.price);
        }else {
           this.price=price-money;
        }
    }
    public double getPrice(){
        return this.price;
    }
    public String getCode(){
        return this.code;
    }

}
