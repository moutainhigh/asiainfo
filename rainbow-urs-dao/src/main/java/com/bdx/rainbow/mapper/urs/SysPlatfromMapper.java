package com.bdx.rainbow.mapper.urs;

import com.bdx.rainbow.entity.urs.SysPlatfrom;
import com.bdx.rainbow.entity.urs.SysPlatfromExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPlatfromMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    int countByExample(SysPlatfromExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    int deleteByExample(SysPlatfromExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    int deleteByPrimaryKey(Integer platId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    int insert(SysPlatfrom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    int insertSelective(SysPlatfrom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    List<SysPlatfrom> selectByExample(SysPlatfromExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    SysPlatfrom selectByPrimaryKey(Integer platId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysPlatfrom record, @Param("example") SysPlatfromExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    int updateByExample(@Param("record") SysPlatfrom record, @Param("example") SysPlatfromExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    int updateByPrimaryKeySelective(SysPlatfrom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    int updateByPrimaryKey(SysPlatfrom record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_platform
     *
     * @mbggenerated Fri Mar 11 20:31:12 CST 2016
     */
    void insertBatch(List<SysPlatfrom> recordLst);
}