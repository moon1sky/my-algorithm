package com.utils;


import java.math.BigDecimal;
import java.util.Date;

public class LoanEntity  {

    private Long id;
    private String loanOrderNo;
    private Long accountId;
    private String status;
    private String productId;
    private String productType;
    private String productName;
    private String bankCode;
    private String bankName;
    private String bankAccountName;
    private String bankAccountNo;
    private String bankAccountType;
    private BigDecimal appliedAmount;
    private BigDecimal desiredAmount;
    private BigDecimal processingFee;
    private BigDecimal originalFee;
    private BigDecimal premiumFee;
    private BigDecimal effictivePrincipal;
    private String purpose;
    private BigDecimal interestRate;
    private BigDecimal overdueInterestRate;
    private BigDecimal platformServiceFeeRate;
    private BigDecimal overduePlatformServiceFeeRate;
    private BigDecimal premiumFeeRate;
    private Integer installments;
    private Integer unpaidInstallments;
    private Integer days;
    
    private Date dueAt;
    
    private BigDecimal principal;
    private BigDecimal interest;
    private BigDecimal overdueInterest;
    private BigDecimal platformServiceFee;
    private BigDecimal overduePlatformServiceFee;
    private BigDecimal installmentPremiumFee;
    private BigDecimal repaymentFee;
    private BigDecimal dueAmount;
    private BigDecimal unpaidPrincipal;
    private BigDecimal unpaidInterest;
    private BigDecimal unpaidOverdueInterest;
    private BigDecimal unpaidPlatformServiceFee;
    private BigDecimal unpaidOverduePlatformServiceFee;
    private BigDecimal unpaidInstallmentPremiumFee;
    private BigDecimal unpaidRepaymentFee;
    private BigDecimal unpaidDueAmount;
    private BigDecimal repaidPrincipal;
    private BigDecimal repaidInterest;
    private BigDecimal repaidOverdueInterest;
    private BigDecimal repaidPlatformServiceFee;
    private BigDecimal repaidOverduePlatformServiceFee;
    private BigDecimal repaidInstallmentPremiumFee;
    private BigDecimal repaidRepaymentFee;
    private BigDecimal repaidDueAmount;
    private String currency;
    private Date createdAt;
    private Date updatedAt;
    private Date repaidAt;
    private BigDecimal derateFee;
    private BigDecimal oneTimePenalty;
    private BigDecimal unpaidOneTimePenalty;
    private BigDecimal repaidOneTimePenalty;
    private Date effectiveAt;
    private Date fundedAt;
    private String scenario;
    private BigDecimal oneTimePenaltyRate;
    private BigDecimal amountLoss;
    private Integer graceDay;
    private String calculator;
    private String loanType;
    private String loanScenario;
    private BigDecimal earlyRepaymentFee;
    private BigDecimal unpaidEarlyRepaymentFee;
    private BigDecimal repaidEarlyRepaymentFee;
    private BigDecimal earlyRepaymentServiceFee;
    private BigDecimal unpaidEarlyRepaymentServiceFee;
    private BigDecimal repaidEarlyRepaymentServiceFee;
    private Integer isNPL;
    private Integer isEarlyPay;
    private BigDecimal subsidy;
    private BigDecimal ewt;
    private BigDecimal md;
    private BigDecimal ewtRate;
    private BigDecimal mdRate;
    private Integer soldStatus;
    private Integer autoDeduct;
    private BigDecimal insurancePremiumRate;
    private BigDecimal insurancePremiumFee;
    private BigDecimal insuranceCommissionRate;
    private BigDecimal insuranceCommissionFee;
    private Date originDueAt;
    private BigDecimal holidayDerateFee;
    private BigDecimal policyGenerationFee;
    private Integer insuranceCheckbox;
    private Integer policyGenerationCheckbox;
    /***
     *  如果添加字段，快照表 LoanSnapshot 也需要增加
     *  注意LoanRepository.xml: updateByPrimaryKey方法,加上对应字段
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanOrderNo() {
        return loanOrderNo;
    }

    public void setLoanOrderNo(String loanOrderNo) {
        this.loanOrderNo = loanOrderNo;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountType() {
        return bankAccountType;
    }

    public void setBankAccountType(String bankAccountType) {
        this.bankAccountType = bankAccountType;
    }

    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public BigDecimal getDesiredAmount() {
        return desiredAmount;
    }

    public void setDesiredAmount(BigDecimal desiredAmount) {
        this.desiredAmount = desiredAmount;
    }

    public BigDecimal getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(BigDecimal processingFee) {
        this.processingFee = processingFee;
    }

    public BigDecimal getOriginalFee() {
        return originalFee;
    }

    public void setOriginalFee(BigDecimal originalFee) {
        this.originalFee = originalFee;
    }

    public BigDecimal getPremiumFee() {
        return premiumFee;
    }

    public void setPremiumFee(BigDecimal premiumFee) {
        this.premiumFee = premiumFee;
    }

    public BigDecimal getEffictivePrincipal() {
        return effictivePrincipal;
    }

    public void setEffictivePrincipal(BigDecimal effictivePrincipal) {
        this.effictivePrincipal = effictivePrincipal;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getOverdueInterestRate() {
        return overdueInterestRate;
    }

    public void setOverdueInterestRate(BigDecimal overdueInterestRate) {
        this.overdueInterestRate = overdueInterestRate;
    }

    public BigDecimal getPlatformServiceFeeRate() {
        return platformServiceFeeRate;
    }

    public void setPlatformServiceFeeRate(BigDecimal platformServiceFeeRate) {
        this.platformServiceFeeRate = platformServiceFeeRate;
    }

    public BigDecimal getOverduePlatformServiceFeeRate() {
        return overduePlatformServiceFeeRate;
    }

    public void setOverduePlatformServiceFeeRate(BigDecimal overduePlatformServiceFeeRate) {
        this.overduePlatformServiceFeeRate = overduePlatformServiceFeeRate;
    }

    public BigDecimal getPremiumFeeRate() {
        return premiumFeeRate;
    }

    public void setPremiumFeeRate(BigDecimal premiumFeeRate) {
        this.premiumFeeRate = premiumFeeRate;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }

    public Integer getUnpaidInstallments() {
        return unpaidInstallments;
    }

    public void setUnpaidInstallments(Integer unpaidInstallments) {
        this.unpaidInstallments = unpaidInstallments;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Date getDueAt() {
        return dueAt;
    }

    public void setDueAt(Date dueAt) {
        this.dueAt = dueAt;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(BigDecimal overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public BigDecimal getPlatformServiceFee() {
        return platformServiceFee;
    }

    public void setPlatformServiceFee(BigDecimal platformServiceFee) {
        this.platformServiceFee = platformServiceFee;
    }

    public BigDecimal getOverduePlatformServiceFee() {
        return overduePlatformServiceFee;
    }

    public void setOverduePlatformServiceFee(BigDecimal overduePlatformServiceFee) {
        this.overduePlatformServiceFee = overduePlatformServiceFee;
    }

    public BigDecimal getInstallmentPremiumFee() {
        return installmentPremiumFee;
    }

    public void setInstallmentPremiumFee(BigDecimal installmentPremiumFee) {
        this.installmentPremiumFee = installmentPremiumFee;
    }

    public BigDecimal getRepaymentFee() {
        return repaymentFee;
    }

    public void setRepaymentFee(BigDecimal repaymentFee) {
        this.repaymentFee = repaymentFee;
    }

    public BigDecimal getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(BigDecimal dueAmount) {
        this.dueAmount = dueAmount;
    }

    public BigDecimal getUnpaidPrincipal() {
        return unpaidPrincipal;
    }

    public void setUnpaidPrincipal(BigDecimal unpaidPrincipal) {
        this.unpaidPrincipal = unpaidPrincipal;
    }

    public BigDecimal getUnpaidInterest() {
        return unpaidInterest;
    }

    public void setUnpaidInterest(BigDecimal unpaidInterest) {
        this.unpaidInterest = unpaidInterest;
    }

    public BigDecimal getUnpaidOverdueInterest() {
        return unpaidOverdueInterest;
    }

    public void setUnpaidOverdueInterest(BigDecimal unpaidOverdueInterest) {
        this.unpaidOverdueInterest = unpaidOverdueInterest;
    }

    public BigDecimal getUnpaidPlatformServiceFee() {
        return unpaidPlatformServiceFee;
    }

    public void setUnpaidPlatformServiceFee(BigDecimal unpaidPlatformServiceFee) {
        this.unpaidPlatformServiceFee = unpaidPlatformServiceFee;
    }

    public BigDecimal getUnpaidOverduePlatformServiceFee() {
        return unpaidOverduePlatformServiceFee;
    }

    public void setUnpaidOverduePlatformServiceFee(BigDecimal unpaidOverduePlatformServiceFee) {
        this.unpaidOverduePlatformServiceFee = unpaidOverduePlatformServiceFee;
    }

    public BigDecimal getUnpaidInstallmentPremiumFee() {
        return unpaidInstallmentPremiumFee;
    }

    public void setUnpaidInstallmentPremiumFee(BigDecimal unpaidInstallmentPremiumFee) {
        this.unpaidInstallmentPremiumFee = unpaidInstallmentPremiumFee;
    }

    public BigDecimal getUnpaidRepaymentFee() {
        return unpaidRepaymentFee;
    }

    public void setUnpaidRepaymentFee(BigDecimal unpaidRepaymentFee) {
        this.unpaidRepaymentFee = unpaidRepaymentFee;
    }

    public BigDecimal getUnpaidDueAmount() {
        return unpaidDueAmount;
    }

    public void setUnpaidDueAmount(BigDecimal unpaidDueAmount) {
        this.unpaidDueAmount = unpaidDueAmount;
    }

    public BigDecimal getRepaidPrincipal() {
        return repaidPrincipal;
    }

    public void setRepaidPrincipal(BigDecimal repaidPrincipal) {
        this.repaidPrincipal = repaidPrincipal;
    }

    public BigDecimal getRepaidInterest() {
        return repaidInterest;
    }

    public void setRepaidInterest(BigDecimal repaidInterest) {
        this.repaidInterest = repaidInterest;
    }

    public BigDecimal getRepaidOverdueInterest() {
        return repaidOverdueInterest;
    }

    public void setRepaidOverdueInterest(BigDecimal repaidOverdueInterest) {
        this.repaidOverdueInterest = repaidOverdueInterest;
    }

    public BigDecimal getRepaidPlatformServiceFee() {
        return repaidPlatformServiceFee;
    }

    public void setRepaidPlatformServiceFee(BigDecimal repaidPlatformServiceFee) {
        this.repaidPlatformServiceFee = repaidPlatformServiceFee;
    }

    public BigDecimal getRepaidOverduePlatformServiceFee() {
        return repaidOverduePlatformServiceFee;
    }

    public void setRepaidOverduePlatformServiceFee(BigDecimal repaidOverduePlatformServiceFee) {
        this.repaidOverduePlatformServiceFee = repaidOverduePlatformServiceFee;
    }

    public BigDecimal getRepaidInstallmentPremiumFee() {
        return repaidInstallmentPremiumFee;
    }

    public void setRepaidInstallmentPremiumFee(BigDecimal repaidInstallmentPremiumFee) {
        this.repaidInstallmentPremiumFee = repaidInstallmentPremiumFee;
    }

    public BigDecimal getRepaidRepaymentFee() {
        return repaidRepaymentFee;
    }

    public void setRepaidRepaymentFee(BigDecimal repaidRepaymentFee) {
        this.repaidRepaymentFee = repaidRepaymentFee;
    }

    public BigDecimal getRepaidDueAmount() {
        return repaidDueAmount;
    }

    public void setRepaidDueAmount(BigDecimal repaidDueAmount) {
        this.repaidDueAmount = repaidDueAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getRepaidAt() {
        return repaidAt;
    }

    public void setRepaidAt(Date repaidAt) {
        this.repaidAt = repaidAt;
    }

    public BigDecimal getDerateFee() {
        return derateFee;
    }

    public void setDerateFee(BigDecimal derateFee) {
        this.derateFee = derateFee;
    }

    public BigDecimal getOneTimePenalty() {
        return oneTimePenalty;
    }

    public void setOneTimePenalty(BigDecimal oneTimePenalty) {
        this.oneTimePenalty = oneTimePenalty;
    }

    public BigDecimal getUnpaidOneTimePenalty() {
        return unpaidOneTimePenalty;
    }

    public void setUnpaidOneTimePenalty(BigDecimal unpaidOneTimePenalty) {
        this.unpaidOneTimePenalty = unpaidOneTimePenalty;
    }

    public BigDecimal getRepaidOneTimePenalty() {
        return repaidOneTimePenalty;
    }

    public void setRepaidOneTimePenalty(BigDecimal repaidOneTimePenalty) {
        this.repaidOneTimePenalty = repaidOneTimePenalty;
    }

    public Date getEffectiveAt() {
        return effectiveAt;
    }

    public void setEffectiveAt(Date effectiveAt) {
        this.effectiveAt = effectiveAt;
    }

    public Date getFundedAt() {
        return fundedAt;
    }

    public void setFundedAt(Date fundedAt) {
        this.fundedAt = fundedAt;
    }

    public String getScenario() {
        return scenario;
    }

    public void setScenario(String scenario) {
        this.scenario = scenario;
    }

    public BigDecimal getOneTimePenaltyRate() {
        return oneTimePenaltyRate;
    }

    public void setOneTimePenaltyRate(BigDecimal oneTimePenaltyRate) {
        this.oneTimePenaltyRate = oneTimePenaltyRate;
    }

    public BigDecimal getAmountLoss() {
        return amountLoss;
    }

    public void setAmountLoss(BigDecimal amountLoss) {
        this.amountLoss = amountLoss;
    }

    public Integer getGraceDay() {
        return graceDay;
    }

    public void setGraceDay(Integer graceDay) {
        this.graceDay = graceDay;
    }

    public String getCalculator() {
        return calculator;
    }

    public void setCalculator(String calculator) {
        this.calculator = calculator;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanScenario() {
        return loanScenario;
    }

    public void setLoanScenario(String loanScenario) {
        this.loanScenario = loanScenario;
    }

    public BigDecimal getEarlyRepaymentFee() {
        return earlyRepaymentFee;
    }

    public void setEarlyRepaymentFee(BigDecimal earlyRepaymentFee) {
        this.earlyRepaymentFee = earlyRepaymentFee;
    }

    public BigDecimal getUnpaidEarlyRepaymentFee() {
        return unpaidEarlyRepaymentFee;
    }

    public void setUnpaidEarlyRepaymentFee(BigDecimal unpaidEarlyRepaymentFee) {
        this.unpaidEarlyRepaymentFee = unpaidEarlyRepaymentFee;
    }

    public BigDecimal getRepaidEarlyRepaymentFee() {
        return repaidEarlyRepaymentFee;
    }

    public void setRepaidEarlyRepaymentFee(BigDecimal repaidEarlyRepaymentFee) {
        this.repaidEarlyRepaymentFee = repaidEarlyRepaymentFee;
    }

    public BigDecimal getEarlyRepaymentServiceFee() {
        return earlyRepaymentServiceFee;
    }

    public void setEarlyRepaymentServiceFee(BigDecimal earlyRepaymentServiceFee) {
        this.earlyRepaymentServiceFee = earlyRepaymentServiceFee;
    }

    public BigDecimal getUnpaidEarlyRepaymentServiceFee() {
        return unpaidEarlyRepaymentServiceFee;
    }

    public void setUnpaidEarlyRepaymentServiceFee(BigDecimal unpaidEarlyRepaymentServiceFee) {
        this.unpaidEarlyRepaymentServiceFee = unpaidEarlyRepaymentServiceFee;
    }

    public BigDecimal getRepaidEarlyRepaymentServiceFee() {
        return repaidEarlyRepaymentServiceFee;
    }

    public void setRepaidEarlyRepaymentServiceFee(BigDecimal repaidEarlyRepaymentServiceFee) {
        this.repaidEarlyRepaymentServiceFee = repaidEarlyRepaymentServiceFee;
    }

    public Integer getIsNPL() {
        return isNPL;
    }

    public void setIsNPL(Integer isNPL) {
        this.isNPL = isNPL;
    }

    public Integer getIsEarlyPay() {
        return isEarlyPay;
    }

    public void setIsEarlyPay(Integer isEarlyPay) {
        this.isEarlyPay = isEarlyPay;
    }

    public BigDecimal getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    public BigDecimal getEwt() {
        return ewt;
    }

    public void setEwt(BigDecimal ewt) {
        this.ewt = ewt;
    }

    public BigDecimal getMd() {
        return md;
    }

    public void setMd(BigDecimal md) {
        this.md = md;
    }

    public BigDecimal getEwtRate() {
        return ewtRate;
    }

    public void setEwtRate(BigDecimal ewtRate) {
        this.ewtRate = ewtRate;
    }

    public BigDecimal getMdRate() {
        return mdRate;
    }

    public void setMdRate(BigDecimal mdRate) {
        this.mdRate = mdRate;
    }

    public Integer getSoldStatus() {
        return soldStatus;
    }

    public void setSoldStatus(Integer soldStatus) {
        this.soldStatus = soldStatus;
    }

    public Integer getAutoDeduct() {
        return autoDeduct;
    }

    public void setAutoDeduct(Integer autoDeduct) {
        this.autoDeduct = autoDeduct;
    }

    public BigDecimal getInsurancePremiumRate() {
        return insurancePremiumRate;
    }

    public void setInsurancePremiumRate(BigDecimal insurancePremiumRate) {
        this.insurancePremiumRate = insurancePremiumRate;
    }

    public BigDecimal getInsurancePremiumFee() {
        return insurancePremiumFee;
    }

    public void setInsurancePremiumFee(BigDecimal insurancePremiumFee) {
        this.insurancePremiumFee = insurancePremiumFee;
    }

    public BigDecimal getInsuranceCommissionRate() {
        return insuranceCommissionRate;
    }

    public void setInsuranceCommissionRate(BigDecimal insuranceCommissionRate) {
        this.insuranceCommissionRate = insuranceCommissionRate;
    }

    public BigDecimal getInsuranceCommissionFee() {
        return insuranceCommissionFee;
    }

    public void setInsuranceCommissionFee(BigDecimal insuranceCommissionFee) {
        this.insuranceCommissionFee = insuranceCommissionFee;
    }

    public Date getOriginDueAt() {
        return originDueAt;
    }

    public void setOriginDueAt(Date originDueAt) {
        this.originDueAt = originDueAt;
    }

    public BigDecimal getHolidayDerateFee() {
        return holidayDerateFee;
    }

    public void setHolidayDerateFee(BigDecimal holidayDerateFee) {
        this.holidayDerateFee = holidayDerateFee;
    }

    public BigDecimal getPolicyGenerationFee() {
        return policyGenerationFee;
    }

    public void setPolicyGenerationFee(BigDecimal policyGenerationFee) {
        this.policyGenerationFee = policyGenerationFee;
    }

    public Integer getInsuranceCheckbox() {
        return insuranceCheckbox;
    }

    public void setInsuranceCheckbox(Integer insuranceCheckbox) {
        this.insuranceCheckbox = insuranceCheckbox;
    }

    public Integer getPolicyGenerationCheckbox() {
        return policyGenerationCheckbox;
    }

    public void setPolicyGenerationCheckbox(Integer policyGenerationCheckbox) {
        this.policyGenerationCheckbox = policyGenerationCheckbox;
    }
}
