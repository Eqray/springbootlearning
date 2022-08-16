package com.example.demo.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder(value={"content","title"})
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = "id")
public class Artical {

    private Long id;
    @JsonProperty("auther")
    private String author;
    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+9")
    private Date createTime;

    private List<Reader> reader;
}
