package Report;

public class Lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottoArray = new int[] { 3, 2, 2 };
//      int[] lottoArray = new int[3];
		for (int i = 0; i < lottoArray.length; i++) // i 총 6개의숫자를뽑을예정
		{
//         lottoArray[i] = (int) ((Math.random() * 3) + 1); // 임의의값이 6개 배열에 들어감
			System.out.print("[" + lottoArray[i] + "]" + " ");
		}
		System.out.println();

		int text = 0;

		for (int i = 0; i < lottoArray.length; i++) {
			for (int r = 0; r < lottoArray.length; r++) {
				text++;
				System.out.println("사이클횟수  :" + text);
				System.out.println("i값참고  :" + "(" + i + ")" + "  " + "R값참고  :" + "(" + r + ")" + "  ");
				if (i != r) // i랑 r값이 같으면 -> break;
				{
					if (i > r) ////////////////////////////////// 조건1
					{
						System.out.println("=================================");
						while (lottoArray[i] == lottoArray[r]) // i의인덱스배열값과 r인덱스의 배열값이 같을경우, 무한하게 r값을 재갱신한다
						{
							System.out.println(lottoArray[i] + "값과" + lottoArray[r] + "값이 같다.");
							lottoArray[i] = (int) ((Math.random() * 3) + 1); // i 갱신
							System.out.println("i>r i갱신된 값 :" + lottoArray[i]);
						}
					}
					
					if (i < r) ////////////////////////////////// 조건2
					{
						System.out.println("=================================");
						while (lottoArray[i] == lottoArray[r]) // i의인덱스배열값과 r인덱스의 배열값이 같을경우, 무한하게 r값을 재갱신한다
						{
							int t = 0;
							System.out.println(lottoArray[i] + "값과" + lottoArray[r] + "값이 같다.");
							lottoArray[r] = (int) ((Math.random() * 3) + 1); // 갱신된 값이 앞의 인덱스와같지않아야 한다는 반복문을 어떻게?
							System.out.println("r>i r갱신된 값 :" + lottoArray[r]);

							if (lottoArray[t] != lottoArray[r]) {
								System.out.println("break점검용");
								t++;// while문 후 갱신된 값이 같지않을경우 break 로
								break;
							}
							if (lottoArray[t] == lottoArray[r]) {
								System.out.println("continue점검용");
								continue;
							}
						}
					}
				}
				continue;
			}
		}
		System.out.println();
		System.out.println();
		for (int k = 0; k < lottoArray.length; k++) {
			System.out.print("[" + lottoArray[k] + "]" + " ");
		}
	}
}