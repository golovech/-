package days16;

//사용자 정의한 예외 클래스
// unchecked 예외
public class ScoreOutOfBoundException extends RuntimeException{

	private static final long serialVersionUID = -4929489435649130159L;

	// 예외 코드 번호 : 필드
	private final int ERROR_CODE ;

	public int getERROR_CODE() {
		return ERROR_CODE;
	}

	public ScoreOutOfBoundException(String message) {
		this(1000,message );
	}

	public ScoreOutOfBoundException(int error_code, String message) {
		super(message);
		this.ERROR_CODE = error_code;
	}

}
