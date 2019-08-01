package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zhangshaohu
 * @email 1362048417@qq.com
 * @date 2019-08-01 20:57:09
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
