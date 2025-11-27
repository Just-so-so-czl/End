package com.group4.service.impl;

import com.group4.entity.po.Rating;
import com.group4.mapper.RatingMapper;
import com.group4.service.IRatingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储用户对帖子的星级评分 服务实现类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Service
public class RatingServiceImpl extends ServiceImpl<RatingMapper, Rating> implements IRatingService {

}
