//package com.cn;
//import com.cn.User;
import java.util.Scanner;
public class QueryBusiness{
	public void showInfor(User user){
   // User user=new User();
	System.out.println("�˻�����:"+user.getName());
	System.out.println("���:"+user.getAmount());
	System.out.println("1:������һ��");
	System.out.println("2:�˳�");
	int input = new Scanner(System.in).nextInt();
    switch(input){
    	case 1:
    	System.out.println("1:��ѯ 2:ת�� 3:ȡ�� 4:��� 5:�˿�");
    	break;
    	case 2:
    	//System.out.println("�˳�");
    	break;
    }
 }	
}