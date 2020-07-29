package com.ttstwitter.twitter.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ttstwitter.twitter.Model.Tweet;
import com.ttstwitter.twitter.Model.User;

@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long> {
    List<Tweet> findAllByOrderByCreatedAtDesc();
    List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);
    List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);
}