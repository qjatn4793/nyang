package com.beomble.nyang.menu.mapper;

import com.beomble.nyang.menu.vo.MenuVo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MenuMapper {

    MenuVo catLists(MenuVo menuVo);

    int catCounts(String memberId);

    MenuVo selectCatImg(MenuVo menuVo);
}
