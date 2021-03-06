package com.esiran.greenpay.system.service.impl;

import com.esiran.greenpay.system.entity.Role;
import com.esiran.greenpay.system.mapper.RoleMapper;
import com.esiran.greenpay.system.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统角色 服务实现类
 * </p>
 *
 * @author Militch
 * @since 2020-04-13
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
