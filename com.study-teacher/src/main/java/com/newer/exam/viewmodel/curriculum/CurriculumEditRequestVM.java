package com.newer.exam.viewmodel.curriculum;

import java.util.List;

import com.newer.exam.domain.Section;
import com.newer.exam.viewmodel.BaseVM;

import lombok.Data;

@Data
public class CurriculumEditRequestVM extends BaseVM {
	private Integer cid;
	
	private Integer ceId;
	
	private Integer tid;
	
	private Integer signNum = 0 ;
	
	private String cname;
	
	private String introduceImg;
	
	private List<Section> sectionItems;

}
