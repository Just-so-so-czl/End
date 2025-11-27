package com.group4.service;

import com.group4.entity.po.Friend;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户好友关系表，记录双向好友关系（每对好友仅存一条记录） 服务类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
public interface IFriendService extends IService<Friend> {

}
