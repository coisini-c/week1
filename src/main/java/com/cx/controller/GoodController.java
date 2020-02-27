package com.cx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.sql.dialect.postgresql.visitor.PGASTVisitor;
import com.cx.bean.Dats;
import com.cx.bean.Good;
import com.cx.service.GoodService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodController {
	@Autowired
	private GoodService service;
	@RequestMapping("list")
	public String selallgoods(Model m,Dats dats) {
		System.out.println(dats);
		if (null==dats.getPagenum()||0==dats.getPagenum()) {
			dats.setPagenum(1);
		}
		PageHelper.startPage(dats.getPagenum(), 2);
		PageInfo<Good> page=new PageInfo<Good>(service.selallgood(dats));
		List<Good> list = page.getList();
		m.addAttribute("dats",dats);
		m.addAttribute("page",page);
		m.addAttribute("list",list);
		return "list";
	}
}
