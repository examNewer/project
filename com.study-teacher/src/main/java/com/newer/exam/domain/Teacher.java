package com.newer.exam.domain;

public class Teacher {
    private Integer tid;

    private String username;

    private String realname;

    private String pwd;

    private String isAuthen;

    private String role;

    private String headimg;

    private String sex;

    private String bgImg3;

    private String bgImg1;

    private String bgImg2;

    private String briefImg;

    private String introduceImg;

    private String brief;

    private String detailIntorduce;

    private Integer status;

    private Integer isEnter;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getIsAuthen() {
        return isAuthen;
    }

    public void setIsAuthen(String isAuthen) {
        this.isAuthen = isAuthen == null ? null : isAuthen.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBgImg3() {
        return bgImg3;
    }

    public void setBgImg3(String bgImg3) {
        this.bgImg3 = bgImg3 == null ? null : bgImg3.trim();
    }

    public String getBgImg1() {
        return bgImg1;
    }

    public void setBgImg1(String bgImg1) {
        this.bgImg1 = bgImg1 == null ? null : bgImg1.trim();
    }

    public String getBgImg2() {
        return bgImg2;
    }

    public void setBgImg2(String bgImg2) {
        this.bgImg2 = bgImg2 == null ? null : bgImg2.trim();
    }

    public String getBriefImg() {
        return briefImg;
    }

    public void setBriefImg(String briefImg) {
        this.briefImg = briefImg == null ? null : briefImg.trim();
    }

    public String getIntroduceImg() {
        return introduceImg;
    }

    public void setIntroduceImg(String introduceImg) {
        this.introduceImg = introduceImg == null ? null : introduceImg.trim();
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getDetailIntorduce() {
        return detailIntorduce;
    }

    public void setDetailIntorduce(String detailIntorduce) {
        this.detailIntorduce = detailIntorduce == null ? null : detailIntorduce.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsEnter() {
        return isEnter;
    }

    public void setIsEnter(Integer isEnter) {
        this.isEnter = isEnter;
    }
}