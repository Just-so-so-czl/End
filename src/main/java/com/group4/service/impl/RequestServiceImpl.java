package com.group4.service.impl;

import com.group4.entity.po.Request;
import com.group4.mapper.RequestMapper;
import com.group4.service.IRequestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储好友请求的发起与处理状态 服务实现类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Service
public class RequestServiceImpl extends ServiceImpl<RequestMapper, Request> implements IRequestService {

}
