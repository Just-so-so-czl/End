package com.group4.service.impl;

import com.group4.entity.po.Profile;
import com.group4.mapper.ProfileMapper;
import com.group4.service.IProfileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户个人资料表，与 user 表一对一关联 服务实现类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Service
public class ProfileServiceImpl extends ServiceImpl<ProfileMapper, Profile> implements IProfileService {

}
