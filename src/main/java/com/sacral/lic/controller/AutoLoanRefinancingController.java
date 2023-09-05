package com.sacral.lic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.entity.AutoLoanRefinancing;
import com.sacral.lic.service.AutoLoanRefinancingService;

@RestController
public class AutoLoanRefinancingController {

    @Autowired
    private AutoLoanRefinancingService autoLoanRefinancingService;

    @PostMapping("/autoloanrefinancing/submit")
    public void submitAutoLoanRefinancing(@RequestBody AutoLoanRefinancing autoLoanRefinancing) {
        autoLoanRefinancingService.saveAutoLoanRefinancing(autoLoanRefinancing);
    }

    @GetMapping("/autoloanrefinancing/get")
    public AutoLoanRefinancing getAutoLoanRefinancing(@RequestParam Long borrowerId, @RequestParam Long loanRefinancingId) {
        AutoLoanRefinancing autoLoanRefinancing = autoLoanRefinancingService.getAutoLoanRefinancingByBorrowerId(borrowerId);
        if (autoLoanRefinancing == null) {
            autoLoanRefinancing = autoLoanRefinancingService.getAutoLoanRefinancingByLoanRefinancingId(loanRefinancingId);
        }
        return autoLoanRefinancing;
    }

    @PostMapping("/autoloanrefinancing/update/accept")
    public void updateNewLoanTermsAccepted(@RequestParam Long loanRefinancingId, @RequestParam boolean newLoanTermsAccepted) {
        autoLoanRefinancingService.updateNewLoanTermsAcceptedByLoanRefinancingId(newLoanTermsAccepted, loanRefinancingId);
    }

    @PostMapping("/autoloanrefinancing/update/complete")
    public void updateLoanRefinancingProcessComplete(@RequestParam Long loanRefinancingId, @RequestParam boolean loanRefinancingProcessComplete) {
        autoLoanRefinancingService.updateLoanRefinancingProcessCompleteByLoanRefinancingId(loanRefinancingProcessComplete, loanRefinancingId);
    }

    @GetMapping("/autoloanrefinancing/delete")
    public void deleteAutoLoanRefinancing(@RequestParam Long loanRefinancingId) {
        autoLoanRefinancingService.deleteAutoLoanRefinancing(loanRefinancingId);
    }
}