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


import com.dao.DiscusswangzhangonggaoDao;
import com.entity.DiscusswangzhangonggaoEntity;
import com.service.DiscusswangzhangonggaoService;
import com.entity.vo.DiscusswangzhangonggaoVO;
import com.entity.view.DiscusswangzhangonggaoView;

@Service("discusswangzhangonggaoService")
public class DiscusswangzhangonggaoServiceImpl extends ServiceImpl<DiscusswangzhangonggaoDao, DiscusswangzhangonggaoEntity> implements DiscusswangzhangonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswangzhangonggaoEntity> page = this.selectPage(
                new Query<DiscusswangzhangonggaoEntity>(params).getPage(),
                new EntityWrapper<DiscusswangzhangonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswangzhangonggaoEntity> wrapper) {
		  Page<DiscusswangzhangonggaoView> page =new Query<DiscusswangzhangonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswangzhangonggaoVO> selectListVO(Wrapper<DiscusswangzhangonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswangzhangonggaoVO selectVO(Wrapper<DiscusswangzhangonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswangzhangonggaoView> selectListView(Wrapper<DiscusswangzhangonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswangzhangonggaoView selectView(Wrapper<DiscusswangzhangonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
