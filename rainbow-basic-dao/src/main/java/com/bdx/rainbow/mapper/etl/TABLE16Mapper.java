package com.bdx.rainbow.mapper.etl;

import com.bdx.rainbow.entity.etl.TABLE16;
import com.bdx.rainbow.entity.etl.TABLE16Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TABLE16Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int countByExample(TABLE16Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByExample(TABLE16Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insert(TABLE16 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insertSelective(TABLE16 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    List<TABLE16> selectByExample(TABLE16Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    TABLE16 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExampleSelective(@Param("record") TABLE16 record, @Param("example") TABLE16Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExample(@Param("record") TABLE16 record, @Param("example") TABLE16Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKeySelective(TABLE16 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKey(TABLE16 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table16
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    void insertBatch(List<TABLE16> recordLst);
}