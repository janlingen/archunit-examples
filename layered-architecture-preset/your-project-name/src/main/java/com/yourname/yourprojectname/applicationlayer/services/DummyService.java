package com.yourname.yourprojectname.applicationlayer.services;

import com.yourname.yourprojectname.datalayer.implementation.DummyRepository;
import org.springframework.stereotype.Service;

/**
 * @author your-name
 */
@Service
public class DummyService {

  private final DummyRepository repository;

  public DummyService(DummyRepository repository) {
    this.repository = repository;
  }
}
