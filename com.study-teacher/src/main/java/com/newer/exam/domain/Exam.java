package com.newer.exam.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Exam {

	private Integer eid;

    private Integer tid;

    private Integer ceId;
    
    private String examCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date beginTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    
    private Integer examTimeHour;

	private Integer examTimeMinute;

	private Integer examTimeSecond;
	


	public Integer getExamTimeHour() {
		return examTimeHour;
	}

	public void setExamTimeHour(Integer examTimeHour) {
		this.examTimeHour = examTimeHour;
	}

	public Integer getExamTimeMinute() {
		return examTimeMinute;
	}

	public void setExamTimeMinute(Integer examTimeMinute) {
		this.examTimeMinute = examTimeMinute;
	}

	public Integer getExamTimeSecond() {
		return examTimeSecond;
	}

	public void setExamTimeSecond(Integer examTimeSecond) {
		this.examTimeSecond = examTimeSecond;
	}

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getCeId() {
        return ceId;
    }

    public void setCeId(Integer ceId) {
        this.ceId = ceId;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode == null ? null : examCode.trim();
    }

	@Override
	public String toString() {
		return "Exam [eid=" + eid + ", tid=" + tid + ", ceId=" + ceId + ", examCode=" + examCode + ", beginTime="
				+ beginTime + ", endTime=" + endTime + ", createTime=" + createTime + ", examTimeHour=" + examTimeHour
				+ ", examTimeMinute=" + examTimeMinute + ", examTimeSecond=" + examTimeSecond + "]";
	}

	
    
    
}