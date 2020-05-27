package com.newer.exam.viewmodel.testpaper;

import com.newer.exam.base.BasePage;
import lombok.Data;

@Data
public class TestPaperPageRequestVM extends BasePage {

    private Integer id;
    private Integer level;
    private Integer subjectId;
    private Integer questionType;
}
