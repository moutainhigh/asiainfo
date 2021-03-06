package com.bdx.rainbow.mapper.basic.mysql;

import com.bdx.rainbow.entity.basic.mysql.TMappUser;
import com.bdx.rainbow.entity.basic.mysql.TMappUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMappUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    int countByExample(TMappUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    int deleteByExample(TMappUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    int insert(TMappUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    int insertSelective(TMappUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    List<TMappUser> selectByExample(TMappUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    TMappUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    int updateByExampleSelective(@Param("record") TMappUser record, @Param("example") TMappUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    int updateByExample(@Param("record") TMappUser record, @Param("example") TMappUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    int updateByPrimaryKeySelective(TMappUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    int updateByPrimaryKey(TMappUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_mapp_user
     *
     * @mbggenerated Thu Jan 21 15:01:55 CST 2016
     */
    void insertBatch(List<TMappUser> recordLst);
}