package com.group4.mapper;

import com.group4.entity.po.Image;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 存储帖子关联的多张图片（一对多关系） Mapper 接口
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Mapper
public interface ImageMapper extends BaseMapper<Image> {

}
