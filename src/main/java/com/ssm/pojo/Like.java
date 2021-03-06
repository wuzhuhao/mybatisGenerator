package com.ssm.pojo;

import java.io.Serializable;

public class Like implements Serializable {
    /**
     * 
     * 表字段 : like_diary.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : like_diary.diary_id
     */
    private Integer diaryId;

    /**
     * 
     * 表字段 : like_diary.user_id
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table like_diary
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:like_diary.id
     *
     * @return like_diary.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:like_diary.id
     *
     * @param id the value for like_diary.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:like_diary.diary_id
     *
     * @return like_diary.diary_id, 
     */
    public Integer getDiaryId() {
        return diaryId;
    }

    /**
     * 设置  字段:like_diary.diary_id
     *
     * @param diaryId the value for like_diary.diary_id, 
     */
    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    /**
     * 获取  字段:like_diary.user_id
     *
     * @return like_diary.user_id, 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置  字段:like_diary.user_id
     *
     * @param userId the value for like_diary.user_id, 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}