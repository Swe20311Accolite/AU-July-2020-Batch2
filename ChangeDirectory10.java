import java.io.*;
public class ChangeDirectory10 {
    public static void main(String[] args)
    {
        File f=new File("E:/sandy.txt");
        if(f.renameTo(new File("D:/sandy5.txt")))
        {
            f.delete();
            System.out.println("file changed directory");
        }
        else
            System.out.println("directory change failed");
    }
}


