package DAOs;
import java.io.*;

public class ObjectDAO implements IDAO {
	
		public Object read(Class clazz, String filename) {
			Object object=null;
			try {
				ObjectInputStream in;
				in=new ObjectInputStream(new FileInputStream(filename));
				object= in.readObject();
				in.close();
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return object;
		}

		public void write(Object object,String filename){
			//serialize
			try {
				ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename));
				out.writeObject(object);
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
}

