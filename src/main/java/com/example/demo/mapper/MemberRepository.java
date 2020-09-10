package com.example.demo.mapper;

import com.example.demo.model.MemberVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<MemberVO, Long> {
    //Repository 인터페이스 생성 후 JpaRepository<Entity, 기본키타입>을 상속받으면 기본적인 CRUD가 자동 생성.
    //JPA 처리를 담당하는 Repository는 기본적으로 4가지가 있다. (T : Entity의 타입클래스, ID : P.K 값의 Type)
    //1) Repository<T, ID>
    //2) CrudRepository<T, ID>
    //3) PagingAndSortingRepository<T, ID>
    //4) JpaRepository<T, ID>


    //findBy뒤에 컬럼명을 붙여주면 이를 이용한 검색이 가능하다
    public List<MemberVO> findById(String id);

    public List<MemberVO> findByName(String name);

    public List<MemberVO> findByNameLike(String keyword);
}
