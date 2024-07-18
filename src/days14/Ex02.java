package days14;
// static을 이해하고 있는가? 오직 한개, 스태틱!
// 초기화 우선순위 암기, 이해하기.
public class Ex02 {

	public static void main(String[] args) {
		Document doc1 = new Document();
		Document doc2 = new Document("Sample.txt");
		Document doc3 = new Document();
		Document doc4 = new Document();
		
		System.out.println("end");
		

	}//main

}//class

class Document{
	String fileName = "Noname"; // 명시적 초기화
	static int count = 1; // 카운트 하려면 스태틱이 있어야 함. 프로그램에서 공유해서 쓸 거라는 뜻. ????
	
	public Document(String fileName) {
		this.fileName = fileName;
		System.out.printf("\"%s\"문서가 생성되었습니다.\n",this.fileName);
	}
	public Document() { // default생성자
		this("Noname\t" + count++);
	}
	
}