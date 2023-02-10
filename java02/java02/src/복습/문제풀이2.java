package 복습;

import java.util.Date;

import javax.swing.JOptionPane;

public class 문제풀이2 {

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900; //2023
		int day = date.getDay(); //0: 일요일, 1: 월요일, 6: 토요일
		int month = date.getMonth() + 1;
		
		//1. 
//		if (year >= 2000) {
//			System.out.println("밀레니엄 세대O");
//		} else {
//			System.out.println("밀레니엄 세대X");
//		}
		
		//2. 
		switch (day) {
		case 0: case 6:
			System.out.println("쉬~~~~~자");
			break;
		default:
			System.out.println("열심히 공부하자.");
			break;
		}
		
		//3. 
		switch (month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4:case 6:case 9:case 11:
			System.out.println("30일까지");
			break;
		default: //나머지
			System.out.println("31일까지");
			break;
		}

	}

}
