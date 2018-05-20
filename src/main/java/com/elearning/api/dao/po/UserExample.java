package com.elearning.api.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdUserIsNull() {
            addCriterion("ID_USER is null");
            return (Criteria) this;
        }

        public Criteria andIdUserIsNotNull() {
            addCriterion("ID_USER is not null");
            return (Criteria) this;
        }

        public Criteria andIdUserEqualTo(Integer value) {
            addCriterion("ID_USER =", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotEqualTo(Integer value) {
            addCriterion("ID_USER <>", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserGreaterThan(Integer value) {
            addCriterion("ID_USER >", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_USER >=", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserLessThan(Integer value) {
            addCriterion("ID_USER <", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserLessThanOrEqualTo(Integer value) {
            addCriterion("ID_USER <=", value, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserIn(List<Integer> values) {
            addCriterion("ID_USER in", values, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotIn(List<Integer> values) {
            addCriterion("ID_USER not in", values, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserBetween(Integer value1, Integer value2) {
            addCriterion("ID_USER between", value1, value2, "idUser");
            return (Criteria) this;
        }

        public Criteria andIdUserNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_USER not between", value1, value2, "idUser");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("U_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("U_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("U_NAME =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("U_NAME <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("U_NAME >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NAME >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("U_NAME <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("U_NAME <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("U_NAME like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("U_NAME not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("U_NAME in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("U_NAME not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("U_NAME between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("U_NAME not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNull() {
            addCriterion("U_NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andUNicknameIsNotNull() {
            addCriterion("U_NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUNicknameEqualTo(String value) {
            addCriterion("U_NICKNAME =", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotEqualTo(String value) {
            addCriterion("U_NICKNAME <>", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThan(String value) {
            addCriterion("U_NICKNAME >", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("U_NICKNAME >=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThan(String value) {
            addCriterion("U_NICKNAME <", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLessThanOrEqualTo(String value) {
            addCriterion("U_NICKNAME <=", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameLike(String value) {
            addCriterion("U_NICKNAME like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotLike(String value) {
            addCriterion("U_NICKNAME not like", value, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameIn(List<String> values) {
            addCriterion("U_NICKNAME in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotIn(List<String> values) {
            addCriterion("U_NICKNAME not in", values, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameBetween(String value1, String value2) {
            addCriterion("U_NICKNAME between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andUNicknameNotBetween(String value1, String value2) {
            addCriterion("U_NICKNAME not between", value1, value2, "uNickname");
            return (Criteria) this;
        }

        public Criteria andULoginIdIsNull() {
            addCriterion("U_LOGIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andULoginIdIsNotNull() {
            addCriterion("U_LOGIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andULoginIdEqualTo(String value) {
            addCriterion("U_LOGIN_ID =", value, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdNotEqualTo(String value) {
            addCriterion("U_LOGIN_ID <>", value, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdGreaterThan(String value) {
            addCriterion("U_LOGIN_ID >", value, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("U_LOGIN_ID >=", value, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdLessThan(String value) {
            addCriterion("U_LOGIN_ID <", value, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdLessThanOrEqualTo(String value) {
            addCriterion("U_LOGIN_ID <=", value, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdLike(String value) {
            addCriterion("U_LOGIN_ID like", value, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdNotLike(String value) {
            addCriterion("U_LOGIN_ID not like", value, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdIn(List<String> values) {
            addCriterion("U_LOGIN_ID in", values, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdNotIn(List<String> values) {
            addCriterion("U_LOGIN_ID not in", values, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdBetween(String value1, String value2) {
            addCriterion("U_LOGIN_ID between", value1, value2, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andULoginIdNotBetween(String value1, String value2) {
            addCriterion("U_LOGIN_ID not between", value1, value2, "uLoginId");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNull() {
            addCriterion("U_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUPasswordIsNotNull() {
            addCriterion("U_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUPasswordEqualTo(String value) {
            addCriterion("U_PASSWORD =", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotEqualTo(String value) {
            addCriterion("U_PASSWORD <>", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThan(String value) {
            addCriterion("U_PASSWORD >", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("U_PASSWORD >=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThan(String value) {
            addCriterion("U_PASSWORD <", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLessThanOrEqualTo(String value) {
            addCriterion("U_PASSWORD <=", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordLike(String value) {
            addCriterion("U_PASSWORD like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotLike(String value) {
            addCriterion("U_PASSWORD not like", value, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordIn(List<String> values) {
            addCriterion("U_PASSWORD in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotIn(List<String> values) {
            addCriterion("U_PASSWORD not in", values, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordBetween(String value1, String value2) {
            addCriterion("U_PASSWORD between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUPasswordNotBetween(String value1, String value2) {
            addCriterion("U_PASSWORD not between", value1, value2, "uPassword");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNull() {
            addCriterion("U_AGE is null");
            return (Criteria) this;
        }

        public Criteria andUAgeIsNotNull() {
            addCriterion("U_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andUAgeEqualTo(Integer value) {
            addCriterion("U_AGE =", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotEqualTo(Integer value) {
            addCriterion("U_AGE <>", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThan(Integer value) {
            addCriterion("U_AGE >", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_AGE >=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThan(Integer value) {
            addCriterion("U_AGE <", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeLessThanOrEqualTo(Integer value) {
            addCriterion("U_AGE <=", value, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeIn(List<Integer> values) {
            addCriterion("U_AGE in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotIn(List<Integer> values) {
            addCriterion("U_AGE not in", values, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeBetween(Integer value1, Integer value2) {
            addCriterion("U_AGE between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("U_AGE not between", value1, value2, "uAge");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("U_SEX is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("U_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("U_SEX =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("U_SEX <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("U_SEX >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("U_SEX >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("U_SEX <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("U_SEX <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("U_SEX like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("U_SEX not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("U_SEX in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("U_SEX not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("U_SEX between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("U_SEX not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andURegistTimeIsNull() {
            addCriterion("U_REGIST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andURegistTimeIsNotNull() {
            addCriterion("U_REGIST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andURegistTimeEqualTo(Date value) {
            addCriterion("U_REGIST_TIME =", value, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistTimeNotEqualTo(Date value) {
            addCriterion("U_REGIST_TIME <>", value, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistTimeGreaterThan(Date value) {
            addCriterion("U_REGIST_TIME >", value, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("U_REGIST_TIME >=", value, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistTimeLessThan(Date value) {
            addCriterion("U_REGIST_TIME <", value, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistTimeLessThanOrEqualTo(Date value) {
            addCriterion("U_REGIST_TIME <=", value, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistTimeIn(List<Date> values) {
            addCriterion("U_REGIST_TIME in", values, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistTimeNotIn(List<Date> values) {
            addCriterion("U_REGIST_TIME not in", values, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistTimeBetween(Date value1, Date value2) {
            addCriterion("U_REGIST_TIME between", value1, value2, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistTimeNotBetween(Date value1, Date value2) {
            addCriterion("U_REGIST_TIME not between", value1, value2, "uRegistTime");
            return (Criteria) this;
        }

        public Criteria andURegistIpIsNull() {
            addCriterion("U_REGIST_IP is null");
            return (Criteria) this;
        }

        public Criteria andURegistIpIsNotNull() {
            addCriterion("U_REGIST_IP is not null");
            return (Criteria) this;
        }

        public Criteria andURegistIpEqualTo(String value) {
            addCriterion("U_REGIST_IP =", value, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpNotEqualTo(String value) {
            addCriterion("U_REGIST_IP <>", value, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpGreaterThan(String value) {
            addCriterion("U_REGIST_IP >", value, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpGreaterThanOrEqualTo(String value) {
            addCriterion("U_REGIST_IP >=", value, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpLessThan(String value) {
            addCriterion("U_REGIST_IP <", value, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpLessThanOrEqualTo(String value) {
            addCriterion("U_REGIST_IP <=", value, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpLike(String value) {
            addCriterion("U_REGIST_IP like", value, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpNotLike(String value) {
            addCriterion("U_REGIST_IP not like", value, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpIn(List<String> values) {
            addCriterion("U_REGIST_IP in", values, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpNotIn(List<String> values) {
            addCriterion("U_REGIST_IP not in", values, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpBetween(String value1, String value2) {
            addCriterion("U_REGIST_IP between", value1, value2, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andURegistIpNotBetween(String value1, String value2) {
            addCriterion("U_REGIST_IP not between", value1, value2, "uRegistIp");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("U_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("U_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("U_EMAIL =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("U_EMAIL <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("U_EMAIL >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("U_EMAIL >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("U_EMAIL <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("U_EMAIL <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("U_EMAIL like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("U_EMAIL not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("U_EMAIL in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("U_EMAIL not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("U_EMAIL between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("U_EMAIL not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNull() {
            addCriterion("U_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andUPhoneIsNotNull() {
            addCriterion("U_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andUPhoneEqualTo(String value) {
            addCriterion("U_PHONE =", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotEqualTo(String value) {
            addCriterion("U_PHONE <>", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThan(String value) {
            addCriterion("U_PHONE >", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("U_PHONE >=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThan(String value) {
            addCriterion("U_PHONE <", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLessThanOrEqualTo(String value) {
            addCriterion("U_PHONE <=", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneLike(String value) {
            addCriterion("U_PHONE like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotLike(String value) {
            addCriterion("U_PHONE not like", value, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneIn(List<String> values) {
            addCriterion("U_PHONE in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotIn(List<String> values) {
            addCriterion("U_PHONE not in", values, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneBetween(String value1, String value2) {
            addCriterion("U_PHONE between", value1, value2, "uPhone");
            return (Criteria) this;
        }

        public Criteria andUPhoneNotBetween(String value1, String value2) {
            addCriterion("U_PHONE not between", value1, value2, "uPhone");
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