package com.mtyu.service;

import com.mtyu.pojo.DictVal;

public interface DictValService {

    /**
     * 根据businessTypeId和busiId获取busiValue
     */
    DictVal getDictVal(DictVal dictVal);
}
