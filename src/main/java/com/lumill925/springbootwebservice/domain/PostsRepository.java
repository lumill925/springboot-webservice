package com.lumill925.springbootwebservice.domain;

import com.lumill925.springbootwebservice.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
