package com.example.demo;

import com.example.demo.controller.ArticalController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
@Slf4j
public class ArticalRestControllerTest {

    private static MockMvc mockMvc;

    @BeforeAll
    static void setUp(){
        Object[] controllers;
        mockMvc = MockMvcBuilders.standaloneSetup(new ArticalController()).build();

    }
    @Test
    public void saveArtical() throws Exception{

        String artical = "{\"id\":3,\"content\":\"who cares\",\"title\":\"tile\",\"createTime\":\"2022/08/16 15:14:19\",\"reader\":[{\"name\":\"test\",\"age\":21},{\"name\":\"test2\",\"age\":22}],\"auther\":\"test\"}";

        MvcResult mvcResult =  mockMvc.perform(
                MockMvcRequestBuilders
                        .request(HttpMethod.POST,"/articales")
                        .contentType("application/json")
                        .content(artical)
        )
        .andExpect(MockMvcResultMatchers.status().is(200))
        .andExpect(MockMvcResultMatchers.jsonPath("$.data.title").value("tile"))
        .andDo(print())
        .andReturn();
        mvcResult.getResponse().setCharacterEncoding("UTF-8");
        log.info(mvcResult.getResponse().getContentAsString());

    }
}
