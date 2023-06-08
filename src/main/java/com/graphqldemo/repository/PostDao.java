package com.graphqldemo.repository;

import com.graphqldemo.model.Post;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PostDao {
    private List<Post> list;

    {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Post.builder().id(i)
                    .title("title" + i)
                    .authorId(i * 10)
                    .category("category" + i * 10)
                    .build());
        }
    }

    public List<Post> getRecentPosts(int count, int offset) {
        List<Post> postList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            postList.add(list.get(offset));
            offset++;
        }
        return postList;
    }
}
