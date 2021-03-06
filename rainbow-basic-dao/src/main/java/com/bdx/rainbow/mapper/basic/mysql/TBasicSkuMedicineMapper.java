package com.bdx.rainbow.mapper.basic.mysql;

import com.bdx.rainbow.entity.basic.mysql.TBasicSkuMedicine;
import com.bdx.rainbow.entity.basic.mysql.TBasicSkuMedicineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicSkuMedicineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int countByExample(TBasicSkuMedicineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int deleteByExample(TBasicSkuMedicineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int deleteByPrimaryKey(Integer skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int insert(TBasicSkuMedicine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int insertSelective(TBasicSkuMedicine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    List<TBasicSkuMedicine> selectByExample(TBasicSkuMedicineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    TBasicSkuMedicine selectByPrimaryKey(Integer skuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByExampleSelective(@Param("record") TBasicSkuMedicine record, @Param("example") TBasicSkuMedicineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByExample(@Param("record") TBasicSkuMedicine record, @Param("example") TBasicSkuMedicineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByPrimaryKeySelective(TBasicSkuMedicine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByPrimaryKey(TBasicSkuMedicine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_sku_medicine
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    void insertBatch(List<TBasicSkuMedicine> recordLst);
}