package 확인문제;

import javax.swing.JOptionPane;

public class 문제1 {
	
	public static void main(String[] args) {
		//입력
		String data1 = JOptionPane.showInputDialog("오늘은 무슨 요일");
		String data2 = JOptionPane.showInputDialog("수업끝나고? 무엇?");
		
		//처리
		String result = "오늘 " + data1 + "에 수업후 나는 " + data2 + "할 예정";
		
		//출력
		System.out.println(result);
	}
	
}
