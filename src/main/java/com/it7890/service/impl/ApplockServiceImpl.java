package com.it7890.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it7890.dao.SdkAliveMapperEX;
import com.it7890.model.SdkAlive;
import com.it7890.service.ApplockService;
import com.it7890.vo.SdkAliveVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mingle on 2018/5/8.
 */
@Service
public class ApplockServiceImpl implements ApplockService {
    @Resource
    SdkAliveMapperEX sdkAliveMapperEX;

    @Override
    public PageInfo<SdkAlive> selectAll1(Integer page, Integer size ){
        PageHelper.startPage(page, size);
        List<SdkAlive> ls = sdkAliveMapperEX.getByPage();
        PageInfo<SdkAlive> pageInfo = new PageInfo<>(ls);
        return pageInfo;
    }

    @Override
    public PageInfo<SdkAlive> getByParams(SdkAliveVo sdkAliveVo, Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<SdkAlive> ls = sdkAliveMapperEX.getByParams(sdkAliveVo);
        PageInfo<SdkAlive> pageInfo = new PageInfo<>(ls);
        return pageInfo;
    }
}
