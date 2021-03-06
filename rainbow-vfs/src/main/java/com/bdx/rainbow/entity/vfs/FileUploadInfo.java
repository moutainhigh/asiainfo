package com.bdx.rainbow.entity.vfs;

import java.sql.Timestamp;

public class FileUploadInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_upload_info.FILE_ID
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    private String fileId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_upload_info.FILE_NAME
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    private String fileName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_upload_info.FILE_SERVER
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    private String fileServer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_upload_info.FILE_PATH
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    private String filePath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_upload_info.FILE_EXT
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    private String fileExt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_upload_info.FILE_SIZE
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    private Long fileSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_upload_info.CREATE_TIME
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    private Timestamp createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_upload_info.USER_ID
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_upload_info.FILE_ID
     *
     * @return the value of file_upload_info.FILE_ID
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_upload_info.FILE_ID
     *
     * @param fileId the value for file_upload_info.FILE_ID
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_upload_info.FILE_NAME
     *
     * @return the value of file_upload_info.FILE_NAME
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_upload_info.FILE_NAME
     *
     * @param fileName the value for file_upload_info.FILE_NAME
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_upload_info.FILE_SERVER
     *
     * @return the value of file_upload_info.FILE_SERVER
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public String getFileServer() {
        return fileServer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_upload_info.FILE_SERVER
     *
     * @param fileServer the value for file_upload_info.FILE_SERVER
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public void setFileServer(String fileServer) {
        this.fileServer = fileServer == null ? null : fileServer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_upload_info.FILE_PATH
     *
     * @return the value of file_upload_info.FILE_PATH
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_upload_info.FILE_PATH
     *
     * @param filePath the value for file_upload_info.FILE_PATH
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_upload_info.FILE_EXT
     *
     * @return the value of file_upload_info.FILE_EXT
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public String getFileExt() {
        return fileExt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_upload_info.FILE_EXT
     *
     * @param fileExt the value for file_upload_info.FILE_EXT
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public void setFileExt(String fileExt) {
        this.fileExt = fileExt == null ? null : fileExt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_upload_info.FILE_SIZE
     *
     * @return the value of file_upload_info.FILE_SIZE
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_upload_info.FILE_SIZE
     *
     * @param fileSize the value for file_upload_info.FILE_SIZE
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_upload_info.CREATE_TIME
     *
     * @return the value of file_upload_info.CREATE_TIME
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_upload_info.CREATE_TIME
     *
     * @param createTime the value for file_upload_info.CREATE_TIME
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_upload_info.USER_ID
     *
     * @return the value of file_upload_info.USER_ID
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_upload_info.USER_ID
     *
     * @param userId the value for file_upload_info.USER_ID
     *
     * @mbggenerated Tue Mar 15 10:38:03 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}