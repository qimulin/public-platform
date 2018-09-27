package xi.chun.lin.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xi.chun.lin.model.SysUserRole;

import java.util.List;

/**
 * Created by Lin.XiChun on 2018/9/27.
 */
@Mapper
public interface SysUserRoleMapper {
    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(Integer userId);
}
