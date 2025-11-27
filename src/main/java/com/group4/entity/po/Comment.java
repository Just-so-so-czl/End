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
 * 存储帖子的普通评论与回复
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论唯一标识，用于删除评论时定位数据
     */
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    /**
     * 评论 / 回复发起者 ID（关联账户表）；删除账户时自动删除其所有评论（级联删除）
     */
    private Integer useraId;

    /**
     * 被回复者 ID（关联账户表，NULL = 普通评论，非 NULL = 回复评论），如 “用户 A 回复用户 B”
     */
    private Integer userbId;

    /**
     * 关联帖子表 post_id，标识评论所属帖子；删除帖子时自动删除所有关联评论（级联删除）
     */
    private Integer postId;

    /**
     * 评论文本（限制 200 字内），前端直接展示
     */
    private String commentContent;

    /**
     * 评论时间（系统自动生成），用于评论列表按时间降序排列
     */
    private LocalDateTime createTime;

    /**
     * 评论状态（1 = 正常，0 = 已删除），用户删除自己评论时逻辑删除
     */
    private Integer status;


}
