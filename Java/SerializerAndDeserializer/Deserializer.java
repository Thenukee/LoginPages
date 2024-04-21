package Java.SerializerAndDeserializer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

  //					Steps to Deserialize
	   //					---------------------------------------------------------------
	   //					1. Your class should implement Serializable interface
       //!                   2. Declare the object (don't instantiate)
	   //					2. add import java.io.Serializable;
	   //					3. FileInputStream fileIn = new FileInputStream(file path);
	   //					4. ObjectInputStream in = new ObjectInputStream(fileIn);
	   //					5. objectNam = (Class) in.readObject();
	   //					6. in.close(); fileIn.close();

public class Deserializer {

    public static void main(String[] args) throws Exception {
        
        User user =null;
        


        FileInputStream fileIn=new FileInputStream("userInfo.ser");
        ObjectInputStream in=new ObjectInputStream(fileIn);
        user=(User)in.readObject();
        in.close();
        fileIn.close();
        
        System.out.println("name"+user.name);
        System.out.println("password"+user.password);




    }




    
}
