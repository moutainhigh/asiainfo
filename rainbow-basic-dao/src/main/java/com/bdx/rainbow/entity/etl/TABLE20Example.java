package com.bdx.rainbow.entity.etl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TABLE20Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    protected String suffix = "";

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    protected int limitClauseStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    protected int limitClauseCount = -1;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public TABLE20Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
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
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public void setLimitClauseStart(int limitClauseStart) {
        this.limitClauseStart=limitClauseStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public int getLimitClauseStart() {
        return limitClauseStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public void setLimitClauseCount(int limitClauseCount) {
        this.limitClauseCount=limitClauseCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
     */
    public int getLimitClauseCount() {
        return limitClauseCount;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNull() {
            addCriterion("CONTENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContentIdIsNotNull() {
            addCriterion("CONTENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContentIdEqualTo(Long value) {
            addCriterion("CONTENT_ID =", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotEqualTo(Long value) {
            addCriterion("CONTENT_ID <>", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThan(Long value) {
            addCriterion("CONTENT_ID >", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTENT_ID >=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThan(Long value) {
            addCriterion("CONTENT_ID <", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdLessThanOrEqualTo(Long value) {
            addCriterion("CONTENT_ID <=", value, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdIn(List<Long> values) {
            addCriterion("CONTENT_ID in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotIn(List<Long> values) {
            addCriterion("CONTENT_ID not in", values, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdBetween(Long value1, Long value2) {
            addCriterion("CONTENT_ID between", value1, value2, "contentId");
            return (Criteria) this;
        }

        public Criteria andContentIdNotBetween(Long value1, Long value2) {
            addCriterion("CONTENT_ID not between", value1, value2, "contentId");
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

        public Criteria andCreateEmpCodeIsNull() {
            addCriterion("CREATE_EMP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeIsNotNull() {
            addCriterion("CREATE_EMP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeEqualTo(String value) {
            addCriterion("CREATE_EMP_CODE =", value, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeNotEqualTo(String value) {
            addCriterion("CREATE_EMP_CODE <>", value, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeGreaterThan(String value) {
            addCriterion("CREATE_EMP_CODE >", value, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_EMP_CODE >=", value, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeLessThan(String value) {
            addCriterion("CREATE_EMP_CODE <", value, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_EMP_CODE <=", value, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeLike(String value) {
            addCriterion("CREATE_EMP_CODE like", value, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeNotLike(String value) {
            addCriterion("CREATE_EMP_CODE not like", value, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeIn(List<String> values) {
            addCriterion("CREATE_EMP_CODE in", values, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeNotIn(List<String> values) {
            addCriterion("CREATE_EMP_CODE not in", values, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeBetween(String value1, String value2) {
            addCriterion("CREATE_EMP_CODE between", value1, value2, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andCreateEmpCodeNotBetween(String value1, String value2) {
            addCriterion("CREATE_EMP_CODE not between", value1, value2, "createEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeIsNull() {
            addCriterion("UPDATE_EMP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeIsNotNull() {
            addCriterion("UPDATE_EMP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeEqualTo(String value) {
            addCriterion("UPDATE_EMP_CODE =", value, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeNotEqualTo(String value) {
            addCriterion("UPDATE_EMP_CODE <>", value, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeGreaterThan(String value) {
            addCriterion("UPDATE_EMP_CODE >", value, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_EMP_CODE >=", value, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeLessThan(String value) {
            addCriterion("UPDATE_EMP_CODE <", value, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_EMP_CODE <=", value, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeLike(String value) {
            addCriterion("UPDATE_EMP_CODE like", value, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeNotLike(String value) {
            addCriterion("UPDATE_EMP_CODE not like", value, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeIn(List<String> values) {
            addCriterion("UPDATE_EMP_CODE in", values, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeNotIn(List<String> values) {
            addCriterion("UPDATE_EMP_CODE not in", values, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeBetween(String value1, String value2) {
            addCriterion("UPDATE_EMP_CODE between", value1, value2, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andUpdateEmpCodeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_EMP_CODE not between", value1, value2, "updateEmpCode");
            return (Criteria) this;
        }

        public Criteria andTd1IsNull() {
            addCriterion("TD1 is null");
            return (Criteria) this;
        }

        public Criteria andTd1IsNotNull() {
            addCriterion("TD1 is not null");
            return (Criteria) this;
        }

        public Criteria andTd1EqualTo(String value) {
            addCriterion("TD1 =", value, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1NotEqualTo(String value) {
            addCriterion("TD1 <>", value, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1GreaterThan(String value) {
            addCriterion("TD1 >", value, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1GreaterThanOrEqualTo(String value) {
            addCriterion("TD1 >=", value, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1LessThan(String value) {
            addCriterion("TD1 <", value, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1LessThanOrEqualTo(String value) {
            addCriterion("TD1 <=", value, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1Like(String value) {
            addCriterion("TD1 like", value, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1NotLike(String value) {
            addCriterion("TD1 not like", value, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1In(List<String> values) {
            addCriterion("TD1 in", values, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1NotIn(List<String> values) {
            addCriterion("TD1 not in", values, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1Between(String value1, String value2) {
            addCriterion("TD1 between", value1, value2, "td1");
            return (Criteria) this;
        }

        public Criteria andTd1NotBetween(String value1, String value2) {
            addCriterion("TD1 not between", value1, value2, "td1");
            return (Criteria) this;
        }

        public Criteria andTd2IsNull() {
            addCriterion("TD2 is null");
            return (Criteria) this;
        }

        public Criteria andTd2IsNotNull() {
            addCriterion("TD2 is not null");
            return (Criteria) this;
        }

        public Criteria andTd2EqualTo(String value) {
            addCriterion("TD2 =", value, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2NotEqualTo(String value) {
            addCriterion("TD2 <>", value, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2GreaterThan(String value) {
            addCriterion("TD2 >", value, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2GreaterThanOrEqualTo(String value) {
            addCriterion("TD2 >=", value, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2LessThan(String value) {
            addCriterion("TD2 <", value, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2LessThanOrEqualTo(String value) {
            addCriterion("TD2 <=", value, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2Like(String value) {
            addCriterion("TD2 like", value, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2NotLike(String value) {
            addCriterion("TD2 not like", value, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2In(List<String> values) {
            addCriterion("TD2 in", values, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2NotIn(List<String> values) {
            addCriterion("TD2 not in", values, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2Between(String value1, String value2) {
            addCriterion("TD2 between", value1, value2, "td2");
            return (Criteria) this;
        }

        public Criteria andTd2NotBetween(String value1, String value2) {
            addCriterion("TD2 not between", value1, value2, "td2");
            return (Criteria) this;
        }

        public Criteria andTd3IsNull() {
            addCriterion("TD3 is null");
            return (Criteria) this;
        }

        public Criteria andTd3IsNotNull() {
            addCriterion("TD3 is not null");
            return (Criteria) this;
        }

        public Criteria andTd3EqualTo(String value) {
            addCriterion("TD3 =", value, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3NotEqualTo(String value) {
            addCriterion("TD3 <>", value, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3GreaterThan(String value) {
            addCriterion("TD3 >", value, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3GreaterThanOrEqualTo(String value) {
            addCriterion("TD3 >=", value, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3LessThan(String value) {
            addCriterion("TD3 <", value, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3LessThanOrEqualTo(String value) {
            addCriterion("TD3 <=", value, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3Like(String value) {
            addCriterion("TD3 like", value, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3NotLike(String value) {
            addCriterion("TD3 not like", value, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3In(List<String> values) {
            addCriterion("TD3 in", values, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3NotIn(List<String> values) {
            addCriterion("TD3 not in", values, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3Between(String value1, String value2) {
            addCriterion("TD3 between", value1, value2, "td3");
            return (Criteria) this;
        }

        public Criteria andTd3NotBetween(String value1, String value2) {
            addCriterion("TD3 not between", value1, value2, "td3");
            return (Criteria) this;
        }

        public Criteria andTd4IsNull() {
            addCriterion("TD4 is null");
            return (Criteria) this;
        }

        public Criteria andTd4IsNotNull() {
            addCriterion("TD4 is not null");
            return (Criteria) this;
        }

        public Criteria andTd4EqualTo(String value) {
            addCriterion("TD4 =", value, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4NotEqualTo(String value) {
            addCriterion("TD4 <>", value, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4GreaterThan(String value) {
            addCriterion("TD4 >", value, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4GreaterThanOrEqualTo(String value) {
            addCriterion("TD4 >=", value, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4LessThan(String value) {
            addCriterion("TD4 <", value, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4LessThanOrEqualTo(String value) {
            addCriterion("TD4 <=", value, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4Like(String value) {
            addCriterion("TD4 like", value, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4NotLike(String value) {
            addCriterion("TD4 not like", value, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4In(List<String> values) {
            addCriterion("TD4 in", values, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4NotIn(List<String> values) {
            addCriterion("TD4 not in", values, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4Between(String value1, String value2) {
            addCriterion("TD4 between", value1, value2, "td4");
            return (Criteria) this;
        }

        public Criteria andTd4NotBetween(String value1, String value2) {
            addCriterion("TD4 not between", value1, value2, "td4");
            return (Criteria) this;
        }

        public Criteria andTd5IsNull() {
            addCriterion("TD5 is null");
            return (Criteria) this;
        }

        public Criteria andTd5IsNotNull() {
            addCriterion("TD5 is not null");
            return (Criteria) this;
        }

        public Criteria andTd5EqualTo(String value) {
            addCriterion("TD5 =", value, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5NotEqualTo(String value) {
            addCriterion("TD5 <>", value, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5GreaterThan(String value) {
            addCriterion("TD5 >", value, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5GreaterThanOrEqualTo(String value) {
            addCriterion("TD5 >=", value, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5LessThan(String value) {
            addCriterion("TD5 <", value, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5LessThanOrEqualTo(String value) {
            addCriterion("TD5 <=", value, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5Like(String value) {
            addCriterion("TD5 like", value, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5NotLike(String value) {
            addCriterion("TD5 not like", value, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5In(List<String> values) {
            addCriterion("TD5 in", values, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5NotIn(List<String> values) {
            addCriterion("TD5 not in", values, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5Between(String value1, String value2) {
            addCriterion("TD5 between", value1, value2, "td5");
            return (Criteria) this;
        }

        public Criteria andTd5NotBetween(String value1, String value2) {
            addCriterion("TD5 not between", value1, value2, "td5");
            return (Criteria) this;
        }

        public Criteria andTd6IsNull() {
            addCriterion("TD6 is null");
            return (Criteria) this;
        }

        public Criteria andTd6IsNotNull() {
            addCriterion("TD6 is not null");
            return (Criteria) this;
        }

        public Criteria andTd6EqualTo(String value) {
            addCriterion("TD6 =", value, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6NotEqualTo(String value) {
            addCriterion("TD6 <>", value, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6GreaterThan(String value) {
            addCriterion("TD6 >", value, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6GreaterThanOrEqualTo(String value) {
            addCriterion("TD6 >=", value, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6LessThan(String value) {
            addCriterion("TD6 <", value, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6LessThanOrEqualTo(String value) {
            addCriterion("TD6 <=", value, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6Like(String value) {
            addCriterion("TD6 like", value, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6NotLike(String value) {
            addCriterion("TD6 not like", value, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6In(List<String> values) {
            addCriterion("TD6 in", values, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6NotIn(List<String> values) {
            addCriterion("TD6 not in", values, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6Between(String value1, String value2) {
            addCriterion("TD6 between", value1, value2, "td6");
            return (Criteria) this;
        }

        public Criteria andTd6NotBetween(String value1, String value2) {
            addCriterion("TD6 not between", value1, value2, "td6");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table table20
     *
     * @mbggenerated do_not_delete_during_merge Fri Aug 21 15:51:17 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table table20
     *
     * @mbggenerated Fri Aug 21 15:51:17 CST 2015
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