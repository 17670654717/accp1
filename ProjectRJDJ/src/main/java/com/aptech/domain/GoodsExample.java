package com.aptech.domain;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGoodsidIsNull() {
            addCriterion("Goodsid is null");
            return (Criteria) this;
        }

        public Criteria andGoodsidIsNotNull() {
            addCriterion("Goodsid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsidEqualTo(Integer value) {
            addCriterion("Goodsid =", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotEqualTo(Integer value) {
            addCriterion("Goodsid <>", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThan(Integer value) {
            addCriterion("Goodsid >", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goodsid >=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThan(Integer value) {
            addCriterion("Goodsid <", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidLessThanOrEqualTo(Integer value) {
            addCriterion("Goodsid <=", value, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidIn(List<Integer> values) {
            addCriterion("Goodsid in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotIn(List<Integer> values) {
            addCriterion("Goodsid not in", values, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidBetween(Integer value1, Integer value2) {
            addCriterion("Goodsid between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsidNotBetween(Integer value1, Integer value2) {
            addCriterion("Goodsid not between", value1, value2, "goodsid");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("Goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("Goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("Goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("Goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("Goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("Goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("Goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("Goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("Goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("Goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("Goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("Goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("Goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("Goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNull() {
            addCriterion("barcode is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIsNotNull() {
            addCriterion("barcode is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeEqualTo(String value) {
            addCriterion("barcode =", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotEqualTo(String value) {
            addCriterion("barcode <>", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThan(String value) {
            addCriterion("barcode >", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeGreaterThanOrEqualTo(String value) {
            addCriterion("barcode >=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThan(String value) {
            addCriterion("barcode <", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLessThanOrEqualTo(String value) {
            addCriterion("barcode <=", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeLike(String value) {
            addCriterion("barcode like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotLike(String value) {
            addCriterion("barcode not like", value, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeIn(List<String> values) {
            addCriterion("barcode in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotIn(List<String> values) {
            addCriterion("barcode not in", values, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeBetween(String value1, String value2) {
            addCriterion("barcode between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andBarcodeNotBetween(String value1, String value2) {
            addCriterion("barcode not between", value1, value2, "barcode");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
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

        public Criteria andSalesPriceIsNull() {
            addCriterion("sales_price is null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIsNotNull() {
            addCriterion("sales_price is not null");
            return (Criteria) this;
        }

        public Criteria andSalesPriceEqualTo(Float value) {
            addCriterion("sales_price =", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotEqualTo(Float value) {
            addCriterion("sales_price <>", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThan(Float value) {
            addCriterion("sales_price >", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("sales_price >=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThan(Float value) {
            addCriterion("sales_price <", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceLessThanOrEqualTo(Float value) {
            addCriterion("sales_price <=", value, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceIn(List<Float> values) {
            addCriterion("sales_price in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotIn(List<Float> values) {
            addCriterion("sales_price not in", values, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceBetween(Float value1, Float value2) {
            addCriterion("sales_price between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andSalesPriceNotBetween(Float value1, Float value2) {
            addCriterion("sales_price not between", value1, value2, "salesPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(Float value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(Float value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(Float value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(Float value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(Float value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<Float> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<Float> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(Float value1, Float value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(Float value1, Float value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreIsNull() {
            addCriterion("online_store is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreIsNotNull() {
            addCriterion("online_store is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreEqualTo(String value) {
            addCriterion("online_store =", value, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreNotEqualTo(String value) {
            addCriterion("online_store <>", value, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreGreaterThan(String value) {
            addCriterion("online_store >", value, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreGreaterThanOrEqualTo(String value) {
            addCriterion("online_store >=", value, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreLessThan(String value) {
            addCriterion("online_store <", value, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreLessThanOrEqualTo(String value) {
            addCriterion("online_store <=", value, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreLike(String value) {
            addCriterion("online_store like", value, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreNotLike(String value) {
            addCriterion("online_store not like", value, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreIn(List<String> values) {
            addCriterion("online_store in", values, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreNotIn(List<String> values) {
            addCriterion("online_store not in", values, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreBetween(String value1, String value2) {
            addCriterion("online_store between", value1, value2, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andOnlineStoreNotBetween(String value1, String value2) {
            addCriterion("online_store not between", value1, value2, "onlineStore");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridIsNull() {
            addCriterion("Goodscolorid is null");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridIsNotNull() {
            addCriterion("Goodscolorid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridEqualTo(Integer value) {
            addCriterion("Goodscolorid =", value, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridNotEqualTo(Integer value) {
            addCriterion("Goodscolorid <>", value, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridGreaterThan(Integer value) {
            addCriterion("Goodscolorid >", value, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goodscolorid >=", value, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridLessThan(Integer value) {
            addCriterion("Goodscolorid <", value, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridLessThanOrEqualTo(Integer value) {
            addCriterion("Goodscolorid <=", value, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridIn(List<Integer> values) {
            addCriterion("Goodscolorid in", values, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridNotIn(List<Integer> values) {
            addCriterion("Goodscolorid not in", values, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridBetween(Integer value1, Integer value2) {
            addCriterion("Goodscolorid between", value1, value2, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodscoloridNotBetween(Integer value1, Integer value2) {
            addCriterion("Goodscolorid not between", value1, value2, "goodscolorid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidIsNull() {
            addCriterion("Goodssizeid is null");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidIsNotNull() {
            addCriterion("Goodssizeid is not null");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidEqualTo(Integer value) {
            addCriterion("Goodssizeid =", value, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidNotEqualTo(Integer value) {
            addCriterion("Goodssizeid <>", value, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidGreaterThan(Integer value) {
            addCriterion("Goodssizeid >", value, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goodssizeid >=", value, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidLessThan(Integer value) {
            addCriterion("Goodssizeid <", value, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidLessThanOrEqualTo(Integer value) {
            addCriterion("Goodssizeid <=", value, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidIn(List<Integer> values) {
            addCriterion("Goodssizeid in", values, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidNotIn(List<Integer> values) {
            addCriterion("Goodssizeid not in", values, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidBetween(Integer value1, Integer value2) {
            addCriterion("Goodssizeid between", value1, value2, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodssizeidNotBetween(Integer value1, Integer value2) {
            addCriterion("Goodssizeid not between", value1, value2, "goodssizeid");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageIsNull() {
            addCriterion("Goodsmessage is null");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageIsNotNull() {
            addCriterion("Goodsmessage is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageEqualTo(String value) {
            addCriterion("Goodsmessage =", value, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageNotEqualTo(String value) {
            addCriterion("Goodsmessage <>", value, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageGreaterThan(String value) {
            addCriterion("Goodsmessage >", value, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageGreaterThanOrEqualTo(String value) {
            addCriterion("Goodsmessage >=", value, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageLessThan(String value) {
            addCriterion("Goodsmessage <", value, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageLessThanOrEqualTo(String value) {
            addCriterion("Goodsmessage <=", value, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageLike(String value) {
            addCriterion("Goodsmessage like", value, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageNotLike(String value) {
            addCriterion("Goodsmessage not like", value, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageIn(List<String> values) {
            addCriterion("Goodsmessage in", values, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageNotIn(List<String> values) {
            addCriterion("Goodsmessage not in", values, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageBetween(String value1, String value2) {
            addCriterion("Goodsmessage between", value1, value2, "goodsmessage");
            return (Criteria) this;
        }

        public Criteria andGoodsmessageNotBetween(String value1, String value2) {
            addCriterion("Goodsmessage not between", value1, value2, "goodsmessage");
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