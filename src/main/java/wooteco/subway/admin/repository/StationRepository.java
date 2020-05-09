package wooteco.subway.admin.repository;

import org.springframework.data.repository.CrudRepository;
import wooteco.subway.admin.domain.Station;

import java.util.List;
import java.util.Set;

public interface StationRepository extends CrudRepository<Station, Long> {
    @Override
    List<Station> findAll();

    @Override
    Set<Station> findAllById(Iterable<Long> longs);
}