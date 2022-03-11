import artists.ArtistsFile;
//import artists.ArtistsName;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> artistsName = new ArrayList<String>();

        ArtistsFile ArtistsFilePath = new ArtistsFile("./artists.txt");

        ArtistsFilePath.printArtistsName();

        try(Scanner scanner = new Scanner(System.in)) {
            String input;
            do {
                System.out.print("Please enter a musical artist: ");
                input = scanner.nextLine();
//                ArtistsName ArtistsName = new ArtistsName(input);
//                singleAddress.add(input);
                if (!(input.equals("exit"))) {
                    artistsName.add(input);
                }

            }while (!(input.equals("exit")));
        }
        ArtistsFilePath.writeArtistsName(artistsName);
//        System.out.println(singleAddress);


    }
}
