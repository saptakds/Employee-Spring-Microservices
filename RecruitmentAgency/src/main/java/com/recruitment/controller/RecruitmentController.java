package com.recruitment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recruitment.exception.CandidateAlreadyExistsException;
import com.recruitment.model.Candidate;
import com.recruitment.service.IRecruitmentService;

@RestController
public class RecruitmentController {

	@Autowired
	private IRecruitmentService service;

	@PostMapping("/register")
	public Candidate registerCandidate(Candidate candidate) throws CandidateAlreadyExistsException {
		return service.registerCandidate(candidate);
	}

	@GetMapping("/view")
	public Map<String, List<Candidate>> viewCandidateBasedonPosition() {
		return service.viewCandidateBasedonPosition();

	}

	@GetMapping("/filter/{yearsOfExperience}")
	public List<Candidate> filterCandidate(@PathVariable int yearsOfExperience) {
		return service.filterCandidate(yearsOfExperience);

	}

	@DeleteMapping("/remove")
	public int removeCandidate() {
		return service.removeCandidate();
	}

}
