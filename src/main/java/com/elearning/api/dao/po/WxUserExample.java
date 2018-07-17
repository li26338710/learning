package com.elearning.api.dao.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WxUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WxUserExample() {
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

        public Criteria andIdWxuserIsNull() {
            addCriterion("ID_WXUSER is null");
            return (Criteria) this;
        }

        public Criteria andIdWxuserIsNotNull() {
            addCriterion("ID_WXUSER is not null");
            return (Criteria) this;
        }

        public Criteria andIdWxuserEqualTo(Integer value) {
            addCriterion("ID_WXUSER =", value, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andIdWxuserNotEqualTo(Integer value) {
            addCriterion("ID_WXUSER <>", value, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andIdWxuserGreaterThan(Integer value) {
            addCriterion("ID_WXUSER >", value, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andIdWxuserGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_WXUSER >=", value, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andIdWxuserLessThan(Integer value) {
            addCriterion("ID_WXUSER <", value, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andIdWxuserLessThanOrEqualTo(Integer value) {
            addCriterion("ID_WXUSER <=", value, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andIdWxuserIn(List<Integer> values) {
            addCriterion("ID_WXUSER in", values, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andIdWxuserNotIn(List<Integer> values) {
            addCriterion("ID_WXUSER not in", values, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andIdWxuserBetween(Integer value1, Integer value2) {
            addCriterion("ID_WXUSER between", value1, value2, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andIdWxuserNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_WXUSER not between", value1, value2, "idWxuser");
            return (Criteria) this;
        }

        public Criteria andUOpenidIsNull() {
            addCriterion("U_OPENID is null");
            return (Criteria) this;
        }

        public Criteria andUOpenidIsNotNull() {
            addCriterion("U_OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andUOpenidEqualTo(String value) {
            addCriterion("U_OPENID =", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotEqualTo(String value) {
            addCriterion("U_OPENID <>", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidGreaterThan(String value) {
            addCriterion("U_OPENID >", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("U_OPENID >=", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLessThan(String value) {
            addCriterion("U_OPENID <", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLessThanOrEqualTo(String value) {
            addCriterion("U_OPENID <=", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidLike(String value) {
            addCriterion("U_OPENID like", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotLike(String value) {
            addCriterion("U_OPENID not like", value, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidIn(List<String> values) {
            addCriterion("U_OPENID in", values, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotIn(List<String> values) {
            addCriterion("U_OPENID not in", values, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidBetween(String value1, String value2) {
            addCriterion("U_OPENID between", value1, value2, "uOpenid");
            return (Criteria) this;
        }

        public Criteria andUOpenidNotBetween(String value1, String value2) {
            addCriterion("U_OPENID not between", value1, value2, "uOpenid");
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

        public Criteria andUProvinceIsNull() {
            addCriterion("U_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andUProvinceIsNotNull() {
            addCriterion("U_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andUProvinceEqualTo(String value) {
            addCriterion("U_PROVINCE =", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceNotEqualTo(String value) {
            addCriterion("U_PROVINCE <>", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceGreaterThan(String value) {
            addCriterion("U_PROVINCE >", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("U_PROVINCE >=", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceLessThan(String value) {
            addCriterion("U_PROVINCE <", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceLessThanOrEqualTo(String value) {
            addCriterion("U_PROVINCE <=", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceLike(String value) {
            addCriterion("U_PROVINCE like", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceNotLike(String value) {
            addCriterion("U_PROVINCE not like", value, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceIn(List<String> values) {
            addCriterion("U_PROVINCE in", values, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceNotIn(List<String> values) {
            addCriterion("U_PROVINCE not in", values, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceBetween(String value1, String value2) {
            addCriterion("U_PROVINCE between", value1, value2, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUProvinceNotBetween(String value1, String value2) {
            addCriterion("U_PROVINCE not between", value1, value2, "uProvince");
            return (Criteria) this;
        }

        public Criteria andUCountryIsNull() {
            addCriterion("U_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andUCountryIsNotNull() {
            addCriterion("U_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andUCountryEqualTo(String value) {
            addCriterion("U_COUNTRY =", value, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryNotEqualTo(String value) {
            addCriterion("U_COUNTRY <>", value, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryGreaterThan(String value) {
            addCriterion("U_COUNTRY >", value, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryGreaterThanOrEqualTo(String value) {
            addCriterion("U_COUNTRY >=", value, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryLessThan(String value) {
            addCriterion("U_COUNTRY <", value, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryLessThanOrEqualTo(String value) {
            addCriterion("U_COUNTRY <=", value, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryLike(String value) {
            addCriterion("U_COUNTRY like", value, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryNotLike(String value) {
            addCriterion("U_COUNTRY not like", value, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryIn(List<String> values) {
            addCriterion("U_COUNTRY in", values, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryNotIn(List<String> values) {
            addCriterion("U_COUNTRY not in", values, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryBetween(String value1, String value2) {
            addCriterion("U_COUNTRY between", value1, value2, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCountryNotBetween(String value1, String value2) {
            addCriterion("U_COUNTRY not between", value1, value2, "uCountry");
            return (Criteria) this;
        }

        public Criteria andUCityIsNull() {
            addCriterion("U_CITY is null");
            return (Criteria) this;
        }

        public Criteria andUCityIsNotNull() {
            addCriterion("U_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andUCityEqualTo(String value) {
            addCriterion("U_CITY =", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotEqualTo(String value) {
            addCriterion("U_CITY <>", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityGreaterThan(String value) {
            addCriterion("U_CITY >", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityGreaterThanOrEqualTo(String value) {
            addCriterion("U_CITY >=", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLessThan(String value) {
            addCriterion("U_CITY <", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLessThanOrEqualTo(String value) {
            addCriterion("U_CITY <=", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityLike(String value) {
            addCriterion("U_CITY like", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotLike(String value) {
            addCriterion("U_CITY not like", value, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityIn(List<String> values) {
            addCriterion("U_CITY in", values, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotIn(List<String> values) {
            addCriterion("U_CITY not in", values, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityBetween(String value1, String value2) {
            addCriterion("U_CITY between", value1, value2, "uCity");
            return (Criteria) this;
        }

        public Criteria andUCityNotBetween(String value1, String value2) {
            addCriterion("U_CITY not between", value1, value2, "uCity");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlIsNull() {
            addCriterion("U_AVATARURL is null");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlIsNotNull() {
            addCriterion("U_AVATARURL is not null");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlEqualTo(String value) {
            addCriterion("U_AVATARURL =", value, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlNotEqualTo(String value) {
            addCriterion("U_AVATARURL <>", value, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlGreaterThan(String value) {
            addCriterion("U_AVATARURL >", value, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlGreaterThanOrEqualTo(String value) {
            addCriterion("U_AVATARURL >=", value, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlLessThan(String value) {
            addCriterion("U_AVATARURL <", value, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlLessThanOrEqualTo(String value) {
            addCriterion("U_AVATARURL <=", value, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlLike(String value) {
            addCriterion("U_AVATARURL like", value, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlNotLike(String value) {
            addCriterion("U_AVATARURL not like", value, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlIn(List<String> values) {
            addCriterion("U_AVATARURL in", values, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlNotIn(List<String> values) {
            addCriterion("U_AVATARURL not in", values, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlBetween(String value1, String value2) {
            addCriterion("U_AVATARURL between", value1, value2, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUAvatarurlNotBetween(String value1, String value2) {
            addCriterion("U_AVATARURL not between", value1, value2, "uAvatarurl");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNull() {
            addCriterion("U_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andUGenderIsNotNull() {
            addCriterion("U_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andUGenderEqualTo(Integer value) {
            addCriterion("U_GENDER =", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotEqualTo(Integer value) {
            addCriterion("U_GENDER <>", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThan(Integer value) {
            addCriterion("U_GENDER >", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_GENDER >=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThan(Integer value) {
            addCriterion("U_GENDER <", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderLessThanOrEqualTo(Integer value) {
            addCriterion("U_GENDER <=", value, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderIn(List<Integer> values) {
            addCriterion("U_GENDER in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotIn(List<Integer> values) {
            addCriterion("U_GENDER not in", values, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderBetween(Integer value1, Integer value2) {
            addCriterion("U_GENDER between", value1, value2, "uGender");
            return (Criteria) this;
        }

        public Criteria andUGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("U_GENDER not between", value1, value2, "uGender");
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