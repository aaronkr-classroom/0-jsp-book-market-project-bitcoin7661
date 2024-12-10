package mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import mvc.database.DBConnection;

public class BoardController extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		
		if (command.equals("/BoardListAction.do")) {
			requestBoardList(request);
		} else if (command.equals(" /BoardWriteForm.do")) {//글 등록 페이지 출력 
			requestLoginName(request);
			RequestDispatcher rd = request.getRequestDispatcher(" /BoardListAction.do");
			rd.forward(request, response);
			}
	}
	public void requestLoginName(HttpServletRequest request) {
		//인증된 사용자명 가져오
		
	}
	
	// 새로운 글 등록하기
	public void requestBoardWrite(HttpServletRequest request) {
		
	}
}

public class BoardDAO {
	private static BoardDAO instance;
	
	private BoardDAO() {
		
	}
	
	//선택된 글의 조회수 증가시키기
	public void updateHit(int num) {
		
	}
	//선택된 글 상세 내용 가져오기
	public BoardDTO getBoardByNum(int num, int page) {
		
	}
	
	//member 테이블에서 인증된 id의 사용자명 가져오기
	public String getLoginNameById(String id) {
		
	}
	
	
	//board 테이블에 새로운 글 삽입하기
	public void inserBoard(BoardDTO board) {
		
	}
	
	public static BoardDAO getInstance() {
		if (instance==null)
			instance = new BoardDAO();
		return instance;
	}
	
	//board 테이블의 레코드 개수
	public int getListCound() {
		
	}
	//board 테이블의 레코드 가져오기
	public ArrayyList<BoardDTO> getBoardList(int page, int limit, String items, String text){
		
	}
	
	//선택된 글 내용 수정하기
	public void updateBoard(BoardDTO board) {
		
	}
	
	//선택된 글 삭제하기 
	public void deleteBoard (int num) {
		
	}

}
