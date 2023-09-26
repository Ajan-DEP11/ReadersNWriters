import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo3 {
    public static void main(String[] args) {
         File file = new File("something.txt");

        try(FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);){

            int read = -1;
            byte[] buffer = new byte[1024];
            while((read = fis.read(buffer)) != -1){
                System.out.println(new String(buffer, 0,read));
            }
            System.out.println();
        }catch(IOException e){
            e.printStackTrace();

        }
    }
}
