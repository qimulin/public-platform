package xi.chun.lin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xi.chun.lin.mapper.SysUserMapper;
import xi.chun.lin.model.SysUser;

/**
 * Created by Lin.XiChun on 2018/9/27.
 */
@Service
public class SysUserService {

    @Autowired(required = false)
    private SysUserMapper sysUserMapper;

    public SysUser selectById(Integer id) {
        return sysUserMapper.selectById(id);
    }

    public SysUser selectByName(String name) {
        return sysUserMapper.selectByName(name);
    }
}
