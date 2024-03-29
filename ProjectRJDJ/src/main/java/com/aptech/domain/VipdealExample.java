package com.aptech.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VipdealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipdealExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberIsNull() {
            addCriterion("vip_order_number is null");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberIsNotNull() {
            addCriterion("vip_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberEqualTo(String value) {
            addCriterion("vip_order_number =", value, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberNotEqualTo(String value) {
            addCriterion("vip_order_number <>", value, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberGreaterThan(String value) {
            addCriterion("vip_order_number >", value, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("vip_order_number >=", value, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberLessThan(String value) {
            addCriterion("vip_order_number <", value, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("vip_order_number <=", value, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberLike(String value) {
            addCriterion("vip_order_number like", value, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberNotLike(String value) {
            addCriterion("vip_order_number not like", value, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberIn(List<String> values) {
            addCriterion("vip_order_number in", values, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberNotIn(List<String> values) {
            addCriterion("vip_order_number not in", values, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberBetween(String value1, String value2) {
            addCriterion("vip_order_number between", value1, value2, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andVipOrderNumberNotBetween(String value1, String value2) {
            addCriterion("vip_order_number not between", value1, value2, "vipOrderNumber");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andModePaymentIsNull() {
            addCriterion("mode_payment is null");
            return (Criteria) this;
        }

        public Criteria andModePaymentIsNotNull() {
            addCriterion("mode_payment is not null");
            return (Criteria) this;
        }

        public Criteria andModePaymentEqualTo(String value) {
            addCriterion("mode_payment =", value, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentNotEqualTo(String value) {
            addCriterion("mode_payment <>", value, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentGreaterThan(String value) {
            addCriterion("mode_payment >", value, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentGreaterThanOrEqualTo(String value) {
            addCriterion("mode_payment >=", value, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentLessThan(String value) {
            addCriterion("mode_payment <", value, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentLessThanOrEqualTo(String value) {
            addCriterion("mode_payment <=", value, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentLike(String value) {
            addCriterion("mode_payment like", value, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentNotLike(String value) {
            addCriterion("mode_payment not like", value, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentIn(List<String> values) {
            addCriterion("mode_payment in", values, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentNotIn(List<String> values) {
            addCriterion("mode_payment not in", values, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentBetween(String value1, String value2) {
            addCriterion("mode_payment between", value1, value2, "modePayment");
            return (Criteria) this;
        }

        public Criteria andModePaymentNotBetween(String value1, String value2) {
            addCriterion("mode_payment not between", value1, value2, "modePayment");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNull() {
            addCriterion("dealtime is null");
            return (Criteria) this;
        }

        public Criteria andDealtimeIsNotNull() {
            addCriterion("dealtime is not null");
            return (Criteria) this;
        }

        public Criteria andDealtimeEqualTo(Date value) {
            addCriterion("dealtime =", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotEqualTo(Date value) {
            addCriterion("dealtime <>", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThan(Date value) {
            addCriterion("dealtime >", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dealtime >=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThan(Date value) {
            addCriterion("dealtime <", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeLessThanOrEqualTo(Date value) {
            addCriterion("dealtime <=", value, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeIn(List<Date> values) {
            addCriterion("dealtime in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotIn(List<Date> values) {
            addCriterion("dealtime not in", values, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeBetween(Date value1, Date value2) {
            addCriterion("dealtime between", value1, value2, "dealtime");
            return (Criteria) this;
        }

        public Criteria andDealtimeNotBetween(Date value1, Date value2) {
            addCriterion("dealtime not between", value1, value2, "dealtime");
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