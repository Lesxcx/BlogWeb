package org.BlogWebApp;

import static org.junit.jupiter.api.Assertions.*;

class BlogPostTest {

    @org.junit.jupiter.api.Test
    void shouldGetCorrectId() {
//        given
BlogPost blogPost = new BlogPost();
blogPost.setId("1");
//        when

//        then
        assertSame("1", blogPost.getId());
    }
    @org.junit.jupiter.api.Test
    void shouldGetNullId() {
//        given
        BlogPost blogPost = new BlogPost();
        blogPost.setId(null);
//        when

//        then
        assertNull(blogPost.getId());
    }
    @org.junit.jupiter.api.Test
    void shouldGetEmptyId() {
//        given
        BlogPost blogPost = new BlogPost();
        blogPost.setId("");
//        when

//        then
        assertEquals("", blogPost.getId());
    }
    @org.junit.jupiter.api.Test
    void shouldGetCorrectPost() {
//given
        BlogPost blogPost = new BlogPost();
//        when
        blogPost.setPost("test");
//        then
        assertSame("test", blogPost.getPost());
    }
    @org.junit.jupiter.api.Test
    void shouldGetNullPost() {
//given
        BlogPost blogPost = new BlogPost();
//        when
        blogPost.setPost(null);
//        then
        assertSame(null, blogPost.getPost());
    }
    @org.junit.jupiter.api.Test
    void shouldGetEmptyPost() {
//given
        BlogPost blogPost = new BlogPost();
//        when
        blogPost.setPost("");
//        then
        assertSame("", blogPost.getPost());
    }
    @org.junit.jupiter.api.Test
    void shouldSetCorrectId() {
//        given
        BlogPost blogPost = new BlogPost();
//        when
        blogPost.setId("test");
//        when
        assertSame("test", blogPost.getId());
    }
    @org.junit.jupiter.api.Test
    void shouldSetEmptyId() {
//        given
        BlogPost blogPost = new BlogPost();
//        when
        blogPost.setId("");
//        when
        assertSame("", blogPost.getId());
    }
    @org.junit.jupiter.api.Test
    void shouldSetNullId() {
//        given
        BlogPost blogPost = new BlogPost();
//        when
        blogPost.setId(null);
//        when
        assertSame(null, blogPost.getId());
    }

    @org.junit.jupiter.api.Test
    void shouldSetCorrectPost() {
//        given
        BlogPost blogPost = new BlogPost();
//        when
        blogPost.setPost("test");
//        then
        assertSame("test", blogPost.getPost());
    }
    @org.junit.jupiter.api.Test
    void shouldSetEmptytPost() {
//        given
        BlogPost blogPost = new BlogPost();
//        when
        blogPost.setPost("");
//        then
        assertSame("", blogPost.getPost());
    }
    @org.junit.jupiter.api.Test
    void shouldSetNullPost() {
//        given
        BlogPost blogPost = new BlogPost();
//        when
        blogPost.setPost(null);
//        then
        assertSame(null, blogPost.getPost());
    }
}