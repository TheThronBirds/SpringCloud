package provider.Dao;

import provider.domain.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Guest,Integer> {

}
