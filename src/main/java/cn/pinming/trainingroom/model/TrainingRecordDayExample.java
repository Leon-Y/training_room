package cn.pinming.trainingroom.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainingRecordDayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrainingRecordDayExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andComeInNumIsNull() {
            addCriterion("come_in_num is null");
            return (Criteria) this;
        }

        public Criteria andComeInNumIsNotNull() {
            addCriterion("come_in_num is not null");
            return (Criteria) this;
        }

        public Criteria andComeInNumEqualTo(Integer value) {
            addCriterion("come_in_num =", value, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeInNumNotEqualTo(Integer value) {
            addCriterion("come_in_num <>", value, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeInNumGreaterThan(Integer value) {
            addCriterion("come_in_num >", value, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeInNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("come_in_num >=", value, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeInNumLessThan(Integer value) {
            addCriterion("come_in_num <", value, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeInNumLessThanOrEqualTo(Integer value) {
            addCriterion("come_in_num <=", value, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeInNumIn(List<Integer> values) {
            addCriterion("come_in_num in", values, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeInNumNotIn(List<Integer> values) {
            addCriterion("come_in_num not in", values, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeInNumBetween(Integer value1, Integer value2) {
            addCriterion("come_in_num between", value1, value2, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeInNumNotBetween(Integer value1, Integer value2) {
            addCriterion("come_in_num not between", value1, value2, "comeInNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumIsNull() {
            addCriterion("come_out_num is null");
            return (Criteria) this;
        }

        public Criteria andComeOutNumIsNotNull() {
            addCriterion("come_out_num is not null");
            return (Criteria) this;
        }

        public Criteria andComeOutNumEqualTo(Integer value) {
            addCriterion("come_out_num =", value, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumNotEqualTo(Integer value) {
            addCriterion("come_out_num <>", value, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumGreaterThan(Integer value) {
            addCriterion("come_out_num >", value, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("come_out_num >=", value, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumLessThan(Integer value) {
            addCriterion("come_out_num <", value, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumLessThanOrEqualTo(Integer value) {
            addCriterion("come_out_num <=", value, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumIn(List<Integer> values) {
            addCriterion("come_out_num in", values, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumNotIn(List<Integer> values) {
            addCriterion("come_out_num not in", values, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumBetween(Integer value1, Integer value2) {
            addCriterion("come_out_num between", value1, value2, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andComeOutNumNotBetween(Integer value1, Integer value2) {
            addCriterion("come_out_num not between", value1, value2, "comeOutNum");
            return (Criteria) this;
        }

        public Criteria andAverageTimeIsNull() {
            addCriterion("average_time is null");
            return (Criteria) this;
        }

        public Criteria andAverageTimeIsNotNull() {
            addCriterion("average_time is not null");
            return (Criteria) this;
        }

        public Criteria andAverageTimeEqualTo(String value) {
            addCriterion("average_time =", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeNotEqualTo(String value) {
            addCriterion("average_time <>", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeGreaterThan(String value) {
            addCriterion("average_time >", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeGreaterThanOrEqualTo(String value) {
            addCriterion("average_time >=", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeLessThan(String value) {
            addCriterion("average_time <", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeLessThanOrEqualTo(String value) {
            addCriterion("average_time <=", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeLike(String value) {
            addCriterion("average_time like", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeNotLike(String value) {
            addCriterion("average_time not like", value, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeIn(List<String> values) {
            addCriterion("average_time in", values, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeNotIn(List<String> values) {
            addCriterion("average_time not in", values, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeBetween(String value1, String value2) {
            addCriterion("average_time between", value1, value2, "averageTime");
            return (Criteria) this;
        }

        public Criteria andAverageTimeNotBetween(String value1, String value2) {
            addCriterion("average_time not between", value1, value2, "averageTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeIsNull() {
            addCriterion("statistical_time is null");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeIsNotNull() {
            addCriterion("statistical_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeEqualTo(Date value) {
            addCriterion("statistical_time =", value, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeNotEqualTo(Date value) {
            addCriterion("statistical_time <>", value, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeGreaterThan(Date value) {
            addCriterion("statistical_time >", value, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("statistical_time >=", value, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeLessThan(Date value) {
            addCriterion("statistical_time <", value, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeLessThanOrEqualTo(Date value) {
            addCriterion("statistical_time <=", value, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeIn(List<Date> values) {
            addCriterion("statistical_time in", values, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeNotIn(List<Date> values) {
            addCriterion("statistical_time not in", values, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeBetween(Date value1, Date value2) {
            addCriterion("statistical_time between", value1, value2, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andStatisticalTimeNotBetween(Date value1, Date value2) {
            addCriterion("statistical_time not between", value1, value2, "statisticalTime");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
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