package com.aptech.domain;

import java.util.ArrayList;
import java.util.List;

public class ParticularsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParticularsExample() {
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

        public Criteria andParticularsidIsNull() {
            addCriterion("particularsid is null");
            return (Criteria) this;
        }

        public Criteria andParticularsidIsNotNull() {
            addCriterion("particularsid is not null");
            return (Criteria) this;
        }

        public Criteria andParticularsidEqualTo(Integer value) {
            addCriterion("particularsid =", value, "particularsid");
            return (Criteria) this;
        }

        public Criteria andParticularsidNotEqualTo(Integer value) {
            addCriterion("particularsid <>", value, "particularsid");
            return (Criteria) this;
        }

        public Criteria andParticularsidGreaterThan(Integer value) {
            addCriterion("particularsid >", value, "particularsid");
            return (Criteria) this;
        }

        public Criteria andParticularsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("particularsid >=", value, "particularsid");
            return (Criteria) this;
        }

        public Criteria andParticularsidLessThan(Integer value) {
            addCriterion("particularsid <", value, "particularsid");
            return (Criteria) this;
        }

        public Criteria andParticularsidLessThanOrEqualTo(Integer value) {
            addCriterion("particularsid <=", value, "particularsid");
            return (Criteria) this;
        }

        public Criteria andParticularsidIn(List<Integer> values) {
            addCriterion("particularsid in", values, "particularsid");
            return (Criteria) this;
        }

        public Criteria andParticularsidNotIn(List<Integer> values) {
            addCriterion("particularsid not in", values, "particularsid");
            return (Criteria) this;
        }

        public Criteria andParticularsidBetween(Integer value1, Integer value2) {
            addCriterion("particularsid between", value1, value2, "particularsid");
            return (Criteria) this;
        }

        public Criteria andParticularsidNotBetween(Integer value1, Integer value2) {
            addCriterion("particularsid not between", value1, value2, "particularsid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNull() {
            addCriterion("purchaseid is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIsNotNull() {
            addCriterion("purchaseid is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseidEqualTo(Integer value) {
            addCriterion("purchaseid =", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotEqualTo(Integer value) {
            addCriterion("purchaseid <>", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThan(Integer value) {
            addCriterion("purchaseid >", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchaseid >=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThan(Integer value) {
            addCriterion("purchaseid <", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidLessThanOrEqualTo(Integer value) {
            addCriterion("purchaseid <=", value, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidIn(List<Integer> values) {
            addCriterion("purchaseid in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotIn(List<Integer> values) {
            addCriterion("purchaseid not in", values, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidBetween(Integer value1, Integer value2) {
            addCriterion("purchaseid between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andPurchaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("purchaseid not between", value1, value2, "purchaseid");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeIsNull() {
            addCriterion("particularsbarcode is null");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeIsNotNull() {
            addCriterion("particularsbarcode is not null");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeEqualTo(String value) {
            addCriterion("particularsbarcode =", value, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeNotEqualTo(String value) {
            addCriterion("particularsbarcode <>", value, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeGreaterThan(String value) {
            addCriterion("particularsbarcode >", value, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("particularsbarcode >=", value, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeLessThan(String value) {
            addCriterion("particularsbarcode <", value, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeLessThanOrEqualTo(String value) {
            addCriterion("particularsbarcode <=", value, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeLike(String value) {
            addCriterion("particularsbarcode like", value, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeNotLike(String value) {
            addCriterion("particularsbarcode not like", value, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeIn(List<String> values) {
            addCriterion("particularsbarcode in", values, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeNotIn(List<String> values) {
            addCriterion("particularsbarcode not in", values, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeBetween(String value1, String value2) {
            addCriterion("particularsbarcode between", value1, value2, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsbarcodeNotBetween(String value1, String value2) {
            addCriterion("particularsbarcode not between", value1, value2, "particularsbarcode");
            return (Criteria) this;
        }

        public Criteria andParticularsnameIsNull() {
            addCriterion("particularsname is null");
            return (Criteria) this;
        }

        public Criteria andParticularsnameIsNotNull() {
            addCriterion("particularsname is not null");
            return (Criteria) this;
        }

        public Criteria andParticularsnameEqualTo(String value) {
            addCriterion("particularsname =", value, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameNotEqualTo(String value) {
            addCriterion("particularsname <>", value, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameGreaterThan(String value) {
            addCriterion("particularsname >", value, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameGreaterThanOrEqualTo(String value) {
            addCriterion("particularsname >=", value, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameLessThan(String value) {
            addCriterion("particularsname <", value, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameLessThanOrEqualTo(String value) {
            addCriterion("particularsname <=", value, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameLike(String value) {
            addCriterion("particularsname like", value, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameNotLike(String value) {
            addCriterion("particularsname not like", value, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameIn(List<String> values) {
            addCriterion("particularsname in", values, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameNotIn(List<String> values) {
            addCriterion("particularsname not in", values, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameBetween(String value1, String value2) {
            addCriterion("particularsname between", value1, value2, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsnameNotBetween(String value1, String value2) {
            addCriterion("particularsname not between", value1, value2, "particularsname");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationIsNull() {
            addCriterion("particularsspecification is null");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationIsNotNull() {
            addCriterion("particularsspecification is not null");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationEqualTo(String value) {
            addCriterion("particularsspecification =", value, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationNotEqualTo(String value) {
            addCriterion("particularsspecification <>", value, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationGreaterThan(String value) {
            addCriterion("particularsspecification >", value, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationGreaterThanOrEqualTo(String value) {
            addCriterion("particularsspecification >=", value, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationLessThan(String value) {
            addCriterion("particularsspecification <", value, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationLessThanOrEqualTo(String value) {
            addCriterion("particularsspecification <=", value, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationLike(String value) {
            addCriterion("particularsspecification like", value, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationNotLike(String value) {
            addCriterion("particularsspecification not like", value, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationIn(List<String> values) {
            addCriterion("particularsspecification in", values, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationNotIn(List<String> values) {
            addCriterion("particularsspecification not in", values, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationBetween(String value1, String value2) {
            addCriterion("particularsspecification between", value1, value2, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularsspecificationNotBetween(String value1, String value2) {
            addCriterion("particularsspecification not between", value1, value2, "particularsspecification");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceIsNull() {
            addCriterion("particularscostprice is null");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceIsNotNull() {
            addCriterion("particularscostprice is not null");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceEqualTo(Float value) {
            addCriterion("particularscostprice =", value, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceNotEqualTo(Float value) {
            addCriterion("particularscostprice <>", value, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceGreaterThan(Float value) {
            addCriterion("particularscostprice >", value, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceGreaterThanOrEqualTo(Float value) {
            addCriterion("particularscostprice >=", value, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceLessThan(Float value) {
            addCriterion("particularscostprice <", value, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceLessThanOrEqualTo(Float value) {
            addCriterion("particularscostprice <=", value, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceIn(List<Float> values) {
            addCriterion("particularscostprice in", values, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceNotIn(List<Float> values) {
            addCriterion("particularscostprice not in", values, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceBetween(Float value1, Float value2) {
            addCriterion("particularscostprice between", value1, value2, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularscostpriceNotBetween(Float value1, Float value2) {
            addCriterion("particularscostprice not between", value1, value2, "particularscostprice");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityIsNull() {
            addCriterion("particularsquantity is null");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityIsNotNull() {
            addCriterion("particularsquantity is not null");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityEqualTo(Integer value) {
            addCriterion("particularsquantity =", value, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityNotEqualTo(Integer value) {
            addCriterion("particularsquantity <>", value, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityGreaterThan(Integer value) {
            addCriterion("particularsquantity >", value, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("particularsquantity >=", value, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityLessThan(Integer value) {
            addCriterion("particularsquantity <", value, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityLessThanOrEqualTo(Integer value) {
            addCriterion("particularsquantity <=", value, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityIn(List<Integer> values) {
            addCriterion("particularsquantity in", values, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityNotIn(List<Integer> values) {
            addCriterion("particularsquantity not in", values, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityBetween(Integer value1, Integer value2) {
            addCriterion("particularsquantity between", value1, value2, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsquantityNotBetween(Integer value1, Integer value2) {
            addCriterion("particularsquantity not between", value1, value2, "particularsquantity");
            return (Criteria) this;
        }

        public Criteria andParticularsamountIsNull() {
            addCriterion("particularsamount is null");
            return (Criteria) this;
        }

        public Criteria andParticularsamountIsNotNull() {
            addCriterion("particularsamount is not null");
            return (Criteria) this;
        }

        public Criteria andParticularsamountEqualTo(Float value) {
            addCriterion("particularsamount =", value, "particularsamount");
            return (Criteria) this;
        }

        public Criteria andParticularsamountNotEqualTo(Float value) {
            addCriterion("particularsamount <>", value, "particularsamount");
            return (Criteria) this;
        }

        public Criteria andParticularsamountGreaterThan(Float value) {
            addCriterion("particularsamount >", value, "particularsamount");
            return (Criteria) this;
        }

        public Criteria andParticularsamountGreaterThanOrEqualTo(Float value) {
            addCriterion("particularsamount >=", value, "particularsamount");
            return (Criteria) this;
        }

        public Criteria andParticularsamountLessThan(Float value) {
            addCriterion("particularsamount <", value, "particularsamount");
            return (Criteria) this;
        }

        public Criteria andParticularsamountLessThanOrEqualTo(Float value) {
            addCriterion("particularsamount <=", value, "particularsamount");
            return (Criteria) this;
        }

        public Criteria andParticularsamountIn(List<Float> values) {
            addCriterion("particularsamount in", values, "particularsamount");
            return (Criteria) this;
        }

        public Criteria andParticularsamountNotIn(List<Float> values) {
            addCriterion("particularsamount not in", values, "particularsamount");
            return (Criteria) this;
        }

        public Criteria andParticularsamountBetween(Float value1, Float value2) {
            addCriterion("particularsamount between", value1, value2, "particularsamount");
            return (Criteria) this;
        }

        public Criteria andParticularsamountNotBetween(Float value1, Float value2) {
            addCriterion("particularsamount not between", value1, value2, "particularsamount");
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