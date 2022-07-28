package com.codestates.jwt.repository;

import com.codestates.jwt.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    public Member findByUsername(String member);   // username 기준으로 검색할 수 있도록 findByUsername()메서드를 생성
}