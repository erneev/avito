package com.erneev.avito.service.impl;

import com.erneev.avito.dto.Post;
import com.erneev.avito.service.api.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MemPostService implements PostService {

    private List<Post> posts = new ArrayList<>(Arrays.asList(
            Post.builder()
                    .title("First Title")
                    .body("First body")
                    .build(),
            Post.builder()
                    .title("Second Title")
                    .body("Second body")
                    .build(),
            Post.builder()
                    .title("Third Title")
                    .body("Third body")
                    .build())
    );

    @Override
    public List<Post> search() {
        return null;
    }
}
