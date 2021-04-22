package com.kkxu.demo.common.domain;

import java.util.ArrayList;
import java.util.List;

public class Schedule_Of_TrainsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Schedule_Of_TrainsExample() {
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

        public Criteria andTarinNoIsNull() {
            addCriterion("tarin_no is null");
            return (Criteria) this;
        }

        public Criteria andTarinNoIsNotNull() {
            addCriterion("tarin_no is not null");
            return (Criteria) this;
        }

        public Criteria andTarinNoEqualTo(String value) {
            addCriterion("tarin_no =", value, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoNotEqualTo(String value) {
            addCriterion("tarin_no <>", value, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoGreaterThan(String value) {
            addCriterion("tarin_no >", value, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoGreaterThanOrEqualTo(String value) {
            addCriterion("tarin_no >=", value, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoLessThan(String value) {
            addCriterion("tarin_no <", value, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoLessThanOrEqualTo(String value) {
            addCriterion("tarin_no <=", value, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoLike(String value) {
            addCriterion("tarin_no like", value, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoNotLike(String value) {
            addCriterion("tarin_no not like", value, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoIn(List<String> values) {
            addCriterion("tarin_no in", values, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoNotIn(List<String> values) {
            addCriterion("tarin_no not in", values, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoBetween(String value1, String value2) {
            addCriterion("tarin_no between", value1, value2, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTarinNoNotBetween(String value1, String value2) {
            addCriterion("tarin_no not between", value1, value2, "tarinNo");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIsNull() {
            addCriterion("train_number is null");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIsNotNull() {
            addCriterion("train_number is not null");
            return (Criteria) this;
        }

        public Criteria andTrainNumberEqualTo(String value) {
            addCriterion("train_number =", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotEqualTo(String value) {
            addCriterion("train_number <>", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberGreaterThan(String value) {
            addCriterion("train_number >", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberGreaterThanOrEqualTo(String value) {
            addCriterion("train_number >=", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberLessThan(String value) {
            addCriterion("train_number <", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberLessThanOrEqualTo(String value) {
            addCriterion("train_number <=", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberLike(String value) {
            addCriterion("train_number like", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotLike(String value) {
            addCriterion("train_number not like", value, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberIn(List<String> values) {
            addCriterion("train_number in", values, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotIn(List<String> values) {
            addCriterion("train_number not in", values, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberBetween(String value1, String value2) {
            addCriterion("train_number between", value1, value2, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andTrainNumberNotBetween(String value1, String value2) {
            addCriterion("train_number not between", value1, value2, "trainNumber");
            return (Criteria) this;
        }

        public Criteria andDepartureStationIsNull() {
            addCriterion("departure_station is null");
            return (Criteria) this;
        }

        public Criteria andDepartureStationIsNotNull() {
            addCriterion("departure_station is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureStationEqualTo(String value) {
            addCriterion("departure_station =", value, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationNotEqualTo(String value) {
            addCriterion("departure_station <>", value, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationGreaterThan(String value) {
            addCriterion("departure_station >", value, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationGreaterThanOrEqualTo(String value) {
            addCriterion("departure_station >=", value, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationLessThan(String value) {
            addCriterion("departure_station <", value, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationLessThanOrEqualTo(String value) {
            addCriterion("departure_station <=", value, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationLike(String value) {
            addCriterion("departure_station like", value, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationNotLike(String value) {
            addCriterion("departure_station not like", value, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationIn(List<String> values) {
            addCriterion("departure_station in", values, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationNotIn(List<String> values) {
            addCriterion("departure_station not in", values, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationBetween(String value1, String value2) {
            addCriterion("departure_station between", value1, value2, "departureStation");
            return (Criteria) this;
        }

        public Criteria andDepartureStationNotBetween(String value1, String value2) {
            addCriterion("departure_station not between", value1, value2, "departureStation");
            return (Criteria) this;
        }

        public Criteria andEndStationIsNull() {
            addCriterion("end_station is null");
            return (Criteria) this;
        }

        public Criteria andEndStationIsNotNull() {
            addCriterion("end_station is not null");
            return (Criteria) this;
        }

        public Criteria andEndStationEqualTo(String value) {
            addCriterion("end_station =", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotEqualTo(String value) {
            addCriterion("end_station <>", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationGreaterThan(String value) {
            addCriterion("end_station >", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationGreaterThanOrEqualTo(String value) {
            addCriterion("end_station >=", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationLessThan(String value) {
            addCriterion("end_station <", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationLessThanOrEqualTo(String value) {
            addCriterion("end_station <=", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationLike(String value) {
            addCriterion("end_station like", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotLike(String value) {
            addCriterion("end_station not like", value, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationIn(List<String> values) {
            addCriterion("end_station in", values, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotIn(List<String> values) {
            addCriterion("end_station not in", values, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationBetween(String value1, String value2) {
            addCriterion("end_station between", value1, value2, "endStation");
            return (Criteria) this;
        }

        public Criteria andEndStationNotBetween(String value1, String value2) {
            addCriterion("end_station not between", value1, value2, "endStation");
            return (Criteria) this;
        }

        public Criteria andFromStationIsNull() {
            addCriterion("from_station is null");
            return (Criteria) this;
        }

        public Criteria andFromStationIsNotNull() {
            addCriterion("from_station is not null");
            return (Criteria) this;
        }

        public Criteria andFromStationEqualTo(String value) {
            addCriterion("from_station =", value, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationNotEqualTo(String value) {
            addCriterion("from_station <>", value, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationGreaterThan(String value) {
            addCriterion("from_station >", value, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationGreaterThanOrEqualTo(String value) {
            addCriterion("from_station >=", value, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationLessThan(String value) {
            addCriterion("from_station <", value, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationLessThanOrEqualTo(String value) {
            addCriterion("from_station <=", value, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationLike(String value) {
            addCriterion("from_station like", value, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationNotLike(String value) {
            addCriterion("from_station not like", value, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationIn(List<String> values) {
            addCriterion("from_station in", values, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationNotIn(List<String> values) {
            addCriterion("from_station not in", values, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationBetween(String value1, String value2) {
            addCriterion("from_station between", value1, value2, "fromStation");
            return (Criteria) this;
        }

        public Criteria andFromStationNotBetween(String value1, String value2) {
            addCriterion("from_station not between", value1, value2, "fromStation");
            return (Criteria) this;
        }

        public Criteria andToStationIsNull() {
            addCriterion("to_station is null");
            return (Criteria) this;
        }

        public Criteria andToStationIsNotNull() {
            addCriterion("to_station is not null");
            return (Criteria) this;
        }

        public Criteria andToStationEqualTo(String value) {
            addCriterion("to_station =", value, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationNotEqualTo(String value) {
            addCriterion("to_station <>", value, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationGreaterThan(String value) {
            addCriterion("to_station >", value, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationGreaterThanOrEqualTo(String value) {
            addCriterion("to_station >=", value, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationLessThan(String value) {
            addCriterion("to_station <", value, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationLessThanOrEqualTo(String value) {
            addCriterion("to_station <=", value, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationLike(String value) {
            addCriterion("to_station like", value, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationNotLike(String value) {
            addCriterion("to_station not like", value, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationIn(List<String> values) {
            addCriterion("to_station in", values, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationNotIn(List<String> values) {
            addCriterion("to_station not in", values, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationBetween(String value1, String value2) {
            addCriterion("to_station between", value1, value2, "toStation");
            return (Criteria) this;
        }

        public Criteria andToStationNotBetween(String value1, String value2) {
            addCriterion("to_station not between", value1, value2, "toStation");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNull() {
            addCriterion("departure_time is null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIsNotNull() {
            addCriterion("departure_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeEqualTo(String value) {
            addCriterion("departure_time =", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotEqualTo(String value) {
            addCriterion("departure_time <>", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThan(String value) {
            addCriterion("departure_time >", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeGreaterThanOrEqualTo(String value) {
            addCriterion("departure_time >=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThan(String value) {
            addCriterion("departure_time <", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLessThanOrEqualTo(String value) {
            addCriterion("departure_time <=", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeLike(String value) {
            addCriterion("departure_time like", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotLike(String value) {
            addCriterion("departure_time not like", value, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeIn(List<String> values) {
            addCriterion("departure_time in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotIn(List<String> values) {
            addCriterion("departure_time not in", values, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeBetween(String value1, String value2) {
            addCriterion("departure_time between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andDepartureTimeNotBetween(String value1, String value2) {
            addCriterion("departure_time not between", value1, value2, "departureTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNull() {
            addCriterion("arrival_time is null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIsNotNull() {
            addCriterion("arrival_time is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeEqualTo(String value) {
            addCriterion("arrival_time =", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotEqualTo(String value) {
            addCriterion("arrival_time <>", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThan(String value) {
            addCriterion("arrival_time >", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_time >=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThan(String value) {
            addCriterion("arrival_time <", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLessThanOrEqualTo(String value) {
            addCriterion("arrival_time <=", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeLike(String value) {
            addCriterion("arrival_time like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotLike(String value) {
            addCriterion("arrival_time not like", value, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeIn(List<String> values) {
            addCriterion("arrival_time in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotIn(List<String> values) {
            addCriterion("arrival_time not in", values, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeBetween(String value1, String value2) {
            addCriterion("arrival_time between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andArrivalTimeNotBetween(String value1, String value2) {
            addCriterion("arrival_time not between", value1, value2, "arrivalTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNull() {
            addCriterion("use_time is null");
            return (Criteria) this;
        }

        public Criteria andUseTimeIsNotNull() {
            addCriterion("use_time is not null");
            return (Criteria) this;
        }

        public Criteria andUseTimeEqualTo(String value) {
            addCriterion("use_time =", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotEqualTo(String value) {
            addCriterion("use_time <>", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThan(String value) {
            addCriterion("use_time >", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeGreaterThanOrEqualTo(String value) {
            addCriterion("use_time >=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThan(String value) {
            addCriterion("use_time <", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLessThanOrEqualTo(String value) {
            addCriterion("use_time <=", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeLike(String value) {
            addCriterion("use_time like", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotLike(String value) {
            addCriterion("use_time not like", value, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeIn(List<String> values) {
            addCriterion("use_time in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotIn(List<String> values) {
            addCriterion("use_time not in", values, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeBetween(String value1, String value2) {
            addCriterion("use_time between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andUseTimeNotBetween(String value1, String value2) {
            addCriterion("use_time not between", value1, value2, "useTime");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatIsNull() {
            addCriterion("business_seat is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatIsNotNull() {
            addCriterion("business_seat is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatEqualTo(String value) {
            addCriterion("business_seat =", value, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatNotEqualTo(String value) {
            addCriterion("business_seat <>", value, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatGreaterThan(String value) {
            addCriterion("business_seat >", value, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatGreaterThanOrEqualTo(String value) {
            addCriterion("business_seat >=", value, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatLessThan(String value) {
            addCriterion("business_seat <", value, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatLessThanOrEqualTo(String value) {
            addCriterion("business_seat <=", value, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatLike(String value) {
            addCriterion("business_seat like", value, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatNotLike(String value) {
            addCriterion("business_seat not like", value, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatIn(List<String> values) {
            addCriterion("business_seat in", values, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatNotIn(List<String> values) {
            addCriterion("business_seat not in", values, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatBetween(String value1, String value2) {
            addCriterion("business_seat between", value1, value2, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andBusinessSeatNotBetween(String value1, String value2) {
            addCriterion("business_seat not between", value1, value2, "businessSeat");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsIsNull() {
            addCriterion("first_class_seats is null");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsIsNotNull() {
            addCriterion("first_class_seats is not null");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsEqualTo(String value) {
            addCriterion("first_class_seats =", value, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsNotEqualTo(String value) {
            addCriterion("first_class_seats <>", value, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsGreaterThan(String value) {
            addCriterion("first_class_seats >", value, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsGreaterThanOrEqualTo(String value) {
            addCriterion("first_class_seats >=", value, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsLessThan(String value) {
            addCriterion("first_class_seats <", value, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsLessThanOrEqualTo(String value) {
            addCriterion("first_class_seats <=", value, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsLike(String value) {
            addCriterion("first_class_seats like", value, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsNotLike(String value) {
            addCriterion("first_class_seats not like", value, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsIn(List<String> values) {
            addCriterion("first_class_seats in", values, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsNotIn(List<String> values) {
            addCriterion("first_class_seats not in", values, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsBetween(String value1, String value2) {
            addCriterion("first_class_seats between", value1, value2, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andFirstClassSeatsNotBetween(String value1, String value2) {
            addCriterion("first_class_seats not between", value1, value2, "firstClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsIsNull() {
            addCriterion("second_class_seats is null");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsIsNotNull() {
            addCriterion("second_class_seats is not null");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsEqualTo(String value) {
            addCriterion("second_class_seats =", value, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsNotEqualTo(String value) {
            addCriterion("second_class_seats <>", value, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsGreaterThan(String value) {
            addCriterion("second_class_seats >", value, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsGreaterThanOrEqualTo(String value) {
            addCriterion("second_class_seats >=", value, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsLessThan(String value) {
            addCriterion("second_class_seats <", value, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsLessThanOrEqualTo(String value) {
            addCriterion("second_class_seats <=", value, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsLike(String value) {
            addCriterion("second_class_seats like", value, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsNotLike(String value) {
            addCriterion("second_class_seats not like", value, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsIn(List<String> values) {
            addCriterion("second_class_seats in", values, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsNotIn(List<String> values) {
            addCriterion("second_class_seats not in", values, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsBetween(String value1, String value2) {
            addCriterion("second_class_seats between", value1, value2, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andSecondClassSeatsNotBetween(String value1, String value2) {
            addCriterion("second_class_seats not between", value1, value2, "secondClassSeats");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthIsNull() {
            addCriterion("high_grade_soft_berth is null");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthIsNotNull() {
            addCriterion("high_grade_soft_berth is not null");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthEqualTo(String value) {
            addCriterion("high_grade_soft_berth =", value, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthNotEqualTo(String value) {
            addCriterion("high_grade_soft_berth <>", value, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthGreaterThan(String value) {
            addCriterion("high_grade_soft_berth >", value, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthGreaterThanOrEqualTo(String value) {
            addCriterion("high_grade_soft_berth >=", value, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthLessThan(String value) {
            addCriterion("high_grade_soft_berth <", value, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthLessThanOrEqualTo(String value) {
            addCriterion("high_grade_soft_berth <=", value, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthLike(String value) {
            addCriterion("high_grade_soft_berth like", value, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthNotLike(String value) {
            addCriterion("high_grade_soft_berth not like", value, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthIn(List<String> values) {
            addCriterion("high_grade_soft_berth in", values, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthNotIn(List<String> values) {
            addCriterion("high_grade_soft_berth not in", values, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthBetween(String value1, String value2) {
            addCriterion("high_grade_soft_berth between", value1, value2, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andHighGradeSoftBerthNotBetween(String value1, String value2) {
            addCriterion("high_grade_soft_berth not between", value1, value2, "highGradeSoftBerth");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedIsNull() {
            addCriterion("soft_bed_first_class_bed is null");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedIsNotNull() {
            addCriterion("soft_bed_first_class_bed is not null");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedEqualTo(String value) {
            addCriterion("soft_bed_first_class_bed =", value, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedNotEqualTo(String value) {
            addCriterion("soft_bed_first_class_bed <>", value, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedGreaterThan(String value) {
            addCriterion("soft_bed_first_class_bed >", value, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedGreaterThanOrEqualTo(String value) {
            addCriterion("soft_bed_first_class_bed >=", value, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedLessThan(String value) {
            addCriterion("soft_bed_first_class_bed <", value, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedLessThanOrEqualTo(String value) {
            addCriterion("soft_bed_first_class_bed <=", value, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedLike(String value) {
            addCriterion("soft_bed_first_class_bed like", value, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedNotLike(String value) {
            addCriterion("soft_bed_first_class_bed not like", value, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedIn(List<String> values) {
            addCriterion("soft_bed_first_class_bed in", values, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedNotIn(List<String> values) {
            addCriterion("soft_bed_first_class_bed not in", values, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedBetween(String value1, String value2) {
            addCriterion("soft_bed_first_class_bed between", value1, value2, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftBedFirstClassBedNotBetween(String value1, String value2) {
            addCriterion("soft_bed_first_class_bed not between", value1, value2, "softBedFirstClassBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedIsNull() {
            addCriterion("motor_train_bed is null");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedIsNotNull() {
            addCriterion("motor_train_bed is not null");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedEqualTo(String value) {
            addCriterion("motor_train_bed =", value, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedNotEqualTo(String value) {
            addCriterion("motor_train_bed <>", value, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedGreaterThan(String value) {
            addCriterion("motor_train_bed >", value, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedGreaterThanOrEqualTo(String value) {
            addCriterion("motor_train_bed >=", value, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedLessThan(String value) {
            addCriterion("motor_train_bed <", value, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedLessThanOrEqualTo(String value) {
            addCriterion("motor_train_bed <=", value, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedLike(String value) {
            addCriterion("motor_train_bed like", value, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedNotLike(String value) {
            addCriterion("motor_train_bed not like", value, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedIn(List<String> values) {
            addCriterion("motor_train_bed in", values, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedNotIn(List<String> values) {
            addCriterion("motor_train_bed not in", values, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedBetween(String value1, String value2) {
            addCriterion("motor_train_bed between", value1, value2, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andMotorTrainBedNotBetween(String value1, String value2) {
            addCriterion("motor_train_bed not between", value1, value2, "motorTrainBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedIsNull() {
            addCriterion("hard_second_class_bed is null");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedIsNotNull() {
            addCriterion("hard_second_class_bed is not null");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedEqualTo(String value) {
            addCriterion("hard_second_class_bed =", value, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedNotEqualTo(String value) {
            addCriterion("hard_second_class_bed <>", value, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedGreaterThan(String value) {
            addCriterion("hard_second_class_bed >", value, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedGreaterThanOrEqualTo(String value) {
            addCriterion("hard_second_class_bed >=", value, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedLessThan(String value) {
            addCriterion("hard_second_class_bed <", value, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedLessThanOrEqualTo(String value) {
            addCriterion("hard_second_class_bed <=", value, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedLike(String value) {
            addCriterion("hard_second_class_bed like", value, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedNotLike(String value) {
            addCriterion("hard_second_class_bed not like", value, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedIn(List<String> values) {
            addCriterion("hard_second_class_bed in", values, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedNotIn(List<String> values) {
            addCriterion("hard_second_class_bed not in", values, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedBetween(String value1, String value2) {
            addCriterion("hard_second_class_bed between", value1, value2, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andHardSecondClassBedNotBetween(String value1, String value2) {
            addCriterion("hard_second_class_bed not between", value1, value2, "hardSecondClassBed");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsIsNull() {
            addCriterion("soft_seats is null");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsIsNotNull() {
            addCriterion("soft_seats is not null");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsEqualTo(String value) {
            addCriterion("soft_seats =", value, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsNotEqualTo(String value) {
            addCriterion("soft_seats <>", value, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsGreaterThan(String value) {
            addCriterion("soft_seats >", value, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsGreaterThanOrEqualTo(String value) {
            addCriterion("soft_seats >=", value, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsLessThan(String value) {
            addCriterion("soft_seats <", value, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsLessThanOrEqualTo(String value) {
            addCriterion("soft_seats <=", value, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsLike(String value) {
            addCriterion("soft_seats like", value, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsNotLike(String value) {
            addCriterion("soft_seats not like", value, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsIn(List<String> values) {
            addCriterion("soft_seats in", values, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsNotIn(List<String> values) {
            addCriterion("soft_seats not in", values, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsBetween(String value1, String value2) {
            addCriterion("soft_seats between", value1, value2, "softSeats");
            return (Criteria) this;
        }

        public Criteria andSoftSeatsNotBetween(String value1, String value2) {
            addCriterion("soft_seats not between", value1, value2, "softSeats");
            return (Criteria) this;
        }

        public Criteria andHardSeatIsNull() {
            addCriterion("hard_seat is null");
            return (Criteria) this;
        }

        public Criteria andHardSeatIsNotNull() {
            addCriterion("hard_seat is not null");
            return (Criteria) this;
        }

        public Criteria andHardSeatEqualTo(String value) {
            addCriterion("hard_seat =", value, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatNotEqualTo(String value) {
            addCriterion("hard_seat <>", value, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatGreaterThan(String value) {
            addCriterion("hard_seat >", value, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatGreaterThanOrEqualTo(String value) {
            addCriterion("hard_seat >=", value, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatLessThan(String value) {
            addCriterion("hard_seat <", value, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatLessThanOrEqualTo(String value) {
            addCriterion("hard_seat <=", value, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatLike(String value) {
            addCriterion("hard_seat like", value, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatNotLike(String value) {
            addCriterion("hard_seat not like", value, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatIn(List<String> values) {
            addCriterion("hard_seat in", values, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatNotIn(List<String> values) {
            addCriterion("hard_seat not in", values, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatBetween(String value1, String value2) {
            addCriterion("hard_seat between", value1, value2, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andHardSeatNotBetween(String value1, String value2) {
            addCriterion("hard_seat not between", value1, value2, "hardSeat");
            return (Criteria) this;
        }

        public Criteria andSeatlessIsNull() {
            addCriterion("seatless is null");
            return (Criteria) this;
        }

        public Criteria andSeatlessIsNotNull() {
            addCriterion("seatless is not null");
            return (Criteria) this;
        }

        public Criteria andSeatlessEqualTo(String value) {
            addCriterion("seatless =", value, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessNotEqualTo(String value) {
            addCriterion("seatless <>", value, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessGreaterThan(String value) {
            addCriterion("seatless >", value, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessGreaterThanOrEqualTo(String value) {
            addCriterion("seatless >=", value, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessLessThan(String value) {
            addCriterion("seatless <", value, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessLessThanOrEqualTo(String value) {
            addCriterion("seatless <=", value, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessLike(String value) {
            addCriterion("seatless like", value, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessNotLike(String value) {
            addCriterion("seatless not like", value, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessIn(List<String> values) {
            addCriterion("seatless in", values, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessNotIn(List<String> values) {
            addCriterion("seatless not in", values, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessBetween(String value1, String value2) {
            addCriterion("seatless between", value1, value2, "seatless");
            return (Criteria) this;
        }

        public Criteria andSeatlessNotBetween(String value1, String value2) {
            addCriterion("seatless not between", value1, value2, "seatless");
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