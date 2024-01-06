package com.blog;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 2, message = "Title should be at least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 4, message = "Description should be at least 4 characters")
    private String description;

    @NotEmpty
    @Size(min = 4, message = "Content should be at least 4 characters")
    private String content;

//    public long getId() {
//        return id;
//    }
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
}

