package ex_file_folder;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractDirectory{

	private List<AbstractDirectory> list;

	public Folder(String name) {
		super(name);
		this.list = new ArrayList<>();
	}
	
	public Folder() {
		this("C:/");
	}
	
	public void add(AbstractDirectory subDirectory) {
		if(!list.contains(subDirectory))
			list.add(subDirectory);
	}
	
	public void remove(AbstractDirectory subDirectory) {
		if(list.contains(subDirectory))
			list.remove(subDirectory);
	}

	@Override
	public int getSize() {
		int total = 0;
		for(AbstractDirectory s : list)
			total += s.getSize();
		return total;
	}
}
