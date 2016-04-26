package com.bdx.rainbow.entity.urs;

import java.sql.Timestamp;

public class SysDeptHis extends SysDeptHisKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.DEPT_NAME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private String deptName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.DEPT_PID
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private Integer deptPid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.DEPT_TYPE
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private String deptType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.DEPT_STATUS
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private String deptStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.CREATER
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private Integer creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.CREATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private Timestamp createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.UPDATER
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private Integer updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.UPDATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private Timestamp updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.PROVINCE
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.AREAID
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private String areaid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.COUNTYID
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private String countyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.BUSSIN_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private Timestamp bussinTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_dept_his.BUSSIN_TYPE
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    private String bussinType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.DEPT_NAME
     *
     * @return the value of t_sys_dept_his.DEPT_NAME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.DEPT_NAME
     *
     * @param deptName the value for t_sys_dept_his.DEPT_NAME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.DEPT_PID
     *
     * @return the value of t_sys_dept_his.DEPT_PID
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public Integer getDeptPid() {
        return deptPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.DEPT_PID
     *
     * @param deptPid the value for t_sys_dept_his.DEPT_PID
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setDeptPid(Integer deptPid) {
        this.deptPid = deptPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.DEPT_TYPE
     *
     * @return the value of t_sys_dept_his.DEPT_TYPE
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public String getDeptType() {
        return deptType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.DEPT_TYPE
     *
     * @param deptType the value for t_sys_dept_his.DEPT_TYPE
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setDeptType(String deptType) {
        this.deptType = deptType == null ? null : deptType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.DEPT_STATUS
     *
     * @return the value of t_sys_dept_his.DEPT_STATUS
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public String getDeptStatus() {
        return deptStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.DEPT_STATUS
     *
     * @param deptStatus the value for t_sys_dept_his.DEPT_STATUS
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setDeptStatus(String deptStatus) {
        this.deptStatus = deptStatus == null ? null : deptStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.CREATER
     *
     * @return the value of t_sys_dept_his.CREATER
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.CREATER
     *
     * @param creater the value for t_sys_dept_his.CREATER
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.CREATE_TIME
     *
     * @return the value of t_sys_dept_his.CREATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.CREATE_TIME
     *
     * @param createTime the value for t_sys_dept_his.CREATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.UPDATER
     *
     * @return the value of t_sys_dept_his.UPDATER
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public Integer getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.UPDATER
     *
     * @param updater the value for t_sys_dept_his.UPDATER
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.UPDATE_TIME
     *
     * @return the value of t_sys_dept_his.UPDATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.UPDATE_TIME
     *
     * @param updateTime the value for t_sys_dept_his.UPDATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.PROVINCE
     *
     * @return the value of t_sys_dept_his.PROVINCE
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.PROVINCE
     *
     * @param province the value for t_sys_dept_his.PROVINCE
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.AREAID
     *
     * @return the value of t_sys_dept_his.AREAID
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.AREAID
     *
     * @param areaid the value for t_sys_dept_his.AREAID
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.COUNTYID
     *
     * @return the value of t_sys_dept_his.COUNTYID
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public String getCountyid() {
        return countyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.COUNTYID
     *
     * @param countyid the value for t_sys_dept_his.COUNTYID
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setCountyid(String countyid) {
        this.countyid = countyid == null ? null : countyid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.BUSSIN_TIME
     *
     * @return the value of t_sys_dept_his.BUSSIN_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public Timestamp getBussinTime() {
        return bussinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.BUSSIN_TIME
     *
     * @param bussinTime the value for t_sys_dept_his.BUSSIN_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setBussinTime(Timestamp bussinTime) {
        this.bussinTime = bussinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_dept_his.BUSSIN_TYPE
     *
     * @return the value of t_sys_dept_his.BUSSIN_TYPE
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public String getBussinType() {
        return bussinType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_dept_his.BUSSIN_TYPE
     *
     * @param bussinType the value for t_sys_dept_his.BUSSIN_TYPE
     *
     * @mbggenerated Tue Jan 19 22:26:19 CST 2016
     */
    public void setBussinType(String bussinType) {
        this.bussinType = bussinType == null ? null : bussinType.trim();
    }
}