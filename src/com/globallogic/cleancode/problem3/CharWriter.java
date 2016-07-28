package com.globallogic.cleancode.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CharWriter {
	public class CopyChars {
	    void copyChars() throws IOException{
	       int character;
	       BufferedReader reader = new BufferedReader(new InputStreamReader(readKeyboard()));
	       while (true){
	    	   character = reader.read();  
	    	   if(character == -1)
	    		   break;
	    	   else {
		           writeToPrinter(character);
	    	   }
	       }
	    }

		private InputStream readKeyboard() {
			// TODO Auto-generated method stub
			return null;
		}

		private void writeToPrinter(int c) {
			// TODO Auto-generated method stub
			
		}

	}


}
