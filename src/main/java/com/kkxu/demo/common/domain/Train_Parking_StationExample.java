package com.kkxu.demo.common.domain;

import java.util.ArrayList;
import java.util.List;

public class Train_Parking_StationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Train_Parking_StationExample() {
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

        public Criteria andStationNoIsNull() {
            addCriterion("station_no is null");
            return (Criteria) this;
        }

        public Criteria andStationNoIsNotNull() {
            addCriterion("station_no is not null");
            return (Criteria) this;
        }

        public Criteria andStationNoEqualTo(String value) {
            addCriterion("station_no =", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotEqualTo(String value) {
            addCriterion("station_no <>", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThan(String value) {
            addCriterion("station_no >", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoGreaterThanOrEqualTo(String value) {
            addCriterion("station_no >=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThan(String value) {
            addCriterion("station_no <", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLessThanOrEqualTo(String value) {
            addCriterion("station_no <=", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoLike(String value) {
            addCriterion("station_no like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotLike(String value) {
            addCriterion("station_no not like", value, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoIn(List<String> values) {
            addCriterion("station_no in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotIn(List<String> values) {
            addCriterion("station_no not in", values, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoBetween(String value1, String value2) {
            addCriterion("station_no between", value1, value2, "stationNo");
            return (Criteria) this;
        }

        public Criteria andStationNoNotBetween(String value1, String value2) {
            addCriterion("station_no not between", value1, value2, "stationNo");
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

        public Criteria andArriveDayStrIsNull() {
            addCriterion("arrive_day_str is null");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrIsNotNull() {
            addCriterion("arrive_day_str is not null");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrEqualTo(String value) {
            addCriterion("arrive_day_str =", value, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrNotEqualTo(String value) {
            addCriterion("arrive_day_str <>", value, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrGreaterThan(String value) {
            addCriterion("arrive_day_str >", value, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_day_str >=", value, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrLessThan(String value) {
            addCriterion("arrive_day_str <", value, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrLessThanOrEqualTo(String value) {
            addCriterion("arrive_day_str <=", value, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrLike(String value) {
            addCriterion("arrive_day_str like", value, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrNotLike(String value) {
            addCriterion("arrive_day_str not like", value, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrIn(List<String> values) {
            addCriterion("arrive_day_str in", values, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrNotIn(List<String> values) {
            addCriterion("arrive_day_str not in", values, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrBetween(String value1, String value2) {
            addCriterion("arrive_day_str between", value1, value2, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveDayStrNotBetween(String value1, String value2) {
            addCriterion("arrive_day_str not between", value1, value2, "arriveDayStr");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNull() {
            addCriterion("arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIsNotNull() {
            addCriterion("arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andArriveTimeEqualTo(String value) {
            addCriterion("arrive_time =", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotEqualTo(String value) {
            addCriterion("arrive_time <>", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThan(String value) {
            addCriterion("arrive_time >", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("arrive_time >=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThan(String value) {
            addCriterion("arrive_time <", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLessThanOrEqualTo(String value) {
            addCriterion("arrive_time <=", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeLike(String value) {
            addCriterion("arrive_time like", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotLike(String value) {
            addCriterion("arrive_time not like", value, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeIn(List<String> values) {
            addCriterion("arrive_time in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotIn(List<String> values) {
            addCriterion("arrive_time not in", values, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeBetween(String value1, String value2) {
            addCriterion("arrive_time between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andArriveTimeNotBetween(String value1, String value2) {
            addCriterion("arrive_time not between", value1, value2, "arriveTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeIsNull() {
            addCriterion("running_time is null");
            return (Criteria) this;
        }

        public Criteria andRunningTimeIsNotNull() {
            addCriterion("running_time is not null");
            return (Criteria) this;
        }

        public Criteria andRunningTimeEqualTo(String value) {
            addCriterion("running_time =", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeNotEqualTo(String value) {
            addCriterion("running_time <>", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeGreaterThan(String value) {
            addCriterion("running_time >", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeGreaterThanOrEqualTo(String value) {
            addCriterion("running_time >=", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeLessThan(String value) {
            addCriterion("running_time <", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeLessThanOrEqualTo(String value) {
            addCriterion("running_time <=", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeLike(String value) {
            addCriterion("running_time like", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeNotLike(String value) {
            addCriterion("running_time not like", value, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeIn(List<String> values) {
            addCriterion("running_time in", values, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeNotIn(List<String> values) {
            addCriterion("running_time not in", values, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeBetween(String value1, String value2) {
            addCriterion("running_time between", value1, value2, "runningTime");
            return (Criteria) this;
        }

        public Criteria andRunningTimeNotBetween(String value1, String value2) {
            addCriterion("running_time not between", value1, value2, "runningTime");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNull() {
            addCriterion("station_name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("station_name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("station_name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("station_name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("station_name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("station_name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("station_name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("station_name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("station_name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("station_name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("station_name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("station_name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("station_name not between", value1, value2, "stationName");
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