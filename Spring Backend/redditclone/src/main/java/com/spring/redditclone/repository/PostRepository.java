package com.spring.redditclone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.redditclone.model.Post;
import com.spring.redditclone.model.Subreddit;
import com.spring.redditclone.model.User;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> fndByUser(User user);
}