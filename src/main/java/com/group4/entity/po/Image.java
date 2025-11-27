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
 * 存储帖子关联的多张图片（一对多关系）
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("image")
public class Image implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片记录唯一标识
     */
    @TableId(value = "image_id", type = IdType.AUTO)
    private Integer imageId;

    /**
     * 关联帖子表 post_id，标识图片所属帖子；删除帖子时自动删除所有关联图片（级联删除）
     */
    private Integer postId;

    /**
     * 单张图片 URL（每张图片单独存储），大小≤500KB，支持多张图片上传
     */
    private String url;


}
