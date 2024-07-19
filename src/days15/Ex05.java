package days15;

import javax.swing.border.Border;

/**
 * @author love
 * @date 2024. 7. 19. - 오후 2:01:04
 * @subject		[싱글톤(singleton)]
 * @content		
 *
 */
public class Ex05 {

	public static void main(String[] args) {
		//The constructor BoardDAO() is not visible 오류 
		             // (private로 생성자 선언 => 불가능!)
		// BoardDAO dao = new BoardDAO();
		BoardDAO dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.insert();
		
		dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.update();
		
		dao = BoardDAO.getInstance();
		System.out.println(dao.hashCode());
		dao.select();
		
		// 동기화 : 공유할 객체가 1개여야 동기화가 가능. // 동기화란? 1명의 사용이 끝나고 다른 사람이 마저 사용하는것...
		
		
		
	} // main

} // class

// DB 연결 + CRUD (생성,읽기,수정,삭제) 가 필요하면 싱글톤을 쓴다.
// DAO == Data Access Object
class BoardDAO{
	
	private static BoardDAO boardDAO = null;
	
	// 1. private로 생성자 선언 => 불가능!
	private BoardDAO() {}
	
	// 동기화처리(잠금) : synchronized
	public synchronized static BoardDAO getInstance() { // static 안에서는 this 사용 못함.
		// return new BoardDAO();
		if (boardDAO == null) {
			boardDAO = new BoardDAO();
		}
		return boardDAO;
	}
	public void insert() {
		System.out.println("DB 추가");
		
	}
	public void select() {
		System.out.println("DB 조회");
	}
	public void update() {
		System.out.println("DB 수정");
	}
	public void delete() {
		System.out.println("DB 삭제");
	}
	
} //BoardDAO