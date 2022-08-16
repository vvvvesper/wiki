package com.imooc.wiki.mapper;

import com.imooc.wiki.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    List<Student> search();
}
