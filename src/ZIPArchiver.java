public class ZIPArchiver extends Archiver {

    @Override
    public void archive(String name) {
        System.out.printf("The file %s was successfully archived to Zip", name);
    }

    @Override
    public void unarchive(String name) {
        System.out.printf("The file %s was successfully unarchived from ZIP", name);
    }

    @Override
    public String toString() {
        return "ZIPArchiver";
    }
}
