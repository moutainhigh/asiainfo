package com.bdx.rainbow.spsy.dal.ibatis.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TOriginIdentificationCodeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    protected Integer limitClauseStart;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    protected Integer limitClauseCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    protected String suffix = "";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public TOriginIdentificationCodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    protected TOriginIdentificationCodeExample(TOriginIdentificationCodeExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public void setLimitClauseStart(Integer limitClauseStart) {
        this.limitClauseStart = limitClauseStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public Integer getLimitClauseStart() {
        return limitClauseStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public void setLimitClauseCount(Integer limitClauseCount) {
        this.limitClauseCount = limitClauseCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public Integer getLimitClauseCount() {
        return limitClauseCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andBuildIdIsNull() {
            addCriterion("BUILD_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuildIdIsNotNull() {
            addCriterion("BUILD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuildIdEqualTo(Integer value) {
            addCriterion("BUILD_ID =", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotEqualTo(Integer value) {
            addCriterion("BUILD_ID <>", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThan(Integer value) {
            addCriterion("BUILD_ID >", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUILD_ID >=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThan(Integer value) {
            addCriterion("BUILD_ID <", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUILD_ID <=", value, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdIn(List<Integer> values) {
            addCriterion("BUILD_ID in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotIn(List<Integer> values) {
            addCriterion("BUILD_ID not in", values, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdBetween(Integer value1, Integer value2) {
            addCriterion("BUILD_ID between", value1, value2, "buildId");
            return (Criteria) this;
        }

        public Criteria andBuildIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUILD_ID not between", value1, value2, "buildId");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIsNull() {
            addCriterion("CODE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIsNotNull() {
            addCriterion("CODE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeTypeEqualTo(String value) {
            addCriterion("CODE_TYPE =", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotEqualTo(String value) {
            addCriterion("CODE_TYPE <>", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeGreaterThan(String value) {
            addCriterion("CODE_TYPE >", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_TYPE >=", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeLessThan(String value) {
            addCriterion("CODE_TYPE <", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeLessThanOrEqualTo(String value) {
            addCriterion("CODE_TYPE <=", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeLike(String value) {
            addCriterion("CODE_TYPE like", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotLike(String value) {
            addCriterion("CODE_TYPE not like", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIn(List<String> values) {
            addCriterion("CODE_TYPE in", values, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotIn(List<String> values) {
            addCriterion("CODE_TYPE not in", values, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeBetween(String value1, String value2) {
            addCriterion("CODE_TYPE between", value1, value2, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotBetween(String value1, String value2) {
            addCriterion("CODE_TYPE not between", value1, value2, "codeType");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("SKU_ID is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("SKU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(Integer value) {
            addCriterion("SKU_ID =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(Integer value) {
            addCriterion("SKU_ID <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(Integer value) {
            addCriterion("SKU_ID >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKU_ID >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(Integer value) {
            addCriterion("SKU_ID <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(Integer value) {
            addCriterion("SKU_ID <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<Integer> values) {
            addCriterion("SKU_ID in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<Integer> values) {
            addCriterion("SKU_ID not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(Integer value1, Integer value2) {
            addCriterion("SKU_ID between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SKU_ID not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNull() {
            addCriterion("SKU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSkuNameIsNotNull() {
            addCriterion("SKU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSkuNameEqualTo(String value) {
            addCriterion("SKU_NAME =", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotEqualTo(String value) {
            addCriterion("SKU_NAME <>", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThan(String value) {
            addCriterion("SKU_NAME >", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_NAME >=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThan(String value) {
            addCriterion("SKU_NAME <", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLessThanOrEqualTo(String value) {
            addCriterion("SKU_NAME <=", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameLike(String value) {
            addCriterion("SKU_NAME like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotLike(String value) {
            addCriterion("SKU_NAME not like", value, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameIn(List<String> values) {
            addCriterion("SKU_NAME in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotIn(List<String> values) {
            addCriterion("SKU_NAME not in", values, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameBetween(String value1, String value2) {
            addCriterion("SKU_NAME between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuNameNotBetween(String value1, String value2) {
            addCriterion("SKU_NAME not between", value1, value2, "skuName");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeIsNull() {
            addCriterion("SKU_BARCODE is null");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeIsNotNull() {
            addCriterion("SKU_BARCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeEqualTo(String value) {
            addCriterion("SKU_BARCODE =", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotEqualTo(String value) {
            addCriterion("SKU_BARCODE <>", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeGreaterThan(String value) {
            addCriterion("SKU_BARCODE >", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_BARCODE >=", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeLessThan(String value) {
            addCriterion("SKU_BARCODE <", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeLessThanOrEqualTo(String value) {
            addCriterion("SKU_BARCODE <=", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeLike(String value) {
            addCriterion("SKU_BARCODE like", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotLike(String value) {
            addCriterion("SKU_BARCODE not like", value, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeIn(List<String> values) {
            addCriterion("SKU_BARCODE in", values, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotIn(List<String> values) {
            addCriterion("SKU_BARCODE not in", values, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeBetween(String value1, String value2) {
            addCriterion("SKU_BARCODE between", value1, value2, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBarcodeNotBetween(String value1, String value2) {
            addCriterion("SKU_BARCODE not between", value1, value2, "skuBarcode");
            return (Criteria) this;
        }

        public Criteria andSkuBatchIsNull() {
            addCriterion("SKU_BATCH is null");
            return (Criteria) this;
        }

        public Criteria andSkuBatchIsNotNull() {
            addCriterion("SKU_BATCH is not null");
            return (Criteria) this;
        }

        public Criteria andSkuBatchEqualTo(String value) {
            addCriterion("SKU_BATCH =", value, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchNotEqualTo(String value) {
            addCriterion("SKU_BATCH <>", value, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchGreaterThan(String value) {
            addCriterion("SKU_BATCH >", value, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_BATCH >=", value, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchLessThan(String value) {
            addCriterion("SKU_BATCH <", value, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchLessThanOrEqualTo(String value) {
            addCriterion("SKU_BATCH <=", value, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchLike(String value) {
            addCriterion("SKU_BATCH like", value, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchNotLike(String value) {
            addCriterion("SKU_BATCH not like", value, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchIn(List<String> values) {
            addCriterion("SKU_BATCH in", values, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchNotIn(List<String> values) {
            addCriterion("SKU_BATCH not in", values, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchBetween(String value1, String value2) {
            addCriterion("SKU_BATCH between", value1, value2, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andSkuBatchNotBetween(String value1, String value2) {
            addCriterion("SKU_BATCH not between", value1, value2, "skuBatch");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityIsNull() {
            addCriterion("CODE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityIsNotNull() {
            addCriterion("CODE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityEqualTo(Integer value) {
            addCriterion("CODE_QUANTITY =", value, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityNotEqualTo(Integer value) {
            addCriterion("CODE_QUANTITY <>", value, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityGreaterThan(Integer value) {
            addCriterion("CODE_QUANTITY >", value, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("CODE_QUANTITY >=", value, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityLessThan(Integer value) {
            addCriterion("CODE_QUANTITY <", value, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("CODE_QUANTITY <=", value, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityIn(List<Integer> values) {
            addCriterion("CODE_QUANTITY in", values, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityNotIn(List<Integer> values) {
            addCriterion("CODE_QUANTITY not in", values, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityBetween(Integer value1, Integer value2) {
            addCriterion("CODE_QUANTITY between", value1, value2, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andCodeQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("CODE_QUANTITY not between", value1, value2, "codeQuantity");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNull() {
            addCriterion("ENTERPRISE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIsNotNull() {
            addCriterion("ENTERPRISE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdEqualTo(Integer value) {
            addCriterion("ENTERPRISE_ID =", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotEqualTo(Integer value) {
            addCriterion("ENTERPRISE_ID <>", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThan(Integer value) {
            addCriterion("ENTERPRISE_ID >", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTERPRISE_ID >=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThan(Integer value) {
            addCriterion("ENTERPRISE_ID <", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdLessThanOrEqualTo(Integer value) {
            addCriterion("ENTERPRISE_ID <=", value, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdIn(List<Integer> values) {
            addCriterion("ENTERPRISE_ID in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotIn(List<Integer> values) {
            addCriterion("ENTERPRISE_ID not in", values, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdBetween(Integer value1, Integer value2) {
            addCriterion("ENTERPRISE_ID between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTERPRISE_ID not between", value1, value2, "enterpriseId");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNull() {
            addCriterion("CREATE_STAFF is null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIsNotNull() {
            addCriterion("CREATE_STAFF is not null");
            return (Criteria) this;
        }

        public Criteria andCreateStaffEqualTo(String value) {
            addCriterion("CREATE_STAFF =", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotEqualTo(String value) {
            addCriterion("CREATE_STAFF <>", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThan(String value) {
            addCriterion("CREATE_STAFF >", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_STAFF >=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThan(String value) {
            addCriterion("CREATE_STAFF <", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLessThanOrEqualTo(String value) {
            addCriterion("CREATE_STAFF <=", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffLike(String value) {
            addCriterion("CREATE_STAFF like", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotLike(String value) {
            addCriterion("CREATE_STAFF not like", value, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffIn(List<String> values) {
            addCriterion("CREATE_STAFF in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotIn(List<String> values) {
            addCriterion("CREATE_STAFF not in", values, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffBetween(String value1, String value2) {
            addCriterion("CREATE_STAFF between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateStaffNotBetween(String value1, String value2) {
            addCriterion("CREATE_STAFF not between", value1, value2, "createStaff");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_origin_identification_code
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}