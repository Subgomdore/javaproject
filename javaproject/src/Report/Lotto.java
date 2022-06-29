package Report;
public class Lotto {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		* 검수를 위해 중복오류를 확인하기위해 6번까지번호만지정
//		* 6으로 되어있는 범위를 * 45로 변경하면 정상출력
		int luck = 0;
		int luck2 = 0;
		int luck3 = 0;
		int luck4 = 0;
		int luck5 = 0;
		int luck6 = 0;
		luck = (int) (Math.random() * 6) + 1;
		System.out.println("첫번째로또번호:" + luck);
		luck2 = (int) (Math.random() * 6) + 1;
		if (luck == luck2) 
		{
			for (int i = 1; i <= 10000; i++) {
				luck2 = (int) (Math.random() * 6) + 1;
				System.out.println("[2]" + i + "번째 다시뽑은숫자=" + luck2);
				if (luck != luck2) {
					break;
				} else {
				}
				break;
			}
		}
		System.out.println("두번째로또번호:" + luck + "," + luck2);
		luck3 = (int) (Math.random() * 6) + 1;
		if (luck == luck3 || luck2 == luck3) {
			for (int i = 1; i <= 1000; i++) {
				luck3 = (int) (Math.random() * 6) + 1;
				if (luck != luck3 && luck2 != luck3) {
					break;
				} else {
				}
				System.out.println("[3]" + i + "번째 다시뽑은숫자=" + luck3);
			}
		}
		System.out.println("세번째로또번호:" + luck + "," + luck2 + "," + luck3);
		luck4 = (int) (Math.random() * 6) + 1;
		if (luck == luck4 || luck2 == luck4 || luck3 == luck4) {
			for (int i = 1; i <= 1000; i++) {
				luck4 = (int) (Math.random() * 6) + 1;
				if (luck != luck4 && luck2 != luck4 && luck3 != luck4) {
					break;
				} else {
				}
				System.out.println("[4]" + i + "번째 다시뽑은숫자=" + luck4);
			}
		}
		System.out.println("네번째로또번호:" + luck + "," + luck2 + "," + luck3 + "," + luck4);
		luck5 = (int) (Math.random() * 6) + 1;
		if (luck == luck5 || luck2 == luck5 || luck3 == luck5 || luck4 == luck5) 
		{
			for (int i = 1; i <= 1000; i++) {
				luck5 = (int) (Math.random() * 6) + 1;
				if (luck != luck5 && luck2 != luck5 && luck3 != luck5 && luck4 != luck5) {
					break;
				} else {
				}
				System.out.println("[5]" + i + "번째 다시뽑은숫자=" + luck5);
			}
		}
		System.out.println("다섯째로또번호:" + luck + "," + luck2 + "," + luck3 + "," + luck4 + "," + luck5);
		luck6 = (int) (Math.random() * 6) + 1;
		if (luck == luck6 || luck2 == luck6 || luck3 == luck6 || luck4 == luck6 || luck5 == luck6) 
		{
			for (int i = 1; i <= 1000; i++) 
			{
				luck6 = (int) (Math.random() * 6) + 1;
				if (luck != luck6 && luck2 != luck6 && luck3 != luck6 && luck4 != luck6 && luck5 != luck6 ) 
				{
					break;
				} else 
				{
				}
				System.out.println("[6]" + i + "번째 다시뽑은숫자=" + luck6);
			}
		}
		System.out.println("최종로또번호:" + luck + "," + luck2 + "," + luck3 + "," + luck4 + "," + luck5 + "," + luck6);
	}
}
