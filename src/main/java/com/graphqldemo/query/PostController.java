package com.graphqldemo.query;

import com.graphqldemo.model.Post;
import com.graphqldemo.repository.PostDao;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PostController {
    private PostDao postDao;

    @QueryMapping
    public List<Post> recentPosts(@Argument int count, @Argument int offset) {
        System.out.println(count);
        return postDao.getRecentPosts(count, offset);
    }
}
