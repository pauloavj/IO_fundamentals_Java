import artists.ArtistsFile;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        create a list of strings to save all the names given in the prompt.
        ArrayList<String> artistsName = new ArrayList<String>();

//        Create a class ArtisitsFile and pass a file to save the names from the list.
        ArtistsFile ArtistsFilePath = new ArtistsFile("./IO_fundamentals_Java/artists.txt");

//         print all existing names in the file.
        ArtistsFilePath.printArtistsName();

//        using the prompt to get all names to save.
        try(Scanner scanner = new Scanner(System.in)) {
            String input = "";
            while (!(input.equals("exit"))) {
                System.out.print("Please enter a musical artist: ");
                input = scanner.nextLine();
                artistsName.add(input);
            }
        }
//        Pass the list of strings to save all the names in the artists.txt file
        ArtistsFilePath.writeArtistsName(artistsName);

    }
}
