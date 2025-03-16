package br.mateus.controllers;

import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.mateus.dto.StatisticsDTO;
import br.mateus.services.TransactionService;

@RestController
@RequestMapping("/statics")
public class StatisticController {

    private final TransactionService transactionService;

    public StatisticController (TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping 
    public ResponseEntity<StatisticsDTO> getStatistics(){
        DoubleSummaryStatistics statistics = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsDTO(statistics));
    }


}
