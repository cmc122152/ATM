import java.util.Scanner;
public class ATM{
   private static long kahao=370120180104L;
   private static int password=123456;
   private static int amount=1000;
   public static void main(String[] args) {
   	//��¼����
 	 System.out.println("�����뿨��");
 	 Scanner sc=new Scanner(System.in);
     long scn=sc.nextLong();
    if(scn==kahao){
    	System.out.println("������ȷ");
        }else{
    	System.out.println("���Ŵ�������������");
    }
      System.out.println("����������");
 	 Scanner pass=new Scanner(System.in);
     int pass_word=pass.nextInt(); 
     if(pass_word==password){
     	System.out.println("������ȷ");
        }else{
    	System.out.println("�����������������");
     }
     //���ܽ���
     System.out.println("��ѡ�����ҵ��");
     System.out.println("1.��ѯ 2.ת�� 3.ȡ�� 4.��� 5.�˿�");
    int number=new Scanner(System.in).nextInt();
    switch(number){
    //��ѯ
    case 1:
       System.out.println("�˻�������"+"����");
       System.out.println("��"+amount+"Ԫ");
       //��ѯ������һ��
          System.out.println("1.������һ��");
          System.out.println("2.�˳�");
          int number1=new Scanner(System.in).nextInt();
           switch(number1){
        	 case 1:
        	  System.out.println("1.��ѯ 2.ת�� 3.ȡ�� 4.��� 5.�˿�");
        	  break;
        	  case 2: 
        	  System.out.println("�ɹ��˳�");
        	  break;}
     //ת��
     case 2:
        System.out.println("������Է����п���");
 	    Scanner sc1=new Scanner(System.in);
        long scn1=sc1.nextLong();
        System.out.println("������ת�˽��");
 	    Scanner sc2=new Scanner(System.in);
        long scn2=sc2.nextLong();
        System.out.println("1.ȷ��");
        System.out.println("2.��������");
        System.out.println("3.���ز˵�");
         int number2=new Scanner(System.in).nextInt();
           switch(number2){
        	 case 1:
        	  System.out.println("�Է����ţ�"+scn1);
        	  System.out.println("�Է�������"+"��*");
        	  System.out.println("ת�˽�"+scn2+"RMB");
        	    System.out.println("1.ȷ��");
                System.out.println("2.��������");
                System.out.println("3.���ز˵�");
                int number3=new Scanner(System.in).nextInt();
                switch(number3){
                	case 1:
                	System.out.println("�����ɹ�");
                	break;
                	case 2:
                }
        	  break;
        	  case 2: 
        	   System.out.println("������Է����п���");
        	   System.out.println("������ת�˽��");
        	  break;}
    }
  }
}