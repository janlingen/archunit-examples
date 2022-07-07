package com.yourname.yourprojectname.adapters.database.dataaccess;

import com.yourname.yourprojectname.adapters.database.datatransfer.entities.DummyEntityDto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author your-name
 */
public interface DummyDao extends JpaRepository<DummyEntityDto, Long> {

}
