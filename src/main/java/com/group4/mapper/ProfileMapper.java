package com.group4.mapper;

import com.group4.entity.po.Profile;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户个人资料表，与 user 表一对一关联 Mapper 接口
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Mapper
public interface ProfileMapper extends BaseMapper<Profile> {

}
