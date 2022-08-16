package com.imooc.wiki.service;

import com.imooc.wiki.domain.Student;
import com.imooc.wiki.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> search(){
        return studentMapper.search();
    }
}
