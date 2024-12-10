public class Main {
    public static void main(String[] args) {
        Directory movDirectory = new Directory("movies");

        FileSystem border = new File("border");
        movDirectory.add(border);

        Directory comDirectory = new Directory("comedy");

        FileSystem hulchul = new File("hulchul");
        comDirectory.add(hulchul);

        movDirectory.add(comDirectory);

        // print out the ls
        movDirectory.ls();
    }
}
