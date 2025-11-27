package com.group4.service.impl;

import com.group4.entity.po.Tag;
import com.group4.mapper.TagMapper;
import com.group4.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 绑定帖子与预定义标签（一对多关系） 服务实现类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
