package streams;

import java.io.*;
import java.util.ArrayList;

public class Str {


	    public static void main(String[] args) throws Exception {  
 	        BufferedReader br= new  BufferedReader(new InputStreamReader(System.in));
	        ArrayList<String>list= new ArrayList <String>();
	       String line;
	       while(!(line = br.readLine()).equals("end")) 
	       list.add(line);
	        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));   
	        for (int i=0;i<list.size();i++)   
	        {
	            String tok[] = list.get(i).split("");
	        bw.write(tok[0] +" X "+tok[2]+" = "+(Integer.parseInt(tok[0]) * Integer.parseInt(tok[2]))+"\n");
	        }
	         bw.flush();
	        
	        
	        
	        
	    
	    
	}
}
