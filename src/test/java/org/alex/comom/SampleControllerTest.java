package org.alex.comom;

import org.alex.common.simple.controller.SampleController;
import org.alex.common.simple.service.SampleServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @Description TODO
 * @Author alexcai
 * @Date 2021/5/11 22:11
 */
@RunWith(MockitoJUnitRunner.class)
public class SampleControllerTest {

  @InjectMocks
  private SampleController sampleController;

  @Mock
  private SampleServiceImpl sampleService;


  @Test
  public void getFirstTest() {
    Mockito.when(sampleService.getFrontString()).thenReturn("1111");
    String x = sampleController.getFirst();
    Assert.assertTrue(x.equals("1111"));
  }



}
