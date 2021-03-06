package com.bdx.rainbow.basic.dubbo.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class DubboLicense implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.LICENSE_ID
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private Integer licenseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.ENTERPRISE_ID
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private Integer enterpriseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.LICENSE_CODE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String licenseCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.LICENSE_TYPE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String licenseType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.LICENSE_NAME
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String licenseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.REGISTER_ADDRESS
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String registerAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.LICENSE_ADDRESS
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String licenseAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.LICENSE_SCOPE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String licenseScope;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.VALID_DATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private Timestamp validDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.INVALID_DATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private Timestamp invalidDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.LICENSE_AUTHORITY
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String licenseAuthority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.LICENSE_TIME
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private Timestamp licenseTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.VALID_PERIOD
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String validPeriod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.APPROVE_EXTEND_DATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private Timestamp approveExtendDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.EXTEND_EXPIREDATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private Timestamp extendExpiredate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.VERSION_FROM
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String versionFrom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.STATUS
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.EXT_ADDRESS_VALUE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String extAddressValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.EXT_ADDRESS_KEY
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String extAddressKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.REMARK
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.CLASSIFICATION_CODE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String classificationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.CREATE_TIME
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private Timestamp createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_license.CREATER
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    private String creater;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.LICENSE_ID
     *
     * @return the value of t_basic_license.LICENSE_ID
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public Integer getLicenseId() {
        return licenseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.LICENSE_ID
     *
     * @param licenseId the value for t_basic_license.LICENSE_ID
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setLicenseId(Integer licenseId) {
        this.licenseId = licenseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.ENTERPRISE_ID
     *
     * @return the value of t_basic_license.ENTERPRISE_ID
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.ENTERPRISE_ID
     *
     * @param enterpriseId the value for t_basic_license.ENTERPRISE_ID
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.LICENSE_CODE
     *
     * @return the value of t_basic_license.LICENSE_CODE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getLicenseCode() {
        return licenseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.LICENSE_CODE
     *
     * @param licenseCode the value for t_basic_license.LICENSE_CODE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode == null ? null : licenseCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.LICENSE_TYPE
     *
     * @return the value of t_basic_license.LICENSE_TYPE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getLicenseType() {
        return licenseType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.LICENSE_TYPE
     *
     * @param licenseType the value for t_basic_license.LICENSE_TYPE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType == null ? null : licenseType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.LICENSE_NAME
     *
     * @return the value of t_basic_license.LICENSE_NAME
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getLicenseName() {
        return licenseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.LICENSE_NAME
     *
     * @param licenseName the value for t_basic_license.LICENSE_NAME
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName == null ? null : licenseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.REGISTER_ADDRESS
     *
     * @return the value of t_basic_license.REGISTER_ADDRESS
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getRegisterAddress() {
        return registerAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.REGISTER_ADDRESS
     *
     * @param registerAddress the value for t_basic_license.REGISTER_ADDRESS
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress == null ? null : registerAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.LICENSE_ADDRESS
     *
     * @return the value of t_basic_license.LICENSE_ADDRESS
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getLicenseAddress() {
        return licenseAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.LICENSE_ADDRESS
     *
     * @param licenseAddress the value for t_basic_license.LICENSE_ADDRESS
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setLicenseAddress(String licenseAddress) {
        this.licenseAddress = licenseAddress == null ? null : licenseAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.LICENSE_SCOPE
     *
     * @return the value of t_basic_license.LICENSE_SCOPE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getLicenseScope() {
        return licenseScope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.LICENSE_SCOPE
     *
     * @param licenseScope the value for t_basic_license.LICENSE_SCOPE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setLicenseScope(String licenseScope) {
        this.licenseScope = licenseScope == null ? null : licenseScope.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.VALID_DATE
     *
     * @return the value of t_basic_license.VALID_DATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public Timestamp getValidDate() {
        return validDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.VALID_DATE
     *
     * @param validDate the value for t_basic_license.VALID_DATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setValidDate(Timestamp validDate) {
        this.validDate = validDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.INVALID_DATE
     *
     * @return the value of t_basic_license.INVALID_DATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public Timestamp getInvalidDate() {
        return invalidDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.INVALID_DATE
     *
     * @param invalidDate the value for t_basic_license.INVALID_DATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setInvalidDate(Timestamp invalidDate) {
        this.invalidDate = invalidDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.LICENSE_AUTHORITY
     *
     * @return the value of t_basic_license.LICENSE_AUTHORITY
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getLicenseAuthority() {
        return licenseAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.LICENSE_AUTHORITY
     *
     * @param licenseAuthority the value for t_basic_license.LICENSE_AUTHORITY
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setLicenseAuthority(String licenseAuthority) {
        this.licenseAuthority = licenseAuthority == null ? null : licenseAuthority.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.LICENSE_TIME
     *
     * @return the value of t_basic_license.LICENSE_TIME
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public Timestamp getLicenseTime() {
        return licenseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.LICENSE_TIME
     *
     * @param licenseTime the value for t_basic_license.LICENSE_TIME
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setLicenseTime(Timestamp licenseTime) {
        this.licenseTime = licenseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.VALID_PERIOD
     *
     * @return the value of t_basic_license.VALID_PERIOD
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getValidPeriod() {
        return validPeriod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.VALID_PERIOD
     *
     * @param validPeriod the value for t_basic_license.VALID_PERIOD
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod == null ? null : validPeriod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.APPROVE_EXTEND_DATE
     *
     * @return the value of t_basic_license.APPROVE_EXTEND_DATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public Timestamp getApproveExtendDate() {
        return approveExtendDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.APPROVE_EXTEND_DATE
     *
     * @param approveExtendDate the value for t_basic_license.APPROVE_EXTEND_DATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setApproveExtendDate(Timestamp approveExtendDate) {
        this.approveExtendDate = approveExtendDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.EXTEND_EXPIREDATE
     *
     * @return the value of t_basic_license.EXTEND_EXPIREDATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public Timestamp getExtendExpiredate() {
        return extendExpiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.EXTEND_EXPIREDATE
     *
     * @param extendExpiredate the value for t_basic_license.EXTEND_EXPIREDATE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setExtendExpiredate(Timestamp extendExpiredate) {
        this.extendExpiredate = extendExpiredate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.VERSION_FROM
     *
     * @return the value of t_basic_license.VERSION_FROM
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getVersionFrom() {
        return versionFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.VERSION_FROM
     *
     * @param versionFrom the value for t_basic_license.VERSION_FROM
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setVersionFrom(String versionFrom) {
        this.versionFrom = versionFrom == null ? null : versionFrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.STATUS
     *
     * @return the value of t_basic_license.STATUS
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.STATUS
     *
     * @param status the value for t_basic_license.STATUS
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.EXT_ADDRESS_VALUE
     *
     * @return the value of t_basic_license.EXT_ADDRESS_VALUE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getExtAddressValue() {
        return extAddressValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.EXT_ADDRESS_VALUE
     *
     * @param extAddressValue the value for t_basic_license.EXT_ADDRESS_VALUE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setExtAddressValue(String extAddressValue) {
        this.extAddressValue = extAddressValue == null ? null : extAddressValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.EXT_ADDRESS_KEY
     *
     * @return the value of t_basic_license.EXT_ADDRESS_KEY
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getExtAddressKey() {
        return extAddressKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.EXT_ADDRESS_KEY
     *
     * @param extAddressKey the value for t_basic_license.EXT_ADDRESS_KEY
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setExtAddressKey(String extAddressKey) {
        this.extAddressKey = extAddressKey == null ? null : extAddressKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.REMARK
     *
     * @return the value of t_basic_license.REMARK
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.REMARK
     *
     * @param remark the value for t_basic_license.REMARK
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.CLASSIFICATION_CODE
     *
     * @return the value of t_basic_license.CLASSIFICATION_CODE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getClassificationCode() {
        return classificationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.CLASSIFICATION_CODE
     *
     * @param classificationCode the value for t_basic_license.CLASSIFICATION_CODE
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode == null ? null : classificationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.CREATE_TIME
     *
     * @return the value of t_basic_license.CREATE_TIME
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.CREATE_TIME
     *
     * @param createTime the value for t_basic_license.CREATE_TIME
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_license.CREATER
     *
     * @return the value of t_basic_license.CREATER
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_license.CREATER
     *
     * @param creater the value for t_basic_license.CREATER
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }
}