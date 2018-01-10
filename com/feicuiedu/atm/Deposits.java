package com.feicuiedu.atm;
//import com.cn.Login;
import java.util.Scanner;
public class Deposits{
	private User user ;
	  public Deposits(User user){
		this.user =user;
}	   	
	public void getDeposits(){
		double number;

	while(true)	{
		System.out.println("请输入存款金额(100的整数):");
	    Scanner input=new Scanner(System.in);
	    double num = input.nextDouble();
			if(num%100==0&&num>0){
				number=num;
				break;		
			}
			else{
				System.out.println("输入错误，请重新输入");
				continue;
			}
	while(true)	{
	    System.out.println("1.确认");		
		System.out.println("2.重新输入");
		System.out.println("3.返回菜单");
		Scanner input = new Scanner(System.in);
		String num2=input.next();
			if(num2.equals("1")){
				double amount=user.getAmount();
				user.setAmount(amount+number);
				System.out.println("存款成功，现在的余额为"+user.getAmount());
				Success success = new Success(user);
				success.getSuccess();
			}
			if(num2.equals("2")){
				getDeposit();
			}
			if(num2.equals("3")){
				Menu menu = new Menu(user);
				menu.getMethod();
			}
			else{
				System.out.println("输入错误，请重新输入");
				continue;
			}			
		}	
	}		
 }	 
}
