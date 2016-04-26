package com.bdx.rainbow.entity.urs;

import java.sql.Timestamp;

public class SysDept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.DEPT_ID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private Integer deptId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.DEPT_NAME
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.DEPT_PID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private Integer deptPid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.DEPT_TYPE
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private String deptType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.DEPT_STATUS
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private String deptStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.CREATER
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private Integer creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.CREATE_TIME
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private Timestamp createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.UPDATER
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private Integer updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.UPDATE_TIME
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private Timestamp updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.PROVINCE
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.AREAID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private String areaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.COUNTYID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private String countyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept.ADMIN
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    private String admin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.DEPT_ID
     *
     * @return the value of t_sys_dept.DEPT_ID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.DEPT_ID
     *
     * @param deptId the value for t_sys_dept.DEPT_ID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.DEPT_NAME
     *
     * @return the value of t_sys_dept.DEPT_NAME
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.DEPT_NAME
     *
     * @param deptName the value for t_sys_dept.DEPT_NAME
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.DEPT_PID
     *
     * @return the value of t_sys_dept.DEPT_PID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public Integer getDeptPid() {
        return deptPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.DEPT_PID
     *
     * @param deptPid the value for t_sys_dept.DEPT_PID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setDeptPid(Integer deptPid) {
        this.deptPid = deptPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.DEPT_TYPE
     *
     * @return the value of t_sys_dept.DEPT_TYPE
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public String getDeptType() {
        return deptType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.DEPT_TYPE
     *
     * @param deptType the value for t_sys_dept.DEPT_TYPE
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setDeptType(String deptType) {
        this.deptType = deptType == null ? null : deptType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.DEPT_STATUS
     *
     * @return the value of t_sys_dept.DEPT_STATUS
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public String getDeptStatus() {
        return deptStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.DEPT_STATUS
     *
     * @param deptStatus the value for t_sys_dept.DEPT_STATUS
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setDeptStatus(String deptStatus) {
        this.deptStatus = deptStatus == null ? null : deptStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.CREATER
     *
     * @return the value of t_sys_dept.CREATER
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.CREATER
     *
     * @param creater the value for t_sys_dept.CREATER
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.CREATE_TIME
     *
     * @return the value of t_sys_dept.CREATE_TIME
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.CREATE_TIME
     *
     * @param createTime the value for t_sys_dept.CREATE_TIME
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.UPDATER
     *
     * @return the value of t_sys_dept.UPDATER
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public Integer getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.UPDATER
     *
     * @param updater the value for t_sys_dept.UPDATER
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.UPDATE_TIME
     *
     * @return the value of t_sys_dept.UPDATE_TIME
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.UPDATE_TIME
     *
     * @param updateTime the value for t_sys_dept.UPDATE_TIME
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.PROVINCE
     *
     * @return the value of t_sys_dept.PROVINCE
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.PROVINCE
     *
     * @param province the value for t_sys_dept.PROVINCE
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.AREAID
     *
     * @return the value of t_sys_dept.AREAID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.AREAID
     *
     * @param areaid the value for t_sys_dept.AREAID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.COUNTYID
     *
     * @return the value of t_sys_dept.COUNTYID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public String getCountyid() {
        return countyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.COUNTYID
     *
     * @param countyid the value for t_sys_dept.COUNTYID
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setCountyid(String countyid) {
        this.countyid = countyid == null ? null : countyid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept.ADMIN
     *
     * @return the value of t_sys_dept.ADMIN
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public String getAdmin() {
        return admin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept.ADMIN
     *
     * @param admin the value for t_sys_dept.ADMIN
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    public void setAdmin(String admin) {
        this.admin = admin == null ? null : admin.trim();
    }
}