package com.utils;


public enum LoanStatusEnum implements EnumCode {

    SUBMITTED("Submitted", 1),
    PROCESSING("Processing", 2),
    INITIALAPPROVED("InitialApproved", 3),
    INITIALREJECTED("InitialRejected", 3),
    INITIALSUSPICIOUS("InitialSuspicious", 3),
    APPROVED("Approved", 4),
    REJECTED("Rejected", 4),
    RE_REJECTED("Re-rejected", 4),
    CANCELED("Canceled", 4),
    PUBLISHED("Published", 5),
    DISBURSED("Disbursed", 6),
    FUNDEDFAILURE("FundedFailure", 7),
    FUNDED("Funded", 7),
    REPAID2PLATFORM("Repaid2Platform", 8),
    REPAID2INVESTOR("Repaid2Investor", 9),
    RECOMMEND("Recommend", 10);

    private String code;
    private int seq;

    LoanStatusEnum(String code, int seq) {
        this.code = code;
        this.seq = seq;
    }

    @Override
    public String getCode() {
        return code;
    }

    public int getSeq() {
        return seq;
    }
}
