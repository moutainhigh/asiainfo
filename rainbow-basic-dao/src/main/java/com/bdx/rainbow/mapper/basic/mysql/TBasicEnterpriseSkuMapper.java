package com.bdx.rainbow.mapper.basic.mysql;

import com.bdx.rainbow.entity.basic.mysql.TBasicEnterpriseSku;
import com.bdx.rainbow.entity.basic.mysql.TBasicEnterpriseSkuExample;
import com.bdx.rainbow.entity.basic.mysql.TBasicEnterpriseSkuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicEnterpriseSkuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int countByExample(TBasicEnterpriseSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int deleteByExample(TBasicEnterpriseSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int deleteByPrimaryKey(TBasicEnterpriseSkuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int insert(TBasicEnterpriseSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int insertSelective(TBasicEnterpriseSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    List<TBasicEnterpriseSku> selectByExample(TBasicEnterpriseSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    TBasicEnterpriseSku selectByPrimaryKey(TBasicEnterpriseSkuKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByExampleSelective(@Param("record") TBasicEnterpriseSku record, @Param("example") TBasicEnterpriseSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByExample(@Param("record") TBasicEnterpriseSku record, @Param("example") TBasicEnterpriseSkuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByPrimaryKeySelective(TBasicEnterpriseSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    int updateByPrimaryKey(TBasicEnterpriseSku record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_basic_enterprise_sku
     *
     * @mbggenerated Wed Jan 20 17:30:41 CST 2016
     */
    void insertBatch(List<TBasicEnterpriseSku> recordLst);
}