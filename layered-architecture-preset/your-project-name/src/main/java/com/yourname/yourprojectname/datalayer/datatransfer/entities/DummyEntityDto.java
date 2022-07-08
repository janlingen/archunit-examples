package com.yourname.yourprojectname.datalayer.datatransfer.entities;

import com.yourname.yourprojectname.datalayer.datatransfer.values.DummyValueDto;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 * @author your-name
 */
@Entity
@Data
public class DummyEntityDto {

  @Id
  Long id;

  @Embedded
  DummyValueDto dummyValueDto;
}
