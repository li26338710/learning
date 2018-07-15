package com.elearning.api.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SubAudioExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubAudioExample() {
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

        public Criteria andIdSubTypeIsNull() {
            addCriterion("ID_SUB_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeIsNotNull() {
            addCriterion("ID_SUB_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeEqualTo(Integer value) {
            addCriterion("ID_SUB_TYPE =", value, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeNotEqualTo(Integer value) {
            addCriterion("ID_SUB_TYPE <>", value, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeGreaterThan(Integer value) {
            addCriterion("ID_SUB_TYPE >", value, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_SUB_TYPE >=", value, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeLessThan(Integer value) {
            addCriterion("ID_SUB_TYPE <", value, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ID_SUB_TYPE <=", value, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeIn(List<Integer> values) {
            addCriterion("ID_SUB_TYPE in", values, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeNotIn(List<Integer> values) {
            addCriterion("ID_SUB_TYPE not in", values, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeBetween(Integer value1, Integer value2) {
            addCriterion("ID_SUB_TYPE between", value1, value2, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_SUB_TYPE not between", value1, value2, "idSubType");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleIsNull() {
            addCriterion("ID_SUB_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleIsNotNull() {
            addCriterion("ID_SUB_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleEqualTo(String value) {
            addCriterion("ID_SUB_ROLE =", value, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleNotEqualTo(String value) {
            addCriterion("ID_SUB_ROLE <>", value, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleGreaterThan(String value) {
            addCriterion("ID_SUB_ROLE >", value, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleGreaterThanOrEqualTo(String value) {
            addCriterion("ID_SUB_ROLE >=", value, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleLessThan(String value) {
            addCriterion("ID_SUB_ROLE <", value, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleLessThanOrEqualTo(String value) {
            addCriterion("ID_SUB_ROLE <=", value, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleLike(String value) {
            addCriterion("ID_SUB_ROLE like", value, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleNotLike(String value) {
            addCriterion("ID_SUB_ROLE not like", value, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleIn(List<String> values) {
            addCriterion("ID_SUB_ROLE in", values, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleNotIn(List<String> values) {
            addCriterion("ID_SUB_ROLE not in", values, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleBetween(String value1, String value2) {
            addCriterion("ID_SUB_ROLE between", value1, value2, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdSubRoleNotBetween(String value1, String value2) {
            addCriterion("ID_SUB_ROLE not between", value1, value2, "idSubRole");
            return (Criteria) this;
        }

        public Criteria andIdAudioIsNull() {
            addCriterion("ID_AUDIO is null");
            return (Criteria) this;
        }

        public Criteria andIdAudioIsNotNull() {
            addCriterion("ID_AUDIO is not null");
            return (Criteria) this;
        }

        public Criteria andIdAudioEqualTo(Integer value) {
            addCriterion("ID_AUDIO =", value, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdAudioNotEqualTo(Integer value) {
            addCriterion("ID_AUDIO <>", value, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdAudioGreaterThan(Integer value) {
            addCriterion("ID_AUDIO >", value, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdAudioGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_AUDIO >=", value, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdAudioLessThan(Integer value) {
            addCriterion("ID_AUDIO <", value, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdAudioLessThanOrEqualTo(Integer value) {
            addCriterion("ID_AUDIO <=", value, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdAudioIn(List<Integer> values) {
            addCriterion("ID_AUDIO in", values, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdAudioNotIn(List<Integer> values) {
            addCriterion("ID_AUDIO not in", values, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdAudioBetween(Integer value1, Integer value2) {
            addCriterion("ID_AUDIO between", value1, value2, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdAudioNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_AUDIO not between", value1, value2, "idAudio");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexIsNull() {
            addCriterion("ID_SUB_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexIsNotNull() {
            addCriterion("ID_SUB_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexEqualTo(Integer value) {
            addCriterion("ID_SUB_INDEX =", value, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexNotEqualTo(Integer value) {
            addCriterion("ID_SUB_INDEX <>", value, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexGreaterThan(Integer value) {
            addCriterion("ID_SUB_INDEX >", value, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_SUB_INDEX >=", value, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexLessThan(Integer value) {
            addCriterion("ID_SUB_INDEX <", value, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexLessThanOrEqualTo(Integer value) {
            addCriterion("ID_SUB_INDEX <=", value, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexIn(List<Integer> values) {
            addCriterion("ID_SUB_INDEX in", values, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexNotIn(List<Integer> values) {
            addCriterion("ID_SUB_INDEX not in", values, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexBetween(Integer value1, Integer value2) {
            addCriterion("ID_SUB_INDEX between", value1, value2, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_SUB_INDEX not between", value1, value2, "idSubIndex");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthIsNull() {
            addCriterion("ID_SUB_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthIsNotNull() {
            addCriterion("ID_SUB_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthEqualTo(Integer value) {
            addCriterion("ID_SUB_LENGTH =", value, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthNotEqualTo(Integer value) {
            addCriterion("ID_SUB_LENGTH <>", value, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthGreaterThan(Integer value) {
            addCriterion("ID_SUB_LENGTH >", value, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_SUB_LENGTH >=", value, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthLessThan(Integer value) {
            addCriterion("ID_SUB_LENGTH <", value, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthLessThanOrEqualTo(Integer value) {
            addCriterion("ID_SUB_LENGTH <=", value, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthIn(List<Integer> values) {
            addCriterion("ID_SUB_LENGTH in", values, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthNotIn(List<Integer> values) {
            addCriterion("ID_SUB_LENGTH not in", values, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthBetween(Integer value1, Integer value2) {
            addCriterion("ID_SUB_LENGTH between", value1, value2, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andIdSubLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_SUB_LENGTH not between", value1, value2, "idSubLength");
            return (Criteria) this;
        }

        public Criteria andAFilePathIsNull() {
            addCriterion("A_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andAFilePathIsNotNull() {
            addCriterion("A_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andAFilePathEqualTo(String value) {
            addCriterion("A_FILE_PATH =", value, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathNotEqualTo(String value) {
            addCriterion("A_FILE_PATH <>", value, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathGreaterThan(String value) {
            addCriterion("A_FILE_PATH >", value, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("A_FILE_PATH >=", value, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathLessThan(String value) {
            addCriterion("A_FILE_PATH <", value, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathLessThanOrEqualTo(String value) {
            addCriterion("A_FILE_PATH <=", value, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathLike(String value) {
            addCriterion("A_FILE_PATH like", value, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathNotLike(String value) {
            addCriterion("A_FILE_PATH not like", value, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathIn(List<String> values) {
            addCriterion("A_FILE_PATH in", values, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathNotIn(List<String> values) {
            addCriterion("A_FILE_PATH not in", values, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathBetween(String value1, String value2) {
            addCriterion("A_FILE_PATH between", value1, value2, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andAFilePathNotBetween(String value1, String value2) {
            addCriterion("A_FILE_PATH not between", value1, value2, "aFilePath");
            return (Criteria) this;
        }

        public Criteria andASizeIsNull() {
            addCriterion("A_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andASizeIsNotNull() {
            addCriterion("A_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andASizeEqualTo(Double value) {
            addCriterion("A_SIZE =", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeNotEqualTo(Double value) {
            addCriterion("A_SIZE <>", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeGreaterThan(Double value) {
            addCriterion("A_SIZE >", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeGreaterThanOrEqualTo(Double value) {
            addCriterion("A_SIZE >=", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeLessThan(Double value) {
            addCriterion("A_SIZE <", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeLessThanOrEqualTo(Double value) {
            addCriterion("A_SIZE <=", value, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeIn(List<Double> values) {
            addCriterion("A_SIZE in", values, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeNotIn(List<Double> values) {
            addCriterion("A_SIZE not in", values, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeBetween(Double value1, Double value2) {
            addCriterion("A_SIZE between", value1, value2, "aSize");
            return (Criteria) this;
        }

        public Criteria andASizeNotBetween(Double value1, Double value2) {
            addCriterion("A_SIZE not between", value1, value2, "aSize");
            return (Criteria) this;
        }

        public Criteria andARecommendIsNull() {
            addCriterion("A_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andARecommendIsNotNull() {
            addCriterion("A_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andARecommendEqualTo(String value) {
            addCriterion("A_RECOMMEND =", value, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendNotEqualTo(String value) {
            addCriterion("A_RECOMMEND <>", value, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendGreaterThan(String value) {
            addCriterion("A_RECOMMEND >", value, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendGreaterThanOrEqualTo(String value) {
            addCriterion("A_RECOMMEND >=", value, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendLessThan(String value) {
            addCriterion("A_RECOMMEND <", value, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendLessThanOrEqualTo(String value) {
            addCriterion("A_RECOMMEND <=", value, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendLike(String value) {
            addCriterion("A_RECOMMEND like", value, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendNotLike(String value) {
            addCriterion("A_RECOMMEND not like", value, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendIn(List<String> values) {
            addCriterion("A_RECOMMEND in", values, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendNotIn(List<String> values) {
            addCriterion("A_RECOMMEND not in", values, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendBetween(String value1, String value2) {
            addCriterion("A_RECOMMEND between", value1, value2, "aRecommend");
            return (Criteria) this;
        }

        public Criteria andARecommendNotBetween(String value1, String value2) {
            addCriterion("A_RECOMMEND not between", value1, value2, "aRecommend");
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