package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BisaixuanshouEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BisaixuanshouVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BisaixuanshouView;


/**
 * 比赛选手
 *
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface BisaixuanshouService extends IService<BisaixuanshouEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BisaixuanshouVO> selectListVO(Wrapper<BisaixuanshouEntity> wrapper);
   	
   	BisaixuanshouVO selectVO(@Param("ew") Wrapper<BisaixuanshouEntity> wrapper);
   	
   	List<BisaixuanshouView> selectListView(Wrapper<BisaixuanshouEntity> wrapper);
   	
   	BisaixuanshouView selectView(@Param("ew") Wrapper<BisaixuanshouEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BisaixuanshouEntity> wrapper);
   	

}

