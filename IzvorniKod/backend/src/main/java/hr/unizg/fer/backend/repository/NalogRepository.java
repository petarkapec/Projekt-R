package hr.unizg.fer.backend.repository;

import hr.unizg.fer.backend.entity.Nalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NalogRepository extends JpaRepository<Nalog, Integer> {
}
