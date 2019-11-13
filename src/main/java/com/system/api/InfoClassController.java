package com.system.api;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.system.entity.Result;
import com.system.entity.TrainTuple;
import com.system.entity.ext.TrainTupleExt;
import com.system.service.InfoClassService;
import com.system.util.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/infoclass")
public class InfoClassController {

    @Resource
    InfoClassService infoClassService;

    @RequestMapping(value = "/select/selectForPage",method = RequestMethod.POST)
    public Result selectForPage(String jsonStr){
        Page<TrainTupleExt> search = JSONObject.parseObject(jsonStr, new TypeReference<Page<TrainTupleExt>>() {
        });
        PageInfo<TrainTupleExt> result=infoClassService.selectForPage(search);
        Map map=new HashMap();
        map.put("resultList",result.getList());
        map.put("totalSize",result.getTotal());
        return new Result(map);
    }



    @RequestMapping(value = "/get/getObject",method = RequestMethod.POST)
    public Result getObject(String jsonStr){
        TrainTupleExt search = JSONObject.parseObject(jsonStr,TrainTupleExt.class);
        TrainTupleExt result=infoClassService.getObject(search);
        Map map=new HashMap();
        map.put("resultList",result);
        return new Result(map);
    }

    @RequestMapping(value = "/insert/insert")
    public Result insert(String jsonStr){
        TrainTupleExt trainTupleExt=JSONObject.parseObject(jsonStr,TrainTupleExt.class);
        infoClassService.insert(trainTupleExt);
        return new Result(Result.defaultSuccessResult());
    }

    @RequestMapping(value = "/update/update")
    public Result update(String jsonStr){
        TrainTupleExt trainTupleExt=JSONObject.parseObject(jsonStr,TrainTupleExt.class);
        infoClassService.update(trainTupleExt);
        return new Result(Result.defaultSuccessResult());
    }

    @RequestMapping(value = "/delete/delete")
    public Result delete(String jsonStr){
        TrainTupleExt trainTupleExt=JSONObject.parseObject(jsonStr,TrainTupleExt.class);
        infoClassService.delete(trainTupleExt);
        return new Result(Result.defaultSuccessResult());
    }
}
