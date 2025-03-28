package com.entity.vo;

import com.entity.SaishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 赛事信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-22 16:16:30
 */
public class SaishixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 比赛类型
	 */
	
	private String bisaileixing;
		
	/**
	 * 比赛赛制
	 */
	
	private String bisaisaizhi;
		
	/**
	 * 场次
	 */
	
	private String changci;
		
	/**
	 * 座位
	 */
	
	private String zuowei;
		
	/**
	 * 比赛时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date bisaishijian;
		
	/**
	 * 比赛时长
	 */
	
	private String bisaishizhang;
		
	/**
	 * 比赛详情
	 */
	
	private String bisaixiangqing;
		
	/**
	 * 选手账号
	 */
	
	private String xuanshouzhanghao;
		
	/**
	 * 选手姓名
	 */
	
	private String xuanshouxingming;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：比赛类型
	 */
	 
	public void setBisaileixing(String bisaileixing) {
		this.bisaileixing = bisaileixing;
	}
	
	/**
	 * 获取：比赛类型
	 */
	public String getBisaileixing() {
		return bisaileixing;
	}
				
	
	/**
	 * 设置：比赛赛制
	 */
	 
	public void setBisaisaizhi(String bisaisaizhi) {
		this.bisaisaizhi = bisaisaizhi;
	}
	
	/**
	 * 获取：比赛赛制
	 */
	public String getBisaisaizhi() {
		return bisaisaizhi;
	}
				
	
	/**
	 * 设置：场次
	 */
	 
	public void setChangci(String changci) {
		this.changci = changci;
	}
	
	/**
	 * 获取：场次
	 */
	public String getChangci() {
		return changci;
	}
				
	
	/**
	 * 设置：座位
	 */
	 
	public void setZuowei(String zuowei) {
		this.zuowei = zuowei;
	}
	
	/**
	 * 获取：座位
	 */
	public String getZuowei() {
		return zuowei;
	}
				
	
	/**
	 * 设置：比赛时间
	 */
	 
	public void setBisaishijian(Date bisaishijian) {
		this.bisaishijian = bisaishijian;
	}
	
	/**
	 * 获取：比赛时间
	 */
	public Date getBisaishijian() {
		return bisaishijian;
	}
				
	
	/**
	 * 设置：比赛时长
	 */
	 
	public void setBisaishizhang(String bisaishizhang) {
		this.bisaishizhang = bisaishizhang;
	}
	
	/**
	 * 获取：比赛时长
	 */
	public String getBisaishizhang() {
		return bisaishizhang;
	}
				
	
	/**
	 * 设置：比赛详情
	 */
	 
	public void setBisaixiangqing(String bisaixiangqing) {
		this.bisaixiangqing = bisaixiangqing;
	}
	
	/**
	 * 获取：比赛详情
	 */
	public String getBisaixiangqing() {
		return bisaixiangqing;
	}
				
	
	/**
	 * 设置：选手账号
	 */
	 
	public void setXuanshouzhanghao(String xuanshouzhanghao) {
		this.xuanshouzhanghao = xuanshouzhanghao;
	}
	
	/**
	 * 获取：选手账号
	 */
	public String getXuanshouzhanghao() {
		return xuanshouzhanghao;
	}
				
	
	/**
	 * 设置：选手姓名
	 */
	 
	public void setXuanshouxingming(String xuanshouxingming) {
		this.xuanshouxingming = xuanshouxingming;
	}
	
	/**
	 * 获取：选手姓名
	 */
	public String getXuanshouxingming() {
		return xuanshouxingming;
	}
			
}
