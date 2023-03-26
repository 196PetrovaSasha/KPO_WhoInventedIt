package org.example;

import java.util.List;

public class Process {
    private List<TechnologicalOperation> operations;

    public Process(List<TechnologicalOperation> operations) {
        this.operations = operations;
    }

    // Метод, который позволяет получить список технологических операций процесса.
    public List<TechnologicalOperation> getOperations() {
        return operations;
    }

    public void start() {

    }
}
