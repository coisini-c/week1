package com.cx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cx.bean.Dats;
import com.cx.bean.Good;
import com.cx.dao.GoodDao;
import com.cx.service.GoodService;
@Service
public class GoodSericeImpl implements GoodService {
	@Autowired
	private GoodDao dao;
	@Override
	public List<Good> selallgood(Dats dats) {
		// TODO Auto-generated method stub
		return dao.selallgoods(dats);
	}
	
}
