package com.bdx.rainbow.mapper.etl;

import com.bdx.rainbow.entity.etl.TABLE27;
import com.bdx.rainbow.entity.etl.TABLE27Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TABLE27Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int countByExample(TABLE27Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByExample(TABLE27Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insert(TABLE27 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insertSelective(TABLE27 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    List<TABLE27> selectByExample(TABLE27Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    TABLE27 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExampleSelective(@Param("record") TABLE27 record, @Param("example") TABLE27Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExample(@Param("record") TABLE27 record, @Param("example") TABLE27Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKeySelective(TABLE27 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKey(TABLE27 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table27
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    void insertBatch(List<TABLE27> recordLst);
}