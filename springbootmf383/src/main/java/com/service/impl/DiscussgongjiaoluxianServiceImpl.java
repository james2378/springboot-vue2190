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


import com.dao.DiscussgongjiaoluxianDao;
import com.entity.DiscussgongjiaoluxianEntity;
import com.service.DiscussgongjiaoluxianService;
import com.entity.vo.DiscussgongjiaoluxianVO;
import com.entity.view.DiscussgongjiaoluxianView;

@Service("discussgongjiaoluxianService")
public class DiscussgongjiaoluxianServiceImpl extends ServiceImpl<DiscussgongjiaoluxianDao, DiscussgongjiaoluxianEntity> implements DiscussgongjiaoluxianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgongjiaoluxianEntity> page = this.selectPage(
                new Query<DiscussgongjiaoluxianEntity>(params).getPage(),
                new EntityWrapper<DiscussgongjiaoluxianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgongjiaoluxianEntity> wrapper) {
		  Page<DiscussgongjiaoluxianView> page =new Query<DiscussgongjiaoluxianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgongjiaoluxianVO> selectListVO(Wrapper<DiscussgongjiaoluxianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgongjiaoluxianVO selectVO(Wrapper<DiscussgongjiaoluxianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgongjiaoluxianView> selectListView(Wrapper<DiscussgongjiaoluxianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgongjiaoluxianView selectView(Wrapper<DiscussgongjiaoluxianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
