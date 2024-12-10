package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRsponse;

import mvc.model.BoardDAO;
import mvc.model.BoardDTO;

public class BoardController extends HttpServlet {
	private static final long serialVersionUID=1L;ub
	static final int LISTCOUNT=5;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request.response);
	}
	
	public void doPost(HttpServletRequest request, HttpservletResponse response)
	throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command= RequestURI.substring(contextPath.length());
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		if (command.equals(" /BoardListAction.do")) { //등록된 글 목록 페이지 출력하기
			requestBoardList(request);
			RequestDispatcher rd = request.getRequestDispatcher(" ./board/list.jsp");
			rd.forward(request,  response);
			//선택된 글 상자 페이지 가져오기
			
		}else if (command.equals("/BoardViewAction.do")) {
			requestBoardView(request);
			RequestDispatcher rd=request.getRequestDispatcher("/BoardView.do");
			rd.forward(request, response);
		} else if (command.equals("/BoardView.do")) { //글 상세 페이지 출력하기
			RequestDispatcher rd=request.getRequestDispatcher(" ./board/view.jsp");
			rd.forward(request, response);
			
		} else if (command.equals(" /BoardUpdateAction.do")) { //선택된 글 수정하기
			requestBoardUpdate(request);
			RequestDispatcher rd=request.getRequestDispatcher("/ BoardListAction.do");
			rd.forward(request, response);
		} else if (command.equals("/BoardDeleteAction.do")) { //선택된 글 삭제하기
			requestBoardDelete(request);
			RequestDispatcher rd= request.getRequestDispatcher("/BoardListAction.do");
			rd.forward(requestm, request);
		}
	}
	// 등록된 글 목록 가져오
	public void requestBoardList(HttpServletRequest request) {
		
	}
	public void requestBoardUpdate(HttpServletRequest request) {
		
	}
	public void requestBoardDelete(HttpServletRequest request) {//선택된 글 삭제하}
	}
	}
}
