package service;

import java.security.Timestamp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import repository.BoardDao;
import vo.Board;

@Component
public class BoardService {
@Autowired
private BoardDao boardDao;

public void setBoardDao(BoardDao boardDao) {
	this.boardDao = boardDao;
}
	public int write(Board board){
		int result=0;
		board.setReadcount(0);
		board.setDate(new Date());
		result = boardDao.insert(board);
		return result;
	}
	public Board read(int boardNum, String id){
		Board board = boardDao.select(boardNum);
		if(board!=null && !id.equals(board.get))
		
		return null;
		
	}

	}


