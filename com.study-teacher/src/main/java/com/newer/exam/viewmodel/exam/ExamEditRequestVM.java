package com.newer.exam.viewmodel.exam;





import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ExamEditRequestVM {
    private Integer eid;
    @NotNull
    private Integer ceId;
    @NotNull
    private Integer tid;

    private String examCode;
    
    private Integer examTimeHour;
    
    private Integer examTimeMinute;
//    
//    private Integer examTimeSecond;
    @NotNull
    private Integer suggestTime;
    
    private String createTime;

    private List<String> limitDateTime;

	@Override
	public String toString() {
		return "ExamEditRequestVM [eid=" + eid + ", ceId=" + ceId + ", tid=" + tid + ", examCode=" + examCode
				+ ", examTimeHour=" + examTimeHour + ", examTimeMinute=" + examTimeMinute + ", suggestTime="
				+ suggestTime + ", limitDateTime=" + limitDateTime + "]";
	}

    
}
