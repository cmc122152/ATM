import java.util.Scanner;
public class ATM{
   private static long kahao=370120180104L;
   private static int password=123456;
   private static int amount=1000;
   public static void main(String[] args) {
   	//登录界面
 	 System.out.println("请输入卡号");
 	 Scanner sc=new Scanner(System.in);
     long scn=sc.nextLong();
    if(scn==kahao){
    	System.out.println("卡号正确");
        }else{
    	System.out.println("卡号错误，请重新输入");
    }
      System.out.println("请输入密码");
 	 Scanner pass=new Scanner(System.in);
     int pass_word=pass.nextInt(); 
     if(pass_word==password){
     	System.out.println("密码正确");
        }else{
    	System.out.println("密码错误，请重新输入");
     }
     //功能界面
     System.out.println("请选择办理业务");
     System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
    int number=new Scanner(System.in).nextInt();
    switch(number){
    //查询
    case 1:
       System.out.println("账户姓名："+"李四");
       System.out.println("余额："+amount+"元");
       //查询返回上一级
          System.out.println("1.返回上一级");
          System.out.println("2.退出");
          int number1=new Scanner(System.in).nextInt();
           switch(number1){
        	 case 1:
        	  System.out.println("1.查询 2.转账 3.取款 4.存款 5.退卡");
        	  break;
        	  case 2: 
        	  System.out.println("成功退出");
        	  break;}
     //转账
     case 2:
        System.out.println("请输入对方银行卡号");
 	    Scanner sc1=new Scanner(System.in);
        long scn1=sc1.nextLong();
        System.out.println("请输入转账金额");
 	    Scanner sc2=new Scanner(System.in);
        long scn2=sc2.nextLong();
        System.out.println("1.确认");
        System.out.println("2.重新输入");
        System.out.println("3.返回菜单");
         int number2=new Scanner(System.in).nextInt();
           switch(number2){
        	 case 1:
        	  System.out.println("对方卡号："+scn1);
        	  System.out.println("对方姓名："+"陈*");
        	  System.out.println("转账金额："+scn2+"RMB");
        	    System.out.println("1.确认");
                System.out.println("2.重新输入");
                System.out.println("3.返回菜单");
                int number3=new Scanner(System.in).nextInt();
                switch(number3){
                	case 1:
                	System.out.println("操作成功");
                	break;
                	case 2:
                }
        	  break;
        	  case 2: 
        	   System.out.println("请输入对方银行卡号");
        	   System.out.println("请输入转账金额");
        	  break;}
    }
  }
}