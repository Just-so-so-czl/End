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
 * 用户好友关系表，记录双向好友关系（每对好友仅存一条记录）
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("friend")
public class Friend implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 好友关系唯一标识
     */
    @TableId(value = "friend_id", type = IdType.AUTO)
    private Integer friendId;

    /**
     * 好友关系发起方 ID（关联账户表，而非个人资料表）；标识用户 B 是用户 A 的好友，删除账户时由应用层处理级联删除
     */
    private Integer useraId;

    /**
     * 好友关系接收方 ID（关联账户表）；标识用户 A 是用户 B 的好友，删除账户时由应用层处理级联删除
     */
    private Integer userbId;

    /**
     * 成为好友的时间（系统自动生成），用于好友列表按添加时间排序
     */
    private LocalDateTime createTime;


}
