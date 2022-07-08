package com.yourname.yourprojectname.datalayer.dataaccess;

import com.yourname.yourprojectname.datalayer.datatransfer.entities.DummyEntityDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author your-name
 */
@Repository
public interface DummyDao extends JpaRepository<DummyEntityDto, Long> {

}
