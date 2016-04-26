package com.bdx.rainbow.ygcf.entity;

import java.sql.Timestamp;

public class DeviceReport {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.REPORT_ID
     *
     * @mbggenerated
     */
    private Integer reportId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.ENTERPRISE_ID
     *
     * @mbggenerated
     */
    private Integer enterpriseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.DEVICE_KEY
     *
     * @mbggenerated
     */
    private String deviceKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.DEVICE_NUM
     *
     * @mbggenerated
     */
    private String deviceNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.STATUS
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.DEAL_DESC
     *
     * @mbggenerated
     */
    private String dealDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.CHANGE_DESC
     *
     * @mbggenerated
     */
    private String changeDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.IS_DEL
     *
     * @mbggenerated
     */
    private String isDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.CREATE_DATE
     *
     * @mbggenerated
     */
    private Timestamp createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.CREATE_USERID
     *
     * @mbggenerated
     */
    private Integer createUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.UPDATE_DATE
     *
     * @mbggenerated
     */
    private Timestamp updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_device_report.UPDATE_USERID
     *
     * @mbggenerated
     */
    private Integer updateUserid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.REPORT_ID
     *
     * @return the value of t_ygcf_device_report.REPORT_ID
     *
     * @mbggenerated
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.REPORT_ID
     *
     * @param reportId the value for t_ygcf_device_report.REPORT_ID
     *
     * @mbggenerated
     */
    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.ENTERPRISE_ID
     *
     * @return the value of t_ygcf_device_report.ENTERPRISE_ID
     *
     * @mbggenerated
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.ENTERPRISE_ID
     *
     * @param enterpriseId the value for t_ygcf_device_report.ENTERPRISE_ID
     *
     * @mbggenerated
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.DEVICE_KEY
     *
     * @return the value of t_ygcf_device_report.DEVICE_KEY
     *
     * @mbggenerated
     */
    public String getDeviceKey() {
        return deviceKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.DEVICE_KEY
     *
     * @param deviceKey the value for t_ygcf_device_report.DEVICE_KEY
     *
     * @mbggenerated
     */
    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey == null ? null : deviceKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.DEVICE_NUM
     *
     * @return the value of t_ygcf_device_report.DEVICE_NUM
     *
     * @mbggenerated
     */
    public String getDeviceNum() {
        return deviceNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.DEVICE_NUM
     *
     * @param deviceNum the value for t_ygcf_device_report.DEVICE_NUM
     *
     * @mbggenerated
     */
    public void setDeviceNum(String deviceNum) {
        this.deviceNum = deviceNum == null ? null : deviceNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.STATUS
     *
     * @return the value of t_ygcf_device_report.STATUS
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.STATUS
     *
     * @param status the value for t_ygcf_device_report.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.DEAL_DESC
     *
     * @return the value of t_ygcf_device_report.DEAL_DESC
     *
     * @mbggenerated
     */
    public String getDealDesc() {
        return dealDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.DEAL_DESC
     *
     * @param dealDesc the value for t_ygcf_device_report.DEAL_DESC
     *
     * @mbggenerated
     */
    public void setDealDesc(String dealDesc) {
        this.dealDesc = dealDesc == null ? null : dealDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.CHANGE_DESC
     *
     * @return the value of t_ygcf_device_report.CHANGE_DESC
     *
     * @mbggenerated
     */
    public String getChangeDesc() {
        return changeDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.CHANGE_DESC
     *
     * @param changeDesc the value for t_ygcf_device_report.CHANGE_DESC
     *
     * @mbggenerated
     */
    public void setChangeDesc(String changeDesc) {
        this.changeDesc = changeDesc == null ? null : changeDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.IS_DEL
     *
     * @return the value of t_ygcf_device_report.IS_DEL
     *
     * @mbggenerated
     */
    public String getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.IS_DEL
     *
     * @param isDel the value for t_ygcf_device_report.IS_DEL
     *
     * @mbggenerated
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.CREATE_DATE
     *
     * @return the value of t_ygcf_device_report.CREATE_DATE
     *
     * @mbggenerated
     */
    public Timestamp getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.CREATE_DATE
     *
     * @param createDate the value for t_ygcf_device_report.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.CREATE_USERID
     *
     * @return the value of t_ygcf_device_report.CREATE_USERID
     *
     * @mbggenerated
     */
    public Integer getCreateUserid() {
        return createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.CREATE_USERID
     *
     * @param createUserid the value for t_ygcf_device_report.CREATE_USERID
     *
     * @mbggenerated
     */
    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.UPDATE_DATE
     *
     * @return the value of t_ygcf_device_report.UPDATE_DATE
     *
     * @mbggenerated
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.UPDATE_DATE
     *
     * @param updateDate the value for t_ygcf_device_report.UPDATE_DATE
     *
     * @mbggenerated
     */
    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_device_report.UPDATE_USERID
     *
     * @return the value of t_ygcf_device_report.UPDATE_USERID
     *
     * @mbggenerated
     */
    public Integer getUpdateUserid() {
        return updateUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_device_report.UPDATE_USERID
     *
     * @param updateUserid the value for t_ygcf_device_report.UPDATE_USERID
     *
     * @mbggenerated
     */
    public void setUpdateUserid(Integer updateUserid) {
        this.updateUserid = updateUserid;
    }
}