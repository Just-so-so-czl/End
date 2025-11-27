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
 * 用户个人资料表，与 user 表一对一关联
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("profile")
public class Profile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关联账户表 user_id，与账户形成一对一关系；删除账户时由应用层处理级联删除
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 头像图片 URL（默认系统头像，后续可扩展 “头像上传” 功能），个人资料页展示
     */
    private String avatar;

    /**
     * 性别（仅支持三种状态，默认 “保密”），符合用户隐私需求，个人资料页可选展示
     */
    private String gender;

    /**
     * 注册 / 登录用手机号（11 位数字，唯一不可重复），支持非手机号注册，仅用于身份验证与密码找回
     */
    private String phone;

    /**
     * 地区（如 “北京市朝阳区”，默认空），个人资料页展示，后续可扩展 “地区选择” 功能
     */
    private String city;

    /**
     * 个性签名（限制 100 字内，支持自定义编辑），个人资料页展示，增强用户个性化表达
     */
    private String signature;

    /**
     * 用户主页背景图片 URL（默认系统背景图，支持后续扩展 “背景图上传” 功能）
     */
    private String backgroundImg;


}
