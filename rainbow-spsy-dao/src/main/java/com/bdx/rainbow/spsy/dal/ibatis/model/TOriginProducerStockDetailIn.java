package com.bdx.rainbow.spsy.dal.ibatis.model;

import java.sql.Timestamp;

public class TOriginProducerStockDetailIn {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.OPERATION_DETAIL_ID
     *
     * @mbggenerated
     */
    private Integer operationDetailId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.SKU_ID
     *
     * @mbggenerated
     */
    private Integer skuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.SKU_NAME
     *
     * @mbggenerated
     */
    private String skuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.SKU_ID_CODE
     *
     * @mbggenerated
     */
    private String skuIdCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.SKU_BAR_CODE
     *
     * @mbggenerated
     */
    private String skuBarCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.SKU_BATCH
     *
     * @mbggenerated
     */
    private String skuBatch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.PRODUCTION_DATE
     *
     * @mbggenerated
     */
    private Timestamp productionDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.PRODUCT_DETECTION_ID
     *
     * @mbggenerated
     */
    private Integer productDetectionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.MATERIAL_INFO
     *
     * @mbggenerated
     */
    private String materialInfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.MANAGE_PERSON
     *
     * @mbggenerated
     */
    private String managePerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.ENTERPRISE_ID
     *
     * @mbggenerated
     */
    private Integer enterpriseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.OPERATION_IN_ID
     *
     * @mbggenerated
     */
    private Integer operationInId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.DETAIL_STATUS
     *
     * @mbggenerated
     */
    private String detailStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.CREATE_STAFF
     *
     * @mbggenerated
     */
    private String createStaff;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.CREATE_TIME
     *
     * @mbggenerated
     */
    private Timestamp createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.UPDAT_STAFF
     *
     * @mbggenerated
     */
    private String updatStaff;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_origin_producer_stock_detail_in.UPDATE_TIME
     *
     * @mbggenerated
     */
    private Timestamp updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.OPERATION_DETAIL_ID
     *
     * @return the value of t_origin_producer_stock_detail_in.OPERATION_DETAIL_ID
     *
     * @mbggenerated
     */
    public Integer getOperationDetailId() {
        return operationDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.OPERATION_DETAIL_ID
     *
     * @param operationDetailId the value for t_origin_producer_stock_detail_in.OPERATION_DETAIL_ID
     *
     * @mbggenerated
     */
    public void setOperationDetailId(Integer operationDetailId) {
        this.operationDetailId = operationDetailId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.SKU_ID
     *
     * @return the value of t_origin_producer_stock_detail_in.SKU_ID
     *
     * @mbggenerated
     */
    public Integer getSkuId() {
        return skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.SKU_ID
     *
     * @param skuId the value for t_origin_producer_stock_detail_in.SKU_ID
     *
     * @mbggenerated
     */
    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.SKU_NAME
     *
     * @return the value of t_origin_producer_stock_detail_in.SKU_NAME
     *
     * @mbggenerated
     */
    public String getSkuName() {
        return skuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.SKU_NAME
     *
     * @param skuName the value for t_origin_producer_stock_detail_in.SKU_NAME
     *
     * @mbggenerated
     */
    public void setSkuName(String skuName) {
        this.skuName = skuName == null ? null : skuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.SKU_ID_CODE
     *
     * @return the value of t_origin_producer_stock_detail_in.SKU_ID_CODE
     *
     * @mbggenerated
     */
    public String getSkuIdCode() {
        return skuIdCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.SKU_ID_CODE
     *
     * @param skuIdCode the value for t_origin_producer_stock_detail_in.SKU_ID_CODE
     *
     * @mbggenerated
     */
    public void setSkuIdCode(String skuIdCode) {
        this.skuIdCode = skuIdCode == null ? null : skuIdCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.SKU_BAR_CODE
     *
     * @return the value of t_origin_producer_stock_detail_in.SKU_BAR_CODE
     *
     * @mbggenerated
     */
    public String getSkuBarCode() {
        return skuBarCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.SKU_BAR_CODE
     *
     * @param skuBarCode the value for t_origin_producer_stock_detail_in.SKU_BAR_CODE
     *
     * @mbggenerated
     */
    public void setSkuBarCode(String skuBarCode) {
        this.skuBarCode = skuBarCode == null ? null : skuBarCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.SKU_BATCH
     *
     * @return the value of t_origin_producer_stock_detail_in.SKU_BATCH
     *
     * @mbggenerated
     */
    public String getSkuBatch() {
        return skuBatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.SKU_BATCH
     *
     * @param skuBatch the value for t_origin_producer_stock_detail_in.SKU_BATCH
     *
     * @mbggenerated
     */
    public void setSkuBatch(String skuBatch) {
        this.skuBatch = skuBatch == null ? null : skuBatch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.PRODUCTION_DATE
     *
     * @return the value of t_origin_producer_stock_detail_in.PRODUCTION_DATE
     *
     * @mbggenerated
     */
    public Timestamp getProductionDate() {
        return productionDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.PRODUCTION_DATE
     *
     * @param productionDate the value for t_origin_producer_stock_detail_in.PRODUCTION_DATE
     *
     * @mbggenerated
     */
    public void setProductionDate(Timestamp productionDate) {
        this.productionDate = productionDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.PRODUCT_DETECTION_ID
     *
     * @return the value of t_origin_producer_stock_detail_in.PRODUCT_DETECTION_ID
     *
     * @mbggenerated
     */
    public Integer getProductDetectionId() {
        return productDetectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.PRODUCT_DETECTION_ID
     *
     * @param productDetectionId the value for t_origin_producer_stock_detail_in.PRODUCT_DETECTION_ID
     *
     * @mbggenerated
     */
    public void setProductDetectionId(Integer productDetectionId) {
        this.productDetectionId = productDetectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.MATERIAL_INFO
     *
     * @return the value of t_origin_producer_stock_detail_in.MATERIAL_INFO
     *
     * @mbggenerated
     */
    public String getMaterialInfo() {
        return materialInfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.MATERIAL_INFO
     *
     * @param materialInfo the value for t_origin_producer_stock_detail_in.MATERIAL_INFO
     *
     * @mbggenerated
     */
    public void setMaterialInfo(String materialInfo) {
        this.materialInfo = materialInfo == null ? null : materialInfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.MANAGE_PERSON
     *
     * @return the value of t_origin_producer_stock_detail_in.MANAGE_PERSON
     *
     * @mbggenerated
     */
    public String getManagePerson() {
        return managePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.MANAGE_PERSON
     *
     * @param managePerson the value for t_origin_producer_stock_detail_in.MANAGE_PERSON
     *
     * @mbggenerated
     */
    public void setManagePerson(String managePerson) {
        this.managePerson = managePerson == null ? null : managePerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.ENTERPRISE_ID
     *
     * @return the value of t_origin_producer_stock_detail_in.ENTERPRISE_ID
     *
     * @mbggenerated
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.ENTERPRISE_ID
     *
     * @param enterpriseId the value for t_origin_producer_stock_detail_in.ENTERPRISE_ID
     *
     * @mbggenerated
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.OPERATION_IN_ID
     *
     * @return the value of t_origin_producer_stock_detail_in.OPERATION_IN_ID
     *
     * @mbggenerated
     */
    public Integer getOperationInId() {
        return operationInId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.OPERATION_IN_ID
     *
     * @param operationInId the value for t_origin_producer_stock_detail_in.OPERATION_IN_ID
     *
     * @mbggenerated
     */
    public void setOperationInId(Integer operationInId) {
        this.operationInId = operationInId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.DETAIL_STATUS
     *
     * @return the value of t_origin_producer_stock_detail_in.DETAIL_STATUS
     *
     * @mbggenerated
     */
    public String getDetailStatus() {
        return detailStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.DETAIL_STATUS
     *
     * @param detailStatus the value for t_origin_producer_stock_detail_in.DETAIL_STATUS
     *
     * @mbggenerated
     */
    public void setDetailStatus(String detailStatus) {
        this.detailStatus = detailStatus == null ? null : detailStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.CREATE_STAFF
     *
     * @return the value of t_origin_producer_stock_detail_in.CREATE_STAFF
     *
     * @mbggenerated
     */
    public String getCreateStaff() {
        return createStaff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.CREATE_STAFF
     *
     * @param createStaff the value for t_origin_producer_stock_detail_in.CREATE_STAFF
     *
     * @mbggenerated
     */
    public void setCreateStaff(String createStaff) {
        this.createStaff = createStaff == null ? null : createStaff.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.CREATE_TIME
     *
     * @return the value of t_origin_producer_stock_detail_in.CREATE_TIME
     *
     * @mbggenerated
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.CREATE_TIME
     *
     * @param createTime the value for t_origin_producer_stock_detail_in.CREATE_TIME
     *
     * @mbggenerated
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.UPDAT_STAFF
     *
     * @return the value of t_origin_producer_stock_detail_in.UPDAT_STAFF
     *
     * @mbggenerated
     */
    public String getUpdatStaff() {
        return updatStaff;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.UPDAT_STAFF
     *
     * @param updatStaff the value for t_origin_producer_stock_detail_in.UPDAT_STAFF
     *
     * @mbggenerated
     */
    public void setUpdatStaff(String updatStaff) {
        this.updatStaff = updatStaff == null ? null : updatStaff.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_origin_producer_stock_detail_in.UPDATE_TIME
     *
     * @return the value of t_origin_producer_stock_detail_in.UPDATE_TIME
     *
     * @mbggenerated
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_origin_producer_stock_detail_in.UPDATE_TIME
     *
     * @param updateTime the value for t_origin_producer_stock_detail_in.UPDATE_TIME
     *
     * @mbggenerated
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}