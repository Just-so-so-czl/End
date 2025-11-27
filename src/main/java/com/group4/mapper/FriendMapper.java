package com.group4.mapper;

import com.group4.entity.po.Friend;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户好友关系表，记录双向好友关系（每对好友仅存一条记录） Mapper 接口
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Mapper
public interface FriendMapper extends BaseMapper<Friend> {

}
