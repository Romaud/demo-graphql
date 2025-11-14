package com.graphqldemo.query;

import com.graphqldemo.model.Post;
import com.graphqldemo.repository.PostDao;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostDao postDao;

    @QueryMapping
    public List<Post> recentPosts(@Argument Integer count, @Argument Integer offset) {
        return postDao.getRecentPosts(count, offset);
    }
}
