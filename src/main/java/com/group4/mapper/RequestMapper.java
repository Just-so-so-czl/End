package com.group4.mapper;

import com.group4.entity.po.Request;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 存储好友请求的发起与处理状态 Mapper 接口
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Mapper
public interface RequestMapper extends BaseMapper<Request> {

}
