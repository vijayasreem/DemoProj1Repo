package com.sacral.lic.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AutoLoanRefinancing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long borrowerId;

    private Long loanRefinancingId;

    private boolean newLoanTermsAccepted;

    private boolean loanRefinancingProcessComplete;

    public AutoLoanRefinancing() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(Long borrowerId) {
        this.borrowerId = borrowerId;
    }

    public Long getLoanRefinancingId() {
        return loanRefinancingId;
    }

    public void setLoanRefinancingId(Long loanRefinancingId) {
        this.loanRefinancingId = loanRefinancingId;
    }

    public boolean isNewLoanTermsAccepted() {
        return newLoanTermsAccepted;
    }

    public void setNewLoanTermsAccepted(boolean newLoanTermsAccepted) {
        this.newLoanTermsAccepted = newLoanTermsAccepted;
    }

    public boolean isLoanRefinancingProcessComplete() {
        return loanRefinancingProcessComplete;
    }

    public void setLoanRefinancingProcessComplete(boolean loanRefinancingProcessComplete) {
        this.loanRefinancingProcessComplete = loanRefinancingProcessComplete;
    }

}