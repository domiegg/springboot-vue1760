package com.entity.view;

import com.entity.BisaisaizhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 比赛赛制
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
@TableName("bisaisaizhi")
public class BisaisaizhiView  extends BisaisaizhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BisaisaizhiView(){
	}
 
 	public BisaisaizhiView(BisaisaizhiEntity bisaisaizhiEntity){
 	try {
			BeanUtils.copyProperties(this, bisaisaizhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
