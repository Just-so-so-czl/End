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
 * 存储好友请求的发起与处理状态
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("request")
public class Request implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 好友请求唯一标识
     */
    @TableId(value = "request_id", type = IdType.AUTO)
    private Integer requestId;

    /**
     * 好友请求发起者 ID（关联账户表）；标识用户 A 向用户 B 发送请求，删除发起者账户时自动删除请求（级联删除）
     */
    private Integer useraId;

    /**
     * 好友请求接收者 ID（关联账户表）；标识用户 A 向用户 B 发送请求，删除接收者账户时自动删除请求（级联删除）
     */
    private Integer userbId;

    /**
     * 请求状态（0 = 未处理，1 = 已同意，2 = 已拒绝），符合状态机管理逻辑
     */
    private Integer status;

    /**
     * 请求发起时间（系统自动生成），用于请求列表按时间排序
     */
    private LocalDateTime requestTime;

    /**
     * 请求处理时间（处理请求时更新，未处理时为 NULL），记录请求状态变更时间
     */
    private LocalDateTime updateTime;


}
