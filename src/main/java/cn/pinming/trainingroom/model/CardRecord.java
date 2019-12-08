package cn.pinming.trainingroom.model;

import java.util.Date;

public class CardRecord {
    private String recordId;

    private Integer sourceId;

    private Byte sourceType;

    private Byte cardType;

    private String idCard;

    private Integer deviceId;

    private String timecard;

    private Date recordTime;

    private Byte type;

    private Byte identifyType;

    private Byte isEffective;

    private Date gmtCreate;

    private String thirdSourceId;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Byte getSourceType() {
        return sourceType;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    public Byte getCardType() {
        return cardType;
    }

    public void setCardType(Byte cardType) {
        this.cardType = cardType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getTimecard() {
        return timecard;
    }

    public void setTimecard(String timecard) {
        this.timecard = timecard == null ? null : timecard.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(Byte identifyType) {
        this.identifyType = identifyType;
    }

    public Byte getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Byte isEffective) {
        this.isEffective = isEffective;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getThirdSourceId() {
        return thirdSourceId;
    }

    public void setThirdSourceId(String thirdSourceId) {
        this.thirdSourceId = thirdSourceId == null ? null : thirdSourceId.trim();
    }
}