package com.cx.dao;

import java.util.List;

import com.cx.bean.Dats;
import com.cx.bean.Good;

public interface GoodDao {

	void selallbrand();

	void selalltype();

	List<Good> selallgoods(Dats dats);
	
}
