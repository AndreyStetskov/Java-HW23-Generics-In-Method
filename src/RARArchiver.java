public class RARArchiver extends Archiver{

    @Override
    public void archive(String name) {
        System.out.printf("The file %s was successfully archived to RAR", name);
    }

    @Override
    public void unarchive(String name) {
        System.out.printf("The file %s was successfully unarchived from RAR", name);
    }

    @Override
    public String toString() {
        return "RARArchiver";
    }
}
