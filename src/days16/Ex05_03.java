package days16;

public class Ex05_03 {

	public static void main(String[] args) {
		String [] urlArr = {
				"www.naver.com"
				, "http://www.naver.com"
				, "http://www.sist.co.kr"
				, "https://www.daum.net"
		};

		//String regex = "^http://";       [^0-9]
		//String regex = ".com$";
		for (int i = 0; i < urlArr.length; i++) {
			//if( urlArr[i].startsWith("http://") )
			if( urlArr[i].endsWith(".com") )
			   System.out.println(urlArr[i]);
		}

	}

}
