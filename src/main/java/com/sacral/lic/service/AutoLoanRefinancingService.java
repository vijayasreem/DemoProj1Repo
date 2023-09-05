package com.sacral.lic.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sacral.lic.entity.AutoLoanRefinancing;
import com.sacral.lic.repository.AutoLoanRefinancingRepository;

@Service
public class AutoLoanRefinancingService {

    @Autowired
    private AutoLoanRefinancingRepository autoLoanRefinancingRepository;

    public AutoLoanRefinancing getAutoLoanRefinancingByBorrowerId(Long borrowerId){
        return autoLoanRefinancingRepository.getAutoLoanRefinancingByBorrowerId(borrowerId);
    }

    public AutoLoanRefinancing getAutoLoanRefinancingByLoanRefinancingId(Long loanRefinancingId){
        return autoLoanRefinancingRepository.getAutoLoanRefinancingByLoanRefinancingId(loanRefinancingId);
    }

    public AutoLoanRefinancing getAutoLoanRefinancingByNewLoanTermsAccepted(boolean newLoanTermsAccepted){
        return autoLoanRefinancingRepository.getAutoLoanRefinancingByNewLoanTermsAccepted(newLoanTermsAccepted);
    }

    public void updateNewLoanTermsAcceptedByLoanRefinancingId(boolean newLoanTermsAccepted, Long loanRefinancingId){
        autoLoanRefinancingRepository.updateNewLoanTermsAcceptedByLoanRefinancingId(newLoanTermsAccepted, loanRefinancingId);
    }

    public void updateLoanRefinancingProcessCompleteByLoanRefinancingId(boolean loanRefinancingProcessComplete, Long loanRefinancingId){
        autoLoanRefinancingRepository.updateLoanRefinancingProcessCompleteByLoanRefinancingId(loanRefinancingProcessComplete, loanRefinancingId);
    }

    public void saveAutoLoanRefinancing(AutoLoanRefinancing autoLoanRefinancing){
        autoLoanRefinancingRepository.save(autoLoanRefinancing);
    }

    public void deleteAutoLoanRefinancing(Long loanRefinancingId){
        autoLoanRefinancingRepository.deleteById(loanRefinancingId);
    }

    public Optional<AutoLoanRefinancing> getAutoLoanRefinancingById(Long loanRefinancingId){
        return autoLoanRefinancingRepository.findById(loanRefinancingId);
    }
}