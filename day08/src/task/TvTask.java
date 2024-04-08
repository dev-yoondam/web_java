package task;

import java.util.Scanner;

public class TvTask {
	public static void main(String[] args) {
		String msg = "1. 전원 버튼\n" 
				+ "2. 채널 올리기\n"
				+ "3. 채널 내리기\n"
				+ "0. 프로그램 종료\n"
				+ "번호 입력 : ";
		//객체 생성
		//입력클래스
		//while(true){
		//msg 출력
		//입력메소드
		//switch~case{ 1: 2: 3: 0: default:
		//1: 호출
		//2: if~e 메소드lse
		//3: if~else
		//0: syso() 
		//default: syso() } } 
		
		BasicTv tv = new BasicTv("black", 16, 100000);
//		System.out.println(tv);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(msg);
			int choice = sc.nextInt();
//			System.out.println(choice);
			switch(choice) {
			case 1:
				tv.powerOnOff();
				break;
			case 2:
				if(tv.power) {
					System.out.println("현재 채널 : " + tv.channel);
					System.out.println("채널이 변경되었습니다. 현재 채널 : " + tv.channelUp());
				}else {
					System.out.println("tv 전원을 켜주세요");
				}
				break;
			case 3:
				if(tv.power) {
					System.out.println("현재 채널 : " + tv.channel);
					System.out.println("채널이 변경되었습니다. 현재 채널 : " + tv.channelDown());
				}else {
					System.out.println("tv 전원을 켜주세요");
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다");
				sc.close();
				System.exit(0); //프로그램 종료
				break;
			default:
				System.out.println("다시 입력하세요");
				break;
			} //switch문 영역 종료
		} //while문 영역종료
		
		
		
		
		
		//객체는 tv라는 객체 1개 생성
		
		//while문을 통해서 프로그램을 무한반복한다
		//사용자에게 옵션메뉴를 출력하고 번호를 입력받는다
		//선택한 옵션에 따라 수행한다
		//1번선택시 : Tv전원을 On, Off한다 => 켜졌을 경우 Tv전원이 켜졌습니다 출력
		//			꺼져있을 경우 Tv전원이 꺼졌습니다 출력
		//2번선택시 : Tv전원이 켜져있을 경우 현재 채널을 출력하고 올린 채널 출력
		//			꺼져있을 경우 Tv전원을 먼저 켜주세요 메시지 출력
		//3번선택시 : Tv전원이 켜져있을 경우 현재 채널을 출력하고 내린 채널 출력
		//			꺼져있을 경우 Tv전원을 먼저 켜주세요 메시지 출력
		//0번선택시 : 프로그램 종료한다
		//그외 선택시 : 다시 번호를 입력하세요
	}
}














