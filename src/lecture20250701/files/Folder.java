package lecture20250701.files;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemElement {
	private List<FileSystemElement> children;
	
	public Folder(String name) {
		super(name);
		this.children = new ArrayList<>();
	}
	
	public List<FileSystemElement> getChildren() {
		return children;
	}
	
    public void addElement(FileSystemElement element) {
        children.add(element);
    }
    
    public long getSize() {
    	int sum = 0;
    	for(FileSystemElement element : this.children) {
    		sum += element.getSize();
    	}
    	return sum;
    }
	
	public String toString() {
		return this.name + " (folder)";
	}
}
