import java.util.ArrayList;

public class Directory implements FileSystem {
    String name;
    ArrayList<FileSystem> files;

    Directory(String name) {
        this.name = name;
        files = new ArrayList<FileSystem>();
    }

    public void add(FileSystem file) {
        files.add(file);
    }

    @Override
    public void ls() {
        System.out.println("Directory name " + name);
        for (FileSystem file : files) {
            file.ls();
        }
    }
}
