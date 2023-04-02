import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Archiver> archive = new ArrayList<>();

        String fileOne = "First file";
        String fileTwo = "Second file";
        String fileThree = "Third file";
        String fileFour = "Fourth file";
        String fileFive = "Fifth file";
        String fileSix = "Six file";
        String fileSeven = "Seventh file";
        String fileEight = "Eighth file";

        archive.add(new Archiver() {
            @Override
            public void archive(String name) {}

            @Override
            public void unarchive(String name) {}
        });

        List <ZIPArchiver> zip = new ArrayList<>();
        zip.add(new ZIPArchiver());
        zip.add(new ZIPArchiver());
        zip.add(new ZIPArchiver());
        zip.add(new ZIPArchiver());
        zip.add(new ZIPArchiver());

        List <RARArchiver> rar = new ArrayList<>();
        rar.add(new RARArchiver());
        rar.add(new RARArchiver());
        rar.add(new RARArchiver());
        rar.add(new RARArchiver());
        rar.add(new RARArchiver());
        rar.add(new RARArchiver());
        rar.add(new RARArchiver());

        ArchiverService.listArchiver(archive);
        ArchiverService.listArchiver(zip);
        ArchiverService.listArchiver(rar);

        ArchiverService.addArchiver(archive);
        System.out.println(archive);
    }
}