package com.bdx.rainbow.entity.urs;

public class SysUser2UserType {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user_2_user_type.USER_ID
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_user_2_user_type.USER_TYPE
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    private String userType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user_2_user_type.USER_ID
     *
     * @return the value of t_sys_user_2_user_type.USER_ID
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user_2_user_type.USER_ID
     *
     * @param userId the value for t_sys_user_2_user_type.USER_ID
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_user_2_user_type.USER_TYPE
     *
     * @return the value of t_sys_user_2_user_type.USER_TYPE
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_user_2_user_type.USER_TYPE
     *
     * @param userType the value for t_sys_user_2_user_type.USER_TYPE
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }
}