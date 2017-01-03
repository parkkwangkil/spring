package repository.mapper;

import java.util.List;

import vo.Myfile;

public interface FileMapper {
	public int insert(Myfile myfile);

	public Myfile select(int fileNum);

	public List<Myfile> selectAll();

}
