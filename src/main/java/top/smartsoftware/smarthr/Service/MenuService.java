package top.smartsoftware.smarthr.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.stereotype.Service;
import top.smartsoftware.smarthr.mapper.MenuMapper;
import top.smartsoftware.smarthr.model.Hr;
import top.smartsoftware.smarthr.model.Menu;

import java.util.List;

/**
 * @Description
 * @Author xjx
 * @Date 2020-11-19
 */

@Service
public class MenuService {

    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());
    }

    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }
}
