package com.feicuiedu.atm;
import java.util.Scanner;
public class Login{
	User user = new User();
	while (true) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("请输入账号:");
	  String CardNumber = scanner.next();

		if (CardNumber.length() == 12) {

			if (CardNumber.equals(user.getCardNumber()) || CardNumber.equals("370120180108")) {

			  System.out.println("请输入密码:");
			  String Password = scanner.next();
				if (Password.equals(user.getPassword())) {

						System.out.println("登录成功!");
						Menu meun = new Menu();
						meun.choiceMenu(user);

					} else {

						System.out.println("密码错误");
					}
				} else {
					System.out.println("用户不存在,请再次重新输入!");
				}

			} else {
				System.out.println("输入账号长度有误,请再次重新输入!");
			}

}
