package com.practice.lkdcode.module.post.domain.repository;

import com.practice.lkdcode.module.post.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    //    Page<Post> findTop100ByOrderByCreatedAtDesc(Pageable pageable);
    Page<Post> findByTitleContaining(String page, Pageable pageable);
}
