package org.alex.common.simple.controller;

import io.swagger.annotations.ApiOperation;
import org.alex.common.simple.service.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description TODO
 * @Author alexcai
 * @Date 2021/5/11 22:06
 */
@RestController
@RequestMapping("/sample")
public class SampleController {

  @Autowired
  private SampleServiceImpl sampleService;

  //http://localhost:8080/aaa/sample/first
  @ApiOperation("fdfd")
  @GetMapping("/first")
  public String getFirst() {
    return sampleService.getFrontString();
  }


}
