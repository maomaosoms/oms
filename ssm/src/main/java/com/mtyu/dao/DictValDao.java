package com.mtyu.dao;

import com.mtyu.pojo.DictVal;

public interface DictValDao {

	/**
	 * 根据businessTypeId和busiId获取busiValue
	 */
	public DictVal getDictVal(DictVal dictVal);
}
