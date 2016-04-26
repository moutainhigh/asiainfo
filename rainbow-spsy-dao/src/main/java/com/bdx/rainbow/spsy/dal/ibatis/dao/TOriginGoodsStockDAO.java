package com.bdx.rainbow.spsy.dal.ibatis.dao;

import com.bdx.rainbow.spsy.dal.ibatis.model.TOriginGoodsStock;
import com.bdx.rainbow.spsy.dal.ibatis.model.TOriginGoodsStockExample;
import java.util.List;

public interface TOriginGoodsStockDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    int countByExample(TOriginGoodsStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    int deleteByExample(TOriginGoodsStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer operationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    Integer insert(TOriginGoodsStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    Integer insertSelective(TOriginGoodsStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    List<TOriginGoodsStock> selectByExample(TOriginGoodsStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    TOriginGoodsStock selectByPrimaryKey(Integer operationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    int updateByExampleSelective(TOriginGoodsStock record, TOriginGoodsStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    int updateByExample(TOriginGoodsStock record, TOriginGoodsStockExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TOriginGoodsStock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TOriginGoodsStock record);
}