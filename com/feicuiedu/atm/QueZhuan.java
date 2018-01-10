//package com;
import java.util.Scanner;

public class QueZhuan{
	public static void (User user) {
		System.out.println("1.确认转账");
        System.out.println("2.返回上一级");
        System.out.println("3.退出");
        int input=new Scanner(System.in).nextInt();
        switch(input){
        	case 1:
        	System.out.println("转账成功！");
        	System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
        	break;
            case 2:
            System.out.println("请输入对方银行卡号:");
	        Scanner sc=new Scanner(System.in);
	       String index=sc.next();
	       System.out.println("请输入金额:");	
	       Scanner sc_mon=new Scanner(System.in);
	       int mon=sc_mon.nextInt();
	       System.out.println("1.确认 2.重新输入 3.返回菜单"); 
	       int input1=new Scanner(System.in).nextInt(); 
	       case 3:
	       break;
        }
	}
}