package com.group4.mapper;

import com.group4.entity.po.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 绑定帖子与预定义标签（一对多关系） Mapper 接口
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Mapper
public interface TagMapper extends BaseMapper<Tag> {

}
