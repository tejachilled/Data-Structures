package com.Okta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class IBM {

	  public static void main(String[] args) throws IOException {
		    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		    String s="";
		    String[] split1 = null;
		    String[] split2 = null;
		    HashMap<Integer,ArrayList<String>> map = null;
		    while ((s = in.readLine()) != null) {
		    //  System.out.println(s);
		      split1 = s.split(",");
		    }
		    HashSet<String> set =   new HashSet<String>();
		     ArrayList<String>  list = new ArrayList<String>();
		    int count =1;
		     for(int i=0;i<split1.length-1;i++){
		         list = new ArrayList<String>();
		         String str = split1[i];
			    	split2 = str.split("->");
			    	
			    	if(map==null){
			    	     map = new HashMap<Integer,ArrayList<String>>();
			    	     list.add(split2[0]);
			    	     map.put(1,list);
			    	     set.add(split2[0]);
			    	     list = new ArrayList<String>();
			    	     map.put(2,split2[1]);
			    	     set.add(split2[1]);
			    	}
			    	list.s

			    	if(set.contains(split2[0])){
			    	    list = map.get(count);
			    	    list.add(split2[0]);
			    	    map.put(count,list);
			    	}else{
			    	    count++;
			    	    list.add(split2[0]);
			    	    map.put(count,list);
			    	}
			  }
			  int gen =   split1[split1.length-1];
			   ArrayList<String>  flist = new ArrayList<String>();
			   flist = map.get(gen);
			   String fin = "";
			  for( String tem : flist){
			      fin  = fin+ tem + "," ;
			  }
			  System.out.println(fin);
			    
		  }


	

}
