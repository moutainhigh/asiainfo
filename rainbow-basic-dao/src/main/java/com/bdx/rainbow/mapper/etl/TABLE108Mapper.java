package com.bdx.rainbow.mapper.etl;

import com.bdx.rainbow.entity.etl.TABLE108;
import com.bdx.rainbow.entity.etl.TABLE108Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TABLE108Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int countByExample(TABLE108Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByExample(TABLE108Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insert(TABLE108 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insertSelective(TABLE108 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    List<TABLE108> selectByExample(TABLE108Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    TABLE108 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExampleSelective(@Param("record") TABLE108 record, @Param("example") TABLE108Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExample(@Param("record") TABLE108 record, @Param("example") TABLE108Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKeySelective(TABLE108 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKey(TABLE108 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table108
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    void insertBatch(List<TABLE108> recordLst);
}