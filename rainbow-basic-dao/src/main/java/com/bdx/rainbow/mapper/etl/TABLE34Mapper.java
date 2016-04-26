package com.bdx.rainbow.mapper.etl;

import com.bdx.rainbow.entity.etl.TABLE34;
import com.bdx.rainbow.entity.etl.TABLE34Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TABLE34Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int countByExample(TABLE34Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByExample(TABLE34Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insert(TABLE34 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insertSelective(TABLE34 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    List<TABLE34> selectByExample(TABLE34Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    TABLE34 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExampleSelective(@Param("record") TABLE34 record, @Param("example") TABLE34Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExample(@Param("record") TABLE34 record, @Param("example") TABLE34Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKeySelective(TABLE34 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKey(TABLE34 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table34
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    void insertBatch(List<TABLE34> recordLst);
}