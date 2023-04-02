public abstract class Archiver {
    public abstract void archive(String name);

    public abstract void unarchive(String name);

    @Override
    public String toString() {
        return "Archiver";
    }
}
