package com.it7890.controller;

import com.github.pagehelper.PageInfo;
import com.it7890.model.SdkAlive;
import com.it7890.service.impl.ApplockServiceImpl;
import com.it7890.utils.BuildResponse;
import com.it7890.utils.ResResult;
import com.it7890.vo.SdkAliveVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mingle on 2018/5/11.
 */
@Controller
@RequestMapping("/")
public class TestController {

    @Resource
    ApplockServiceImpl applockService;


    @RequestMapping("index")
    public String goIndex(){
        return "index";
    }

    @RequestMapping("all")
    public String getAll2(
            @RequestParam(value = "page", required = true, defaultValue = "1") Integer page,
            @RequestParam(value = "limit", required = true, defaultValue = "2") Integer limit,
            @RequestParam(value = "status", required = false) Integer status,
            Model map
    ){
        Long starttime = System.currentTimeMillis();
        SdkAliveVo sdkAliveVo = new SdkAliveVo();
        sdkAliveVo.setStatus(status);
        ResResult<PageInfo<SdkAlive>> data = BuildResponse.makeOKRsp(applockService.getByParams(sdkAliveVo, page, limit), System.currentTimeMillis()-starttime);
        map.addAttribute("datas", data);
        return "tables";
//        return data;
    }
}
