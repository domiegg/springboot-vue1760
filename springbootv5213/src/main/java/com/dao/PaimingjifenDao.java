package com.dao;

import com.entity.PaimingjifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaimingjifenVO;
import com.entity.view.PaimingjifenView;


/**
 * 排名计分
 * 
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface PaimingjifenDao extends BaseMapper<PaimingjifenEntity> {
	
	List<PaimingjifenVO> selectListVO(@Param("ew") Wrapper<PaimingjifenEntity> wrapper);
	
	PaimingjifenVO selectVO(@Param("ew") Wrapper<PaimingjifenEntity> wrapper);
	
	List<PaimingjifenView> selectListView(@Param("ew") Wrapper<PaimingjifenEntity> wrapper);

	List<PaimingjifenView> selectListView(Pagination page,@Param("ew") Wrapper<PaimingjifenEntity> wrapper);
	
	PaimingjifenView selectView(@Param("ew") Wrapper<PaimingjifenEntity> wrapper);
	

}
