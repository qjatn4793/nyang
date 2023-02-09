package com.beomble.nyang.menu.service;

import com.beomble.nyang.menu.mapper.MenuMapper;
import com.beomble.nyang.menu.vo.MenuVo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service("MenuService")
public class MenuService {

    MenuMapper menuMapper;

    public MenuVo catLists(MenuVo menuVo) {

        return menuMapper.catLists(menuVo);
    }

    public int catCounts(String memberId) {

        return menuMapper.catCounts(memberId);
    }

    public MenuVo selectCatImg(MenuVo menuVo) {

        return menuMapper.selectCatImg(menuVo);
    }
}
