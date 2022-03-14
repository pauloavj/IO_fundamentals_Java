package artists;

import java.io.*;
import java.util.ArrayList;

public class ArtistsFile {
    /**Path to the file to be edited.*/
    private String artistFilePath;

    /**Constructor to be assigned on creation, you need to give file path variable as an argument.*/
    public ArtistsFile(String artistFilePath){
        this.artistFilePath = artistFilePath;
    }

    /**This function will print the name of all the artists saved in the file.*/
    public void printArtistsName() {
        try(FileReader artistsInputFromFile = new FileReader(artistFilePath);
            BufferedReader artistsReaderFromFile = new BufferedReader(artistsInputFromFile)){
            String line;
            while((line = artistsReaderFromFile.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Artist database is currently empty");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    /**This function will save all the names given in the artists file.*/
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

