package com.example.demo.service;

import com.example.demo.mapper.MemberRepository;
import com.example.demo.model.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService2 {
    @Autowired
    private MemberRepository MemberRepository;

    public List<MemberVO> findAll() {
        List<MemberVO> members = new ArrayList<>();
        MemberRepository.findAll().forEach(e -> members.add(e));
        return members;
    }

    public Optional<MemberVO> findById(Long memberNo){
        Optional<MemberVO> member = MemberRepository.findById(memberNo);
        return member;
    }

    public void deleteById(Long memberNo) {
        MemberRepository.deleteById(memberNo);
    }

    public MemberVO save(MemberVO member){
        MemberRepository.save(member);
        return member;
    }

    public void updateById(Long memberNo, MemberVO member){
        Optional<MemberVO> e = MemberRepository.findById(memberNo);

        if(e.isPresent()) {
            e.get().setMemberNo(member.getMemberNo());
            e.get().setId(member.getId());
            e.get().setName(member.getName());
            MemberRepository.save(member);
        }
    }
}
