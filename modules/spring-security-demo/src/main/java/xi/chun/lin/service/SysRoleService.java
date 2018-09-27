package xi.chun.lin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xi.chun.lin.mapper.SysRoleMapper;
import xi.chun.lin.model.SysRole;

/**
 * Created by Lin.XiChun on 2018/9/27.
 */
@Service
public class SysRoleService {
    @Autowired(required = false)
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id){
        return roleMapper.selectById(id);
    }
}
