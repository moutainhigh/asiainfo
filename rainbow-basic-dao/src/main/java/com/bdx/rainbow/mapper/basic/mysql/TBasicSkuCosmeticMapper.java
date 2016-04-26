package com.bdx.rainbow.mapper.basic.mysql;

import com.bdx.rainbow.entity.basic.mysql.TBasicSkuCosmetic;
import com.bdx.rainbow.entity.basic.mysql.TBasicSkuCosmeticExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicSkuCosmeticMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int countByExample(TBasicSkuCosmeticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int deleteByExample(TBasicSkuCosmeticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int deleteByPrimaryKey(Integer skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int insert(TBasicSkuCosmetic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int insertSelective(TBasicSkuCosmetic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    List<TBasicSkuCosmetic> selectByExample(TBasicSkuCosmeticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    TBasicSkuCosmetic selectByPrimaryKey(Integer skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByExampleSelective(@Param("record") TBasicSkuCosmetic record, @Param("example") TBasicSkuCosmeticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByExample(@Param("record") TBasicSkuCosmetic record, @Param("example") TBasicSkuCosmeticExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByPrimaryKeySelective(TBasicSkuCosmetic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByPrimaryKey(TBasicSkuCosmetic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_cosmetic
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    void insertBatch(List<TBasicSkuCosmetic> recordLst);
}