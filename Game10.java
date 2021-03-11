import java.util.*;

public class Game10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user1 = 0;
		int com1 = 0;
		int bigim = 0;
		System.out.println("가위바위보 게임이 시작됩니다. 1 = 가위, 2 = 바위, 3 = 보");

		while(true){
			int user = sc.nextInt();
			int com = (int)Math.random()*3+1;

			if(user == 1){
				if(com == 2){
					System.out.println("user : " + user + " com : " + com + " com 승리!!");
					com1++;
				}
				else if(com == 3){
					System.out.println("user : " + user + " com : " + com + " user 승!!");
					user1++;
				}
				else{
					System.out.println("user : " + user + " com : " + com + " 비김!!");
					bigim++;
				}
			}
			else if(user == 2){
				if(com == 1){
					System.out.println("user : " + user + " com : " + com + " user 승!!");
					user1++;
				}
				else if(com == 3){
					System.out.println("user : " + user + " com : " + com + " com 승!!");
					com1++;
				}
				else{
					System.out.println("user : " + user + " com : " + com + " 비김!!");
					bigim++;
				}
			}
			else if(user == 3){
				if(com == 1){
					System.out.println("user : " + user + " com : " + com + " com 승!!");
					com1++;
				}
				else if(com == 2){
					System.out.println("user : " + user + " com : " + com + " user 승!!");
					user1++;
				}
				else{
					System.out.println("user : " + user + " com : " + com + " 비김!!");
					bigim++;
				}
			}
			else{
				System.out.println("다시 입력해주세요.");
			}
			if(user1 >= 3 || com1 >= 3){
				break;
			}
		}
		System.out.printf("user==> 승 : %d, 패 : %d, 무승부 : %d\n" , user1, com1, bigim);
		System.out.printf("com ==> 승 : %d, 패 : %d, 무승부 : %d\n", com1, user1, bigim);
		System.out.printf("가위바위보 게임이 종료되었습니다.");

	}
}