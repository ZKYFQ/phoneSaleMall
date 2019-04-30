package cn.com.phone.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductidIsNull() {
            addCriterion("productid is null");
            return (Criteria) this;
        }

        public Criteria andProductidIsNotNull() {
            addCriterion("productid is not null");
            return (Criteria) this;
        }

        public Criteria andProductidEqualTo(Integer value) {
            addCriterion("productid =", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotEqualTo(Integer value) {
            addCriterion("productid <>", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThan(Integer value) {
            addCriterion("productid >", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidGreaterThanOrEqualTo(Integer value) {
            addCriterion("productid >=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThan(Integer value) {
            addCriterion("productid <", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidLessThanOrEqualTo(Integer value) {
            addCriterion("productid <=", value, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidIn(List<Integer> values) {
            addCriterion("productid in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotIn(List<Integer> values) {
            addCriterion("productid not in", values, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidBetween(Integer value1, Integer value2) {
            addCriterion("productid between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductidNotBetween(Integer value1, Integer value2) {
            addCriterion("productid not between", value1, value2, "productid");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNull() {
            addCriterion("productprice is null");
            return (Criteria) this;
        }

        public Criteria andProductpriceIsNotNull() {
            addCriterion("productprice is not null");
            return (Criteria) this;
        }

        public Criteria andProductpriceEqualTo(Double value) {
            addCriterion("productprice =", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotEqualTo(Double value) {
            addCriterion("productprice <>", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThan(Double value) {
            addCriterion("productprice >", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("productprice >=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThan(Double value) {
            addCriterion("productprice <", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceLessThanOrEqualTo(Double value) {
            addCriterion("productprice <=", value, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceIn(List<Double> values) {
            addCriterion("productprice in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotIn(List<Double> values) {
            addCriterion("productprice not in", values, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceBetween(Double value1, Double value2) {
            addCriterion("productprice between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductpriceNotBetween(Double value1, Double value2) {
            addCriterion("productprice not between", value1, value2, "productprice");
            return (Criteria) this;
        }

        public Criteria andProductaddressIsNull() {
            addCriterion("productaddress is null");
            return (Criteria) this;
        }

        public Criteria andProductaddressIsNotNull() {
            addCriterion("productaddress is not null");
            return (Criteria) this;
        }

        public Criteria andProductaddressEqualTo(String value) {
            addCriterion("productaddress =", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressNotEqualTo(String value) {
            addCriterion("productaddress <>", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressGreaterThan(String value) {
            addCriterion("productaddress >", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressGreaterThanOrEqualTo(String value) {
            addCriterion("productaddress >=", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressLessThan(String value) {
            addCriterion("productaddress <", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressLessThanOrEqualTo(String value) {
            addCriterion("productaddress <=", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressLike(String value) {
            addCriterion("productaddress like", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressNotLike(String value) {
            addCriterion("productaddress not like", value, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressIn(List<String> values) {
            addCriterion("productaddress in", values, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressNotIn(List<String> values) {
            addCriterion("productaddress not in", values, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressBetween(String value1, String value2) {
            addCriterion("productaddress between", value1, value2, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductaddressNotBetween(String value1, String value2) {
            addCriterion("productaddress not between", value1, value2, "productaddress");
            return (Criteria) this;
        }

        public Criteria andProductctiyIsNull() {
            addCriterion("productctiy is null");
            return (Criteria) this;
        }

        public Criteria andProductctiyIsNotNull() {
            addCriterion("productctiy is not null");
            return (Criteria) this;
        }

        public Criteria andProductctiyEqualTo(String value) {
            addCriterion("productctiy =", value, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyNotEqualTo(String value) {
            addCriterion("productctiy <>", value, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyGreaterThan(String value) {
            addCriterion("productctiy >", value, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyGreaterThanOrEqualTo(String value) {
            addCriterion("productctiy >=", value, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyLessThan(String value) {
            addCriterion("productctiy <", value, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyLessThanOrEqualTo(String value) {
            addCriterion("productctiy <=", value, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyLike(String value) {
            addCriterion("productctiy like", value, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyNotLike(String value) {
            addCriterion("productctiy not like", value, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyIn(List<String> values) {
            addCriterion("productctiy in", values, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyNotIn(List<String> values) {
            addCriterion("productctiy not in", values, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyBetween(String value1, String value2) {
            addCriterion("productctiy between", value1, value2, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductctiyNotBetween(String value1, String value2) {
            addCriterion("productctiy not between", value1, value2, "productctiy");
            return (Criteria) this;
        }

        public Criteria andProductmessIsNull() {
            addCriterion("productmess is null");
            return (Criteria) this;
        }

        public Criteria andProductmessIsNotNull() {
            addCriterion("productmess is not null");
            return (Criteria) this;
        }

        public Criteria andProductmessEqualTo(String value) {
            addCriterion("productmess =", value, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessNotEqualTo(String value) {
            addCriterion("productmess <>", value, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessGreaterThan(String value) {
            addCriterion("productmess >", value, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessGreaterThanOrEqualTo(String value) {
            addCriterion("productmess >=", value, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessLessThan(String value) {
            addCriterion("productmess <", value, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessLessThanOrEqualTo(String value) {
            addCriterion("productmess <=", value, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessLike(String value) {
            addCriterion("productmess like", value, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessNotLike(String value) {
            addCriterion("productmess not like", value, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessIn(List<String> values) {
            addCriterion("productmess in", values, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessNotIn(List<String> values) {
            addCriterion("productmess not in", values, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessBetween(String value1, String value2) {
            addCriterion("productmess between", value1, value2, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductmessNotBetween(String value1, String value2) {
            addCriterion("productmess not between", value1, value2, "productmess");
            return (Criteria) this;
        }

        public Criteria andProductpicIsNull() {
            addCriterion("productpic is null");
            return (Criteria) this;
        }

        public Criteria andProductpicIsNotNull() {
            addCriterion("productpic is not null");
            return (Criteria) this;
        }

        public Criteria andProductpicEqualTo(String value) {
            addCriterion("productpic =", value, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicNotEqualTo(String value) {
            addCriterion("productpic <>", value, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicGreaterThan(String value) {
            addCriterion("productpic >", value, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicGreaterThanOrEqualTo(String value) {
            addCriterion("productpic >=", value, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicLessThan(String value) {
            addCriterion("productpic <", value, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicLessThanOrEqualTo(String value) {
            addCriterion("productpic <=", value, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicLike(String value) {
            addCriterion("productpic like", value, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicNotLike(String value) {
            addCriterion("productpic not like", value, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicIn(List<String> values) {
            addCriterion("productpic in", values, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicNotIn(List<String> values) {
            addCriterion("productpic not in", values, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicBetween(String value1, String value2) {
            addCriterion("productpic between", value1, value2, "productpic");
            return (Criteria) this;
        }

        public Criteria andProductpicNotBetween(String value1, String value2) {
            addCriterion("productpic not between", value1, value2, "productpic");
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