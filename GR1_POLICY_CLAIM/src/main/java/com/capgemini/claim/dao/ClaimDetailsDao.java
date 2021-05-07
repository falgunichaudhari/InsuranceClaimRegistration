package com.capgemini.claim.dao;

import com.capgemini.claim.bean.ClaimDetails;

public interface ClaimDetailsDao {
	public ClaimDetails getClaimDetails(Double policyNumber);

}
