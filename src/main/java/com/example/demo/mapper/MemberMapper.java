package com.example.demo.mapper;

import com.example.demo.model.MemberModel;

import java.util.List;

public interface MemberMapper {

    public List<MemberModel> memberList() throws Exception;

    public int login(int id) throws Exception;
}
