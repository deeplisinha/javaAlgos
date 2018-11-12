package com.practice.learn;


import java.io.*;


public class Wordcount {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:/Users/user/Documents/notes/word.txt");
		    BufferedReader read=new BufferedReader(file);
		    int count=0;
		    if(read.readLine()==" ") {
		    	count=count+1;	
		    }
		    System.out.println("total word="+count);
		    read.close();	
		    }
}

	

