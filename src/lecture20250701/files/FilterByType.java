package lecture20250701.files;

public class FilterByType implements FilterSystemFilter {
	
	private String typeToCheck;
	
	public FilterByType(String typeToCheck) {
		this.typeToCheck = typeToCheck;
	}
	
	public boolean accept(FileSystemElement el) {
		if(el instanceof File) {
			File file = (File) el;
			
			return file.getFileType().equals(typeToCheck);
		}
		
		return false; 
				
	}
}
