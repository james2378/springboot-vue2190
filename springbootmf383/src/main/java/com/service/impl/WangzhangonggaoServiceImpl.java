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


import com.dao.WangzhangonggaoDao;
import com.entity.WangzhangonggaoEntity;
import com.service.WangzhangonggaoService;
import com.entity.vo.WangzhangonggaoVO;
import com.entity.view.WangzhangonggaoView;

@Service("wangzhangonggaoService")
public class WangzhangonggaoServiceImpl extends ServiceImpl<WangzhangonggaoDao, WangzhangonggaoEntity> implements WangzhangonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WangzhangonggaoEntity> page = this.selectPage(
                new Query<WangzhangonggaoEntity>(params).getPage(),
                new EntityWrapper<WangzhangonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WangzhangonggaoEntity> wrapper) {
		  Page<WangzhangonggaoView> page =new Query<WangzhangonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WangzhangonggaoVO> selectListVO(Wrapper<WangzhangonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WangzhangonggaoVO selectVO(Wrapper<WangzhangonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WangzhangonggaoView> selectListView(Wrapper<WangzhangonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WangzhangonggaoView selectView(Wrapper<WangzhangonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
