package com.bdx.rainbow.entity.urs;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class SysUserExtHisExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    protected String suffix = "";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    protected int limitClauseStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    protected int limitClauseCount = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public SysUserExtHisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
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
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setLimitClauseStart(int limitClauseStart) {
        this.limitClauseStart=limitClauseStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public int getLimitClauseStart() {
        return limitClauseStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public void setLimitClauseCount(int limitClauseCount) {
        this.limitClauseCount=limitClauseCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public int getLimitClauseCount() {
        return limitClauseCount;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andBussin6IsNull() {
            addCriterion("BUSSIN6 is null");
            return (Criteria) this;
        }

        public Criteria andBussin6IsNotNull() {
            addCriterion("BUSSIN6 is not null");
            return (Criteria) this;
        }

        public Criteria andBussin6EqualTo(Integer value) {
            addCriterion("BUSSIN6 =", value, "bussin6");
            return (Criteria) this;
        }

        public Criteria andBussin6NotEqualTo(Integer value) {
            addCriterion("BUSSIN6 <>", value, "bussin6");
            return (Criteria) this;
        }

        public Criteria andBussin6GreaterThan(Integer value) {
            addCriterion("BUSSIN6 >", value, "bussin6");
            return (Criteria) this;
        }

        public Criteria andBussin6GreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSSIN6 >=", value, "bussin6");
            return (Criteria) this;
        }

        public Criteria andBussin6LessThan(Integer value) {
            addCriterion("BUSSIN6 <", value, "bussin6");
            return (Criteria) this;
        }

        public Criteria andBussin6LessThanOrEqualTo(Integer value) {
            addCriterion("BUSSIN6 <=", value, "bussin6");
            return (Criteria) this;
        }

        public Criteria andBussin6In(List<Integer> values) {
            addCriterion("BUSSIN6 in", values, "bussin6");
            return (Criteria) this;
        }

        public Criteria andBussin6NotIn(List<Integer> values) {
            addCriterion("BUSSIN6 not in", values, "bussin6");
            return (Criteria) this;
        }

        public Criteria andBussin6Between(Integer value1, Integer value2) {
            addCriterion("BUSSIN6 between", value1, value2, "bussin6");
            return (Criteria) this;
        }

        public Criteria andBussin6NotBetween(Integer value1, Integer value2) {
            addCriterion("BUSSIN6 not between", value1, value2, "bussin6");
            return (Criteria) this;
        }

        public Criteria andExtKeyIsNull() {
            addCriterion("EXT_KEY is null");
            return (Criteria) this;
        }

        public Criteria andExtKeyIsNotNull() {
            addCriterion("EXT_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andExtKeyEqualTo(String value) {
            addCriterion("EXT_KEY =", value, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyNotEqualTo(String value) {
            addCriterion("EXT_KEY <>", value, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyGreaterThan(String value) {
            addCriterion("EXT_KEY >", value, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_KEY >=", value, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyLessThan(String value) {
            addCriterion("EXT_KEY <", value, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyLessThanOrEqualTo(String value) {
            addCriterion("EXT_KEY <=", value, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyLike(String value) {
            addCriterion("EXT_KEY like", value, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyNotLike(String value) {
            addCriterion("EXT_KEY not like", value, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyIn(List<String> values) {
            addCriterion("EXT_KEY in", values, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyNotIn(List<String> values) {
            addCriterion("EXT_KEY not in", values, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyBetween(String value1, String value2) {
            addCriterion("EXT_KEY between", value1, value2, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtKeyNotBetween(String value1, String value2) {
            addCriterion("EXT_KEY not between", value1, value2, "extKey");
            return (Criteria) this;
        }

        public Criteria andExtValueIsNull() {
            addCriterion("EXT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andExtValueIsNotNull() {
            addCriterion("EXT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andExtValueEqualTo(String value) {
            addCriterion("EXT_VALUE =", value, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueNotEqualTo(String value) {
            addCriterion("EXT_VALUE <>", value, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueGreaterThan(String value) {
            addCriterion("EXT_VALUE >", value, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_VALUE >=", value, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueLessThan(String value) {
            addCriterion("EXT_VALUE <", value, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueLessThanOrEqualTo(String value) {
            addCriterion("EXT_VALUE <=", value, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueLike(String value) {
            addCriterion("EXT_VALUE like", value, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueNotLike(String value) {
            addCriterion("EXT_VALUE not like", value, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueIn(List<String> values) {
            addCriterion("EXT_VALUE in", values, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueNotIn(List<String> values) {
            addCriterion("EXT_VALUE not in", values, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueBetween(String value1, String value2) {
            addCriterion("EXT_VALUE between", value1, value2, "extValue");
            return (Criteria) this;
        }

        public Criteria andExtValueNotBetween(String value1, String value2) {
            addCriterion("EXT_VALUE not between", value1, value2, "extValue");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBussinTimeIsNull() {
            addCriterion("BUSSIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBussinTimeIsNotNull() {
            addCriterion("BUSSIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBussinTimeEqualTo(Timestamp value) {
            addCriterion("BUSSIN_TIME =", value, "bussinTime");
            return (Criteria) this;
        }

        public Criteria andBussinTimeNotEqualTo(Timestamp value) {
            addCriterion("BUSSIN_TIME <>", value, "bussinTime");
            return (Criteria) this;
        }

        public Criteria andBussinTimeGreaterThan(Timestamp value) {
            addCriterion("BUSSIN_TIME >", value, "bussinTime");
            return (Criteria) this;
        }

        public Criteria andBussinTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("BUSSIN_TIME >=", value, "bussinTime");
            return (Criteria) this;
        }

        public Criteria andBussinTimeLessThan(Timestamp value) {
            addCriterion("BUSSIN_TIME <", value, "bussinTime");
            return (Criteria) this;
        }

        public Criteria andBussinTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("BUSSIN_TIME <=", value, "bussinTime");
            return (Criteria) this;
        }

        public Criteria andBussinTimeIn(List<Timestamp> values) {
            addCriterion("BUSSIN_TIME in", values, "bussinTime");
            return (Criteria) this;
        }

        public Criteria andBussinTimeNotIn(List<Timestamp> values) {
            addCriterion("BUSSIN_TIME not in", values, "bussinTime");
            return (Criteria) this;
        }

        public Criteria andBussinTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BUSSIN_TIME between", value1, value2, "bussinTime");
            return (Criteria) this;
        }

        public Criteria andBussinTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("BUSSIN_TIME not between", value1, value2, "bussinTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated do_not_delete_during_merge Tue Jan 19 22:26:20 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_sys_user_ext_his
     *
     * @mbggenerated Tue Jan 19 22:26:20 CST 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}