package com.newer.exam.viewmodel.exercises;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Data
public class ExercisesEditRequestVM {

    private Integer id;
    
    private Integer ceId;
    
    private Integer tid;

    private String ename;
    
    private String answer;

    private String comment;
    
    private List<String> answerArray;
    
    private String type;
    
    @Valid
    private List<ExercisesEditItemVM> items;
    
    private Integer score;

    @Range(min = 1, max = 5, message = "请选择题目难度")
    private Integer difficulty;

    
    public ExercisesEditRequestVM() {
    	
    }
}
