package za.co.hleleka.library.management.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.co.hleleka.library.management.domain.ResourceActivityHistoryLine;

@Repository
public interface ResourceActivityHistoryLineRepository extends CrudRepository<ResourceActivityHistoryLine, Integer> {
}
