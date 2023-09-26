import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
    /**
     
     */
    public static void main(String[] args) {
        // File file = new File("something2.txt");
        // try{
        //     file.createNewFile();
        //     try(FileOutputStream fos = new FileOutputStream(file);
        //     BufferedOutputStream bos =new BufferedOutputStream(fos);){
        //         String content = "ahsghjbkalb";
        //         bos.write(content);
        //         bos.flush();


        //     }
        // }catch(IOException e){
        //     e.printStackTrace();
        // }

           File file = new File("something2.txt");
        try{
            file.createNewFile();
            try(FileWriter fos = new FileWriter(file);
            BufferedWriter bos =new BufferedWriter(fos);){
                String content = "ahsghjbkalb";
                bos.write(content);
                bos.flush();


            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
