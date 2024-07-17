package days13;
/**
 * @author love
 * @date 2024. 7. 17. - 오후 3:41:51
 * @subject
 * @content
 *
 */
public class Ex08 {

	public static void main(String[] args) {
		// 5명
		//		Save s1 = new Save("김선우", 1000, 0.03);		
		//		Save s2 = new Save("김인경", 10000, 0.03);		
		//		Save s3 = new Save("김재민", 5000, 0.03);		
		//		Save s4 = new Save("김준석", 15000, 0.03);		
		//		Save s5 = new Save("박준용", 1000, 0.03);
		//		
		//		s1.dispSave();
		//		s2.dispSave();
		//		s3.dispSave();
		//		s4.dispSave();
		//		s5.dispSave();
		// 위를 클래스 배열 선언 사용하여 수정해보자!

		/*
		Save [] sArr = new Save[5];
		// [0x100]sArr
		sArr[0] = new Save("김선우", 1000, 0.03);		
		sArr[1] = new Save("김인경", 10000, 0.03);		
		sArr[2] = new Save("김재민", 5000, 0.03);		
		sArr[3] = new Save("김준석", 15000, 0.03);		
		sArr[4] = new Save("박준용", 1000, 0.03);
		 */
		
		// 클래스명. 클래스변수
		// The field Save.rate is not visible . 접근 못한다. 는 말.
	//	System.out.println(Save.rate);
		
		//Save.rate = 0.05;
		Save.setRate(0.05);
		//System.out.println(Save.rate);
		
		
		Save [] sArr = {
						new Save("김선우", 1000, 0.03),	
						new Save("김인경", 10000, 0.03),		
						new Save("김재민", 5000, 0.03),
						new Save("김준석", 15000, 0.03),	
						new Save("박준용", 1000, 0.03)
						};
		
		// sArr[2].setRate(1.37);
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i].dispSave();
		}

	} // main

} // class
