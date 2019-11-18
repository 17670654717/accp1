package com.aptech.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodstypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodstypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andGoodstypeidIsNull() {
            addCriterion("GoodsTypeid is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIsNotNull() {
            addCriterion("GoodsTypeid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidEqualTo(Integer value) {
            addCriterion("GoodsTypeid =", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotEqualTo(Integer value) {
            addCriterion("GoodsTypeid <>", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThan(Integer value) {
            addCriterion("GoodsTypeid >", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsTypeid >=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThan(Integer value) {
            addCriterion("GoodsTypeid <", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsTypeid <=", value, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidIn(List<Integer> values) {
            addCriterion("GoodsTypeid in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotIn(List<Integer> values) {
            addCriterion("GoodsTypeid not in", values, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidBetween(Integer value1, Integer value2) {
            addCriterion("GoodsTypeid between", value1, value2, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsTypeid not between", value1, value2, "goodstypeid");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameIsNull() {
            addCriterion("GoodsTypename is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameIsNotNull() {
            addCriterion("GoodsTypename is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameEqualTo(String value) {
            addCriterion("GoodsTypename =", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameNotEqualTo(String value) {
            addCriterion("GoodsTypename <>", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameGreaterThan(String value) {
            addCriterion("GoodsTypename >", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameGreaterThanOrEqualTo(String value) {
            addCriterion("GoodsTypename >=", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameLessThan(String value) {
            addCriterion("GoodsTypename <", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameLessThanOrEqualTo(String value) {
            addCriterion("GoodsTypename <=", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameLike(String value) {
            addCriterion("GoodsTypename like", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameNotLike(String value) {
            addCriterion("GoodsTypename not like", value, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameIn(List<String> values) {
            addCriterion("GoodsTypename in", values, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameNotIn(List<String> values) {
            addCriterion("GoodsTypename not in", values, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameBetween(String value1, String value2) {
            addCriterion("GoodsTypename between", value1, value2, "goodstypename");
            return (Criteria) this;
        }

        public Criteria andGoodstypenameNotBetween(String value1, String value2) {
            addCriterion("GoodsTypename not between", value1, value2, "goodstypename");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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