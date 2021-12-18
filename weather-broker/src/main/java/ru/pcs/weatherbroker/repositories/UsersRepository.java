package ru.pcs.weatherbroker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pcs.weatherbroker.models.City;
import ru.pcs.weatherbroker.models.User;
import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Integer> {
    User findUserById(Integer id);
    List<User> findAllByCity_Id(Integer id);
    Optional<User> findByEmail(String email);

}
