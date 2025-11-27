package com.group4.service.impl;

import com.group4.entity.po.Comment;
import com.group4.mapper.CommentMapper;
import com.group4.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储帖子的普通评论与回复 服务实现类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
