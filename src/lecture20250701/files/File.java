package lecture20250701.files;

public class File extends FileSystemElement {
	private long size;
	private String fileType;
	
	public File(String name, long size, String fileType) {
		super(name);
		this.size = size;
		this.fileType = fileType;
	}

	public long getSize() {
		return size;
	}

	public String getFileType() {
		return fileType;
	}
	
	public String toString() {
		return this.name + " (" + this.fileType + ", " + this.size + ")";
	}

}
