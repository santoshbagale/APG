package com.animal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animal.ServiceImpl.TimerResponse;
import com.animal.ServiceImpl.TimerService;

@RestController
@RequestMapping("/timer")
public class TimerController {

    @Autowired
    private TimerService timerService;

    @GetMapping("/start")
    public TimerResponse startTimer() {
        return timerService.startOrResetTimer();
    }

    @GetMapping("/status")
    public TimerResponse getTimerStatus() {
        return timerService.getTimerStatus();
    }
}

