package com.linkedbear.mybatis.encapsulate.b_metadata;

import com.linkedbear.mybatis.encapsulate.b_metadata.entity.Department;

public interface DepartmentMapper extends BaseMapper<Department> {
    
//    @Select("select * from tbl_department")
//    List<Department> findAll();
//
//    @Update("update tbl_department set name = #{name}, tel = #{tel} where id = #{id}")
//    int update(Department department);
//
//    @Select("select * from tbl_department where id = #{id}")
//    Department findById(String id);
}
