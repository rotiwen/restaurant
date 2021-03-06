package com.seventeen.restaurant.model;

public class Dish {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.id
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.dish_group_id
     *
     * @mbggenerated
     */
    private String dishGroupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.dish_style_id
     *
     * @mbggenerated
     */
    private String dishStyleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.display_name
     *
     * @mbggenerated
     */
    private String displayName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.taste
     *
     * @mbggenerated
     */
    private String taste;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.suitable_for_people
     *
     * @mbggenerated
     */
    private String suitableForPeople;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.nutrient_level
     *
     * @mbggenerated
     */
    private Short nutrientLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dish.recommended_level
     *
     * @mbggenerated
     */
    private Short recommendedLevel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.id
     *
     * @return the value of dish.id
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.id
     *
     * @param id the value for dish.id
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.dish_group_id
     *
     * @return the value of dish.dish_group_id
     *
     * @mbggenerated
     */
    public String getDishGroupId() {
        return dishGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.dish_group_id
     *
     * @param dishGroupId the value for dish.dish_group_id
     *
     * @mbggenerated
     */
    public void setDishGroupId(String dishGroupId) {
        this.dishGroupId = dishGroupId == null ? null : dishGroupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.dish_style_id
     *
     * @return the value of dish.dish_style_id
     *
     * @mbggenerated
     */
    public String getDishStyleId() {
        return dishStyleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.dish_style_id
     *
     * @param dishStyleId the value for dish.dish_style_id
     *
     * @mbggenerated
     */
    public void setDishStyleId(String dishStyleId) {
        this.dishStyleId = dishStyleId == null ? null : dishStyleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.code
     *
     * @return the value of dish.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.code
     *
     * @param code the value for dish.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.display_name
     *
     * @return the value of dish.display_name
     *
     * @mbggenerated
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.display_name
     *
     * @param displayName the value for dish.display_name
     *
     * @mbggenerated
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.taste
     *
     * @return the value of dish.taste
     *
     * @mbggenerated
     */
    public String getTaste() {
        return taste;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.taste
     *
     * @param taste the value for dish.taste
     *
     * @mbggenerated
     */
    public void setTaste(String taste) {
        this.taste = taste == null ? null : taste.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.description
     *
     * @return the value of dish.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.description
     *
     * @param description the value for dish.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.suitable_for_people
     *
     * @return the value of dish.suitable_for_people
     *
     * @mbggenerated
     */
    public String getSuitableForPeople() {
        return suitableForPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.suitable_for_people
     *
     * @param suitableForPeople the value for dish.suitable_for_people
     *
     * @mbggenerated
     */
    public void setSuitableForPeople(String suitableForPeople) {
        this.suitableForPeople = suitableForPeople == null ? null : suitableForPeople.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.nutrient_level
     *
     * @return the value of dish.nutrient_level
     *
     * @mbggenerated
     */
    public Short getNutrientLevel() {
        return nutrientLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.nutrient_level
     *
     * @param nutrientLevel the value for dish.nutrient_level
     *
     * @mbggenerated
     */
    public void setNutrientLevel(Short nutrientLevel) {
        this.nutrientLevel = nutrientLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dish.recommended_level
     *
     * @return the value of dish.recommended_level
     *
     * @mbggenerated
     */
    public Short getRecommendedLevel() {
        return recommendedLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dish.recommended_level
     *
     * @param recommendedLevel the value for dish.recommended_level
     *
     * @mbggenerated
     */
    public void setRecommendedLevel(Short recommendedLevel) {
        this.recommendedLevel = recommendedLevel;
    }
}