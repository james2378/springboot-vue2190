package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GongjiaoluxianDao;
import com.entity.GongjiaoluxianEntity;
import com.service.GongjiaoluxianService;
import com.entity.vo.GongjiaoluxianVO;
import com.entity.view.GongjiaoluxianView;

@Service("gongjiaoluxianService")
public class GongjiaoluxianServiceImpl extends ServiceImpl<GongjiaoluxianDao, GongjiaoluxianEntity> implements GongjiaoluxianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GongjiaoluxianEntity> page = this.selectPage(
                new Query<GongjiaoluxianEntity>(params).getPage(),
                new EntityWrapper<GongjiaoluxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GongjiaoluxianEntity> wrapper) {
		  Page<GongjiaoluxianView> page =new Query<GongjiaoluxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GongjiaoluxianVO> selectListVO(Wrapper<GongjiaoluxianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GongjiaoluxianVO selectVO(Wrapper<GongjiaoluxianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GongjiaoluxianView> selectListView(Wrapper<GongjiaoluxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GongjiaoluxianView selectView(Wrapper<GongjiaoluxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
