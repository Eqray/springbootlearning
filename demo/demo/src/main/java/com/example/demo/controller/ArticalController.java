package com.example.demo.controller;

import com.example.demo.CustomResponse;
import com.example.demo.model.Artical;
import com.example.demo.model.Reader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class ArticalController {

//    @RequestMapping(value = "/articales/{id}",method = RequestMethod.GET)
    @GetMapping(value = "/articales/{id}")
    public CustomResponse getArtical(@PathVariable("id") Long id){
        List<Reader> readers = new ArrayList<Reader>(){{
           add(new Reader("test",21));
           add(new Reader("test2",22));
        }};
        Artical artical = Artical.builder()
                .id(1L)
                .author("test")
                .content("who cares")
                .createTime( new Date())
                .reader(readers)
                .title("tile")
                .build();


        log.info("artical" + artical);
        return  CustomResponse.success(artical);
    }

    @RequestMapping(value = "/articales",method = RequestMethod.POST)
    public CustomResponse saveArtical(@RequestBody Artical artical){


        log.info("saveArtical" + artical);
        return  CustomResponse.success();
    }

//    @RequestMapping(value = "/articales",method = RequestMethod.POST)
//    public CustomResponse saveArtical(@RequestParam String author,
//                                      @RequestParam String title,
//                                      @RequestParam String content,
//                                      @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//                                      @RequestParam Date createTime){
//
//
//        log.info("saveArtical" + createTime);
//        return  CustomResponse.success();
//    }

    @RequestMapping(value = "/articales", method = RequestMethod.PUT)
    public CustomResponse updateArtical(@RequestBody Artical artical){
        if(artical.getId() == null){
            //todo exception
        }

        log.info("updateArtical" + artical);
        return CustomResponse.success();
    }

    @RequestMapping(value = "/articales/{id}",method = RequestMethod.DELETE)
    public CustomResponse deleteArtical(@PathVariable("id") Long id){


        log.info("updateArtical" + id);
        return CustomResponse.success();
    }
}
