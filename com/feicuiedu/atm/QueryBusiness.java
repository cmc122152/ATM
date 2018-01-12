package com.feicuiedu.atm;

import java.util.Scanner;
public class QueryBusiness{
	public void showInfor(User user){
   // User user=new User();
	System.out.println("账户姓名:"+user.getName());
	System.out.println("余额:"+user.getAmount());
	System.out.println("1:返回上一级");
	System.out.println("2:退出");
	int input = new Scanner(System.in).nextInt();
    switch(input){
    	case 1:
    	System.out.println("1:查询 2:转账 3:取款 4:存款 5:退卡");
    	break;
    	case 2:
    	//System.out.println("退出");
    	break;
    }
 }	
}
