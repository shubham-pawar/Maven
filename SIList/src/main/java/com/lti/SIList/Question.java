package com.lti.SIList;

import java.util.Iterator;  
import java.util.List;  
  
public class Question {  
private int id;  
private String name;  
private List<String> answers;  
  
//setters and getters  
  
public void displayInfo(){  
    System.out.println(id+" "+name);  
    System.out.println("answers are:");  
    Iterator<String> itr=answers.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}  
  
}  

