package com.elearning.api.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecordingExample() {
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

        public Criteria andIdRecordingIsNull() {
            addCriterion("ID_RECORDING is null");
            return (Criteria) this;
        }

        public Criteria andIdRecordingIsNotNull() {
            addCriterion("ID_RECORDING is not null");
            return (Criteria) this;
        }

        public Criteria andIdRecordingEqualTo(Integer value) {
            addCriterion("ID_RECORDING =", value, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdRecordingNotEqualTo(Integer value) {
            addCriterion("ID_RECORDING <>", value, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdRecordingGreaterThan(Integer value) {
            addCriterion("ID_RECORDING >", value, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdRecordingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_RECORDING >=", value, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdRecordingLessThan(Integer value) {
            addCriterion("ID_RECORDING <", value, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdRecordingLessThanOrEqualTo(Integer value) {
            addCriterion("ID_RECORDING <=", value, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdRecordingIn(List<Integer> values) {
            addCriterion("ID_RECORDING in", values, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdRecordingNotIn(List<Integer> values) {
            addCriterion("ID_RECORDING not in", values, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdRecordingBetween(Integer value1, Integer value2) {
            addCriterion("ID_RECORDING between", value1, value2, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdRecordingNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_RECORDING not between", value1, value2, "idRecording");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioIsNull() {
            addCriterion("ID_SUB_AUDIO is null");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioIsNotNull() {
            addCriterion("ID_SUB_AUDIO is not null");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioEqualTo(Integer value) {
            addCriterion("ID_SUB_AUDIO =", value, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioNotEqualTo(Integer value) {
            addCriterion("ID_SUB_AUDIO <>", value, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioGreaterThan(Integer value) {
            addCriterion("ID_SUB_AUDIO >", value, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_SUB_AUDIO >=", value, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioLessThan(Integer value) {
            addCriterion("ID_SUB_AUDIO <", value, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioLessThanOrEqualTo(Integer value) {
            addCriterion("ID_SUB_AUDIO <=", value, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioIn(List<Integer> values) {
            addCriterion("ID_SUB_AUDIO in", values, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioNotIn(List<Integer> values) {
            addCriterion("ID_SUB_AUDIO not in", values, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioBetween(Integer value1, Integer value2) {
            addCriterion("ID_SUB_AUDIO between", value1, value2, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubAudioNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_SUB_AUDIO not between", value1, value2, "idSubAudio");
            return (Criteria) this;
        }

        public Criteria andIdUseridIsNull() {
            addCriterion("ID_USERID is null");
            return (Criteria) this;
        }

        public Criteria andIdUseridIsNotNull() {
            addCriterion("ID_USERID is not null");
            return (Criteria) this;
        }

        public Criteria andIdUseridEqualTo(String value) {
            addCriterion("ID_USERID =", value, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridNotEqualTo(String value) {
            addCriterion("ID_USERID <>", value, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridGreaterThan(String value) {
            addCriterion("ID_USERID >", value, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridGreaterThanOrEqualTo(String value) {
            addCriterion("ID_USERID >=", value, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridLessThan(String value) {
            addCriterion("ID_USERID <", value, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridLessThanOrEqualTo(String value) {
            addCriterion("ID_USERID <=", value, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridLike(String value) {
            addCriterion("ID_USERID like", value, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridNotLike(String value) {
            addCriterion("ID_USERID not like", value, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridIn(List<String> values) {
            addCriterion("ID_USERID in", values, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridNotIn(List<String> values) {
            addCriterion("ID_USERID not in", values, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridBetween(String value1, String value2) {
            addCriterion("ID_USERID between", value1, value2, "idUserid");
            return (Criteria) this;
        }

        public Criteria andIdUseridNotBetween(String value1, String value2) {
            addCriterion("ID_USERID not between", value1, value2, "idUserid");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeIsNull() {
            addCriterion("R_RECORD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeIsNotNull() {
            addCriterion("R_RECORD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeEqualTo(Date value) {
            addCriterion("R_RECORD_TIME =", value, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeNotEqualTo(Date value) {
            addCriterion("R_RECORD_TIME <>", value, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeGreaterThan(Date value) {
            addCriterion("R_RECORD_TIME >", value, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("R_RECORD_TIME >=", value, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeLessThan(Date value) {
            addCriterion("R_RECORD_TIME <", value, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("R_RECORD_TIME <=", value, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeIn(List<Date> values) {
            addCriterion("R_RECORD_TIME in", values, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeNotIn(List<Date> values) {
            addCriterion("R_RECORD_TIME not in", values, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeBetween(Date value1, Date value2) {
            addCriterion("R_RECORD_TIME between", value1, value2, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("R_RECORD_TIME not between", value1, value2, "rRecordTime");
            return (Criteria) this;
        }

        public Criteria andRFileSizeIsNull() {
            addCriterion("R_FILE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andRFileSizeIsNotNull() {
            addCriterion("R_FILE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andRFileSizeEqualTo(String value) {
            addCriterion("R_FILE_SIZE =", value, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeNotEqualTo(String value) {
            addCriterion("R_FILE_SIZE <>", value, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeGreaterThan(String value) {
            addCriterion("R_FILE_SIZE >", value, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeGreaterThanOrEqualTo(String value) {
            addCriterion("R_FILE_SIZE >=", value, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeLessThan(String value) {
            addCriterion("R_FILE_SIZE <", value, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeLessThanOrEqualTo(String value) {
            addCriterion("R_FILE_SIZE <=", value, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeLike(String value) {
            addCriterion("R_FILE_SIZE like", value, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeNotLike(String value) {
            addCriterion("R_FILE_SIZE not like", value, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeIn(List<String> values) {
            addCriterion("R_FILE_SIZE in", values, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeNotIn(List<String> values) {
            addCriterion("R_FILE_SIZE not in", values, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeBetween(String value1, String value2) {
            addCriterion("R_FILE_SIZE between", value1, value2, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRFileSizeNotBetween(String value1, String value2) {
            addCriterion("R_FILE_SIZE not between", value1, value2, "rFileSize");
            return (Criteria) this;
        }

        public Criteria andRClientipIsNull() {
            addCriterion("R_CLIENTIP is null");
            return (Criteria) this;
        }

        public Criteria andRClientipIsNotNull() {
            addCriterion("R_CLIENTIP is not null");
            return (Criteria) this;
        }

        public Criteria andRClientipEqualTo(String value) {
            addCriterion("R_CLIENTIP =", value, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipNotEqualTo(String value) {
            addCriterion("R_CLIENTIP <>", value, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipGreaterThan(String value) {
            addCriterion("R_CLIENTIP >", value, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipGreaterThanOrEqualTo(String value) {
            addCriterion("R_CLIENTIP >=", value, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipLessThan(String value) {
            addCriterion("R_CLIENTIP <", value, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipLessThanOrEqualTo(String value) {
            addCriterion("R_CLIENTIP <=", value, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipLike(String value) {
            addCriterion("R_CLIENTIP like", value, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipNotLike(String value) {
            addCriterion("R_CLIENTIP not like", value, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipIn(List<String> values) {
            addCriterion("R_CLIENTIP in", values, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipNotIn(List<String> values) {
            addCriterion("R_CLIENTIP not in", values, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipBetween(String value1, String value2) {
            addCriterion("R_CLIENTIP between", value1, value2, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientipNotBetween(String value1, String value2) {
            addCriterion("R_CLIENTIP not between", value1, value2, "rClientip");
            return (Criteria) this;
        }

        public Criteria andRClientappIsNull() {
            addCriterion("R_CLIENTAPP is null");
            return (Criteria) this;
        }

        public Criteria andRClientappIsNotNull() {
            addCriterion("R_CLIENTAPP is not null");
            return (Criteria) this;
        }

        public Criteria andRClientappEqualTo(String value) {
            addCriterion("R_CLIENTAPP =", value, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappNotEqualTo(String value) {
            addCriterion("R_CLIENTAPP <>", value, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappGreaterThan(String value) {
            addCriterion("R_CLIENTAPP >", value, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappGreaterThanOrEqualTo(String value) {
            addCriterion("R_CLIENTAPP >=", value, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappLessThan(String value) {
            addCriterion("R_CLIENTAPP <", value, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappLessThanOrEqualTo(String value) {
            addCriterion("R_CLIENTAPP <=", value, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappLike(String value) {
            addCriterion("R_CLIENTAPP like", value, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappNotLike(String value) {
            addCriterion("R_CLIENTAPP not like", value, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappIn(List<String> values) {
            addCriterion("R_CLIENTAPP in", values, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappNotIn(List<String> values) {
            addCriterion("R_CLIENTAPP not in", values, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappBetween(String value1, String value2) {
            addCriterion("R_CLIENTAPP between", value1, value2, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andRClientappNotBetween(String value1, String value2) {
            addCriterion("R_CLIENTAPP not between", value1, value2, "rClientapp");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("CREATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("CREATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("CREATEUSER =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("CREATEUSER <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("CREATEUSER >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEUSER >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("CREATEUSER <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("CREATEUSER <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("CREATEUSER like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("CREATEUSER not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("CREATEUSER in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("CREATEUSER not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("CREATEUSER between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("CREATEUSER not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNull() {
            addCriterion("UPDATEUSER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIsNotNull() {
            addCriterion("UPDATEUSER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuserEqualTo(String value) {
            addCriterion("UPDATEUSER =", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotEqualTo(String value) {
            addCriterion("UPDATEUSER <>", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThan(String value) {
            addCriterion("UPDATEUSER >", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER >=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThan(String value) {
            addCriterion("UPDATEUSER <", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLessThanOrEqualTo(String value) {
            addCriterion("UPDATEUSER <=", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserLike(String value) {
            addCriterion("UPDATEUSER like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotLike(String value) {
            addCriterion("UPDATEUSER not like", value, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserIn(List<String> values) {
            addCriterion("UPDATEUSER in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotIn(List<String> values) {
            addCriterion("UPDATEUSER not in", values, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserBetween(String value1, String value2) {
            addCriterion("UPDATEUSER between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andUpdateuserNotBetween(String value1, String value2) {
            addCriterion("UPDATEUSER not between", value1, value2, "updateuser");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("IS_ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("IS_ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Integer value) {
            addCriterion("IS_ACTIVE =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Integer value) {
            addCriterion("IS_ACTIVE <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Integer value) {
            addCriterion("IS_ACTIVE >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ACTIVE >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Integer value) {
            addCriterion("IS_ACTIVE <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ACTIVE <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Integer> values) {
            addCriterion("IS_ACTIVE in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Integer> values) {
            addCriterion("IS_ACTIVE not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACTIVE between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACTIVE not between", value1, value2, "isActive");
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