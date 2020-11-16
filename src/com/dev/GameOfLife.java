package com.dev;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameOfLife {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\ThinkPad T560\\Desktop\\gameOfLife.txt";
		displayFile(path);

	}
	
	public static void displayFile(String path) throws IOException {
		
		 File file = new File(path); 
		  try(BufferedReader br = new BufferedReader(new FileReader(file))){
			  String st; 
			  int i=0;
			  int nbr_l = 0,nbr_c=0;
			  Map<Integer,int[]> map=new HashMap<>();
			  while ((st = br.readLine()) != null) {
				  String[] lignetab=st.split(" ");
				  List<Integer> getAllOccurrence=new ArrayList<>();
				    System.out.println(st); 
				    if(i==0) {
				    	i++;
				    	continue;
				    }
				  
				  if(i==1) {
					  nbr_l=Integer.valueOf(lignetab[0]);
					  nbr_c=Integer.valueOf(lignetab[1]);
					  
				  }else {
					 // System.out.printf("index of %d",st.indexOf("*"));
					  int[] tab=new int[nbr_c];
					    //System.out.println(tab[0]); 

					  if(st.contains("*")) {
						  getAllOccurrence=st.contains("*")?getAllOccurrence(st,"*"):Collections.EMPTY_LIST;
						  for(int j=0;j<getAllOccurrence.size();j++) {
							  tab[j]=getAllOccurrence.get(j);
						  }
					  }

					 // tab=getAllOccurrence.stream().toArray(Integer[]::new);
					  //for()
					   map.put(i,tab);

					 
				  }
			    i++;
			  } 
			  
			    map.forEach((K,V) -> System.out.println(K + ", Stock : " + V[0]));

			  
			  //System.out.printf("nbr Ligne %d , Nbr Colonne %d",nbr_l,nbr_c);
			  
		  }
		  
	}
	/*
	public static Integer[] getAllOccurrenceo(String word,String caractere) {
		
	}*/

	public static List<Integer> getAllOccurrence(String word,String caractere) {
		List<Integer> listOccurence=new ArrayList<>();
		
		int index = word.indexOf(caractere);
		while (index >= 0) {
			listOccurence.add(index);
		    index = word.indexOf(caractere, index + 1);
		}
		return listOccurence;
	}
}
