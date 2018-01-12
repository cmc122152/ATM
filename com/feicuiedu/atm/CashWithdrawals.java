package com.feicuiedu.atm;
import java.util.Scanner;
public class CashWithdrawals{
 public void (User user) {
  	User user =new User();
  	double num=user.getAmount();
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入取款金额(100的整数)");
	double index=sc.nextInt();
	
	if(index>num){
		System.out.println("余额不足");
		break;
	}
	else if (index<num){
		number=num;
		break;
	}
    
	while(true);{

		System.out.println("1.确认 2.重新输入 3.返回菜单");
		Scanner input=new Scanner(System.in);
		String num2=input.next();
		if(num2.equals("1")){
			double amount=user.getAmount();
            user.setAmount(amount-number);
            System.out.println("取款成功,余额为"+user.getAmount());
            Success success = new Success(user);
			success.getSuccess();
		}
		   if(num2.equals("2")){
		   	get.CashWithdrawals();
		   }
		   if(num2.equals("3")){
		   	Menu menu = new Menu(user);
			menu.getMethod();
		   }
		else if(){
			System.out.println("输入错误，请重新输入");
			continue;
		}
	}
}
}
