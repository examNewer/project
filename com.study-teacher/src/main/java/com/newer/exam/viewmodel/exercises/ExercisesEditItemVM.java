package com.newer.exam.viewmodel.exercises;

import lombok.Data;



@Data
public class ExercisesEditItemVM {
	
    private String prefix;
    
    private String content;
    
    public ExercisesEditItemVM(String prefix,String content) {
    	this.prefix=prefix;
    	this.content=content;
    }
    
    public ExercisesEditItemVM() {
		// TODO Auto-generated constructor stub
	}
}
