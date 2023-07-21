package com.recruitment.model;

public class Candidate {
	
	
	private String candidateId	;
	private String candidateName;	
	private String mobileNumber	;
	private String emailId	;
	private String positionAppliedFor	;
	private Integer yearsOfExperience	;
	private double expectedSalary	;
	
	private String Status	;


	





	public Candidate() {
		
	}

	public Candidate(String candidateId, String candidateName, String mobileNumber, String emailId,
			String positionAppliedFor, Integer yearsOfExperience, double expectedSalary, String status) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.positionAppliedFor = positionAppliedFor;
		this.yearsOfExperience = yearsOfExperience;
		this.expectedSalary = expectedSalary;
		Status = status;
	}

}
