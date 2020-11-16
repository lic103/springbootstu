package com.example.demo.Controller;


import com.example.demo.model.Area;
import com.example.demo.service.AreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
@Api(value = "区域接口",description = "接口描述",tags = {"区域模块校验接口"})
public class AreaController {
    @Autowired
    AreaService areaService;
    @ApiOperation(value = "获取区域", notes="根据url的id来获取区域详细信息")
    @ApiParam(name="areaId", value = "区域id",type = "Integer",required = true)
    @RequestMapping(value = "/get/{areaId}",method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> getArea(@PathVariable("areaId") Integer areaId){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("area",areaService.getArea(areaId));
        return modelMap;
    }

    @ApiOperation(value = "添加区域",notes = "notes")
    @ApiParam(name="area", value = "区域模型",type = "Area",required = true)
    @RequestMapping(value = "/add",method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> addArea(Area area){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("success",areaService.addArea(area));

        return modelMap;
    }

    @ApiOperation(value = "编辑区域",notes = "notes")
    @ApiParam(name="area", value = "区域模型",type = "Area",required = true)
    @RequestMapping(value = "/edit",method = RequestMethod.PUT,produces = {"application/json;charset=UTF-8"})
    public Map<String,Object> editArea(Area area){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }

/*    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllArea(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return areaService.findAllArea(pageNum,pageSize);
    }*/
    @ApiOperation(value = "删除区域",notes = "notes")

    @RequestMapping(value="/del",method = RequestMethod.DELETE)
    @ApiParam(name="areaId", value = "区域id",type = "Integer",required = true)
    public Map<String,Object> deleteArea(@PathParam("areaId") Integer areaId){
        Map<String,Object> modelMap= new HashMap<String,Object>() ;
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }
    @GetMapping("/test")
    @ApiIgnore
    public String Test(){
        return "test";
    }

}
