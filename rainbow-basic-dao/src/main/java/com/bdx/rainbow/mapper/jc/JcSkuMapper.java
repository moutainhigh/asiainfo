package com.bdx.rainbow.mapper.jc;

import com.bdx.rainbow.entity.jc.JcSku;
import com.bdx.rainbow.entity.jc.JcSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JcSkuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    int countByExample(JcSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    int deleteByExample(JcSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    int deleteByPrimaryKey(String skuBarcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    int insert(JcSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    int insertSelective(JcSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    List<JcSku> selectByExample(JcSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    JcSku selectByPrimaryKey(String skuBarcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    int updateByExampleSelective(@Param("record") JcSku record, @Param("example") JcSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    int updateByExample(@Param("record") JcSku record, @Param("example") JcSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    int updateByPrimaryKeySelective(JcSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    int updateByPrimaryKey(JcSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jc_sku
     *
     * @mbggenerated Mon Jan 18 14:56:54 CST 2016
     */
    void insertBatch(List<JcSku> recordLst);
}