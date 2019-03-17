package serializationExam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String args[]) throws Exception{
		EmpDetails e1=new EmpDetails();
		
		
		FileOutputStream out =new FileOutputStream("E:/abcd.txt");
		ObjectOutputStream op=new ObjectOutputStream(out);
		op.writeObject(e1);
	}
}
