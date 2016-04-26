package com.bdx.rainbow.ygcf.mapper;

import com.bdx.rainbow.ygcf.entity.LedgerPurchase;
import com.bdx.rainbow.ygcf.entity.LedgerPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LedgerPurchaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    int countByExample(LedgerPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    int deleteByExample(LedgerPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer purchaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    int insert(LedgerPurchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    int insertSelective(LedgerPurchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    List<LedgerPurchase> selectByExample(LedgerPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    LedgerPurchase selectByPrimaryKey(Integer purchaseId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LedgerPurchase record, @Param("example") LedgerPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LedgerPurchase record, @Param("example") LedgerPurchaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LedgerPurchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LedgerPurchase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_ygcf_ledger_purchase
     *
     * @mbggenerated
     */
    void insertBatch(List<LedgerPurchase> recordLst);
}