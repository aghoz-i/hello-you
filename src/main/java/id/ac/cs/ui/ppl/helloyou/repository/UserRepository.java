package id.ac.cs.ui.ppl.helloyou.repository;

import id.ac.cs.ui.ppl.helloyou.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
