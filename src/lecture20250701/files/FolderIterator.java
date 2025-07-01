package lecture20250701.files;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FolderIterator implements 
	Iterator<FileSystemElement> {
	
	private Iterator<FileSystemElement> it;
	private List<FileSystemElement> all;
	private int pointer;
	

	public FolderIterator(Folder root, 
			FilterSystemFilter filter) {
		List<FileSystemElement> all = new ArrayList<>();
		collect(root, all, filter);
		this.it = all.iterator();
		this.all = all;
		this.pointer = 0;
	}

	private void collect(Folder root, 
			List<FileSystemElement> all,
			FilterSystemFilter filter) {
		List<FileSystemElement> children = root.getChildren();
		for(FileSystemElement el : children) {
			if(filter.accept(el)) {				
				all.add(el);
			}
			if(el instanceof Folder) {
				collect((Folder) el, all, filter);
			}
		}
	}

	@Override
	public boolean hasNext() {
		// return this.pointer < this.all.size();
		return it.hasNext();
	}

	@Override
	public FileSystemElement next() {
		// return this.all.get(this.pointer ++);
		return it.next();
	}

}
