package framework.servlet.controller.exceptions;

/**
 * 서비스 로직의 예외를 처리하는 클래스
 * @author 유현
 * @since 18.07.22
 */
public class DuplicateURLException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DuplicateURLException(String msg) {
		super(msg);
	}
}