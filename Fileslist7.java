import java.io.File;
public class Fileslist7 {
    public static void main(String[] args)
    {
        File d=new File("E:/");
        File[] list=d.listFiles();
        if(list!=null && list.length>0)
        {
            for (File f:list) {
                System.out.println(f.getName());
            }
        }
    }
}
