package com.kkxu.demo.common.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order_ListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Order_ListExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andTrainNoIsNull() {
            addCriterion("train_no is null");
            return (Criteria) this;
        }

        public Criteria andTrainNoIsNotNull() {
            addCriterion("train_no is not null");
            return (Criteria) this;
        }

        public Criteria andTrainNoEqualTo(String value) {
            addCriterion("train_no =", value, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoNotEqualTo(String value) {
            addCriterion("train_no <>", value, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoGreaterThan(String value) {
            addCriterion("train_no >", value, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoGreaterThanOrEqualTo(String value) {
            addCriterion("train_no >=", value, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoLessThan(String value) {
            addCriterion("train_no <", value, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoLessThanOrEqualTo(String value) {
            addCriterion("train_no <=", value, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoLike(String value) {
            addCriterion("train_no like", value, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoNotLike(String value) {
            addCriterion("train_no not like", value, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoIn(List<String> values) {
            addCriterion("train_no in", values, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoNotIn(List<String> values) {
            addCriterion("train_no not in", values, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoBetween(String value1, String value2) {
            addCriterion("train_no between", value1, value2, "trainNo");
            return (Criteria) this;
        }

        public Criteria andTrainNoNotBetween(String value1, String value2) {
            addCriterion("train_no not between", value1, value2, "trainNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoIsNull() {
            addCriterion("start_station_no is null");
            return (Criteria) this;
        }

        public Criteria andStartStationNoIsNotNull() {
            addCriterion("start_station_no is not null");
            return (Criteria) this;
        }

        public Criteria andStartStationNoEqualTo(String value) {
            addCriterion("start_station_no =", value, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoNotEqualTo(String value) {
            addCriterion("start_station_no <>", value, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoGreaterThan(String value) {
            addCriterion("start_station_no >", value, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoGreaterThanOrEqualTo(String value) {
            addCriterion("start_station_no >=", value, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoLessThan(String value) {
            addCriterion("start_station_no <", value, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoLessThanOrEqualTo(String value) {
            addCriterion("start_station_no <=", value, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoLike(String value) {
            addCriterion("start_station_no like", value, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoNotLike(String value) {
            addCriterion("start_station_no not like", value, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoIn(List<String> values) {
            addCriterion("start_station_no in", values, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoNotIn(List<String> values) {
            addCriterion("start_station_no not in", values, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoBetween(String value1, String value2) {
            addCriterion("start_station_no between", value1, value2, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNoNotBetween(String value1, String value2) {
            addCriterion("start_station_no not between", value1, value2, "startStationNo");
            return (Criteria) this;
        }

        public Criteria andStartStationNameIsNull() {
            addCriterion("start_station_name is null");
            return (Criteria) this;
        }

        public Criteria andStartStationNameIsNotNull() {
            addCriterion("start_station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStartStationNameEqualTo(String value) {
            addCriterion("start_station_name =", value, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameNotEqualTo(String value) {
            addCriterion("start_station_name <>", value, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameGreaterThan(String value) {
            addCriterion("start_station_name >", value, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("start_station_name >=", value, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameLessThan(String value) {
            addCriterion("start_station_name <", value, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameLessThanOrEqualTo(String value) {
            addCriterion("start_station_name <=", value, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameLike(String value) {
            addCriterion("start_station_name like", value, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameNotLike(String value) {
            addCriterion("start_station_name not like", value, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameIn(List<String> values) {
            addCriterion("start_station_name in", values, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameNotIn(List<String> values) {
            addCriterion("start_station_name not in", values, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameBetween(String value1, String value2) {
            addCriterion("start_station_name between", value1, value2, "startStationName");
            return (Criteria) this;
        }

        public Criteria andStartStationNameNotBetween(String value1, String value2) {
            addCriterion("start_station_name not between", value1, value2, "startStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNoIsNull() {
            addCriterion("end_station_no is null");
            return (Criteria) this;
        }

        public Criteria andEndStationNoIsNotNull() {
            addCriterion("end_station_no is not null");
            return (Criteria) this;
        }

        public Criteria andEndStationNoEqualTo(String value) {
            addCriterion("end_station_no =", value, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoNotEqualTo(String value) {
            addCriterion("end_station_no <>", value, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoGreaterThan(String value) {
            addCriterion("end_station_no >", value, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoGreaterThanOrEqualTo(String value) {
            addCriterion("end_station_no >=", value, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoLessThan(String value) {
            addCriterion("end_station_no <", value, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoLessThanOrEqualTo(String value) {
            addCriterion("end_station_no <=", value, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoLike(String value) {
            addCriterion("end_station_no like", value, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoNotLike(String value) {
            addCriterion("end_station_no not like", value, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoIn(List<String> values) {
            addCriterion("end_station_no in", values, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoNotIn(List<String> values) {
            addCriterion("end_station_no not in", values, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoBetween(String value1, String value2) {
            addCriterion("end_station_no between", value1, value2, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNoNotBetween(String value1, String value2) {
            addCriterion("end_station_no not between", value1, value2, "endStationNo");
            return (Criteria) this;
        }

        public Criteria andEndStationNameIsNull() {
            addCriterion("end_station_name is null");
            return (Criteria) this;
        }

        public Criteria andEndStationNameIsNotNull() {
            addCriterion("end_station_name is not null");
            return (Criteria) this;
        }

        public Criteria andEndStationNameEqualTo(String value) {
            addCriterion("end_station_name =", value, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameNotEqualTo(String value) {
            addCriterion("end_station_name <>", value, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameGreaterThan(String value) {
            addCriterion("end_station_name >", value, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("end_station_name >=", value, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameLessThan(String value) {
            addCriterion("end_station_name <", value, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameLessThanOrEqualTo(String value) {
            addCriterion("end_station_name <=", value, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameLike(String value) {
            addCriterion("end_station_name like", value, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameNotLike(String value) {
            addCriterion("end_station_name not like", value, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameIn(List<String> values) {
            addCriterion("end_station_name in", values, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameNotIn(List<String> values) {
            addCriterion("end_station_name not in", values, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameBetween(String value1, String value2) {
            addCriterion("end_station_name between", value1, value2, "endStationName");
            return (Criteria) this;
        }

        public Criteria andEndStationNameNotBetween(String value1, String value2) {
            addCriterion("end_station_name not between", value1, value2, "endStationName");
            return (Criteria) this;
        }

        public Criteria andCarriageNoIsNull() {
            addCriterion("carriage_no is null");
            return (Criteria) this;
        }

        public Criteria andCarriageNoIsNotNull() {
            addCriterion("carriage_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageNoEqualTo(String value) {
            addCriterion("carriage_no =", value, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoNotEqualTo(String value) {
            addCriterion("carriage_no <>", value, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoGreaterThan(String value) {
            addCriterion("carriage_no >", value, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoGreaterThanOrEqualTo(String value) {
            addCriterion("carriage_no >=", value, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoLessThan(String value) {
            addCriterion("carriage_no <", value, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoLessThanOrEqualTo(String value) {
            addCriterion("carriage_no <=", value, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoLike(String value) {
            addCriterion("carriage_no like", value, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoNotLike(String value) {
            addCriterion("carriage_no not like", value, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoIn(List<String> values) {
            addCriterion("carriage_no in", values, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoNotIn(List<String> values) {
            addCriterion("carriage_no not in", values, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoBetween(String value1, String value2) {
            addCriterion("carriage_no between", value1, value2, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andCarriageNoNotBetween(String value1, String value2) {
            addCriterion("carriage_no not between", value1, value2, "carriageNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoIsNull() {
            addCriterion("seat_no is null");
            return (Criteria) this;
        }

        public Criteria andSeatNoIsNotNull() {
            addCriterion("seat_no is not null");
            return (Criteria) this;
        }

        public Criteria andSeatNoEqualTo(String value) {
            addCriterion("seat_no =", value, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoNotEqualTo(String value) {
            addCriterion("seat_no <>", value, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoGreaterThan(String value) {
            addCriterion("seat_no >", value, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoGreaterThanOrEqualTo(String value) {
            addCriterion("seat_no >=", value, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoLessThan(String value) {
            addCriterion("seat_no <", value, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoLessThanOrEqualTo(String value) {
            addCriterion("seat_no <=", value, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoLike(String value) {
            addCriterion("seat_no like", value, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoNotLike(String value) {
            addCriterion("seat_no not like", value, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoIn(List<String> values) {
            addCriterion("seat_no in", values, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoNotIn(List<String> values) {
            addCriterion("seat_no not in", values, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoBetween(String value1, String value2) {
            addCriterion("seat_no between", value1, value2, "seatNo");
            return (Criteria) this;
        }

        public Criteria andSeatNoNotBetween(String value1, String value2) {
            addCriterion("seat_no not between", value1, value2, "seatNo");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(String value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(String value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(String value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(String value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(String value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLike(String value) {
            addCriterion("order_money like", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotLike(String value) {
            addCriterion("order_money not like", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<String> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<String> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(String value1, String value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(String value1, String value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNull() {
            addCriterion("order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIsNotNull() {
            addCriterion("order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeEqualTo(Date value) {
            addCriterion("order_create_time =", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("order_create_time <>", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThan(Date value) {
            addCriterion("order_create_time >", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_create_time >=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThan(Date value) {
            addCriterion("order_create_time <", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_create_time <=", value, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeIn(List<Date> values) {
            addCriterion("order_create_time in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("order_create_time not in", values, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("order_create_time between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_create_time not between", value1, value2, "orderCreateTime");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateIsNull() {
            addCriterion("train_start_date is null");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateIsNotNull() {
            addCriterion("train_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateEqualTo(Date value) {
            addCriterion("train_start_date =", value, "trainStartDate");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateNotEqualTo(Date value) {
            addCriterion("train_start_date <>", value, "trainStartDate");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateGreaterThan(Date value) {
            addCriterion("train_start_date >", value, "trainStartDate");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("train_start_date >=", value, "trainStartDate");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateLessThan(Date value) {
            addCriterion("train_start_date <", value, "trainStartDate");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateLessThanOrEqualTo(Date value) {
            addCriterion("train_start_date <=", value, "trainStartDate");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateIn(List<Date> values) {
            addCriterion("train_start_date in", values, "trainStartDate");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateNotIn(List<Date> values) {
            addCriterion("train_start_date not in", values, "trainStartDate");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateBetween(Date value1, Date value2) {
            addCriterion("train_start_date between", value1, value2, "trainStartDate");
            return (Criteria) this;
        }

        public Criteria andTrainStartDateNotBetween(Date value1, Date value2) {
            addCriterion("train_start_date not between", value1, value2, "trainStartDate");
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