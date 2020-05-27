package com.newer.exam.viewmodel.exercises;

import com.newer.exam.base.BasePage;
import lombok.Data;

@Data
public class ExercisesPageRequestVM extends BasePage {

    private Integer id;
    private Integer level;
    private Integer subjectId;
    private Integer questionType;
}
