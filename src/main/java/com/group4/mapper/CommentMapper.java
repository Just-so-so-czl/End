package com.group4.mapper;

import com.group4.entity.po.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 存储帖子的普通评论与回复 Mapper 接口
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

}
