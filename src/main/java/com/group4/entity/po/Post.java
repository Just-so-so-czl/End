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
 * 存储用户发布的核心帖子内容（文本、视频等）
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("post")
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 帖子唯一标识，关联 comment、rating、image 等子表
     */
    @TableId(value = "post_id", type = IdType.AUTO)
    private Integer postId;

    /**
     * 关联账户表 user_id，标识帖子发布者；删除账户时自动删除其所有帖子（级联删除）
     */
    private Integer userId;

    /**
     * 帖子文本内容（非必填，纯媒体帖子可空），限制 2000 字内，前端直接展示
     */
    private String text;

    /**
     * 视频文件 URL（非必填，仅支持单个视频），大小≤100MB，纯文本 / 图片帖子可空
     */
    private String videoUrl;

    /**
     * 自定义位置信息（非必填，如 “北京市朝阳区”），帖子卡片顶部展示
     */
    private String location;

    /**
     * 帖子发布时间（系统自动生成），用于帖子列表按时间降序排列
     */
    private LocalDateTime publishTime;

    /**
     * 帖子状态（1 = 正常，0 = 已删除），用户 / 管理员删除帖子时逻辑删除
     */
    private Integer status;


}
