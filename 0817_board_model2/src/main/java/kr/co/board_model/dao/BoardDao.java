package kr.co.board_model.dao;

import java.util.ArrayList;

import kr.co.board_model.dto.BoardDto;

public interface BoardDao {

	public ArrayList<BoardDto> list();
	
	public BoardDto content(String id);
	
	public void readnum(String id);
	
	public String getPwd(int id);
	
	public BoardDto update(String id);
	
	public void update_ok(BoardDto bdto);
	
	public void delete(String id);
	
	public void write_ok(BoardDto bdto);
}
