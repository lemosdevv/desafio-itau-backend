package br.mateus.services;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import br.mateus.entity.Transaction;

@Service
public class TransactionService {

    private final Queue<Transaction> transactions = new ConcurrentLinkedQueue<>();

    // Método que adiciona uma transação
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    // Método que limpa as transações
    public void deleteTransactions() {
        transactions.clear();
    }

    // Método que retorna as estatisticas
    public DoubleSummaryStatistics getStatistics() {
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
                .filter(t -> t.getDate().isAfter(now.minusSeconds(60)))
                .mapToDouble(Transaction::getValue)
                .summaryStatistics();
    }
}
