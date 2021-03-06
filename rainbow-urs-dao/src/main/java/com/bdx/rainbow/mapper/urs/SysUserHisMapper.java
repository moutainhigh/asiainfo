package com.bdx.rainbow.mapper.urs;

import com.bdx.rainbow.entity.urs.SysUserHis;
import com.bdx.rainbow.entity.urs.SysUserHisExample;
import com.bdx.rainbow.entity.urs.SysUserHisKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserHisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int countByExample(SysUserHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int deleteByExample(SysUserHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int deleteByPrimaryKey(SysUserHisKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int insert(SysUserHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int insertSelective(SysUserHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    List<SysUserHis> selectByExample(SysUserHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    SysUserHis selectByPrimaryKey(SysUserHisKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysUserHis record, @Param("example") SysUserHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int updateByExample(@Param("record") SysUserHis record, @Param("example") SysUserHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int updateByPrimaryKeySelective(SysUserHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int updateByPrimaryKey(SysUserHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    void insertBatch(List<SysUserHis> recordLst);
}