package com.lhdb.game.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample extends BasePojo  {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public UsersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
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

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("Username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("Username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("Username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("Username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("Username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("Username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("Username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("Username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("Username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("Username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("Username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("Username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("Username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("Username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNullityIsNull() {
            addCriterion("Nullity is null");
            return (Criteria) this;
        }

        public Criteria andNullityIsNotNull() {
            addCriterion("Nullity is not null");
            return (Criteria) this;
        }

        public Criteria andNullityEqualTo(Byte value) {
            addCriterion("Nullity =", value, "nullity");
            return (Criteria) this;
        }

        public Criteria andNullityNotEqualTo(Byte value) {
            addCriterion("Nullity <>", value, "nullity");
            return (Criteria) this;
        }

        public Criteria andNullityGreaterThan(Byte value) {
            addCriterion("Nullity >", value, "nullity");
            return (Criteria) this;
        }

        public Criteria andNullityGreaterThanOrEqualTo(Byte value) {
            addCriterion("Nullity >=", value, "nullity");
            return (Criteria) this;
        }

        public Criteria andNullityLessThan(Byte value) {
            addCriterion("Nullity <", value, "nullity");
            return (Criteria) this;
        }

        public Criteria andNullityLessThanOrEqualTo(Byte value) {
            addCriterion("Nullity <=", value, "nullity");
            return (Criteria) this;
        }

        public Criteria andNullityIn(List<Byte> values) {
            addCriterion("Nullity in", values, "nullity");
            return (Criteria) this;
        }

        public Criteria andNullityNotIn(List<Byte> values) {
            addCriterion("Nullity not in", values, "nullity");
            return (Criteria) this;
        }

        public Criteria andNullityBetween(Byte value1, Byte value2) {
            addCriterion("Nullity between", value1, value2, "nullity");
            return (Criteria) this;
        }

        public Criteria andNullityNotBetween(Byte value1, Byte value2) {
            addCriterion("Nullity not between", value1, value2, "nullity");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeIsNull() {
            addCriterion("PreLogintime is null");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeIsNotNull() {
            addCriterion("PreLogintime is not null");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeEqualTo(Date value) {
            addCriterion("PreLogintime =", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeNotEqualTo(Date value) {
            addCriterion("PreLogintime <>", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeGreaterThan(Date value) {
            addCriterion("PreLogintime >", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PreLogintime >=", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeLessThan(Date value) {
            addCriterion("PreLogintime <", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeLessThanOrEqualTo(Date value) {
            addCriterion("PreLogintime <=", value, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeIn(List<Date> values) {
            addCriterion("PreLogintime in", values, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeNotIn(List<Date> values) {
            addCriterion("PreLogintime not in", values, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeBetween(Date value1, Date value2) {
            addCriterion("PreLogintime between", value1, value2, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPrelogintimeNotBetween(Date value1, Date value2) {
            addCriterion("PreLogintime not between", value1, value2, "prelogintime");
            return (Criteria) this;
        }

        public Criteria andPreloginipIsNull() {
            addCriterion("PreLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andPreloginipIsNotNull() {
            addCriterion("PreLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andPreloginipEqualTo(String value) {
            addCriterion("PreLoginIP =", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotEqualTo(String value) {
            addCriterion("PreLoginIP <>", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipGreaterThan(String value) {
            addCriterion("PreLoginIP >", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipGreaterThanOrEqualTo(String value) {
            addCriterion("PreLoginIP >=", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipLessThan(String value) {
            addCriterion("PreLoginIP <", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipLessThanOrEqualTo(String value) {
            addCriterion("PreLoginIP <=", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipLike(String value) {
            addCriterion("PreLoginIP like", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotLike(String value) {
            addCriterion("PreLoginIP not like", value, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipIn(List<String> values) {
            addCriterion("PreLoginIP in", values, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotIn(List<String> values) {
            addCriterion("PreLoginIP not in", values, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipBetween(String value1, String value2) {
            addCriterion("PreLoginIP between", value1, value2, "preloginip");
            return (Criteria) this;
        }

        public Criteria andPreloginipNotBetween(String value1, String value2) {
            addCriterion("PreLoginIP not between", value1, value2, "preloginip");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("LastLogintime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("LastLogintime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("LastLogintime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("LastLogintime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("LastLogintime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLogintime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("LastLogintime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LastLogintime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("LastLogintime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("LastLogintime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("LastLogintime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LastLogintime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNull() {
            addCriterion("LastLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andLastloginipIsNotNull() {
            addCriterion("LastLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginipEqualTo(String value) {
            addCriterion("LastLoginIP =", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotEqualTo(String value) {
            addCriterion("LastLoginIP <>", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThan(String value) {
            addCriterion("LastLoginIP >", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipGreaterThanOrEqualTo(String value) {
            addCriterion("LastLoginIP >=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThan(String value) {
            addCriterion("LastLoginIP <", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLessThanOrEqualTo(String value) {
            addCriterion("LastLoginIP <=", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipLike(String value) {
            addCriterion("LastLoginIP like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotLike(String value) {
            addCriterion("LastLoginIP not like", value, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipIn(List<String> values) {
            addCriterion("LastLoginIP in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotIn(List<String> values) {
            addCriterion("LastLoginIP not in", values, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipBetween(String value1, String value2) {
            addCriterion("LastLoginIP between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLastloginipNotBetween(String value1, String value2) {
            addCriterion("LastLoginIP not between", value1, value2, "lastloginip");
            return (Criteria) this;
        }

        public Criteria andLogintimesIsNull() {
            addCriterion("LoginTimes is null");
            return (Criteria) this;
        }

        public Criteria andLogintimesIsNotNull() {
            addCriterion("LoginTimes is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimesEqualTo(Integer value) {
            addCriterion("LoginTimes =", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesNotEqualTo(Integer value) {
            addCriterion("LoginTimes <>", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesGreaterThan(Integer value) {
            addCriterion("LoginTimes >", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("LoginTimes >=", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesLessThan(Integer value) {
            addCriterion("LoginTimes <", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesLessThanOrEqualTo(Integer value) {
            addCriterion("LoginTimes <=", value, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesIn(List<Integer> values) {
            addCriterion("LoginTimes in", values, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesNotIn(List<Integer> values) {
            addCriterion("LoginTimes not in", values, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesBetween(Integer value1, Integer value2) {
            addCriterion("LoginTimes between", value1, value2, "logintimes");
            return (Criteria) this;
        }

        public Criteria andLogintimesNotBetween(Integer value1, Integer value2) {
            addCriterion("LoginTimes not between", value1, value2, "logintimes");
            return (Criteria) this;
        }

        public Criteria andIsbandIsNull() {
            addCriterion("IsBand is null");
            return (Criteria) this;
        }

        public Criteria andIsbandIsNotNull() {
            addCriterion("IsBand is not null");
            return (Criteria) this;
        }

        public Criteria andIsbandEqualTo(Integer value) {
            addCriterion("IsBand =", value, "isband");
            return (Criteria) this;
        }

        public Criteria andIsbandNotEqualTo(Integer value) {
            addCriterion("IsBand <>", value, "isband");
            return (Criteria) this;
        }

        public Criteria andIsbandGreaterThan(Integer value) {
            addCriterion("IsBand >", value, "isband");
            return (Criteria) this;
        }

        public Criteria andIsbandGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsBand >=", value, "isband");
            return (Criteria) this;
        }

        public Criteria andIsbandLessThan(Integer value) {
            addCriterion("IsBand <", value, "isband");
            return (Criteria) this;
        }

        public Criteria andIsbandLessThanOrEqualTo(Integer value) {
            addCriterion("IsBand <=", value, "isband");
            return (Criteria) this;
        }

        public Criteria andIsbandIn(List<Integer> values) {
            addCriterion("IsBand in", values, "isband");
            return (Criteria) this;
        }

        public Criteria andIsbandNotIn(List<Integer> values) {
            addCriterion("IsBand not in", values, "isband");
            return (Criteria) this;
        }

        public Criteria andIsbandBetween(Integer value1, Integer value2) {
            addCriterion("IsBand between", value1, value2, "isband");
            return (Criteria) this;
        }

        public Criteria andIsbandNotBetween(Integer value1, Integer value2) {
            addCriterion("IsBand not between", value1, value2, "isband");
            return (Criteria) this;
        }

        public Criteria andBandipIsNull() {
            addCriterion("BandIP is null");
            return (Criteria) this;
        }

        public Criteria andBandipIsNotNull() {
            addCriterion("BandIP is not null");
            return (Criteria) this;
        }

        public Criteria andBandipEqualTo(String value) {
            addCriterion("BandIP =", value, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipNotEqualTo(String value) {
            addCriterion("BandIP <>", value, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipGreaterThan(String value) {
            addCriterion("BandIP >", value, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipGreaterThanOrEqualTo(String value) {
            addCriterion("BandIP >=", value, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipLessThan(String value) {
            addCriterion("BandIP <", value, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipLessThanOrEqualTo(String value) {
            addCriterion("BandIP <=", value, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipLike(String value) {
            addCriterion("BandIP like", value, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipNotLike(String value) {
            addCriterion("BandIP not like", value, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipIn(List<String> values) {
            addCriterion("BandIP in", values, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipNotIn(List<String> values) {
            addCriterion("BandIP not in", values, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipBetween(String value1, String value2) {
            addCriterion("BandIP between", value1, value2, "bandip");
            return (Criteria) this;
        }

        public Criteria andBandipNotBetween(String value1, String value2) {
            addCriterion("BandIP not between", value1, value2, "bandip");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Users
     *
     * @mbggenerated do_not_delete_during_merge Wed Oct 29 18:20:08 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table Users
     *
     * @mbggenerated Wed Oct 29 18:20:08 CST 2014
     */
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