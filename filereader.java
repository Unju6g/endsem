import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class filereader{
    public static void main (String[]args){
        BufferedReader br=null;
        try{
            br= new BufferedReader(new FileReader("sample.txt"));
            String line = br.readLine();
            System.out.println("firstline :"+line);
        }
        catch(IOException e){
            System.out.println("error reading file:"+e.getMessage());
        }
        finally{
            System.out.println("file resources are being closed");
            
        
        try {
            if(br!=null)
            br.close();
        }catch(IOException e){
            System.out.println("error closing file");
        }
    }

}
}
