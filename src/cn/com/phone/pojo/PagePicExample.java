package cn.com.phone.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PagePicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PagePicExample() {
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

        public Criteria andPicIdIsNull() {
            addCriterion("PIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andPicIdIsNotNull() {
            addCriterion("PIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPicIdEqualTo(Integer value) {
            addCriterion("PIC_ID =", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotEqualTo(Integer value) {
            addCriterion("PIC_ID <>", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThan(Integer value) {
            addCriterion("PIC_ID >", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PIC_ID >=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThan(Integer value) {
            addCriterion("PIC_ID <", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("PIC_ID <=", value, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdIn(List<Integer> values) {
            addCriterion("PIC_ID in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotIn(List<Integer> values) {
            addCriterion("PIC_ID not in", values, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdBetween(Integer value1, Integer value2) {
            addCriterion("PIC_ID between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PIC_ID not between", value1, value2, "picId");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNull() {
            addCriterion("PAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNotNull() {
            addCriterion("PAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPageNameEqualTo(String value) {
            addCriterion("PAGE_NAME =", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotEqualTo(String value) {
            addCriterion("PAGE_NAME <>", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThan(String value) {
            addCriterion("PAGE_NAME >", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAGE_NAME >=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThan(String value) {
            addCriterion("PAGE_NAME <", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThanOrEqualTo(String value) {
            addCriterion("PAGE_NAME <=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLike(String value) {
            addCriterion("PAGE_NAME like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotLike(String value) {
            addCriterion("PAGE_NAME not like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameIn(List<String> values) {
            addCriterion("PAGE_NAME in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotIn(List<String> values) {
            addCriterion("PAGE_NAME not in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameBetween(String value1, String value2) {
            addCriterion("PAGE_NAME between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotBetween(String value1, String value2) {
            addCriterion("PAGE_NAME not between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPicFilePathIsNull() {
            addCriterion("PIC_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andPicFilePathIsNotNull() {
            addCriterion("PIC_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPicFilePathEqualTo(String value) {
            addCriterion("PIC_FILE_PATH =", value, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathNotEqualTo(String value) {
            addCriterion("PIC_FILE_PATH <>", value, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathGreaterThan(String value) {
            addCriterion("PIC_FILE_PATH >", value, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_FILE_PATH >=", value, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathLessThan(String value) {
            addCriterion("PIC_FILE_PATH <", value, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathLessThanOrEqualTo(String value) {
            addCriterion("PIC_FILE_PATH <=", value, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathLike(String value) {
            addCriterion("PIC_FILE_PATH like", value, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathNotLike(String value) {
            addCriterion("PIC_FILE_PATH not like", value, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathIn(List<String> values) {
            addCriterion("PIC_FILE_PATH in", values, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathNotIn(List<String> values) {
            addCriterion("PIC_FILE_PATH not in", values, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathBetween(String value1, String value2) {
            addCriterion("PIC_FILE_PATH between", value1, value2, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicFilePathNotBetween(String value1, String value2) {
            addCriterion("PIC_FILE_PATH not between", value1, value2, "picFilePath");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeIsNull() {
            addCriterion("PIC_NAME_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeIsNotNull() {
            addCriterion("PIC_NAME_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeEqualTo(String value) {
            addCriterion("PIC_NAME_TYPE =", value, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeNotEqualTo(String value) {
            addCriterion("PIC_NAME_TYPE <>", value, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeGreaterThan(String value) {
            addCriterion("PIC_NAME_TYPE >", value, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PIC_NAME_TYPE >=", value, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeLessThan(String value) {
            addCriterion("PIC_NAME_TYPE <", value, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeLessThanOrEqualTo(String value) {
            addCriterion("PIC_NAME_TYPE <=", value, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeLike(String value) {
            addCriterion("PIC_NAME_TYPE like", value, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeNotLike(String value) {
            addCriterion("PIC_NAME_TYPE not like", value, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeIn(List<String> values) {
            addCriterion("PIC_NAME_TYPE in", values, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeNotIn(List<String> values) {
            addCriterion("PIC_NAME_TYPE not in", values, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeBetween(String value1, String value2) {
            addCriterion("PIC_NAME_TYPE between", value1, value2, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPicNameTypeNotBetween(String value1, String value2) {
            addCriterion("PIC_NAME_TYPE not between", value1, value2, "picNameType");
            return (Criteria) this;
        }

        public Criteria andPageLactionIsNull() {
            addCriterion("PAGE_LACTION is null");
            return (Criteria) this;
        }

        public Criteria andPageLactionIsNotNull() {
            addCriterion("PAGE_LACTION is not null");
            return (Criteria) this;
        }

        public Criteria andPageLactionEqualTo(String value) {
            addCriterion("PAGE_LACTION =", value, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionNotEqualTo(String value) {
            addCriterion("PAGE_LACTION <>", value, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionGreaterThan(String value) {
            addCriterion("PAGE_LACTION >", value, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionGreaterThanOrEqualTo(String value) {
            addCriterion("PAGE_LACTION >=", value, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionLessThan(String value) {
            addCriterion("PAGE_LACTION <", value, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionLessThanOrEqualTo(String value) {
            addCriterion("PAGE_LACTION <=", value, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionLike(String value) {
            addCriterion("PAGE_LACTION like", value, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionNotLike(String value) {
            addCriterion("PAGE_LACTION not like", value, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionIn(List<String> values) {
            addCriterion("PAGE_LACTION in", values, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionNotIn(List<String> values) {
            addCriterion("PAGE_LACTION not in", values, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionBetween(String value1, String value2) {
            addCriterion("PAGE_LACTION between", value1, value2, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andPageLactionNotBetween(String value1, String value2) {
            addCriterion("PAGE_LACTION not between", value1, value2, "pageLaction");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("DESC is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("DESC =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("DESC <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("DESC >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("DESC >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("DESC <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("DESC <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("DESC like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("DESC not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("DESC in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("DESC not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("DESC between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("DESC not between", value1, value2, "desc");
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