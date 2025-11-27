package com.group4.service.impl;

import com.group4.entity.po.Post;
import com.group4.mapper.PostMapper;
import com.group4.service.IPostService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储用户发布的核心帖子内容（文本、视频等） 服务实现类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements IPostService {

}
