package cn.pinming.trainingroom.model;

import java.util.Date;

public class TrainingRecordDay {
    private Integer id;

    private String companyId;

    private String projectId;

    private Integer comeInNum;

    private Integer comeOutNum;

    private String averageTime;

    private Date statisticalTime;

    private Date gmtCreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Integer getComeInNum() {
        return comeInNum;
    }

    public void setComeInNum(Integer comeInNum) {
        this.comeInNum = comeInNum;
    }

    public Integer getComeOutNum() {
        return comeOutNum;
    }

    public void setComeOutNum(Integer comeOutNum) {
        this.comeOutNum = comeOutNum;
    }

    public String getAverageTime() {
        return averageTime;
    }

    public void setAverageTime(String averageTime) {
        this.averageTime = averageTime == null ? null : averageTime.trim();
    }

    public Date getStatisticalTime() {
        return statisticalTime;
    }

    public void setStatisticalTime(Date statisticalTime) {
        this.statisticalTime = statisticalTime;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}