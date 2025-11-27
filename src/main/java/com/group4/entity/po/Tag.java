package com.group4.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 绑定帖子与预定义标签（一对多关系）
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tag")
public class Tag implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标签关联记录唯一标识
     */
    @TableId(value = "tag_id", type = IdType.AUTO)
    private Integer tagId;

    /**
     * 关联帖子表 post_id，标识标签所属帖子；删除帖子时自动删除关联标签（级联删除）
     */
    private Integer postId;

    /**
     * 存储预定义标签名（枚举值可按需调整），仅允许选择系统预设标签，避免标签杂乱
     */
    private String name;


}
