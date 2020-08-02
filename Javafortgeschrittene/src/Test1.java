import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Test1 {

	public static void main(String[] args)  {

		int []t=new int [5];
  int index;
  
  BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));
  
  try {

	  System.out.println("Bitte Index Eingeben ");
	  
	  index=Integer.parseInt(einlesen.readLine());
	  
	  t[index]=100;
	  if(index==0)      throw(new Eigeneexception());
	  
	  FileReader f=new FileReader("test.txt");
	  f.close();
	  
  }
  catch (IndexOutOfBoundsException e1 ) {
	  
	  System.out.println("index ist leider out of bounds"+ e1.getMessage());
	  System.out.println();
	  
	  
	// TODO: handle exception
}
  
  catch(FileNotFoundException e2) {
	  
	  System.out.println("file not Found"+e2.getMessage());
	// TODO: handle exception
}
  
  catch (Eigeneexception e) {
	  System.out.println("es gibt arithmetic exception");
	// TODO: handle exception
}
  
  
  
  
  
  
  
  
  
  catch(Exception e) {
	  
	  System.out.println("general false"+e.getMessage());
	  
	  
	  
  }finally { System.out.println("weitere programm ");
	
}
 
  
  

	}

}
