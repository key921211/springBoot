package com.example.demo.service;

import com.example.demo.mapper.MemberMapper;
import com.example.demo.model.MemberModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<MemberModel> memberList() throws Exception{
        return memberMapper.memberList();
    }

    public int login(int id) throws Exception{
        return memberMapper.login(id);
    }
}
