package com.group4.service.impl;

import com.group4.entity.po.Friend;
import com.group4.mapper.FriendMapper;
import com.group4.service.IFriendService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户好友关系表，记录双向好友关系（每对好友仅存一条记录） 服务实现类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Service
public class FriendServiceImpl extends ServiceImpl<FriendMapper, Friend> implements IFriendService {

}
