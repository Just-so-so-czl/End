package com.group4.service.impl;

import com.group4.entity.po.Account;
import com.group4.mapper.AccountMapper;
import com.group4.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储用户账户核心信息与安全状态 服务实现类
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
