package com.group4.mapper;

import com.group4.entity.po.Rating;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 存储用户对帖子的星级评分 Mapper 接口
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Mapper
public interface RatingMapper extends BaseMapper<Rating> {

}
