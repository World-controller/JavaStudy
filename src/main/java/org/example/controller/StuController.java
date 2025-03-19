package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuController {
  public String getName(){
    return "ggb";
    }
    public int add(int a, int b) {
            return a + b;
  }

}
