package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 인터페이스만 만들어 놓으면 구현체는 알아서 만들어 줌, Spring Bean에 등록까지 완료
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{
    // 쿼리 생성: select m from Member m where m.name = ?
    @Override
    Optional<Member> findByName(String name);
}
