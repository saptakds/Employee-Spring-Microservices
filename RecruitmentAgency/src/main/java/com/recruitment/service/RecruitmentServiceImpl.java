package com.recruitment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.recruitment.exception.CandidateAlreadyExistsException;
import com.recruitment.model.Candidate;

public class RecruitmentServiceImpl implements IRecruitmentService {

	private static List<Candidate> candidateList=new ArrayList<Candidate>();
	
	/*
	 * This method should add the candidate object to the candidateList, before adding it shoulkd check
	 * whether the email id of the candidate is already available, if available throw an exception
	 * else add the candidate object into the list
	 */
	public Candidate registerCandidate(Candidate candidate) throws CandidateAlreadyExistsException {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * This method should return the Map as position applied for as a key and list of candidates who applied for that position as value.
	 */
	public Map<String, List<Candidate>> viewCandidateBasedonPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * This method should accept the years of experience as input and it should  
	 *  iterate the candidateList and return the list of candidates who have that experience.
	 */
	public List<Candidate> filterCandidate(int yearsOfExperience) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
	 * This method should remove the candidate based on the status. 
	 * If the status is recruited then remove all those candidates.
	 * This method should return the number of candidates removed.
	 */
	public int removeCandidate() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
public static List<Candidate> getCandidateList() {
		return candidateList;
	}

	public static void setCandidateList(List<Candidate> candidateList) {
		RecruitmentServiceImpl.candidateList = candidateList;
	}

	
}
