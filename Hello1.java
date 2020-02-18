import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Hello1 
{ 
    public static void main(String[] args) throws IOException  
    { 
        System.out.println("Hello,Enter Your Name");

        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name = reader.readLine(); 
  
        // Printing the read line 
        System.out.println(name);         
    } 
}
