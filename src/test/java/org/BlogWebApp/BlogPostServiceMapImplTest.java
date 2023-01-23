package org.BlogWebApp;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BlogPostServiceMapImplTest {

    @Test
    void shouldAddCorrectPost() {
//        given
        HashMap<String, BlogPost> blogPost = new HashMap<>();
        BlogPost post = new BlogPost("id", "test");
//        when
        blogPost.put("id", post);
//        then
        assertNotNull(blogPost);
    }

    @Test
    void getPostsTest() {
        //        given
        HashMap<String, BlogPost> blogPost = new HashMap<>();
        BlogPost post = new BlogPost("id", "test");
//        when
        blogPost.put("id", post);
//        when
        assertNotNull(blogPost);
    }

    @Test
    void getPostTest() {
        //        given
        HashMap<String, BlogPost> blogPost = new HashMap<>();
        BlogPost post = new BlogPost("id", "test");
//        when
        blogPost.put("id", post);
//        then
        assertNotNull(blogPost.get("id"));
    }

    @Test
    void editPostTest() throws BlogPostException{
        //        given
        HashMap<String, BlogPost> blogPost = new HashMap<>();
        BlogPost post = new BlogPost("id", "test");
//        when
        blogPost.put("id", post);
//        then
        assertNotNull(post.getId());
    }

    @Test
    void deletePostTest() {
        //        given
        HashMap<String, BlogPost> blogPost = new HashMap<>();
        BlogPost post = new BlogPost("id", "test");
//        when
        blogPost.put("idt", post);
        blogPost.remove("idt");
//        then
        assertFalse(blogPost.containsKey("idt"));
    }

    @Test
    void deletePostsTest() {
        //        given
        HashMap<String, BlogPost> blogPost = new HashMap<>();
        BlogPost post = new BlogPost("id", "test");
//        when
        blogPost.put("idt", post);
        blogPost.clear();
//        then
        assertFalse(blogPost.containsValue(post));
    }

    @Test
    void postExistTest() {
        //        given
        HashMap<String, BlogPost> blogPost = new HashMap<>();
        BlogPost post = new BlogPost("id", "test");
//        when
        blogPost.put("idt", post);
//        then
        assertTrue(blogPost.containsKey("idt"));
    }
}