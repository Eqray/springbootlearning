package com.example.demo;

import com.example.demo.model.Artical;
import com.example.demo.model.Reader;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JacksonTest {

    @Test
    void testJackson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<Reader> readers = new ArrayList<Reader>(){{
            add(new Reader("test",21));
            add(new Reader("test2",22));
        }};
        Artical artical = Artical.builder()
                .id(2L)
                .author("test")
                .content("who cares")
                .createTime( new Date())
                .reader(readers)
                .title("tile")
                .build();

        String jsonStr = mapper.writeValueAsString(artical);

        Artical artical1 = mapper.readValue(jsonStr, Artical.class);

        System.out.println(jsonStr);
    }

}
