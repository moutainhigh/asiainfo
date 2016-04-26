package com.bdx.rainbow.ygcf.entity;

import java.sql.Timestamp;

public class LedgerPurchase {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.PURCHASE_ID
     *
     * @mbggenerated
     */
    private Integer purchaseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.LEDGER_ID
     *
     * @mbggenerated
     */
    private Integer ledgerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.PRODUCT_NAME
     *
     * @mbggenerated
     */
    private String productName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.QUANTITY
     *
     * @mbggenerated
     */
    private String quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.VALIDITY
     *
     * @mbggenerated
     */
    private String validity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.STANDARD
     *
     * @mbggenerated
     */
    private String standard;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.PRODUCTOR
     *
     * @mbggenerated
     */
    private String productor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.PRODUCT_NO
     *
     * @mbggenerated
     */
    private String productNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.PROVIDER
     *
     * @mbggenerated
     */
    private String provider;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.FILE_ID
     *
     * @mbggenerated
     */
    private String fileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.IS_DEL
     *
     * @mbggenerated
     */
    private String isDel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.CREATE_DATE
     *
     * @mbggenerated
     */
    private Timestamp createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.CREATE_USERID
     *
     * @mbggenerated
     */
    private Integer createUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.UPDATE_DATE
     *
     * @mbggenerated
     */
    private Timestamp updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_ygcf_ledger_purchase.UPDATE_USERID
     *
     * @mbggenerated
     */
    private Integer updateUserid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.PURCHASE_ID
     *
     * @return the value of t_ygcf_ledger_purchase.PURCHASE_ID
     *
     * @mbggenerated
     */
    public Integer getPurchaseId() {
        return purchaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.PURCHASE_ID
     *
     * @param purchaseId the value for t_ygcf_ledger_purchase.PURCHASE_ID
     *
     * @mbggenerated
     */
    public void setPurchaseId(Integer purchaseId) {
        this.purchaseId = purchaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.LEDGER_ID
     *
     * @return the value of t_ygcf_ledger_purchase.LEDGER_ID
     *
     * @mbggenerated
     */
    public Integer getLedgerId() {
        return ledgerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.LEDGER_ID
     *
     * @param ledgerId the value for t_ygcf_ledger_purchase.LEDGER_ID
     *
     * @mbggenerated
     */
    public void setLedgerId(Integer ledgerId) {
        this.ledgerId = ledgerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.PRODUCT_NAME
     *
     * @return the value of t_ygcf_ledger_purchase.PRODUCT_NAME
     *
     * @mbggenerated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.PRODUCT_NAME
     *
     * @param productName the value for t_ygcf_ledger_purchase.PRODUCT_NAME
     *
     * @mbggenerated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.QUANTITY
     *
     * @return the value of t_ygcf_ledger_purchase.QUANTITY
     *
     * @mbggenerated
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.QUANTITY
     *
     * @param quantity the value for t_ygcf_ledger_purchase.QUANTITY
     *
     * @mbggenerated
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.VALIDITY
     *
     * @return the value of t_ygcf_ledger_purchase.VALIDITY
     *
     * @mbggenerated
     */
    public String getValidity() {
        return validity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.VALIDITY
     *
     * @param validity the value for t_ygcf_ledger_purchase.VALIDITY
     *
     * @mbggenerated
     */
    public void setValidity(String validity) {
        this.validity = validity == null ? null : validity.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.STANDARD
     *
     * @return the value of t_ygcf_ledger_purchase.STANDARD
     *
     * @mbggenerated
     */
    public String getStandard() {
        return standard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.STANDARD
     *
     * @param standard the value for t_ygcf_ledger_purchase.STANDARD
     *
     * @mbggenerated
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.PRODUCTOR
     *
     * @return the value of t_ygcf_ledger_purchase.PRODUCTOR
     *
     * @mbggenerated
     */
    public String getProductor() {
        return productor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.PRODUCTOR
     *
     * @param productor the value for t_ygcf_ledger_purchase.PRODUCTOR
     *
     * @mbggenerated
     */
    public void setProductor(String productor) {
        this.productor = productor == null ? null : productor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.PRODUCT_NO
     *
     * @return the value of t_ygcf_ledger_purchase.PRODUCT_NO
     *
     * @mbggenerated
     */
    public String getProductNo() {
        return productNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.PRODUCT_NO
     *
     * @param productNo the value for t_ygcf_ledger_purchase.PRODUCT_NO
     *
     * @mbggenerated
     */
    public void setProductNo(String productNo) {
        this.productNo = productNo == null ? null : productNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.PROVIDER
     *
     * @return the value of t_ygcf_ledger_purchase.PROVIDER
     *
     * @mbggenerated
     */
    public String getProvider() {
        return provider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.PROVIDER
     *
     * @param provider the value for t_ygcf_ledger_purchase.PROVIDER
     *
     * @mbggenerated
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.FILE_ID
     *
     * @return the value of t_ygcf_ledger_purchase.FILE_ID
     *
     * @mbggenerated
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.FILE_ID
     *
     * @param fileId the value for t_ygcf_ledger_purchase.FILE_ID
     *
     * @mbggenerated
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.IS_DEL
     *
     * @return the value of t_ygcf_ledger_purchase.IS_DEL
     *
     * @mbggenerated
     */
    public String getIsDel() {
        return isDel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.IS_DEL
     *
     * @param isDel the value for t_ygcf_ledger_purchase.IS_DEL
     *
     * @mbggenerated
     */
    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.CREATE_DATE
     *
     * @return the value of t_ygcf_ledger_purchase.CREATE_DATE
     *
     * @mbggenerated
     */
    public Timestamp getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.CREATE_DATE
     *
     * @param createDate the value for t_ygcf_ledger_purchase.CREATE_DATE
     *
     * @mbggenerated
     */
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.CREATE_USERID
     *
     * @return the value of t_ygcf_ledger_purchase.CREATE_USERID
     *
     * @mbggenerated
     */
    public Integer getCreateUserid() {
        return createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.CREATE_USERID
     *
     * @param createUserid the value for t_ygcf_ledger_purchase.CREATE_USERID
     *
     * @mbggenerated
     */
    public void setCreateUserid(Integer createUserid) {
        this.createUserid = createUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.UPDATE_DATE
     *
     * @return the value of t_ygcf_ledger_purchase.UPDATE_DATE
     *
     * @mbggenerated
     */
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.UPDATE_DATE
     *
     * @param updateDate the value for t_ygcf_ledger_purchase.UPDATE_DATE
     *
     * @mbggenerated
     */
    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ygcf_ledger_purchase.UPDATE_USERID
     *
     * @return the value of t_ygcf_ledger_purchase.UPDATE_USERID
     *
     * @mbggenerated
     */
    public Integer getUpdateUserid() {
        return updateUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ygcf_ledger_purchase.UPDATE_USERID
     *
     * @param updateUserid the value for t_ygcf_ledger_purchase.UPDATE_USERID
     *
     * @mbggenerated
     */
    public void setUpdateUserid(Integer updateUserid) {
        this.updateUserid = updateUserid;
    }
}