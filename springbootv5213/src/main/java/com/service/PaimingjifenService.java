package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaimingjifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaimingjifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaimingjifenView;


/**
 * 排名计分
 *
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public interface PaimingjifenService extends IService<PaimingjifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaimingjifenVO> selectListVO(Wrapper<PaimingjifenEntity> wrapper);
   	
   	PaimingjifenVO selectVO(@Param("ew") Wrapper<PaimingjifenEntity> wrapper);
   	
   	List<PaimingjifenView> selectListView(Wrapper<PaimingjifenEntity> wrapper);
   	
   	PaimingjifenView selectView(@Param("ew") Wrapper<PaimingjifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaimingjifenEntity> wrapper);
   	

}

