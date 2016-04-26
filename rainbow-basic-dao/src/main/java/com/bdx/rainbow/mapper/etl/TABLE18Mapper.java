package com.bdx.rainbow.mapper.etl;

import com.bdx.rainbow.entity.etl.TABLE18;
import com.bdx.rainbow.entity.etl.TABLE18Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TABLE18Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int countByExample(TABLE18Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByExample(TABLE18Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insert(TABLE18 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int insertSelective(TABLE18 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    List<TABLE18> selectByExample(TABLE18Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    TABLE18 selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExampleSelective(@Param("record") TABLE18 record, @Param("example") TABLE18Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByExample(@Param("record") TABLE18 record, @Param("example") TABLE18Example example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKeySelective(TABLE18 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    int updateByPrimaryKey(TABLE18 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table18
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    void insertBatch(List<TABLE18> recordLst);
}