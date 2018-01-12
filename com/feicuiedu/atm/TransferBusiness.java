package com.feicuiedu.atm;
import java.util.Scanner;
public class TransferBusiness{
  User user = new User();
  double num=user.getAmount();
  
  while(ture){
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入对方账号:");
    String CardNumber = scanner.next();
   if(CardNumber.length() == 12){
    System.out.println("请输入金额:");
    Scanner sc_mon=new Scanner(System.in);
    int mon=sc_mon.nextInt(); 
      if(mon>num){
        System.out.ptintln("余额不足");
        break;
      }
      else if(mon<num){
        money=num;
        break;
      }
   }
   while(ture){
    System.out.println("1.确认 2.重新输入 3.返回菜单"); 
    int input=new Scanner(System.in);
    String index=input.next();
    if(index.equals("1")){
        System.out.println("对方卡号:"+CardNumber);
        System.out.println("对方姓名:"+name);
        System.out.println("转账金额:"+mon);
        System.out.println("1.确认转账");
        System.out.println("2.返回上一级");
        System.out.println("3.退出");
        int input1=new Scanner(System.in);
        String ber=input1.next();
        if(ber.equals("1")){
          double amount=user.getAmount();
          user.setAmount(amount-money);
          System.out.println("转账成功,余额为"+user.getAmount());
          Success success = new Success(user);
          success.getSuccess();
        }
        if(ber.equals("2")){
          get. TransferBusiness();
        }
        if(ber.equals("3")){
          continue;
        }
        else if(){
          System.out.println("输入错误，请重新输入");
        }
    }
    if(index.equals("2")){
      get. TransferBusiness();
    }
    if(index.equals("3")){
        Menu menu = new Menu(user);
        menu.getMethod();
    }
    else if(){
      System.out.println("输入错误，请重新输入");
      continue;
    }
   }
	/*private static String name="王五";
  public static void (User user) {
	System.out.println("请输入对方银行卡号:");
	Scanner sc=new Scanner(System.in);
	 String index=sc.next();
	 System.out.println("请输入金额:");	
	 Scanner sc_mon=new Scanner(System.in);
	 int mon=sc_mon.nextInt();
	 System.out.println("1.确认 2.重新输入 3.返回菜单"); 
	 int input=new Scanner(System.in).nextInt();
     //第一次
     switch(input){
     case 1:
        System.out.println("对方卡号:"+index);
        System.out.println("对方姓名:"+name);
        System.out.println("转账金额:"+mon);
        System.out.println("1.确认转账");
        System.out.println("2.返回上一级");
        System.out.println("3.退出");
        break;
     case 2:
        System.out.println("请输入对方银行卡号:");
	    Scanner sc1=new Scanner(System.in);
	    String index1=sc1.next();
	    System.out.println("请输入金额:");	
	    Scanner sc_mon1=new Scanner(System.in);
	    int mon1=sc_mon1.nextInt();
	    System.out.println("1.确认 2.重新输入 3.返回菜单"); 
	    int input1=new Scanner(System.in).nextInt();
         //
         switch(input1){
     	  case 1:
          System.out.println("对方卡号:"+index1);
          System.out.println("对方姓名:"+name);
          System.out.println("转账金额:"+mon1);
          System.out.println("1.确认转账");
          System.out.println("2.返回上一级");
          System.out.println("3.退出");
          case 2:
          System.out.println("请输入对方银行卡号:");
	      Scanner sc2=new Scanner(System.in);
	      String index2=sc2.next();
	      System.out.println("请输入金额:");	
	      Scanner sc_mon2=new Scanner(System.in);
	      int mon2=sc_mon2.nextInt();
	      System.out.println("1.确认 2.重新输入 3.返回菜单"); 
	      int input2=new Scanner(System.in).nextInt(); 
	      
           //第三次
	        switch(input2){
     	    case 1:
            System.out.println("对方卡号:"+index);
            System.out.println("对方姓名:"+name);
            System.out.println("转账金额:"+mon);
            System.out.println("1.确认转账");
            System.out.println("2.返回上一级");
            System.out.println("3.退出");
            break;
            case 2:
            System.out.println("请输入对方银行卡号:");
	        Scanner sc3=new Scanner(System.in);
	        String index3=sc3.next();
	        System.out.println("请输入金额:");	
	        Scanner sc_mon3=new Scanner(System.in);
	        int mon3=sc_mon3.nextInt();
	        System.out.println("1.确认 2.重新输入 3.返回菜单"); 
	        int input3=new Scanner(System.in).nextInt(); 
	        case 3:
            System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
            break;}
          case 3:
          System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
          break;}
     case 3:
     System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
     break;
     
	
  }
 }*/
}
}
