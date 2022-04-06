package ex_file_folder;

public class File extends AbstractDirectory{
	private int size;

	public File(String name, int size) {
		super(name);
		this.size = size;
	}

	public File() {
		super();
	}

	@Override
	public int getSize() {
		return size;
	}
}
