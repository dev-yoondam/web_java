package task;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	UserService site = new UserService();
	
	UserVO u1 = new UserVO("dear-dam", "dam", "윤담", 25);
	UserVO u2 = new UserVO("klimzero", "wooyoung", "유우영", 27);
	UserVO u3 = new UserVO("west-hyeon", "seohyeon", "김서현", 25);
	
	
	site.regist(u1);
	
	
}
}
