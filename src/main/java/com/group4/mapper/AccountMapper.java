package com.group4.mapper;

import com.group4.entity.po.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 存储用户账户核心信息与安全状态 Mapper 接口
 * </p>
 *
 * @author czl
 * @since 2025-11-27
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {

}
