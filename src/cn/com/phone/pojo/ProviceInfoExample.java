package cn.com.phone.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProviceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProviceInfoExample() {
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

        public Criteria andProviceIdIsNull() {
            addCriterion("PROVICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProviceIdIsNotNull() {
            addCriterion("PROVICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProviceIdEqualTo(Integer value) {
            addCriterion("PROVICE_ID =", value, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceIdNotEqualTo(Integer value) {
            addCriterion("PROVICE_ID <>", value, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceIdGreaterThan(Integer value) {
            addCriterion("PROVICE_ID >", value, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROVICE_ID >=", value, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceIdLessThan(Integer value) {
            addCriterion("PROVICE_ID <", value, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROVICE_ID <=", value, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceIdIn(List<Integer> values) {
            addCriterion("PROVICE_ID in", values, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceIdNotIn(List<Integer> values) {
            addCriterion("PROVICE_ID not in", values, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceIdBetween(Integer value1, Integer value2) {
            addCriterion("PROVICE_ID between", value1, value2, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROVICE_ID not between", value1, value2, "proviceId");
            return (Criteria) this;
        }

        public Criteria andProviceNameIsNull() {
            addCriterion("PROVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProviceNameIsNotNull() {
            addCriterion("PROVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProviceNameEqualTo(String value) {
            addCriterion("PROVICE_NAME =", value, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameNotEqualTo(String value) {
            addCriterion("PROVICE_NAME <>", value, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameGreaterThan(String value) {
            addCriterion("PROVICE_NAME >", value, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVICE_NAME >=", value, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameLessThan(String value) {
            addCriterion("PROVICE_NAME <", value, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameLessThanOrEqualTo(String value) {
            addCriterion("PROVICE_NAME <=", value, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameLike(String value) {
            addCriterion("PROVICE_NAME like", value, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameNotLike(String value) {
            addCriterion("PROVICE_NAME not like", value, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameIn(List<String> values) {
            addCriterion("PROVICE_NAME in", values, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameNotIn(List<String> values) {
            addCriterion("PROVICE_NAME not in", values, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameBetween(String value1, String value2) {
            addCriterion("PROVICE_NAME between", value1, value2, "proviceName");
            return (Criteria) this;
        }

        public Criteria andProviceNameNotBetween(String value1, String value2) {
            addCriterion("PROVICE_NAME not between", value1, value2, "proviceName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRemarskIsNull() {
            addCriterion("REMARSK is null");
            return (Criteria) this;
        }

        public Criteria andRemarskIsNotNull() {
            addCriterion("REMARSK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarskEqualTo(String value) {
            addCriterion("REMARSK =", value, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskNotEqualTo(String value) {
            addCriterion("REMARSK <>", value, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskGreaterThan(String value) {
            addCriterion("REMARSK >", value, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskGreaterThanOrEqualTo(String value) {
            addCriterion("REMARSK >=", value, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskLessThan(String value) {
            addCriterion("REMARSK <", value, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskLessThanOrEqualTo(String value) {
            addCriterion("REMARSK <=", value, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskLike(String value) {
            addCriterion("REMARSK like", value, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskNotLike(String value) {
            addCriterion("REMARSK not like", value, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskIn(List<String> values) {
            addCriterion("REMARSK in", values, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskNotIn(List<String> values) {
            addCriterion("REMARSK not in", values, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskBetween(String value1, String value2) {
            addCriterion("REMARSK between", value1, value2, "remarsk");
            return (Criteria) this;
        }

        public Criteria andRemarskNotBetween(String value1, String value2) {
            addCriterion("REMARSK not between", value1, value2, "remarsk");
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