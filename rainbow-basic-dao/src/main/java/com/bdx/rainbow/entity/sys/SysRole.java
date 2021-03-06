package com.bdx.rainbow.entity.sys;

import java.sql.Timestamp;

public class SysRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.ROLE_ID
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.ROLE_NAME
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.ROLE_PID
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    private Integer rolePid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.CREATER
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    private Integer creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.CREATE_TIME
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    private Timestamp createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.UPDATER
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    private Integer updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.UPDATE_TIME
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    private Timestamp updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.ROLE_ID
     *
     * @return the value of sys_role.ROLE_ID
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.ROLE_ID
     *
     * @param roleId the value for sys_role.ROLE_ID
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.ROLE_NAME
     *
     * @return the value of sys_role.ROLE_NAME
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.ROLE_NAME
     *
     * @param roleName the value for sys_role.ROLE_NAME
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.ROLE_PID
     *
     * @return the value of sys_role.ROLE_PID
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public Integer getRolePid() {
        return rolePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.ROLE_PID
     *
     * @param rolePid the value for sys_role.ROLE_PID
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public void setRolePid(Integer rolePid) {
        this.rolePid = rolePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.CREATER
     *
     * @return the value of sys_role.CREATER
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.CREATER
     *
     * @param creater the value for sys_role.CREATER
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.CREATE_TIME
     *
     * @return the value of sys_role.CREATE_TIME
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.CREATE_TIME
     *
     * @param createTime the value for sys_role.CREATE_TIME
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.UPDATER
     *
     * @return the value of sys_role.UPDATER
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public Integer getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.UPDATER
     *
     * @param updater the value for sys_role.UPDATER
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.UPDATE_TIME
     *
     * @return the value of sys_role.UPDATE_TIME
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.UPDATE_TIME
     *
     * @param updateTime the value for sys_role.UPDATE_TIME
     *
     * @mbggenerated Thu Jan 07 15:12:02 CST 2016
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}