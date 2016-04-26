package com.bdx.rainbow.urs.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class SysRole implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.ROLE_ID
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.PLAT_ID
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    private Integer platId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.ROLE_NAME
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.ROLE_PID
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    private Integer rolePid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.CREATER
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    private Integer creater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.CREATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    private Timestamp createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.UPDATER
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    private Integer updater;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.UPDATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    private Timestamp updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_role.ADMIN_USER
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    private String adminUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.ROLE_ID
     *
     * @return the value of t_sys_role.ROLE_ID
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.ROLE_ID
     *
     * @param roleId the value for t_sys_role.ROLE_ID
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.PLAT_ID
     *
     * @return the value of t_sys_role.PLAT_ID
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public Integer getPlatId() {
        return platId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.PLAT_ID
     *
     * @param platId the value for t_sys_role.PLAT_ID
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public void setPlatId(Integer platId) {
        this.platId = platId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.ROLE_NAME
     *
     * @return the value of t_sys_role.ROLE_NAME
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.ROLE_NAME
     *
     * @param roleName the value for t_sys_role.ROLE_NAME
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.ROLE_PID
     *
     * @return the value of t_sys_role.ROLE_PID
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public Integer getRolePid() {
        return rolePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.ROLE_PID
     *
     * @param rolePid the value for t_sys_role.ROLE_PID
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public void setRolePid(Integer rolePid) {
        this.rolePid = rolePid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.CREATER
     *
     * @return the value of t_sys_role.CREATER
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public Integer getCreater() {
        return creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.CREATER
     *
     * @param creater the value for t_sys_role.CREATER
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.CREATE_TIME
     *
     * @return the value of t_sys_role.CREATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public Timestamp getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.CREATE_TIME
     *
     * @param createTime the value for t_sys_role.CREATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.UPDATER
     *
     * @return the value of t_sys_role.UPDATER
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public Integer getUpdater() {
        return updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.UPDATER
     *
     * @param updater the value for t_sys_role.UPDATER
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public void setUpdater(Integer updater) {
        this.updater = updater;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.UPDATE_TIME
     *
     * @return the value of t_sys_role.UPDATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.UPDATE_TIME
     *
     * @param updateTime the value for t_sys_role.UPDATE_TIME
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_role.ADMIN_USER
     *
     * @return the value of t_sys_role.ADMIN_USER
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public String getAdminUser() {
        return adminUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_role.ADMIN_USER
     *
     * @param adminUser the value for t_sys_role.ADMIN_USER
     *
     * @mbggenerated Tue Jan 19 22:16:25 CST 2016
     */
    public void setAdminUser(String adminUser) {
        this.adminUser = adminUser == null ? null : adminUser.trim();
    }
}