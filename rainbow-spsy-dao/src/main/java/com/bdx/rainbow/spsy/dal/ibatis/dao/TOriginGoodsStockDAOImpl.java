package com.bdx.rainbow.spsy.dal.ibatis.dao;

import com.bdx.rainbow.spsy.dal.ibatis.model.TOriginGoodsStock;
import com.bdx.rainbow.spsy.dal.ibatis.model.TOriginGoodsStockExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class TOriginGoodsStockDAOImpl extends SqlMapClientDaoSupport implements TOriginGoodsStockDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public TOriginGoodsStockDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public int countByExample(TOriginGoodsStockExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("t_origin_goods_stock.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public int deleteByExample(TOriginGoodsStockExample example) {
        int rows = getSqlMapClientTemplate().delete("t_origin_goods_stock.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public int deleteByPrimaryKey(Integer operationId) {
        TOriginGoodsStock _key = new TOriginGoodsStock();
        _key.setOperationId(operationId);
        int rows = getSqlMapClientTemplate().delete("t_origin_goods_stock.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public Integer insert(TOriginGoodsStock record) {
        Object newKey = getSqlMapClientTemplate().insert("t_origin_goods_stock.insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public Integer insertSelective(TOriginGoodsStock record) {
        Object newKey = getSqlMapClientTemplate().insert("t_origin_goods_stock.insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    @SuppressWarnings("unchecked")
    public List<TOriginGoodsStock> selectByExample(TOriginGoodsStockExample example) {
        List<TOriginGoodsStock> list = getSqlMapClientTemplate().queryForList("t_origin_goods_stock.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public TOriginGoodsStock selectByPrimaryKey(Integer operationId) {
        TOriginGoodsStock _key = new TOriginGoodsStock();
        _key.setOperationId(operationId);
        TOriginGoodsStock record = (TOriginGoodsStock) getSqlMapClientTemplate().queryForObject("t_origin_goods_stock.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public int updateByExampleSelective(TOriginGoodsStock record, TOriginGoodsStockExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_origin_goods_stock.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public int updateByExample(TOriginGoodsStock record, TOriginGoodsStockExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("t_origin_goods_stock.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public int updateByPrimaryKeySelective(TOriginGoodsStock record) {
        int rows = getSqlMapClientTemplate().update("t_origin_goods_stock.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    public int updateByPrimaryKey(TOriginGoodsStock record) {
        int rows = getSqlMapClientTemplate().update("t_origin_goods_stock.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_origin_goods_stock
     *
     * @mbggenerated
     */
    protected static class UpdateByExampleParms extends TOriginGoodsStockExample {
        private Object record;

        public UpdateByExampleParms(Object record, TOriginGoodsStockExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}