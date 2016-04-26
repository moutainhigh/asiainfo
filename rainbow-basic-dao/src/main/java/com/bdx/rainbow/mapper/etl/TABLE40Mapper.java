package com.bdx.rainbow.mapper.etl;

import com.bdx.rainbow.entity.etl.TABLE40;
import com.bdx.rainbow.entity.etl.TABLE40Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TABLE40Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int countByExample(TABLE40Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByExample(TABLE40Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insert(TABLE40 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insertSelective(TABLE40 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    List<TABLE40> selectByExample(TABLE40Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    TABLE40 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExampleSelective(@Param("record") TABLE40 record, @Param("example") TABLE40Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExample(@Param("record") TABLE40 record, @Param("example") TABLE40Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKeySelective(TABLE40 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKey(TABLE40 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table40
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    void insertBatch(List<TABLE40> recordLst);
}