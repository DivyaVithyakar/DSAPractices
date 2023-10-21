package dsapractice.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
	 * 
	 */
	import java.util.*;

	class Twitter {
	    private int timeStamp = 0;
	    private Map<Integer, User> userMap;

	    private class Tweet {
	        int tweetId;
	        int time;

	        public Tweet(int tweetId, int time) {
	            this.tweetId = tweetId;
	            this.time = time;
	        }
	    }

	    private class User {
	        int userId;
	        Set<Integer> followed;
	        List<Tweet> tweets;

	        public User(int userId) {
	            this.userId = userId;
	            followed = new HashSet<Integer>();
	            tweets = new ArrayList<Tweet>();
	            follow(userId); // User follows itself initially.
	        }

	        public void follow(int userId) {
	            followed.add(userId);
	        }

	        public void unfollow(int userId) {
	            if (userId != this.userId) { // User cannot unfollow itself.
	                followed.remove(userId);
	            }
	        }

	        public void postTweet(int tweetId) {
	            tweets.add(new Tweet(tweetId, timeStamp++));
	        }
	    }

	    /** Initialize your data structure here. */
	    public Twitter() {
	        userMap = new HashMap<Integer, User>();
	    }

	    /** Compose a new tweet. */
	    public void postTweet(int userId, int tweetId) {
	        if (!userMap.containsKey(userId)) {
	            userMap.put(userId, new User(userId));
	        }
	        userMap.get(userId).postTweet(tweetId);
	    }

	    /**
	     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item in
	     * the news feed must be posted by users who the user followed or by the user
	     * herself. Tweets must be ordered from most recent to least recent.
	     */
	    public List<Integer> getNewsFeed(int userId) {
	        List<Integer> result = new ArrayList<Integer>();
	        if (!userMap.containsKey(userId)) {
	            return result;
	        }

	        Set<Integer> followedUsers = userMap.get(userId).followed;
	        PriorityQueue<Tweet> pq = new PriorityQueue<Tweet>((a, b) -> b.time - a.time);

	        for (int followedUserId : followedUsers) {
	            List<Tweet> tweets = userMap.get(followedUserId).tweets;
	            for (Tweet tweet : tweets) {
	                pq.offer(tweet);
	                if (pq.size() > 10) {
	                    pq.poll();
	                }
	            }
	        }

	        while (!pq.isEmpty()) {
	            result.add(0, pq.poll().tweetId); // Add tweets in reverse order (most recent first).
	        }

	        return result;
	    }

	    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
	    public void follow(int followerId, int followeeId) {
	        if (!userMap.containsKey(followerId)) {
	            userMap.put(followerId, new User(followerId));
	        }
	        if (!userMap.containsKey(followeeId)) {
	            userMap.put(followeeId, new User(followeeId));
	        }
	        userMap.get(followerId).follow(followeeId);
	    }

	    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
	    public void unfollow(int followerId, int followeeId) {
	        if (userMap.containsKey(followerId) && followerId != followeeId) {
	            userMap.get(followerId).unfollow(followeeId);
	        }
	    }
	
	
}