package cn.blog.dao;

import cn.blog.common.ServerResponse;
import cn.blog.pojo.Category;
import cn.blog.vo.CategoryVo;

import java.util.List;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer categoryid);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer categoryid);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    List<Category> selectAll();

    List<CategoryVo> selectAllSimple();

    List<CategoryVo> selectAllWithBlogCount();
}