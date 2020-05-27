package com.newer.exam.viewmodel.exercises;




import lombok.Data;

@Data
public class ExercisesResponseVM {

    private Integer id;

    private String type;

    private String ename;

    private Integer ceId;

    private Integer difficulty;

    private Integer tid;

	@Override
	public String toString() {
		return "ExercisesResponseVM [id=" + id + ", type=" + type + ", ename=" + ename + ", ceId=" + ceId
				+ ", difficulty=" + difficulty + ", tid=" + tid + "]";
	}

    
}
