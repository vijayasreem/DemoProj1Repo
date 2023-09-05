package com.sacral.lic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.sacral.lic.entity.AutoLoanRefinancing;

@Repository
public interface AutoLoanRefinancingRepository extends JpaRepository<AutoLoanRefinancing, Long>{

    @Query("SELECT a FROM AutoLoanRefinancing a WHERE a.borrowerId = ?1")
    AutoLoanRefinancing getAutoLoanRefinancingByBorrowerId(Long borrowerId);

    @Query("SELECT a FROM AutoLoanRefinancing a WHERE a.loanRefinancingId = ?1")
    AutoLoanRefinancing getAutoLoanRefinancingByLoanRefinancingId(Long loanRefinancingId);

    @Query("SELECT a FROM AutoLoanRefinancing a WHERE a.newLoanTermsAccepted = ?1")
    AutoLoanRefinancing getAutoLoanRefinancingByNewLoanTermsAccepted(boolean newLoanTermsAccepted);

    @Query("UPDATE AutoLoanRefinancing a SET a.newLoanTermsAccepted = ?1 WHERE a.loanRefinancingId = ?2")
    void updateNewLoanTermsAcceptedByLoanRefinancingId(boolean newLoanTermsAccepted, Long loanRefinancingId);

    @Query("UPDATE AutoLoanRefinancing a SET a.loanRefinancingProcessComplete = ?1 WHERE a.loanRefinancingId = ?2")
    void updateLoanRefinancingProcessCompleteByLoanRefinancingId(boolean loanRefinancingProcessComplete, Long loanRefinancingId);

}