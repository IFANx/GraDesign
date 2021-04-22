package com.kkxu.demo.common.domain;

import java.util.ArrayList;
import java.util.List;

public class Train_InfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Train_InfoExample() {
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

        public Criteria andTrainTypeIsNull() {
            addCriterion("train_type is null");
            return (Criteria) this;
        }

        public Criteria andTrainTypeIsNotNull() {
            addCriterion("train_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrainTypeEqualTo(String value) {
            addCriterion("train_type =", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotEqualTo(String value) {
            addCriterion("train_type <>", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeGreaterThan(String value) {
            addCriterion("train_type >", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("train_type >=", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeLessThan(String value) {
            addCriterion("train_type <", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeLessThanOrEqualTo(String value) {
            addCriterion("train_type <=", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeLike(String value) {
            addCriterion("train_type like", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotLike(String value) {
            addCriterion("train_type not like", value, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeIn(List<String> values) {
            addCriterion("train_type in", values, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotIn(List<String> values) {
            addCriterion("train_type not in", values, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeBetween(String value1, String value2) {
            addCriterion("train_type between", value1, value2, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainTypeNotBetween(String value1, String value2) {
            addCriterion("train_type not between", value1, value2, "trainType");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesIsNull() {
            addCriterion("train_carriages is null");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesIsNotNull() {
            addCriterion("train_carriages is not null");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesEqualTo(Integer value) {
            addCriterion("train_carriages =", value, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesNotEqualTo(Integer value) {
            addCriterion("train_carriages <>", value, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesGreaterThan(Integer value) {
            addCriterion("train_carriages >", value, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesGreaterThanOrEqualTo(Integer value) {
            addCriterion("train_carriages >=", value, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesLessThan(Integer value) {
            addCriterion("train_carriages <", value, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesLessThanOrEqualTo(Integer value) {
            addCriterion("train_carriages <=", value, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesIn(List<Integer> values) {
            addCriterion("train_carriages in", values, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesNotIn(List<Integer> values) {
            addCriterion("train_carriages not in", values, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesBetween(Integer value1, Integer value2) {
            addCriterion("train_carriages between", value1, value2, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainCarriagesNotBetween(Integer value1, Integer value2) {
            addCriterion("train_carriages not between", value1, value2, "trainCarriages");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationIsNull() {
            addCriterion("train_start_station is null");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationIsNotNull() {
            addCriterion("train_start_station is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationEqualTo(String value) {
            addCriterion("train_start_station =", value, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationNotEqualTo(String value) {
            addCriterion("train_start_station <>", value, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationGreaterThan(String value) {
            addCriterion("train_start_station >", value, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationGreaterThanOrEqualTo(String value) {
            addCriterion("train_start_station >=", value, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationLessThan(String value) {
            addCriterion("train_start_station <", value, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationLessThanOrEqualTo(String value) {
            addCriterion("train_start_station <=", value, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationLike(String value) {
            addCriterion("train_start_station like", value, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationNotLike(String value) {
            addCriterion("train_start_station not like", value, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationIn(List<String> values) {
            addCriterion("train_start_station in", values, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationNotIn(List<String> values) {
            addCriterion("train_start_station not in", values, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationBetween(String value1, String value2) {
            addCriterion("train_start_station between", value1, value2, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartStationNotBetween(String value1, String value2) {
            addCriterion("train_start_station not between", value1, value2, "trainStartStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationIsNull() {
            addCriterion("train_end_station is null");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationIsNotNull() {
            addCriterion("train_end_station is not null");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationEqualTo(String value) {
            addCriterion("train_end_station =", value, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationNotEqualTo(String value) {
            addCriterion("train_end_station <>", value, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationGreaterThan(String value) {
            addCriterion("train_end_station >", value, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationGreaterThanOrEqualTo(String value) {
            addCriterion("train_end_station >=", value, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationLessThan(String value) {
            addCriterion("train_end_station <", value, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationLessThanOrEqualTo(String value) {
            addCriterion("train_end_station <=", value, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationLike(String value) {
            addCriterion("train_end_station like", value, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationNotLike(String value) {
            addCriterion("train_end_station not like", value, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationIn(List<String> values) {
            addCriterion("train_end_station in", values, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationNotIn(List<String> values) {
            addCriterion("train_end_station not in", values, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationBetween(String value1, String value2) {
            addCriterion("train_end_station between", value1, value2, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainEndStationNotBetween(String value1, String value2) {
            addCriterion("train_end_station not between", value1, value2, "trainEndStation");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeIsNull() {
            addCriterion("train_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeIsNotNull() {
            addCriterion("train_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeEqualTo(String value) {
            addCriterion("train_start_time =", value, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeNotEqualTo(String value) {
            addCriterion("train_start_time <>", value, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeGreaterThan(String value) {
            addCriterion("train_start_time >", value, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("train_start_time >=", value, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeLessThan(String value) {
            addCriterion("train_start_time <", value, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeLessThanOrEqualTo(String value) {
            addCriterion("train_start_time <=", value, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeLike(String value) {
            addCriterion("train_start_time like", value, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeNotLike(String value) {
            addCriterion("train_start_time not like", value, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeIn(List<String> values) {
            addCriterion("train_start_time in", values, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeNotIn(List<String> values) {
            addCriterion("train_start_time not in", values, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeBetween(String value1, String value2) {
            addCriterion("train_start_time between", value1, value2, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainStartTimeNotBetween(String value1, String value2) {
            addCriterion("train_start_time not between", value1, value2, "trainStartTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeIsNull() {
            addCriterion("train_end_time is null");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeIsNotNull() {
            addCriterion("train_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeEqualTo(String value) {
            addCriterion("train_end_time =", value, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeNotEqualTo(String value) {
            addCriterion("train_end_time <>", value, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeGreaterThan(String value) {
            addCriterion("train_end_time >", value, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("train_end_time >=", value, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeLessThan(String value) {
            addCriterion("train_end_time <", value, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeLessThanOrEqualTo(String value) {
            addCriterion("train_end_time <=", value, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeLike(String value) {
            addCriterion("train_end_time like", value, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeNotLike(String value) {
            addCriterion("train_end_time not like", value, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeIn(List<String> values) {
            addCriterion("train_end_time in", values, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeNotIn(List<String> values) {
            addCriterion("train_end_time not in", values, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeBetween(String value1, String value2) {
            addCriterion("train_end_time between", value1, value2, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainEndTimeNotBetween(String value1, String value2) {
            addCriterion("train_end_time not between", value1, value2, "trainEndTime");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayIsNull() {
            addCriterion("train_arrive_day is null");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayIsNotNull() {
            addCriterion("train_arrive_day is not null");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayEqualTo(String value) {
            addCriterion("train_arrive_day =", value, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayNotEqualTo(String value) {
            addCriterion("train_arrive_day <>", value, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayGreaterThan(String value) {
            addCriterion("train_arrive_day >", value, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayGreaterThanOrEqualTo(String value) {
            addCriterion("train_arrive_day >=", value, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayLessThan(String value) {
            addCriterion("train_arrive_day <", value, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayLessThanOrEqualTo(String value) {
            addCriterion("train_arrive_day <=", value, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayLike(String value) {
            addCriterion("train_arrive_day like", value, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayNotLike(String value) {
            addCriterion("train_arrive_day not like", value, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayIn(List<String> values) {
            addCriterion("train_arrive_day in", values, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayNotIn(List<String> values) {
            addCriterion("train_arrive_day not in", values, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayBetween(String value1, String value2) {
            addCriterion("train_arrive_day between", value1, value2, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainArriveDayNotBetween(String value1, String value2) {
            addCriterion("train_arrive_day not between", value1, value2, "trainArriveDay");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeIsNull() {
            addCriterion("train_runing_time is null");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeIsNotNull() {
            addCriterion("train_runing_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeEqualTo(String value) {
            addCriterion("train_runing_time =", value, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeNotEqualTo(String value) {
            addCriterion("train_runing_time <>", value, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeGreaterThan(String value) {
            addCriterion("train_runing_time >", value, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeGreaterThanOrEqualTo(String value) {
            addCriterion("train_runing_time >=", value, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeLessThan(String value) {
            addCriterion("train_runing_time <", value, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeLessThanOrEqualTo(String value) {
            addCriterion("train_runing_time <=", value, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeLike(String value) {
            addCriterion("train_runing_time like", value, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeNotLike(String value) {
            addCriterion("train_runing_time not like", value, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeIn(List<String> values) {
            addCriterion("train_runing_time in", values, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeNotIn(List<String> values) {
            addCriterion("train_runing_time not in", values, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeBetween(String value1, String value2) {
            addCriterion("train_runing_time between", value1, value2, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRuningTimeNotBetween(String value1, String value2) {
            addCriterion("train_runing_time not between", value1, value2, "trainRuningTime");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeIsNull() {
            addCriterion("train_run_type is null");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeIsNotNull() {
            addCriterion("train_run_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeEqualTo(String value) {
            addCriterion("train_run_type =", value, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeNotEqualTo(String value) {
            addCriterion("train_run_type <>", value, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeGreaterThan(String value) {
            addCriterion("train_run_type >", value, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeGreaterThanOrEqualTo(String value) {
            addCriterion("train_run_type >=", value, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeLessThan(String value) {
            addCriterion("train_run_type <", value, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeLessThanOrEqualTo(String value) {
            addCriterion("train_run_type <=", value, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeLike(String value) {
            addCriterion("train_run_type like", value, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeNotLike(String value) {
            addCriterion("train_run_type not like", value, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeIn(List<String> values) {
            addCriterion("train_run_type in", values, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeNotIn(List<String> values) {
            addCriterion("train_run_type not in", values, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeBetween(String value1, String value2) {
            addCriterion("train_run_type between", value1, value2, "trainRunType");
            return (Criteria) this;
        }

        public Criteria andTrainRunTypeNotBetween(String value1, String value2) {
            addCriterion("train_run_type not between", value1, value2, "trainRunType");
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