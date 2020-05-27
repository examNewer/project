package com.newer.exam.viewmodel.curriculum;

import com.newer.exam.base.BasePage;
import lombok.Data;

@Data
public class CurriculumPageRequestVM extends BasePage {
    private Integer cid;
    private Integer ceId;
    private Integer tid;
}
