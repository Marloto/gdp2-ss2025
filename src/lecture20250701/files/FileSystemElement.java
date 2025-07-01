package lecture20250701.files;

public abstract class FileSystemElement {
	protected String name;
	protected long created;
	
	public FileSystemElement(String name) {
		this.name = name;
		this.created = System.currentTimeMillis();
	}

	public String getName() {
		return name;
	}

	public long getCreated() {
		return created;
	}
	
	public abstract String toString();
	
	public abstract long getSize();

}
