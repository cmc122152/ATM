package com;
import com.Login;
import java.util.Scanner;
public class CashWithdrawals{
 public static void (User user) {
  	Login log =new Login();
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入取款金额");
	double index=sc.nextInt();
	if(index>this.amount){
		System.out.println("余额不足");
	}
	else if (index<this.amount){
		System.out.println("1.确认 2.重新输入 3.返回菜单");
		int input=new Scanner1(System.in).nextInt();
	     switch(input){
	      case 1:
	         System.out.println("取款成功");
	         System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
	         break;
	      case 2:
	        Scanner sc1=new Scanner(System.in);
	        System.out.println("请输入取款金额");
	        double index1=sc1.nextInt();
	        if(index1>this.amount){
		    System.out.println("余额不足");
			}
			else if (index1<this.amount){
		    System.out.println("1.确认 2.重新输入 3.返回菜单");
		    int input1=new Scanner2(System.in).nextInt();
		    switch(input1){
		    	case 1:
		    	System.out.println("取款成功");
	            System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
	            break;
	            case 2:
	             Scanner sc2=new Scanner(System.in);
	             System.out.println("请输入取款金额");
	             double index2=sc2.nextInt();
	             if(index2>this.amount){
		         System.out.println("余额不足");
	             }
	             else if (index2<this.amount){
		         System.out.println("1.确认 2.重新输入 3.返回菜单");
		         int input2=new Scanner3(System.in).nextInt();
		         switch(input2){
		    	  case 1:
		    	  System.out.println("取款成功");
	              System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
	              break;
	              case 2:
	              break;
	              case 3:
	                System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
	                break;
	            } 
	        }
	            case 3:
	            System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
	            break;
		    }
		}	      
		    case 3:
	      System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
	      break;
	    
	}
 }
}
}