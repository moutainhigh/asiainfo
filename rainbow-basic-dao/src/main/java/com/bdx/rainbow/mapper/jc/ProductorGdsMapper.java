package com.bdx.rainbow.mapper.jc;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdx.rainbow.entity.jc.ProductorGds;
import com.bdx.rainbow.entity.jc.ProductorGdsExample;

public interface ProductorGdsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    int countByExample(ProductorGdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    int deleteByExample(ProductorGdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    int deleteByPrimaryKey(String pCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    int insert(ProductorGds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    int insertSelective(ProductorGds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    List<ProductorGds> selectByExample(ProductorGdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    ProductorGds selectByPrimaryKey(String pCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    int updateByExampleSelective(@Param("record") ProductorGds record, @Param("example") ProductorGdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    int updateByExample(@Param("record") ProductorGds record, @Param("example") ProductorGdsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    int updateByPrimaryKeySelective(ProductorGds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    int updateByPrimaryKey(ProductorGds record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productor_gds
     *
     * @mbggenerated Wed Nov 04 22:44:14 CST 2015
     */
    void insertBatch(List<ProductorGds> recordLst);
}