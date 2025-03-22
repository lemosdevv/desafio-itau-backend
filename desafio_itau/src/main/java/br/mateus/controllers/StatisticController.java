package br.mateus.controllers;

import java.util.DoubleSummaryStatistics;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.mateus.dto.StatisticsDTO;
import br.mateus.services.TransactionService;

@RestController
@RequestMapping("/statistics")
public class StatisticController {

    private final TransactionService transactionService;

    public StatisticController (TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @Operation(summary = "Obter as estatísticas das transações recentes", description = "Retorna as estatísticas de transações realizadas nos últimos 60 segundos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Estatísticas retornadas com sucesso"),
            @ApiResponse(responseCode = "500", description = "Erro no servidor")
    })
    @GetMapping 
    public ResponseEntity<StatisticsDTO> getStatistics(){
        DoubleSummaryStatistics statistics = transactionService.getStatistics();
        return ResponseEntity.ok(new StatisticsDTO(statistics));
    }


}
