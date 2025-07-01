package lecture20250701.files;

public class Main {
	public static void main(String[] args) {
        // Root-Verzeichnis erstellen
        Folder root = new Folder("MyDocuments");
        
        // Dateien im Root-Verzeichnis
        root.addElement(new File("readme.txt", 1024, "txt"));
        root.addElement(new File("todo.txt", 512, "txt"));
        root.addElement(new File("presentation.pdf", 5120, "pdf"));
        
        // Unterordner erstellen
        Folder projects = new Folder("Projects");
        projects.addElement(new File("project1.java", 2048, "java"));
        projects.addElement(new File("project2.py", 1536, "py"));
        projects.addElement(new File("config.xml", 768, "xml"));
        
        // Nested Unterordner
        Folder webProject = new Folder("WebProject");
        webProject.addElement(new File("index.html", 2560, "html"));
        webProject.addElement(new File("style.css", 1024, "css"));
        webProject.addElement(new File("script.js", 3072, "js"));
        
        // WebProject in Projects hinzufügen
        projects.addElement(webProject);
        
        // Bilder-Ordner
        Folder images = new Folder("Images");
        images.addElement(new File("photo1.jpg", 4096, "jpg"));
        images.addElement(new File("photo2.png", 2048, "png"));
        images.addElement(new File("logo.svg", 512, "svg"));
        
        // Alles zum Root hinzufügen
        root.addElement(projects);
        root.addElement(images);
	}
}
