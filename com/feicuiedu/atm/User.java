package com.feicuiedu.atm;
import java.util.Scanner;
 public class User{
 	private String number="370120180104";
 	private  String password="123456";
 	private  String name="李四";
 	private  double amount;
 	public void setAmount(double amount){
 		this.amount=amount;
 	}
 	public String getNumber(String number){
 		return this.number=number;
 	}
 	public String getPassword(String password){
 		return this.password=password;
 	}
    public String getName(String name){
 		return this.name=name;
 	}
 	public double getAmount(double amount){
 		return this.amount=amount;
 	} 	  
 }
