package com.bdx.rainbow.mapper.etl;

import com.bdx.rainbow.entity.etl.TABLE79;
import com.bdx.rainbow.entity.etl.TABLE79Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TABLE79Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int countByExample(TABLE79Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByExample(TABLE79Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insert(TABLE79 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insertSelective(TABLE79 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    List<TABLE79> selectByExample(TABLE79Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    TABLE79 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExampleSelective(@Param("record") TABLE79 record, @Param("example") TABLE79Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExample(@Param("record") TABLE79 record, @Param("example") TABLE79Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKeySelective(TABLE79 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKey(TABLE79 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table79
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    void insertBatch(List<TABLE79> recordLst);
}