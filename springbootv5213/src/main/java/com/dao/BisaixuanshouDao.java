package com.dao;

import com.entity.BisaixuanshouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BisaixuanshouVO;
import com.entity.view.BisaixuanshouView;


/**
 * 比赛选手
 * 
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface BisaixuanshouDao extends BaseMapper<BisaixuanshouEntity> {
	
	List<BisaixuanshouVO> selectListVO(@Param("ew") Wrapper<BisaixuanshouEntity> wrapper);
	
	BisaixuanshouVO selectVO(@Param("ew") Wrapper<BisaixuanshouEntity> wrapper);
	
	List<BisaixuanshouView> selectListView(@Param("ew") Wrapper<BisaixuanshouEntity> wrapper);

	List<BisaixuanshouView> selectListView(Pagination page,@Param("ew") Wrapper<BisaixuanshouEntity> wrapper);
	
	BisaixuanshouView selectView(@Param("ew") Wrapper<BisaixuanshouEntity> wrapper);
	

}
