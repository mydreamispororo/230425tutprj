package shop;

import shop.model.Register;

public class Register_Ex {

	public static void main(String[] args) {
		
		
		/*
		// 저장 :setter
		person.setUserid("user1234");

		// 출력 : getter
		System.out.println("입력하신 아이디는 : " + person.getUserid());
		*/

		// 비밀번호.
		/*
		person.setPasswd("12345678");
		System.out.println("입력하신 비밀번호 : " + person.getPasswd());
		*/
		
		Register person = new Register();
		person.setUserid("koreasda23");
		person.setPasswd("1234564564");
		
		//Register.java 파일이 한장 더 복사된다고 생각
		Register person2 = new Register();
		person2.setUserid("changwon123");
		person2.setPasswd("123456789");
		
		//Register.java 파일이 한장 더 복사된다고 생각
		Register person3 = new Register();
		person3.setUserid("busan12452");
		person3.setPasswd("12345556789");

		System.out.println("-------------------");
		System.out.println(person.disp());
		System.out.println("<--------------->");
		System.out.println(person2.disp());
		System.out.println("<--------------->");
		System.out.println(person3.disp());
		
		
	}

}
