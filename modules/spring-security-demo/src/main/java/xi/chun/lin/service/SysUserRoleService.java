package xi.chun.lin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xi.chun.lin.mapper.SysUserRoleMapper;
import xi.chun.lin.model.SysUserRole;

import java.util.List;

/**
 * Created by Lin.XiChun on 2018/9/27.
 */
@Service
public class SysUserRoleService {
    @Autowired(required = false)
    private SysUserRoleMapper userRoleMapper;

    public List<SysUserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}

