package com.it7890.service;

import com.github.pagehelper.PageInfo;
import com.it7890.model.SdkAlive;
import com.it7890.vo.SdkAliveVo;

/**
 * Created by mingle on 2018/5/8.
 */
public interface ApplockService {
    PageInfo<SdkAlive> selectAll1(Integer page, Integer size);
    PageInfo<SdkAlive> getByParams(SdkAliveVo sdkAliveVO, Integer page, Integer size);
}
