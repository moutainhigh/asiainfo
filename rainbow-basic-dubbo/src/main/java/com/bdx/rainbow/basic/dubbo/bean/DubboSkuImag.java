package com.bdx.rainbow.basic.dubbo.bean;

import java.sql.Timestamp;

public class DubboSkuImag {
	
	private Integer skuId;

    private String vfsId;
    
    private String fileDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_sku_imag.FILE_TYPE
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    private String fileType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_sku_imag.FILE_INDEX
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    private Integer fileIndex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_sku_imag.FILE_URL
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    private String fileUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_sku_imag.CREATE_TIME
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    private Timestamp createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_basic_sku_imag.CREATER
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    private String creater;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_sku_imag.FILE_DESC
     *
     * @return the value of t_basic_sku_imag.FILE_DESC
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public String getFileDesc() {
        return fileDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_sku_imag.FILE_DESC
     *
     * @param fileDesc the value for t_basic_sku_imag.FILE_DESC
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public void setFileDesc(String fileDesc) {
        this.fileDesc = fileDesc == null ? null : fileDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_sku_imag.FILE_TYPE
     *
     * @return the value of t_basic_sku_imag.FILE_TYPE
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_sku_imag.FILE_TYPE
     *
     * @param fileType the value for t_basic_sku_imag.FILE_TYPE
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_sku_imag.FILE_INDEX
     *
     * @return the value of t_basic_sku_imag.FILE_INDEX
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public Integer getFileIndex() {
        return fileIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_sku_imag.FILE_INDEX
     *
     * @param fileIndex the value for t_basic_sku_imag.FILE_INDEX
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public void setFileIndex(Integer fileIndex) {
        this.fileIndex = fileIndex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_sku_imag.FILE_URL
     *
     * @return the value of t_basic_sku_imag.FILE_URL
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_sku_imag.FILE_URL
     *
     * @param fileUrl the value for t_basic_sku_imag.FILE_URL
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_sku_imag.CREATE_TIME
     *
     * @return the value of t_basic_sku_imag.CREATE_TIME
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_sku_imag.CREATE_TIME
     *
     * @param createTime the value for t_basic_sku_imag.CREATE_TIME
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_basic_sku_imag.CREATER
     *
     * @return the value of t_basic_sku_imag.CREATER
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public String getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_basic_sku_imag.CREATER
     *
     * @param creater the value for t_basic_sku_imag.CREATER
     *
     * @mbggenerated Wed Jan 27 11:51:34 CST 2016
     */
    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

	public Integer getSkuId() {
		return skuId;
	}

	public void setSkuId(Integer skuId) {
		this.skuId = skuId;
	}

	public String getVfsId() {
		return vfsId;
	}

	public void setVfsId(String vfsId) {
		this.vfsId = vfsId;
	}
    
    
}