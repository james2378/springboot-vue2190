package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GongjiaoluxianEntity;
import com.entity.view.GongjiaoluxianView;

import com.service.GongjiaoluxianService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 公交路线
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-04 22:19:36
 */
@RestController
@RequestMapping("/gongjiaoluxian")
public class GongjiaoluxianController {
    @Autowired
    private GongjiaoluxianService gongjiaoluxianService;

    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GongjiaoluxianEntity gongjiaoluxian,
		HttpServletRequest request){
        EntityWrapper<GongjiaoluxianEntity> ew = new EntityWrapper<GongjiaoluxianEntity>();
		PageUtils page = gongjiaoluxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongjiaoluxian), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GongjiaoluxianEntity gongjiaoluxian, 
		HttpServletRequest request){
        EntityWrapper<GongjiaoluxianEntity> ew = new EntityWrapper<GongjiaoluxianEntity>();
		PageUtils page = gongjiaoluxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongjiaoluxian), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GongjiaoluxianEntity gongjiaoluxian){
       	EntityWrapper<GongjiaoluxianEntity> ew = new EntityWrapper<GongjiaoluxianEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gongjiaoluxian, "gongjiaoluxian")); 
        return R.ok().put("data", gongjiaoluxianService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GongjiaoluxianEntity gongjiaoluxian){
        EntityWrapper< GongjiaoluxianEntity> ew = new EntityWrapper< GongjiaoluxianEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gongjiaoluxian, "gongjiaoluxian")); 
		GongjiaoluxianView gongjiaoluxianView =  gongjiaoluxianService.selectView(ew);
		return R.ok("查询公交路线成功").put("data", gongjiaoluxianView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GongjiaoluxianEntity gongjiaoluxian = gongjiaoluxianService.selectById(id);
		gongjiaoluxian.setClicknum(gongjiaoluxian.getClicknum()+1);
		gongjiaoluxian.setClicktime(new Date());
		gongjiaoluxianService.updateById(gongjiaoluxian);
        return R.ok().put("data", gongjiaoluxian);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GongjiaoluxianEntity gongjiaoluxian = gongjiaoluxianService.selectById(id);
		gongjiaoluxian.setClicknum(gongjiaoluxian.getClicknum()+1);
		gongjiaoluxian.setClicktime(new Date());
		gongjiaoluxianService.updateById(gongjiaoluxian);
        return R.ok().put("data", gongjiaoluxian);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R vote(@PathVariable("id") String id,String type){
        GongjiaoluxianEntity gongjiaoluxian = gongjiaoluxianService.selectById(id);
        if(type.equals("1")) {
        	gongjiaoluxian.setThumbsupnum(gongjiaoluxian.getThumbsupnum()+1);
        } else {
        	gongjiaoluxian.setCrazilynum(gongjiaoluxian.getCrazilynum()+1);
        }
        gongjiaoluxianService.updateById(gongjiaoluxian);
        return R.ok("投票成功");
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GongjiaoluxianEntity gongjiaoluxian, HttpServletRequest request){
    	gongjiaoluxian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongjiaoluxian);
        gongjiaoluxianService.insert(gongjiaoluxian);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody GongjiaoluxianEntity gongjiaoluxian, HttpServletRequest request){
    	gongjiaoluxian.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(gongjiaoluxian);
        gongjiaoluxianService.insert(gongjiaoluxian);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody GongjiaoluxianEntity gongjiaoluxian, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gongjiaoluxian);
        gongjiaoluxianService.updateById(gongjiaoluxian);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gongjiaoluxianService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<GongjiaoluxianEntity> wrapper = new EntityWrapper<GongjiaoluxianEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = gongjiaoluxianService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,GongjiaoluxianEntity gongjiaoluxian, HttpServletRequest request,String pre){
        EntityWrapper<GongjiaoluxianEntity> ew = new EntityWrapper<GongjiaoluxianEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        params.put("order", "desc");
		PageUtils page = gongjiaoluxianService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gongjiaoluxian), params), params));
        return R.ok().put("data", page);
    }







}
