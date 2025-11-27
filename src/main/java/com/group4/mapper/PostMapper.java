package com.group4.mapper;

import com.group4.entity.po.Post;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 存储用户发布的核心帖子内容（文本、视频等） Mapper 接口
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Mapper
public interface PostMapper extends BaseMapper<Post> {

}
