package com.bdx.rainbow.entity.urs;

import java.sql.Timestamp;

public class SysUserExtHis {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user_ext_his.BUSSIN6
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    private Integer bussin6;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user_ext_his.EXT_KEY
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    private String extKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user_ext_his.EXT_VALUE
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    private String extValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user_ext_his.USER_ID
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user_ext_his.BUSSIN_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    private Timestamp bussinTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user_ext_his.BUSSIN6
     *
     * @return the value of t_sys_user_ext_his.BUSSIN6
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public Integer getBussin6() {
        return bussin6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user_ext_his.BUSSIN6
     *
     * @param bussin6 the value for t_sys_user_ext_his.BUSSIN6
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setBussin6(Integer bussin6) {
        this.bussin6 = bussin6;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user_ext_his.EXT_KEY
     *
     * @return the value of t_sys_user_ext_his.EXT_KEY
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public String getExtKey() {
        return extKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user_ext_his.EXT_KEY
     *
     * @param extKey the value for t_sys_user_ext_his.EXT_KEY
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setExtKey(String extKey) {
        this.extKey = extKey == null ? null : extKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user_ext_his.EXT_VALUE
     *
     * @return the value of t_sys_user_ext_his.EXT_VALUE
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public String getExtValue() {
        return extValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user_ext_his.EXT_VALUE
     *
     * @param extValue the value for t_sys_user_ext_his.EXT_VALUE
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setExtValue(String extValue) {
        this.extValue = extValue == null ? null : extValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user_ext_his.USER_ID
     *
     * @return the value of t_sys_user_ext_his.USER_ID
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user_ext_his.USER_ID
     *
     * @param userId the value for t_sys_user_ext_his.USER_ID
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user_ext_his.BUSSIN_TIME
     *
     * @return the value of t_sys_user_ext_his.BUSSIN_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public Timestamp getBussinTime() {
        return bussinTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user_ext_his.BUSSIN_TIME
     *
     * @param bussinTime the value for t_sys_user_ext_his.BUSSIN_TIME
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setBussinTime(Timestamp bussinTime) {
        this.bussinTime = bussinTime;
    }
}