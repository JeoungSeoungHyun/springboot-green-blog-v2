package site.metacoding.blogv2.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.blogv2.domain.post.Post;
import site.metacoding.blogv2.domain.post.PostRepository;

@RequiredArgsConstructor
@Service // 컴퍼넌트 스캔시 IoC에 등록 // 트랜잭션 관리를 위해 생성. //기능의 모임 //비즈닉스 로직(핵심 로직)
public class PostService {

    private final PostRepository postRepository;

    // DB에 insert한 Post를 다시 리턴 받음.
    @Transactional
    public void 글쓰기(Post post) {
        postRepository.save(post);
    }
}
