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

    //                 	1. children classes of a parent class that implements Serializable will do so as well
	   //!					2. static fields are not serialized (they belong to the class, not an individual object)
	   //!					3. Fields declared as "transient" aren't serialized, they're ignored
	   //					4. the class's definition ("class file") itself is not recorded, cast it as the object type
	   //!					5. serialVersionUID is a unique version ID 




    
}
