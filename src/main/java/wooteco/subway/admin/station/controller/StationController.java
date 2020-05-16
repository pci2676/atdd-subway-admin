package wooteco.subway.admin.station.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wooteco.subway.admin.common.response.DefaultResponse;
import wooteco.subway.admin.station.service.StationService;
import wooteco.subway.admin.station.service.dto.StationCreateRequest;
import wooteco.subway.admin.station.service.dto.StationResponse;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/stations")
public class StationController {
    private final StationService stationService;

    public StationController(final StationService stationService) {
        this.stationService = stationService;
    }

    @PostMapping
    public ResponseEntity<Void> createStation(@RequestBody @Valid StationCreateRequest request) {
        Long id = stationService.save(request);

        return ResponseEntity.created(URI.create("/stations/" + id)).build();
    }

    @GetMapping
    public ResponseEntity<DefaultResponse<List<StationResponse>>> showStations() {
        return ResponseEntity.ok().body(DefaultResponse.of(StationResponse.listOf(stationService.findAll())));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStation(@PathVariable Long id) {
        stationService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
