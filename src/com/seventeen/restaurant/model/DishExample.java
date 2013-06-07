package com.seventeen.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class DishExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dish
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dish
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dish
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    public DishExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
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
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dish
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dish
     *
     * @mbggenerated
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdIsNull() {
            addCriterion("dish_group_id is null");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdIsNotNull() {
            addCriterion("dish_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdEqualTo(String value) {
            addCriterion("dish_group_id =", value, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdNotEqualTo(String value) {
            addCriterion("dish_group_id <>", value, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdGreaterThan(String value) {
            addCriterion("dish_group_id >", value, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("dish_group_id >=", value, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdLessThan(String value) {
            addCriterion("dish_group_id <", value, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdLessThanOrEqualTo(String value) {
            addCriterion("dish_group_id <=", value, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdLike(String value) {
            addCriterion("dish_group_id like", value, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdNotLike(String value) {
            addCriterion("dish_group_id not like", value, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdIn(List<String> values) {
            addCriterion("dish_group_id in", values, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdNotIn(List<String> values) {
            addCriterion("dish_group_id not in", values, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdBetween(String value1, String value2) {
            addCriterion("dish_group_id between", value1, value2, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishGroupIdNotBetween(String value1, String value2) {
            addCriterion("dish_group_id not between", value1, value2, "dishGroupId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdIsNull() {
            addCriterion("dish_style_id is null");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdIsNotNull() {
            addCriterion("dish_style_id is not null");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdEqualTo(String value) {
            addCriterion("dish_style_id =", value, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdNotEqualTo(String value) {
            addCriterion("dish_style_id <>", value, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdGreaterThan(String value) {
            addCriterion("dish_style_id >", value, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdGreaterThanOrEqualTo(String value) {
            addCriterion("dish_style_id >=", value, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdLessThan(String value) {
            addCriterion("dish_style_id <", value, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdLessThanOrEqualTo(String value) {
            addCriterion("dish_style_id <=", value, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdLike(String value) {
            addCriterion("dish_style_id like", value, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdNotLike(String value) {
            addCriterion("dish_style_id not like", value, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdIn(List<String> values) {
            addCriterion("dish_style_id in", values, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdNotIn(List<String> values) {
            addCriterion("dish_style_id not in", values, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdBetween(String value1, String value2) {
            addCriterion("dish_style_id between", value1, value2, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andDishStyleIdNotBetween(String value1, String value2) {
            addCriterion("dish_style_id not between", value1, value2, "dishStyleId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNull() {
            addCriterion("display_name is null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIsNotNull() {
            addCriterion("display_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayNameEqualTo(String value) {
            addCriterion("display_name =", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotEqualTo(String value) {
            addCriterion("display_name <>", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThan(String value) {
            addCriterion("display_name >", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
            addCriterion("display_name >=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThan(String value) {
            addCriterion("display_name <", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLessThanOrEqualTo(String value) {
            addCriterion("display_name <=", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameLike(String value) {
            addCriterion("display_name like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotLike(String value) {
            addCriterion("display_name not like", value, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameIn(List<String> values) {
            addCriterion("display_name in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotIn(List<String> values) {
            addCriterion("display_name not in", values, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameBetween(String value1, String value2) {
            addCriterion("display_name between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andDisplayNameNotBetween(String value1, String value2) {
            addCriterion("display_name not between", value1, value2, "displayName");
            return (Criteria) this;
        }

        public Criteria andTasteIsNull() {
            addCriterion("taste is null");
            return (Criteria) this;
        }

        public Criteria andTasteIsNotNull() {
            addCriterion("taste is not null");
            return (Criteria) this;
        }

        public Criteria andTasteEqualTo(String value) {
            addCriterion("taste =", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotEqualTo(String value) {
            addCriterion("taste <>", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThan(String value) {
            addCriterion("taste >", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThanOrEqualTo(String value) {
            addCriterion("taste >=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThan(String value) {
            addCriterion("taste <", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThanOrEqualTo(String value) {
            addCriterion("taste <=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLike(String value) {
            addCriterion("taste like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotLike(String value) {
            addCriterion("taste not like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteIn(List<String> values) {
            addCriterion("taste in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotIn(List<String> values) {
            addCriterion("taste not in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteBetween(String value1, String value2) {
            addCriterion("taste between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotBetween(String value1, String value2) {
            addCriterion("taste not between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleIsNull() {
            addCriterion("suitable_for_people is null");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleIsNotNull() {
            addCriterion("suitable_for_people is not null");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleEqualTo(String value) {
            addCriterion("suitable_for_people =", value, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleNotEqualTo(String value) {
            addCriterion("suitable_for_people <>", value, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleGreaterThan(String value) {
            addCriterion("suitable_for_people >", value, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("suitable_for_people >=", value, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleLessThan(String value) {
            addCriterion("suitable_for_people <", value, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleLessThanOrEqualTo(String value) {
            addCriterion("suitable_for_people <=", value, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleLike(String value) {
            addCriterion("suitable_for_people like", value, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleNotLike(String value) {
            addCriterion("suitable_for_people not like", value, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleIn(List<String> values) {
            addCriterion("suitable_for_people in", values, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleNotIn(List<String> values) {
            addCriterion("suitable_for_people not in", values, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleBetween(String value1, String value2) {
            addCriterion("suitable_for_people between", value1, value2, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andSuitableForPeopleNotBetween(String value1, String value2) {
            addCriterion("suitable_for_people not between", value1, value2, "suitableForPeople");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelIsNull() {
            addCriterion("nutrient_level is null");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelIsNotNull() {
            addCriterion("nutrient_level is not null");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelEqualTo(Short value) {
            addCriterion("nutrient_level =", value, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelNotEqualTo(Short value) {
            addCriterion("nutrient_level <>", value, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelGreaterThan(Short value) {
            addCriterion("nutrient_level >", value, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("nutrient_level >=", value, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelLessThan(Short value) {
            addCriterion("nutrient_level <", value, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelLessThanOrEqualTo(Short value) {
            addCriterion("nutrient_level <=", value, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelIn(List<Short> values) {
            addCriterion("nutrient_level in", values, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelNotIn(List<Short> values) {
            addCriterion("nutrient_level not in", values, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelBetween(Short value1, Short value2) {
            addCriterion("nutrient_level between", value1, value2, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andNutrientLevelNotBetween(Short value1, Short value2) {
            addCriterion("nutrient_level not between", value1, value2, "nutrientLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelIsNull() {
            addCriterion("recommended_level is null");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelIsNotNull() {
            addCriterion("recommended_level is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelEqualTo(Short value) {
            addCriterion("recommended_level =", value, "recommendedLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelNotEqualTo(Short value) {
            addCriterion("recommended_level <>", value, "recommendedLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelGreaterThan(Short value) {
            addCriterion("recommended_level >", value, "recommendedLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("recommended_level >=", value, "recommendedLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelLessThan(Short value) {
            addCriterion("recommended_level <", value, "recommendedLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelLessThanOrEqualTo(Short value) {
            addCriterion("recommended_level <=", value, "recommendedLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelIn(List<Short> values) {
            addCriterion("recommended_level in", values, "recommendedLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelNotIn(List<Short> values) {
            addCriterion("recommended_level not in", values, "recommendedLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelBetween(Short value1, Short value2) {
            addCriterion("recommended_level between", value1, value2, "recommendedLevel");
            return (Criteria) this;
        }

        public Criteria andRecommendedLevelNotBetween(Short value1, Short value2) {
            addCriterion("recommended_level not between", value1, value2, "recommendedLevel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dish
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dish
     *
     * @mbggenerated
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