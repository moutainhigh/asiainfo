package com.bdx.rainbow.spsy.dal.ibatis.model;

import java.sql.Timestamp;

public class TOriginAgencyCompany {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.AGENCY_ID
     *
     * @mbggenerated
     */
    private Integer agencyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.AGENCY_NAME
     *
     * @mbggenerated
     */
    private String agencyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.AGENCY_RESPONSIBLE_PERSON
     *
     * @mbggenerated
     */
    private String agencyResponsiblePerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.LINK_PHONE
     *
     * @mbggenerated
     */
    private String linkPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.AGENCY_SALE_MAIN
     *
     * @mbggenerated
     */
    private String agencySaleMain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.AGENCY_ADDRESS
     *
     * @mbggenerated
     */
    private String agencyAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.LBS
     *
     * @mbggenerated
     */
    private String lbs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.REPERTORY_ADDRESS
     *
     * @mbggenerated
     */
    private String repertoryAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.REPERTORY_ADDRESS_LBS
     *
     * @mbggenerated
     */
    private String repertoryAddressLbs;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.AGENCY_TYPE
     *
     * @mbggenerated
     */
    private String agencyType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.FOOD_DISTRIBUTION_LICENSE
     *
     * @mbggenerated
     */
    private String foodDistributionLicense;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.PROVINCE_CODE
     *
     * @mbggenerated
     */
    private String provinceCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.AREA_CODE
     *
     * @mbggenerated
     */
    private String areaCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.CITY_CODE
     *
     * @mbggenerated
     */
    private String cityCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.ENTERPRISE_ID
     *
     * @mbggenerated
     */
    private Integer enterpriseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.CREATE_ENTERPRISE_ID
     *
     * @mbggenerated
     */
    private Integer createEnterpriseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.CREATE_STAFF
     *
     * @mbggenerated
     */
    private String createStaff;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.CREATE_TIME
     *
     * @mbggenerated
     */
    private Timestamp createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.UPDATE_STAFF
     *
     * @mbggenerated
     */
    private String updateStaff;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_agency_company.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Timestamp updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.AGENCY_ID
     *
     * @return the value of t_origin_agency_company.AGENCY_ID
     *
     * @mbggenerated
     */
    public Integer getAgencyId() {
        return agencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.AGENCY_ID
     *
     * @param agencyId the value for t_origin_agency_company.AGENCY_ID
     *
     * @mbggenerated
     */
    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.AGENCY_NAME
     *
     * @return the value of t_origin_agency_company.AGENCY_NAME
     *
     * @mbggenerated
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.AGENCY_NAME
     *
     * @param agencyName the value for t_origin_agency_company.AGENCY_NAME
     *
     * @mbggenerated
     */
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName == null ? null : agencyName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.AGENCY_RESPONSIBLE_PERSON
     *
     * @return the value of t_origin_agency_company.AGENCY_RESPONSIBLE_PERSON
     *
     * @mbggenerated
     */
    public String getAgencyResponsiblePerson() {
        return agencyResponsiblePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.AGENCY_RESPONSIBLE_PERSON
     *
     * @param agencyResponsiblePerson the value for t_origin_agency_company.AGENCY_RESPONSIBLE_PERSON
     *
     * @mbggenerated
     */
    public void setAgencyResponsiblePerson(String agencyResponsiblePerson) {
        this.agencyResponsiblePerson = agencyResponsiblePerson == null ? null : agencyResponsiblePerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.LINK_PHONE
     *
     * @return the value of t_origin_agency_company.LINK_PHONE
     *
     * @mbggenerated
     */
    public String getLinkPhone() {
        return linkPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.LINK_PHONE
     *
     * @param linkPhone the value for t_origin_agency_company.LINK_PHONE
     *
     * @mbggenerated
     */
    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.AGENCY_SALE_MAIN
     *
     * @return the value of t_origin_agency_company.AGENCY_SALE_MAIN
     *
     * @mbggenerated
     */
    public String getAgencySaleMain() {
        return agencySaleMain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.AGENCY_SALE_MAIN
     *
     * @param agencySaleMain the value for t_origin_agency_company.AGENCY_SALE_MAIN
     *
     * @mbggenerated
     */
    public void setAgencySaleMain(String agencySaleMain) {
        this.agencySaleMain = agencySaleMain == null ? null : agencySaleMain.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.AGENCY_ADDRESS
     *
     * @return the value of t_origin_agency_company.AGENCY_ADDRESS
     *
     * @mbggenerated
     */
    public String getAgencyAddress() {
        return agencyAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.AGENCY_ADDRESS
     *
     * @param agencyAddress the value for t_origin_agency_company.AGENCY_ADDRESS
     *
     * @mbggenerated
     */
    public void setAgencyAddress(String agencyAddress) {
        this.agencyAddress = agencyAddress == null ? null : agencyAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.LBS
     *
     * @return the value of t_origin_agency_company.LBS
     *
     * @mbggenerated
     */
    public String getLbs() {
        return lbs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.LBS
     *
     * @param lbs the value for t_origin_agency_company.LBS
     *
     * @mbggenerated
     */
    public void setLbs(String lbs) {
        this.lbs = lbs == null ? null : lbs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.REPERTORY_ADDRESS
     *
     * @return the value of t_origin_agency_company.REPERTORY_ADDRESS
     *
     * @mbggenerated
     */
    public String getRepertoryAddress() {
        return repertoryAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.REPERTORY_ADDRESS
     *
     * @param repertoryAddress the value for t_origin_agency_company.REPERTORY_ADDRESS
     *
     * @mbggenerated
     */
    public void setRepertoryAddress(String repertoryAddress) {
        this.repertoryAddress = repertoryAddress == null ? null : repertoryAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.REPERTORY_ADDRESS_LBS
     *
     * @return the value of t_origin_agency_company.REPERTORY_ADDRESS_LBS
     *
     * @mbggenerated
     */
    public String getRepertoryAddressLbs() {
        return repertoryAddressLbs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.REPERTORY_ADDRESS_LBS
     *
     * @param repertoryAddressLbs the value for t_origin_agency_company.REPERTORY_ADDRESS_LBS
     *
     * @mbggenerated
     */
    public void setRepertoryAddressLbs(String repertoryAddressLbs) {
        this.repertoryAddressLbs = repertoryAddressLbs == null ? null : repertoryAddressLbs.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.AGENCY_TYPE
     *
     * @return the value of t_origin_agency_company.AGENCY_TYPE
     *
     * @mbggenerated
     */
    public String getAgencyType() {
        return agencyType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.AGENCY_TYPE
     *
     * @param agencyType the value for t_origin_agency_company.AGENCY_TYPE
     *
     * @mbggenerated
     */
    public void setAgencyType(String agencyType) {
        this.agencyType = agencyType == null ? null : agencyType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.FOOD_DISTRIBUTION_LICENSE
     *
     * @return the value of t_origin_agency_company.FOOD_DISTRIBUTION_LICENSE
     *
     * @mbggenerated
     */
    public String getFoodDistributionLicense() {
        return foodDistributionLicense;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.FOOD_DISTRIBUTION_LICENSE
     *
     * @param foodDistributionLicense the value for t_origin_agency_company.FOOD_DISTRIBUTION_LICENSE
     *
     * @mbggenerated
     */
    public void setFoodDistributionLicense(String foodDistributionLicense) {
        this.foodDistributionLicense = foodDistributionLicense == null ? null : foodDistributionLicense.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.PROVINCE_CODE
     *
     * @return the value of t_origin_agency_company.PROVINCE_CODE
     *
     * @mbggenerated
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.PROVINCE_CODE
     *
     * @param provinceCode the value for t_origin_agency_company.PROVINCE_CODE
     *
     * @mbggenerated
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.AREA_CODE
     *
     * @return the value of t_origin_agency_company.AREA_CODE
     *
     * @mbggenerated
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.AREA_CODE
     *
     * @param areaCode the value for t_origin_agency_company.AREA_CODE
     *
     * @mbggenerated
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.CITY_CODE
     *
     * @return the value of t_origin_agency_company.CITY_CODE
     *
     * @mbggenerated
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.CITY_CODE
     *
     * @param cityCode the value for t_origin_agency_company.CITY_CODE
     *
     * @mbggenerated
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.ENTERPRISE_ID
     *
     * @return the value of t_origin_agency_company.ENTERPRISE_ID
     *
     * @mbggenerated
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.ENTERPRISE_ID
     *
     * @param enterpriseId the value for t_origin_agency_company.ENTERPRISE_ID
     *
     * @mbggenerated
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.CREATE_ENTERPRISE_ID
     *
     * @return the value of t_origin_agency_company.CREATE_ENTERPRISE_ID
     *
     * @mbggenerated
     */
    public Integer getCreateEnterpriseId() {
        return createEnterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.CREATE_ENTERPRISE_ID
     *
     * @param createEnterpriseId the value for t_origin_agency_company.CREATE_ENTERPRISE_ID
     *
     * @mbggenerated
     */
    public void setCreateEnterpriseId(Integer createEnterpriseId) {
        this.createEnterpriseId = createEnterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.CREATE_STAFF
     *
     * @return the value of t_origin_agency_company.CREATE_STAFF
     *
     * @mbggenerated
     */
    public String getCreateStaff() {
        return createStaff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.CREATE_STAFF
     *
     * @param createStaff the value for t_origin_agency_company.CREATE_STAFF
     *
     * @mbggenerated
     */
    public void setCreateStaff(String createStaff) {
        this.createStaff = createStaff == null ? null : createStaff.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.CREATE_TIME
     *
     * @return the value of t_origin_agency_company.CREATE_TIME
     *
     * @mbggenerated
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.CREATE_TIME
     *
     * @param createTime the value for t_origin_agency_company.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.UPDATE_STAFF
     *
     * @return the value of t_origin_agency_company.UPDATE_STAFF
     *
     * @mbggenerated
     */
    public String getUpdateStaff() {
        return updateStaff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.UPDATE_STAFF
     *
     * @param updateStaff the value for t_origin_agency_company.UPDATE_STAFF
     *
     * @mbggenerated
     */
    public void setUpdateStaff(String updateStaff) {
        this.updateStaff = updateStaff == null ? null : updateStaff.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_agency_company.UPDATE_TIME
     *
     * @return the value of t_origin_agency_company.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_agency_company.UPDATE_TIME
     *
     * @param updateTime the value for t_origin_agency_company.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}