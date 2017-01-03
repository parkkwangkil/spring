package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vo.Board;

@Component
public class BoardDao {
@Autowired
public int insert(Board board) {
	
	return 0;
}

public Board select(int boardNum) {
	// TODO Auto-generated method stub
	return null;
}

}
