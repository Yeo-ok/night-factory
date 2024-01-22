package org.recorder.nightfactory.controller;


import lombok.RequiredArgsConstructor;
import org.recorder.nightfactory.domain.Theme;
import org.recorder.nightfactory.dto.ScheduleListResponse;
import org.recorder.nightfactory.dto.ThemeListResponse;
import org.recorder.nightfactory.service.ScheduleService;
import org.recorder.nightfactory.service.ThemeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class ThemeApiController {
    private final ThemeService themeService;
    private final ScheduleService scheduleService;

    @GetMapping("/api/themes")
    public ResponseEntity<ThemeListResponse> findAllThemes() {
        ThemeListResponse themes = new ThemeListResponse(
                themeService.findAll());

        return ResponseEntity.ok().body(themes);
    }

    @GetMapping("/api/Schedules/{id}")
    public ResponseEntity<ScheduleListResponse> findAllScheduleById(@PathVariable Integer id) {
        Theme theme = themeService.findById(id);

        ScheduleListResponse schedules = new ScheduleListResponse(theme, scheduleService.findAllByTheme(theme));
        return ResponseEntity.ok().body(schedules);
    }
}


