package com.aptech.domain;

import java.util.ArrayList;
import java.util.List;

public class VipinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VipinfoExample() {
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

        public Criteria andVipidIsNull() {
            addCriterion("vipid is null");
            return (Criteria) this;
        }

        public Criteria andVipidIsNotNull() {
            addCriterion("vipid is not null");
            return (Criteria) this;
        }

        public Criteria andVipidEqualTo(String value) {
            addCriterion("vipid =", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotEqualTo(String value) {
            addCriterion("vipid <>", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThan(String value) {
            addCriterion("vipid >", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidGreaterThanOrEqualTo(String value) {
            addCriterion("vipid >=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThan(String value) {
            addCriterion("vipid <", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLessThanOrEqualTo(String value) {
            addCriterion("vipid <=", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidLike(String value) {
            addCriterion("vipid like", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotLike(String value) {
            addCriterion("vipid not like", value, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidIn(List<String> values) {
            addCriterion("vipid in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotIn(List<String> values) {
            addCriterion("vipid not in", values, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidBetween(String value1, String value2) {
            addCriterion("vipid between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipidNotBetween(String value1, String value2) {
            addCriterion("vipid not between", value1, value2, "vipid");
            return (Criteria) this;
        }

        public Criteria andVipnameIsNull() {
            addCriterion("vipname is null");
            return (Criteria) this;
        }

        public Criteria andVipnameIsNotNull() {
            addCriterion("vipname is not null");
            return (Criteria) this;
        }

        public Criteria andVipnameEqualTo(String value) {
            addCriterion("vipname =", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotEqualTo(String value) {
            addCriterion("vipname <>", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThan(String value) {
            addCriterion("vipname >", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameGreaterThanOrEqualTo(String value) {
            addCriterion("vipname >=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThan(String value) {
            addCriterion("vipname <", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLessThanOrEqualTo(String value) {
            addCriterion("vipname <=", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameLike(String value) {
            addCriterion("vipname like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotLike(String value) {
            addCriterion("vipname not like", value, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameIn(List<String> values) {
            addCriterion("vipname in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotIn(List<String> values) {
            addCriterion("vipname not in", values, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameBetween(String value1, String value2) {
            addCriterion("vipname between", value1, value2, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipnameNotBetween(String value1, String value2) {
            addCriterion("vipname not between", value1, value2, "vipname");
            return (Criteria) this;
        }

        public Criteria andVipsexIsNull() {
            addCriterion("vipSex is null");
            return (Criteria) this;
        }

        public Criteria andVipsexIsNotNull() {
            addCriterion("vipSex is not null");
            return (Criteria) this;
        }

        public Criteria andVipsexEqualTo(String value) {
            addCriterion("vipSex =", value, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexNotEqualTo(String value) {
            addCriterion("vipSex <>", value, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexGreaterThan(String value) {
            addCriterion("vipSex >", value, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexGreaterThanOrEqualTo(String value) {
            addCriterion("vipSex >=", value, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexLessThan(String value) {
            addCriterion("vipSex <", value, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexLessThanOrEqualTo(String value) {
            addCriterion("vipSex <=", value, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexLike(String value) {
            addCriterion("vipSex like", value, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexNotLike(String value) {
            addCriterion("vipSex not like", value, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexIn(List<String> values) {
            addCriterion("vipSex in", values, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexNotIn(List<String> values) {
            addCriterion("vipSex not in", values, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexBetween(String value1, String value2) {
            addCriterion("vipSex between", value1, value2, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipsexNotBetween(String value1, String value2) {
            addCriterion("vipSex not between", value1, value2, "vipsex");
            return (Criteria) this;
        }

        public Criteria andVipstateIsNull() {
            addCriterion("vipstate is null");
            return (Criteria) this;
        }

        public Criteria andVipstateIsNotNull() {
            addCriterion("vipstate is not null");
            return (Criteria) this;
        }

        public Criteria andVipstateEqualTo(Integer value) {
            addCriterion("vipstate =", value, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipstateNotEqualTo(Integer value) {
            addCriterion("vipstate <>", value, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipstateGreaterThan(Integer value) {
            addCriterion("vipstate >", value, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("vipstate >=", value, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipstateLessThan(Integer value) {
            addCriterion("vipstate <", value, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipstateLessThanOrEqualTo(Integer value) {
            addCriterion("vipstate <=", value, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipstateIn(List<Integer> values) {
            addCriterion("vipstate in", values, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipstateNotIn(List<Integer> values) {
            addCriterion("vipstate not in", values, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipstateBetween(Integer value1, Integer value2) {
            addCriterion("vipstate between", value1, value2, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipstateNotBetween(Integer value1, Integer value2) {
            addCriterion("vipstate not between", value1, value2, "vipstate");
            return (Criteria) this;
        }

        public Criteria andVipphoneIsNull() {
            addCriterion("vipphone is null");
            return (Criteria) this;
        }

        public Criteria andVipphoneIsNotNull() {
            addCriterion("vipphone is not null");
            return (Criteria) this;
        }

        public Criteria andVipphoneEqualTo(String value) {
            addCriterion("vipphone =", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotEqualTo(String value) {
            addCriterion("vipphone <>", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneGreaterThan(String value) {
            addCriterion("vipphone >", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneGreaterThanOrEqualTo(String value) {
            addCriterion("vipphone >=", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLessThan(String value) {
            addCriterion("vipphone <", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLessThanOrEqualTo(String value) {
            addCriterion("vipphone <=", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneLike(String value) {
            addCriterion("vipphone like", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotLike(String value) {
            addCriterion("vipphone not like", value, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneIn(List<String> values) {
            addCriterion("vipphone in", values, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotIn(List<String> values) {
            addCriterion("vipphone not in", values, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneBetween(String value1, String value2) {
            addCriterion("vipphone between", value1, value2, "vipphone");
            return (Criteria) this;
        }

        public Criteria andVipphoneNotBetween(String value1, String value2) {
            addCriterion("vipphone not between", value1, value2, "vipphone");
            return (Criteria) this;
        }

        public Criteria andViplevelIsNull() {
            addCriterion("viplevel is null");
            return (Criteria) this;
        }

        public Criteria andViplevelIsNotNull() {
            addCriterion("viplevel is not null");
            return (Criteria) this;
        }

        public Criteria andViplevelEqualTo(Integer value) {
            addCriterion("viplevel =", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotEqualTo(Integer value) {
            addCriterion("viplevel <>", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelGreaterThan(Integer value) {
            addCriterion("viplevel >", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("viplevel >=", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLessThan(Integer value) {
            addCriterion("viplevel <", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelLessThanOrEqualTo(Integer value) {
            addCriterion("viplevel <=", value, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelIn(List<Integer> values) {
            addCriterion("viplevel in", values, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotIn(List<Integer> values) {
            addCriterion("viplevel not in", values, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelBetween(Integer value1, Integer value2) {
            addCriterion("viplevel between", value1, value2, "viplevel");
            return (Criteria) this;
        }

        public Criteria andViplevelNotBetween(Integer value1, Integer value2) {
            addCriterion("viplevel not between", value1, value2, "viplevel");
            return (Criteria) this;
        }

        public Criteria andVippwdIsNull() {
            addCriterion("vippwd is null");
            return (Criteria) this;
        }

        public Criteria andVippwdIsNotNull() {
            addCriterion("vippwd is not null");
            return (Criteria) this;
        }

        public Criteria andVippwdEqualTo(String value) {
            addCriterion("vippwd =", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdNotEqualTo(String value) {
            addCriterion("vippwd <>", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdGreaterThan(String value) {
            addCriterion("vippwd >", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdGreaterThanOrEqualTo(String value) {
            addCriterion("vippwd >=", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdLessThan(String value) {
            addCriterion("vippwd <", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdLessThanOrEqualTo(String value) {
            addCriterion("vippwd <=", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdLike(String value) {
            addCriterion("vippwd like", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdNotLike(String value) {
            addCriterion("vippwd not like", value, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdIn(List<String> values) {
            addCriterion("vippwd in", values, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdNotIn(List<String> values) {
            addCriterion("vippwd not in", values, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdBetween(String value1, String value2) {
            addCriterion("vippwd between", value1, value2, "vippwd");
            return (Criteria) this;
        }

        public Criteria andVippwdNotBetween(String value1, String value2) {
            addCriterion("vippwd not between", value1, value2, "vippwd");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
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