package com.kkxu.demo.common.domain;

import java.util.ArrayList;
import java.util.List;

public class PassengerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PassengerExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andPassengerPhoneNumberIsNull() {
            addCriterion("passenger_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberIsNotNull() {
            addCriterion("passenger_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberEqualTo(String value) {
            addCriterion("passenger_phone_number =", value, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberNotEqualTo(String value) {
            addCriterion("passenger_phone_number <>", value, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberGreaterThan(String value) {
            addCriterion("passenger_phone_number >", value, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_phone_number >=", value, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberLessThan(String value) {
            addCriterion("passenger_phone_number <", value, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("passenger_phone_number <=", value, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberLike(String value) {
            addCriterion("passenger_phone_number like", value, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberNotLike(String value) {
            addCriterion("passenger_phone_number not like", value, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberIn(List<String> values) {
            addCriterion("passenger_phone_number in", values, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberNotIn(List<String> values) {
            addCriterion("passenger_phone_number not in", values, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberBetween(String value1, String value2) {
            addCriterion("passenger_phone_number between", value1, value2, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("passenger_phone_number not between", value1, value2, "passengerPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberIsNull() {
            addCriterion("user_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberIsNotNull() {
            addCriterion("user_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberEqualTo(String value) {
            addCriterion("user_phone_number =", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotEqualTo(String value) {
            addCriterion("user_phone_number <>", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberGreaterThan(String value) {
            addCriterion("user_phone_number >", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone_number >=", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberLessThan(String value) {
            addCriterion("user_phone_number <", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("user_phone_number <=", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberLike(String value) {
            addCriterion("user_phone_number like", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotLike(String value) {
            addCriterion("user_phone_number not like", value, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberIn(List<String> values) {
            addCriterion("user_phone_number in", values, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotIn(List<String> values) {
            addCriterion("user_phone_number not in", values, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberBetween(String value1, String value2) {
            addCriterion("user_phone_number between", value1, value2, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("user_phone_number not between", value1, value2, "userPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameIsNull() {
            addCriterion("passenger_real_name is null");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameIsNotNull() {
            addCriterion("passenger_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameEqualTo(String value) {
            addCriterion("passenger_real_name =", value, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameNotEqualTo(String value) {
            addCriterion("passenger_real_name <>", value, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameGreaterThan(String value) {
            addCriterion("passenger_real_name >", value, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_real_name >=", value, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameLessThan(String value) {
            addCriterion("passenger_real_name <", value, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameLessThanOrEqualTo(String value) {
            addCriterion("passenger_real_name <=", value, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameLike(String value) {
            addCriterion("passenger_real_name like", value, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameNotLike(String value) {
            addCriterion("passenger_real_name not like", value, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameIn(List<String> values) {
            addCriterion("passenger_real_name in", values, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameNotIn(List<String> values) {
            addCriterion("passenger_real_name not in", values, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameBetween(String value1, String value2) {
            addCriterion("passenger_real_name between", value1, value2, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerRealNameNotBetween(String value1, String value2) {
            addCriterion("passenger_real_name not between", value1, value2, "passengerRealName");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberIsNull() {
            addCriterion("passenger_id_number is null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberIsNotNull() {
            addCriterion("passenger_id_number is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberEqualTo(String value) {
            addCriterion("passenger_id_number =", value, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberNotEqualTo(String value) {
            addCriterion("passenger_id_number <>", value, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberGreaterThan(String value) {
            addCriterion("passenger_id_number >", value, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_id_number >=", value, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberLessThan(String value) {
            addCriterion("passenger_id_number <", value, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberLessThanOrEqualTo(String value) {
            addCriterion("passenger_id_number <=", value, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberLike(String value) {
            addCriterion("passenger_id_number like", value, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberNotLike(String value) {
            addCriterion("passenger_id_number not like", value, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberIn(List<String> values) {
            addCriterion("passenger_id_number in", values, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberNotIn(List<String> values) {
            addCriterion("passenger_id_number not in", values, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberBetween(String value1, String value2) {
            addCriterion("passenger_id_number between", value1, value2, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerIdNumberNotBetween(String value1, String value2) {
            addCriterion("passenger_id_number not between", value1, value2, "passengerIdNumber");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeIsNull() {
            addCriterion("passenger_type is null");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeIsNotNull() {
            addCriterion("passenger_type is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeEqualTo(Integer value) {
            addCriterion("passenger_type =", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeNotEqualTo(Integer value) {
            addCriterion("passenger_type <>", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeGreaterThan(Integer value) {
            addCriterion("passenger_type >", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("passenger_type >=", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeLessThan(Integer value) {
            addCriterion("passenger_type <", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeLessThanOrEqualTo(Integer value) {
            addCriterion("passenger_type <=", value, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeIn(List<Integer> values) {
            addCriterion("passenger_type in", values, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeNotIn(List<Integer> values) {
            addCriterion("passenger_type not in", values, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeBetween(Integer value1, Integer value2) {
            addCriterion("passenger_type between", value1, value2, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("passenger_type not between", value1, value2, "passengerType");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressIsNull() {
            addCriterion("passenger_address is null");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressIsNotNull() {
            addCriterion("passenger_address is not null");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressEqualTo(String value) {
            addCriterion("passenger_address =", value, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressNotEqualTo(String value) {
            addCriterion("passenger_address <>", value, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressGreaterThan(String value) {
            addCriterion("passenger_address >", value, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("passenger_address >=", value, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressLessThan(String value) {
            addCriterion("passenger_address <", value, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressLessThanOrEqualTo(String value) {
            addCriterion("passenger_address <=", value, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressLike(String value) {
            addCriterion("passenger_address like", value, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressNotLike(String value) {
            addCriterion("passenger_address not like", value, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressIn(List<String> values) {
            addCriterion("passenger_address in", values, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressNotIn(List<String> values) {
            addCriterion("passenger_address not in", values, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressBetween(String value1, String value2) {
            addCriterion("passenger_address between", value1, value2, "passengerAddress");
            return (Criteria) this;
        }

        public Criteria andPassengerAddressNotBetween(String value1, String value2) {
            addCriterion("passenger_address not between", value1, value2, "passengerAddress");
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