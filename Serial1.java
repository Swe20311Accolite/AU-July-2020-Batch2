import java.io.*;
import java.util.*;
class Serial implements Serializable {
   public UUID s1,s2,s3;static int i=0;
    transient UUID s4,s5;
    public UUID getS1() {
        return s1;
    }
    public UUID getS2() {
        return s2;
    }
    public UUID getS3() {
        return s3;
    }
    public UUID getS4() {
        return s4;
    }
    public UUID getS5() {
        return s5;
    }
    public Serial(UUID s1, UUID s2, UUID s3, UUID s4, UUID s5) {
        this.s1 = s1; this.s2 = s2; this.s3 = s3; this.s4 = s4; this.s5 = s5;
    }
    public void printUUID(UUID u)
    {  i++;
        if(u != null)
            System.out.println("UUID s"+i+" is " + u.toString()+" serialized");
        else
            System.out.println("UUID s"+i +" cannot get serialize");
    }
}

public class Serial1 {
    public static void main(String []args) {
        Serial serial =new Serial(UUID.randomUUID(),UUID.randomUUID(),UUID.randomUUID(),UUID.randomUUID(),UUID.randomUUID());
        try
        {
            FileOutputStream f1 = new FileOutputStream("file1.ser");
            ObjectOutputStream obj1 = new ObjectOutputStream(f1);
            obj1.writeObject(serial);
            obj1.close();f1.close();
        }
        catch(Exception e) {
            new Exception("exception Caught");
        }

        try
        {
            FileInputStream f2 = new FileInputStream("file1.ser");
            ObjectInputStream objIn = new ObjectInputStream(f2);
            serial = (Serial) objIn.readObject();
        } catch (Exception e) {
            new Exception("exception Caught");
        }
        serial.printUUID(serial.s1);serial.printUUID(serial.s2);
        serial.printUUID(serial.s3);serial.printUUID(serial.s4);serial.printUUID(serial.s5);


    }
}