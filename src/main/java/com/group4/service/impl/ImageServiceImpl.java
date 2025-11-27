package com.group4.service.impl;

import com.group4.entity.po.Image;
import com.group4.mapper.ImageMapper;
import com.group4.service.IImageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储帖子关联的多张图片（一对多关系） 服务实现类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image> implements IImageService {

}
