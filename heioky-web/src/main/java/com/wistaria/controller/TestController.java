package com.wistaria.controller;

import com.wistaria.base.ApiResult;
import com.wistaria.base.Result;
import com.wistaria.model.JunkTypesModel;
import com.wistaria.service.JunkTypesService;
import com.wistaria.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    private TestService testService;

    @Autowired
    private JunkTypesService junkTypesService;

    @RequestMapping("skip")
    public String skip() {
        testService.getContent();
        return "跳转页面";
    }

    @GetMapping("/list")
    public ApiResult<List<JunkTypesModel>> list() {
        List<JunkTypesModel> list = junkTypesService.findList();
        if (list != null) {
            return Result.success(list);
        } else {
            return Result.error(-1, "没有查询到相应信息，请检查后重新查询！");
        }

    }
}
