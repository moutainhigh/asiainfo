package com.bdx.rainbow.mapper.urs;

import com.bdx.rainbow.entity.urs.SysUserExtHis;
import com.bdx.rainbow.entity.urs.SysUserExtHisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserExtHisMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int countByExample(SysUserExtHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int deleteByExample(SysUserExtHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int deleteByPrimaryKey(Integer bussin6);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int insert(SysUserExtHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int insertSelective(SysUserExtHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    List<SysUserExtHis> selectByExample(SysUserExtHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    SysUserExtHis selectByPrimaryKey(Integer bussin6);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysUserExtHis record, @Param("example") SysUserExtHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int updateByExample(@Param("record") SysUserExtHis record, @Param("example") SysUserExtHisExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int updateByPrimaryKeySelective(SysUserExtHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    int updateByPrimaryKey(SysUserExtHis record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    void insertBatch(List<SysUserExtHis> recordLst);
}