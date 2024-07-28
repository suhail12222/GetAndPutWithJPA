package xuk.fhffds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xuk.fhffds.dto.EmployeeDto;
import xuk.fhffds.entities.EmployeeEnities;
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEnities,Long> {
}
