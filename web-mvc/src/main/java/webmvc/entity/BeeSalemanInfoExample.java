package webmvc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BeeSalemanInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BeeSalemanInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSalemanNumIsNull() {
            addCriterion("saleman_num is null");
            return (Criteria) this;
        }

        public Criteria andSalemanNumIsNotNull() {
            addCriterion("saleman_num is not null");
            return (Criteria) this;
        }

        public Criteria andSalemanNumEqualTo(String value) {
            addCriterion("saleman_num =", value, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumNotEqualTo(String value) {
            addCriterion("saleman_num <>", value, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumGreaterThan(String value) {
            addCriterion("saleman_num >", value, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumGreaterThanOrEqualTo(String value) {
            addCriterion("saleman_num >=", value, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumLessThan(String value) {
            addCriterion("saleman_num <", value, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumLessThanOrEqualTo(String value) {
            addCriterion("saleman_num <=", value, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumLike(String value) {
            addCriterion("saleman_num like", value, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumNotLike(String value) {
            addCriterion("saleman_num not like", value, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumIn(List<String> values) {
            addCriterion("saleman_num in", values, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumNotIn(List<String> values) {
            addCriterion("saleman_num not in", values, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumBetween(String value1, String value2) {
            addCriterion("saleman_num between", value1, value2, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNumNotBetween(String value1, String value2) {
            addCriterion("saleman_num not between", value1, value2, "salemanNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumIsNull() {
            addCriterion("merchant_num is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNumIsNotNull() {
            addCriterion("merchant_num is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNumEqualTo(String value) {
            addCriterion("merchant_num =", value, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumNotEqualTo(String value) {
            addCriterion("merchant_num <>", value, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumGreaterThan(String value) {
            addCriterion("merchant_num >", value, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_num >=", value, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumLessThan(String value) {
            addCriterion("merchant_num <", value, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumLessThanOrEqualTo(String value) {
            addCriterion("merchant_num <=", value, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumLike(String value) {
            addCriterion("merchant_num like", value, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumNotLike(String value) {
            addCriterion("merchant_num not like", value, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumIn(List<String> values) {
            addCriterion("merchant_num in", values, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumNotIn(List<String> values) {
            addCriterion("merchant_num not in", values, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumBetween(String value1, String value2) {
            addCriterion("merchant_num between", value1, value2, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andMerchantNumNotBetween(String value1, String value2) {
            addCriterion("merchant_num not between", value1, value2, "merchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumIsNull() {
            addCriterion("parent_merchant_num is null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumIsNotNull() {
            addCriterion("parent_merchant_num is not null");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumEqualTo(String value) {
            addCriterion("parent_merchant_num =", value, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumNotEqualTo(String value) {
            addCriterion("parent_merchant_num <>", value, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumGreaterThan(String value) {
            addCriterion("parent_merchant_num >", value, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumGreaterThanOrEqualTo(String value) {
            addCriterion("parent_merchant_num >=", value, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumLessThan(String value) {
            addCriterion("parent_merchant_num <", value, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumLessThanOrEqualTo(String value) {
            addCriterion("parent_merchant_num <=", value, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumLike(String value) {
            addCriterion("parent_merchant_num like", value, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumNotLike(String value) {
            addCriterion("parent_merchant_num not like", value, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumIn(List<String> values) {
            addCriterion("parent_merchant_num in", values, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumNotIn(List<String> values) {
            addCriterion("parent_merchant_num not in", values, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumBetween(String value1, String value2) {
            addCriterion("parent_merchant_num between", value1, value2, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andParentMerchantNumNotBetween(String value1, String value2) {
            addCriterion("parent_merchant_num not between", value1, value2, "parentMerchantNum");
            return (Criteria) this;
        }

        public Criteria andSalemanNameIsNull() {
            addCriterion("saleman_name is null");
            return (Criteria) this;
        }

        public Criteria andSalemanNameIsNotNull() {
            addCriterion("saleman_name is not null");
            return (Criteria) this;
        }

        public Criteria andSalemanNameEqualTo(String value) {
            addCriterion("saleman_name =", value, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameNotEqualTo(String value) {
            addCriterion("saleman_name <>", value, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameGreaterThan(String value) {
            addCriterion("saleman_name >", value, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameGreaterThanOrEqualTo(String value) {
            addCriterion("saleman_name >=", value, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameLessThan(String value) {
            addCriterion("saleman_name <", value, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameLessThanOrEqualTo(String value) {
            addCriterion("saleman_name <=", value, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameLike(String value) {
            addCriterion("saleman_name like", value, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameNotLike(String value) {
            addCriterion("saleman_name not like", value, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameIn(List<String> values) {
            addCriterion("saleman_name in", values, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameNotIn(List<String> values) {
            addCriterion("saleman_name not in", values, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameBetween(String value1, String value2) {
            addCriterion("saleman_name between", value1, value2, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanNameNotBetween(String value1, String value2) {
            addCriterion("saleman_name not between", value1, value2, "salemanName");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneIsNull() {
            addCriterion("saleman_phone is null");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneIsNotNull() {
            addCriterion("saleman_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneEqualTo(String value) {
            addCriterion("saleman_phone =", value, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneNotEqualTo(String value) {
            addCriterion("saleman_phone <>", value, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneGreaterThan(String value) {
            addCriterion("saleman_phone >", value, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("saleman_phone >=", value, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneLessThan(String value) {
            addCriterion("saleman_phone <", value, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneLessThanOrEqualTo(String value) {
            addCriterion("saleman_phone <=", value, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneLike(String value) {
            addCriterion("saleman_phone like", value, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneNotLike(String value) {
            addCriterion("saleman_phone not like", value, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneIn(List<String> values) {
            addCriterion("saleman_phone in", values, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneNotIn(List<String> values) {
            addCriterion("saleman_phone not in", values, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneBetween(String value1, String value2) {
            addCriterion("saleman_phone between", value1, value2, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andSalemanPhoneNotBetween(String value1, String value2) {
            addCriterion("saleman_phone not between", value1, value2, "salemanPhone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNull() {
            addCriterion("invite_code is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(String value) {
            addCriterion("invite_code =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(String value) {
            addCriterion("invite_code <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(String value) {
            addCriterion("invite_code >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invite_code >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(String value) {
            addCriterion("invite_code <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("invite_code <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLike(String value) {
            addCriterion("invite_code like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotLike(String value) {
            addCriterion("invite_code not like", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<String> values) {
            addCriterion("invite_code in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<String> values) {
            addCriterion("invite_code not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(String value1, String value2) {
            addCriterion("invite_code between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(String value1, String value2) {
            addCriterion("invite_code not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNull() {
            addCriterion("active_time is null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIsNotNull() {
            addCriterion("active_time is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTimeEqualTo(Date value) {
            addCriterion("active_time =", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotEqualTo(Date value) {
            addCriterion("active_time <>", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThan(Date value) {
            addCriterion("active_time >", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("active_time >=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThan(Date value) {
            addCriterion("active_time <", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("active_time <=", value, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeIn(List<Date> values) {
            addCriterion("active_time in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotIn(List<Date> values) {
            addCriterion("active_time not in", values, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeBetween(Date value1, Date value2) {
            addCriterion("active_time between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andActiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("active_time not between", value1, value2, "activeTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeIsNull() {
            addCriterion("resign_time is null");
            return (Criteria) this;
        }

        public Criteria andResignTimeIsNotNull() {
            addCriterion("resign_time is not null");
            return (Criteria) this;
        }

        public Criteria andResignTimeEqualTo(Date value) {
            addCriterion("resign_time =", value, "resignTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeNotEqualTo(Date value) {
            addCriterion("resign_time <>", value, "resignTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeGreaterThan(Date value) {
            addCriterion("resign_time >", value, "resignTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("resign_time >=", value, "resignTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeLessThan(Date value) {
            addCriterion("resign_time <", value, "resignTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeLessThanOrEqualTo(Date value) {
            addCriterion("resign_time <=", value, "resignTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeIn(List<Date> values) {
            addCriterion("resign_time in", values, "resignTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeNotIn(List<Date> values) {
            addCriterion("resign_time not in", values, "resignTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeBetween(Date value1, Date value2) {
            addCriterion("resign_time between", value1, value2, "resignTime");
            return (Criteria) this;
        }

        public Criteria andResignTimeNotBetween(Date value1, Date value2) {
            addCriterion("resign_time not between", value1, value2, "resignTime");
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