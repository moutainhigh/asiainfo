package com.bdx.rainbow.spsy.dal.ibatis.dao;

import com.bdx.rainbow.spsy.dal.ibatis.model.TOriginProducerStockDetailIn;
import com.bdx.rainbow.spsy.dal.ibatis.model.TOriginProducerStockDetailInExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TOriginProducerStockDetailInDAOImpl extends SqlMapClientDaoSupport implements TOriginProducerStockDetailInDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public TOriginProducerStockDetailInDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public int countByExample(TOriginProducerStockDetailInExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("t_origin_producer_stock_detail_in.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public int deleteByExample(TOriginProducerStockDetailInExample example) {
        int rows = getSqlMapClientTemplate().delete("t_origin_producer_stock_detail_in.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public int deleteByPrimaryKey(Integer operationDetailId) {
        TOriginProducerStockDetailIn _key = new TOriginProducerStockDetailIn();
        _key.setOperationDetailId(operationDetailId);
        int rows = getSqlMapClientTemplate().delete("t_origin_producer_stock_detail_in.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public Integer insert(TOriginProducerStockDetailIn record) {
        Object newKey = getSqlMapClientTemplate().insert("t_origin_producer_stock_detail_in.insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public Integer insertSelective(TOriginProducerStockDetailIn record) {
        Object newKey = getSqlMapClientTemplate().insert("t_origin_producer_stock_detail_in.insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public List<TOriginProducerStockDetailIn> selectByExample(TOriginProducerStockDetailInExample example) {
        List<TOriginProducerStockDetailIn> list = getSqlMapClientTemplate().queryForList("t_origin_producer_stock_detail_in.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public TOriginProducerStockDetailIn selectByPrimaryKey(Integer operationDetailId) {
        TOriginProducerStockDetailIn _key = new TOriginProducerStockDetailIn();
        _key.setOperationDetailId(operationDetailId);
        TOriginProducerStockDetailIn record = (TOriginProducerStockDetailIn) getSqlMapClientTemplate().queryForObject("t_origin_producer_stock_detail_in.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public int updateByExampleSelective(TOriginProducerStockDetailIn record, TOriginProducerStockDetailInExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_origin_producer_stock_detail_in.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public int updateByExample(TOriginProducerStockDetailIn record, TOriginProducerStockDetailInExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_origin_producer_stock_detail_in.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public int updateByPrimaryKeySelective(TOriginProducerStockDetailIn record) {
        int rows = getSqlMapClientTemplate().update("t_origin_producer_stock_detail_in.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    public int updateByPrimaryKey(TOriginProducerStockDetailIn record) {
        int rows = getSqlMapClientTemplate().update("t_origin_producer_stock_detail_in.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_origin_producer_stock_detail_in
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends TOriginProducerStockDetailInExample {
        private Object record;

        public UpdateByExampleParms(Object record, TOriginProducerStockDetailInExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}