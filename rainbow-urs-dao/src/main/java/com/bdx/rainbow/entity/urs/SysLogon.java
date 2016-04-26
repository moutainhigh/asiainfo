package com.bdx.rainbow.entity.urs;

import java.sql.Timestamp;

public class SysLogon {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGON_ID
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private Integer logonId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGON_NAME
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String logonName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGON_TIME
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private Timestamp logonTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGON_IP
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String logonIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGON_MAC
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String logonMac;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.DEPT_ID
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private Integer deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.USER_TYPE
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.SERVER_IP
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String serverIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGONIMEI
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String logonimei;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGONVERSION
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String logonversion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGONBRAND
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String logonbrand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGONMODEL
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String logonmodel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGONOS
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String logonos;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_logon.LOGON_SID
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    private String logonSid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGON_ID
     *
     * @return the value of t_sys_logon.LOGON_ID
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public Integer getLogonId() {
        return logonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGON_ID
     *
     * @param logonId the value for t_sys_logon.LOGON_ID
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonId(Integer logonId) {
        this.logonId = logonId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGON_NAME
     *
     * @return the value of t_sys_logon.LOGON_NAME
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getLogonName() {
        return logonName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGON_NAME
     *
     * @param logonName the value for t_sys_logon.LOGON_NAME
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonName(String logonName) {
        this.logonName = logonName == null ? null : logonName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGON_TIME
     *
     * @return the value of t_sys_logon.LOGON_TIME
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public Timestamp getLogonTime() {
        return logonTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGON_TIME
     *
     * @param logonTime the value for t_sys_logon.LOGON_TIME
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonTime(Timestamp logonTime) {
        this.logonTime = logonTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGON_IP
     *
     * @return the value of t_sys_logon.LOGON_IP
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getLogonIp() {
        return logonIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGON_IP
     *
     * @param logonIp the value for t_sys_logon.LOGON_IP
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonIp(String logonIp) {
        this.logonIp = logonIp == null ? null : logonIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGON_MAC
     *
     * @return the value of t_sys_logon.LOGON_MAC
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getLogonMac() {
        return logonMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGON_MAC
     *
     * @param logonMac the value for t_sys_logon.LOGON_MAC
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonMac(String logonMac) {
        this.logonMac = logonMac == null ? null : logonMac.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.DEPT_ID
     *
     * @return the value of t_sys_logon.DEPT_ID
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.DEPT_ID
     *
     * @param deptId the value for t_sys_logon.DEPT_ID
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.USER_TYPE
     *
     * @return the value of t_sys_logon.USER_TYPE
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.USER_TYPE
     *
     * @param userType the value for t_sys_logon.USER_TYPE
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.SERVER_IP
     *
     * @return the value of t_sys_logon.SERVER_IP
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.SERVER_IP
     *
     * @param serverIp the value for t_sys_logon.SERVER_IP
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp == null ? null : serverIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGONIMEI
     *
     * @return the value of t_sys_logon.LOGONIMEI
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getLogonimei() {
        return logonimei;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGONIMEI
     *
     * @param logonimei the value for t_sys_logon.LOGONIMEI
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonimei(String logonimei) {
        this.logonimei = logonimei == null ? null : logonimei.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGONVERSION
     *
     * @return the value of t_sys_logon.LOGONVERSION
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getLogonversion() {
        return logonversion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGONVERSION
     *
     * @param logonversion the value for t_sys_logon.LOGONVERSION
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonversion(String logonversion) {
        this.logonversion = logonversion == null ? null : logonversion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGONBRAND
     *
     * @return the value of t_sys_logon.LOGONBRAND
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getLogonbrand() {
        return logonbrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGONBRAND
     *
     * @param logonbrand the value for t_sys_logon.LOGONBRAND
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonbrand(String logonbrand) {
        this.logonbrand = logonbrand == null ? null : logonbrand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGONMODEL
     *
     * @return the value of t_sys_logon.LOGONMODEL
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getLogonmodel() {
        return logonmodel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGONMODEL
     *
     * @param logonmodel the value for t_sys_logon.LOGONMODEL
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonmodel(String logonmodel) {
        this.logonmodel = logonmodel == null ? null : logonmodel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGONOS
     *
     * @return the value of t_sys_logon.LOGONOS
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getLogonos() {
        return logonos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGONOS
     *
     * @param logonos the value for t_sys_logon.LOGONOS
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonos(String logonos) {
        this.logonos = logonos == null ? null : logonos.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_logon.LOGON_SID
     *
     * @return the value of t_sys_logon.LOGON_SID
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public String getLogonSid() {
        return logonSid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_logon.LOGON_SID
     *
     * @param logonSid the value for t_sys_logon.LOGON_SID
     *
     * @mbggenerated Thu Jan 28 15:20:19 CST 2016
     */
    public void setLogonSid(String logonSid) {
        this.logonSid = logonSid == null ? null : logonSid.trim();
    }
}