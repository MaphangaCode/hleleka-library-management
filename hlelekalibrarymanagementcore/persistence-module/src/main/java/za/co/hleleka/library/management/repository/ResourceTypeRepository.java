package za.co.hleleka.library.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.hleleka.library.management.domain.ResourceType;

@Repository
public interface ResourceTypeRepository extends CrudRepository<ResourceType, Integer> {
}
