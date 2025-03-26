package com.dao;

import com.entity.YouqinglianjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YouqinglianjieVO;
import com.entity.view.YouqinglianjieView;


/**
 * 友情链接
 * 
 * @author 
 * @email 
 * @date 2022-04-04 22:19:36
 */
public interface YouqinglianjieDao extends BaseMapper<YouqinglianjieEntity> {
	
	List<YouqinglianjieVO> selectListVO(@Param("ew") Wrapper<YouqinglianjieEntity> wrapper);
	
	YouqinglianjieVO selectVO(@Param("ew") Wrapper<YouqinglianjieEntity> wrapper);
	
	List<YouqinglianjieView> selectListView(@Param("ew") Wrapper<YouqinglianjieEntity> wrapper);

	List<YouqinglianjieView> selectListView(Pagination page,@Param("ew") Wrapper<YouqinglianjieEntity> wrapper);
	
	YouqinglianjieView selectView(@Param("ew") Wrapper<YouqinglianjieEntity> wrapper);
	

}
