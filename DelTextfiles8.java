import java.io.File;

public class DelTextfiles8 {
    public static void main(String[] args)
    {
        File d=new File("E:/filestxt");
        File[] list=d.listFiles();
        if(list!=null && list.length>0)
        {
            for (File f:list) {
                System.out.println(f.getName());
                File f1=f;
                f1.delete();
            }
        }
    }
}
