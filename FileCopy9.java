import java.io.*;

public class FileCopy9 {
    public static void main(String[] args) throws FileNotFoundException,IOException {
        try {
            int b;
            File input=new File("E://filestxt/sandy.txt");
            File output=new File("E://filestxt/sandy1.txt");
            FileInputStream i=new FileInputStream(input);
            FileOutputStream o=new FileOutputStream(output);
            b=i.read();
            while(b!=-1)
               o.write(b);
            i.close();
            o.close();
            System.out.println("another copy created");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
