package com.beomble.nyang.menu.controller;

import com.beomble.nyang.login.vo.LoginVo;
import com.beomble.nyang.menu.service.MenuService;
import com.beomble.nyang.menu.vo.MenuVo;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@ResponseBody
@RestController
public class MenuController {
    MenuService menuService;

    @GetMapping("/catLists")
    public ArrayList<MenuVo> catLists(HttpServletRequest request, Model model){ // 로그인
        LoginVo loginVo = (LoginVo) request.getSession().getAttribute("loginMember");

        MenuVo menuVo = new MenuVo();
        menuVo.setMemberId(loginVo.getMemberId());
        ArrayList<MenuVo> catLists = new ArrayList<>();

        int catCounts = menuService.catCounts(menuVo.getMemberId());


        for (int i=0; i < catCounts; i++) {
            menuVo.setCatNum(i);
            catLists.add(menuService.catLists(menuVo));
        }

        return catLists;
    }

    @PostMapping("/selectCatImg")
    public MenuVo selectCatImg(HttpServletRequest request, @RequestBody MenuVo menuVo){ // 로그인
        LoginVo loginVo = (LoginVo) request.getSession().getAttribute("loginMember");

        menuVo.setMemberId(loginVo.getMemberId());

        //int catImg = Integer.parseInt(menuService.selectCatImg(menuVo).getCatImg());

        return menuService.selectCatImg(menuVo);
    }
}
