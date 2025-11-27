package com.group4.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 存储用户对帖子的星级评分
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("rating")
public class Rating implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评分唯一标识
     */
    @TableId(value = "rating_id", type = IdType.AUTO)
    private Integer ratingId;

    /**
     * 评分者 ID（关联账户表）；删除账户时自动删除其所有评分（级联删除）
     */
    private Integer userId;

    /**
     * 被评分帖子 ID（关联帖子表）；删除帖子时自动删除所有关联评分（级联删除）
     */
    private Integer postId;

    /**
     * 评分值（1-5 星，符合星级评分逻辑）
     */
    private Integer score;

    /**
     * 评分时间（系统自动生成）
     */
    private LocalDateTime createTime;


}
