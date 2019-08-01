package com.atguigu.gulimall.sms.dao;

import com.atguigu.gulimall.sms.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author zhangshaohu
 * @email 1362048417@qq.com
 * @date 2019-08-01 21:38:18
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
