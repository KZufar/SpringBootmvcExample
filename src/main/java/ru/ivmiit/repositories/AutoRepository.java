package ru.ivmiit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ivmiit.models.Auto;
import ru.ivmiit.models.User;

public interface AutoRepository extends JpaRepository<Auto, Long> {

}
