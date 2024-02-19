package com.battleservice.controller;

import com.battleservice.domain.Battle;
import com.battleservice.repository.BattleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/battle")
@RequiredArgsConstructor
public class BattleController {

    private final BattleRepository battleRepository;

    public Battle createBattle(@RequestBody Battle battle) {
        return battleRepository.save(battle);
    }
}
