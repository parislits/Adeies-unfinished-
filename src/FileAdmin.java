import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileAdmin {
	
	
	public static void writeWorkerToFile(ArrayList w) {
		
		try
		{
			
		 File f = new File("Workers.ser");
		 FileOutputStream fouts = new FileOutputStream(f);
		 ObjectOutputStream oouts = new ObjectOutputStream(fouts);
		// PrintWriter out = new PrintWriter(new FileWriter(f, true));
		oouts.writeObject(w);
		 
		 oouts.close();
		}
		catch(IOException e)
		{
		 
		}

	}
	public static ArrayList readsWorkersOfFile() throws ClassNotFoundException, IOException{
		
		ArrayList Workers;
		
		FileInputStream fileInputStream = new FileInputStream("Workers.ser");
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
		Workers = (ArrayList) objectInputStream.readObject();
		objectInputStream.close();
		return Workers;
	
	
	}
	

}
