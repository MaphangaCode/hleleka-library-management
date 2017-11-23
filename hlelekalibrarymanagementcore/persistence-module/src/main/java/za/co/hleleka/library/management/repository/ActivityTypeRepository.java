package za.co.hleleka.library.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.hleleka.library.management.domain.ActivityType;

/**
 * repository interface used to define the operations for accessing data for the activity type.
 */
@Repository
public interface ActivityTypeRepository extends CrudRepository<ActivityType, Integer>{
}
