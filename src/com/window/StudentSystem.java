package com.window;
import com.mysqld.Mysqld;
/*���ڣ�2021��1��2��
 * ������:Bվup�� �̵���
 * QQ:3058333641
 * ��ǰ�ฺ�𣬵��ÿ�ʼ��ͼ�ν���
 * */
public class StudentSystem {
	public static LoginStart loginstartA;

	public static void main(String[] args) {
		
		show();
		
	}
	static public  void show() {
		LoginStart loginstart=new LoginStart();//��ʼ�����췽��
		loginstartA=loginstart;
		Mysqld a=new Mysqld("root","123456");//���ݿ��˺� ������
		Manage aa=new Manage();
	}

}
