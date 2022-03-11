package artists;

import java.io.*;
import java.net.PortUnreachableException;
import java.util.ArrayList;

public class ArtistsFile {
    private String artistFilePath;
//    private ArrayList<String> singleAddress;
//    public ArtistsFile(String artistFilePath) {
//        this.artistFilePath = artistFilePath;
//    }
//    private String artistsName;
//    String artistFilePath = "./artists.txt";

    public ArtistsFile(String artistFilePath){
        this.artistFilePath = artistFilePath;
    }


    public void printArtistsName() {
        try(FileReader artistsInputFromFile = new FileReader(artistFilePath);
            BufferedReader artistsReaderFromFile = new BufferedReader(artistsInputFromFile)){
            String line;
            while((line = artistsReaderFromFile.readLine()) != null){
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void writeArtistsName(ArrayList<String> artistsName) {
        try( FileWriter input = new FileWriter(artistFilePath, true);
            BufferedWriter output = new BufferedWriter(input)){
            for (int i = 0; i < artistsName.size(); i++) {
                output.write(artistsName.get(i) + "\n");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
//public artist(String artistName){
//
//}
