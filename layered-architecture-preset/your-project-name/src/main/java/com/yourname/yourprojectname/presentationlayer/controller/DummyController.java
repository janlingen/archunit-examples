package com.yourname.yourprojectname.presentationlayer.controller;

import com.yourname.yourprojectname.applicationlayer.services.DummyService;
import org.springframework.stereotype.Controller;

/**
 * @author your-name
 */
@Controller
public class DummyController {

  private final String dummy = new String("Hello whoever uses this.");
  private final DummyService service;

  public DummyController(DummyService service) {
    this.service = service;
  }
}
