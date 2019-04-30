package cn.com.phone.pojo;

import java.util.ArrayList;
import java.util.List;

public class SeachWordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeachWordExample() {
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

        public Criteria andSeachIdIsNull() {
            addCriterion("SEACH_ID is null");
            return (Criteria) this;
        }

        public Criteria andSeachIdIsNotNull() {
            addCriterion("SEACH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSeachIdEqualTo(Integer value) {
            addCriterion("SEACH_ID =", value, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachIdNotEqualTo(Integer value) {
            addCriterion("SEACH_ID <>", value, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachIdGreaterThan(Integer value) {
            addCriterion("SEACH_ID >", value, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEACH_ID >=", value, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachIdLessThan(Integer value) {
            addCriterion("SEACH_ID <", value, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachIdLessThanOrEqualTo(Integer value) {
            addCriterion("SEACH_ID <=", value, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachIdIn(List<Integer> values) {
            addCriterion("SEACH_ID in", values, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachIdNotIn(List<Integer> values) {
            addCriterion("SEACH_ID not in", values, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachIdBetween(Integer value1, Integer value2) {
            addCriterion("SEACH_ID between", value1, value2, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SEACH_ID not between", value1, value2, "seachId");
            return (Criteria) this;
        }

        public Criteria andSeachWordIsNull() {
            addCriterion("SEACH_WORD is null");
            return (Criteria) this;
        }

        public Criteria andSeachWordIsNotNull() {
            addCriterion("SEACH_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andSeachWordEqualTo(String value) {
            addCriterion("SEACH_WORD =", value, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordNotEqualTo(String value) {
            addCriterion("SEACH_WORD <>", value, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordGreaterThan(String value) {
            addCriterion("SEACH_WORD >", value, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordGreaterThanOrEqualTo(String value) {
            addCriterion("SEACH_WORD >=", value, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordLessThan(String value) {
            addCriterion("SEACH_WORD <", value, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordLessThanOrEqualTo(String value) {
            addCriterion("SEACH_WORD <=", value, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordLike(String value) {
            addCriterion("SEACH_WORD like", value, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordNotLike(String value) {
            addCriterion("SEACH_WORD not like", value, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordIn(List<String> values) {
            addCriterion("SEACH_WORD in", values, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordNotIn(List<String> values) {
            addCriterion("SEACH_WORD not in", values, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordBetween(String value1, String value2) {
            addCriterion("SEACH_WORD between", value1, value2, "seachWord");
            return (Criteria) this;
        }

        public Criteria andSeachWordNotBetween(String value1, String value2) {
            addCriterion("SEACH_WORD not between", value1, value2, "seachWord");
            return (Criteria) this;
        }

        public Criteria andBrankFlagIsNull() {
            addCriterion("BRANK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBrankFlagIsNotNull() {
            addCriterion("BRANK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBrankFlagEqualTo(String value) {
            addCriterion("BRANK_FLAG =", value, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagNotEqualTo(String value) {
            addCriterion("BRANK_FLAG <>", value, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagGreaterThan(String value) {
            addCriterion("BRANK_FLAG >", value, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagGreaterThanOrEqualTo(String value) {
            addCriterion("BRANK_FLAG >=", value, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagLessThan(String value) {
            addCriterion("BRANK_FLAG <", value, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagLessThanOrEqualTo(String value) {
            addCriterion("BRANK_FLAG <=", value, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagLike(String value) {
            addCriterion("BRANK_FLAG like", value, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagNotLike(String value) {
            addCriterion("BRANK_FLAG not like", value, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagIn(List<String> values) {
            addCriterion("BRANK_FLAG in", values, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagNotIn(List<String> values) {
            addCriterion("BRANK_FLAG not in", values, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagBetween(String value1, String value2) {
            addCriterion("BRANK_FLAG between", value1, value2, "brankFlag");
            return (Criteria) this;
        }

        public Criteria andBrankFlagNotBetween(String value1, String value2) {
            addCriterion("BRANK_FLAG not between", value1, value2, "brankFlag");
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