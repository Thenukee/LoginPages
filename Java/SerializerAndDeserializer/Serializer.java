package Java.SerializerAndDeserializer;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Steps to Serialize
	   //					---------------------------------------------------------------
	   //					1. Your class should implement Serializable interface
	   //					2. add import java.io.Serializable;
	   //					3. FileOutputStream fileOut = new FileOutputStream(file path)
	   //					4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
	   //					5. out.writeObject(objectName)
	   //					6. out.close(); fileOut.close();
	   //					---------------------------------------------------------------

public class Serializer {
    public static void main(String[] args) throws IOException {
        
        User user =new User();
        user.name="Thxlnew";
        user.password="Ntsa";


        FileOutputStream fileOut=new FileOutputStream("userInfo.ser");
        ObjectOutputStream out=new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object info saved!!");




    }
    
}
