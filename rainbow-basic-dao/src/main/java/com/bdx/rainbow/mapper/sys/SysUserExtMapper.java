package com.bdx.rainbow.mapper.sys;

import com.bdx.rainbow.entity.sys.SysUserExt;
import com.bdx.rainbow.entity.sys.SysUserExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserExtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_ext
     *
     * @mbggenerated Thu Jan 07 15:12:03 CST 2016
     */
    int countByExample(SysUserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_ext
     *
     * @mbggenerated Thu Jan 07 15:12:03 CST 2016
     */
    int deleteByExample(SysUserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_ext
     *
     * @mbggenerated Thu Jan 07 15:12:03 CST 2016
     */
    int insert(SysUserExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_ext
     *
     * @mbggenerated Thu Jan 07 15:12:03 CST 2016
     */
    int insertSelective(SysUserExt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_ext
     *
     * @mbggenerated Thu Jan 07 15:12:03 CST 2016
     */
    List<SysUserExt> selectByExample(SysUserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_ext
     *
     * @mbggenerated Thu Jan 07 15:12:03 CST 2016
     */
    int updateByExampleSelective(@Param("record") SysUserExt record, @Param("example") SysUserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_ext
     *
     * @mbggenerated Thu Jan 07 15:12:03 CST 2016
     */
    int updateByExample(@Param("record") SysUserExt record, @Param("example") SysUserExtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_ext
     *
     * @mbggenerated Thu Jan 07 15:12:03 CST 2016
     */
    void insertBatch(List<SysUserExt> recordLst);
}