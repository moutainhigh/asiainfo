package com.bdx.rainbow.spsy.dal.ibatis.dao;

import com.bdx.rainbow.spsy.dal.ibatis.model.TOriginMerchantStockOut;
import com.bdx.rainbow.spsy.dal.ibatis.model.TOriginMerchantStockOutExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TOriginMerchantStockOutDAOImpl extends SqlMapClientDaoSupport implements TOriginMerchantStockOutDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public TOriginMerchantStockOutDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public int countByExample(TOriginMerchantStockOutExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("t_origin_merchant_stock_out.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public int deleteByExample(TOriginMerchantStockOutExample example) {
        int rows = getSqlMapClientTemplate().delete("t_origin_merchant_stock_out.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public int deleteByPrimaryKey(Integer operationOutId) {
        TOriginMerchantStockOut _key = new TOriginMerchantStockOut();
        _key.setOperationOutId(operationOutId);
        int rows = getSqlMapClientTemplate().delete("t_origin_merchant_stock_out.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public Integer insert(TOriginMerchantStockOut record) {
        Object newKey = getSqlMapClientTemplate().insert("t_origin_merchant_stock_out.insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public Integer insertSelective(TOriginMerchantStockOut record) {
        Object newKey = getSqlMapClientTemplate().insert("t_origin_merchant_stock_out.insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public List<TOriginMerchantStockOut> selectByExample(TOriginMerchantStockOutExample example) {
        List<TOriginMerchantStockOut> list = getSqlMapClientTemplate().queryForList("t_origin_merchant_stock_out.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public TOriginMerchantStockOut selectByPrimaryKey(Integer operationOutId) {
        TOriginMerchantStockOut _key = new TOriginMerchantStockOut();
        _key.setOperationOutId(operationOutId);
        TOriginMerchantStockOut record = (TOriginMerchantStockOut) getSqlMapClientTemplate().queryForObject("t_origin_merchant_stock_out.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public int updateByExampleSelective(TOriginMerchantStockOut record, TOriginMerchantStockOutExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_origin_merchant_stock_out.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public int updateByExample(TOriginMerchantStockOut record, TOriginMerchantStockOutExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_origin_merchant_stock_out.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public int updateByPrimaryKeySelective(TOriginMerchantStockOut record) {
        int rows = getSqlMapClientTemplate().update("t_origin_merchant_stock_out.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    public int updateByPrimaryKey(TOriginMerchantStockOut record) {
        int rows = getSqlMapClientTemplate().update("t_origin_merchant_stock_out.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_origin_merchant_stock_out
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends TOriginMerchantStockOutExample {
        private Object record;

        public UpdateByExampleParms(Object record, TOriginMerchantStockOutExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}