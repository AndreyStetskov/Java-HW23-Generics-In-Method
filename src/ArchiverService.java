import java.util.List;

public class ArchiverService {
    public static void listArchiver(List<? extends Archiver> archiver) {
        if (archiver == null) {
            System.out.println("The list of archivers is empty");
            return;
        }
        for (Archiver archive : archiver) {
            System.out.println(archive);
        }
    }

    public static void addArchiver(List<? super Archiver> archiver) {
        archiver.add(new RARArchiver());
        archiver.add(new ZIPArchiver());
        archiver.add(new Archiver() {
            @Override
            public void archive(String name) {System.out.printf("%s has to archive here", name);}

            @Override
            public void unarchive(String name) {System.out.printf("%s has to unarchive here", name);}
        });
    }


}
