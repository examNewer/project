package com.newer.exam.viewmodel.curriculum;

import com.newer.exam.viewmodel.BaseVM;
import lombok.Data;

@Data
public class CurriculumResponseVM extends BaseVM {
    private Integer cid;

    private Integer ceId;

    private Integer tid;

    private String cname;
    
    private Integer isPay;
    
    private Integer signNum;
    
    private String introduceImg;
    
    private Integer status;
}
