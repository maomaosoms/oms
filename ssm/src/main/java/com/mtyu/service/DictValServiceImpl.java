package com.mtyu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtyu.dao.DictValDao;
import com.mtyu.pojo.DictVal;

/**
 * dictVal的业务逻辑，使用注解进行事务管理
 * 
 * @author K-HItmaN
 *
 */
@Service
public class DictValServiceImpl implements DictValService {
	
	@Autowired
	private DictValDao dictValDao;
	
	public DictVal getDictVal(DictVal dictVal) {
		return dictValDao.getDictVal(dictVal);
	}

}
