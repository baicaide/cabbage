package org.alex.common.simple.service;

import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author alexcai
 * @Date 2021/5/11 22:19
 */
@Service("SampleService")
public class SampleServiceImpl {

  public String getFrontString() {
    return "Hello World";
  }

}
