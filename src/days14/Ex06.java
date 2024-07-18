package days14;

import days12.Tv;

/**
 * @author love
 * @date 2024. 7. 18. - 오후 12:19:43
 * @subject
 * @content
 *
 */
public class Ex06 {

	public static void main(String[] args) {
		//
		
		CaptionTv ctv = new CaptionTv();
		ctv.power();
		
		ctv.channelUp();
		ctv.channelDown();
		System.out.println(ctv.channel);
		
		ctv.cation = true;
		ctv.dispCaption("Hello~");
		ctv.dispCaption("loveYou!");

		ctv.power();
		System.out.println("e n d");
		
	}//main

}//class

class CaptionTv extends Tv{
	
	boolean cation; // 자막기능 on/off	(true/false)
	
	void dispCaption(String massage) { // dispCaption은 어디서 나온 메서드인가? 직접 만들면 되나.
		if (cation) {
			System.out.println(massage);
		}
	}
	
}
