package br.mateus.controllers;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.mateus.dto.TransactionDTO;
import br.mateus.entity.Transaction;
import br.mateus.services.TransactionService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteTransactions() {
        transactionService.deleteTransactions();
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<TransactionDTO> createTransaction(@RequestBody @Valid TransactionDTO transactionDTO) {
        if(transactionDTO.getDate().isAfter(OffsetDateTime.now()) || transactionDTO.getValue() <= 0){
            return ResponseEntity.unprocessableEntity().build();
        }
        transactionService.addTransaction(new Transaction(transactionDTO.getValue(), transactionDTO.getDate()));
        return ResponseEntity.status(HttpStatus.CREATED).body(transactionDTO);
    }
    
}
