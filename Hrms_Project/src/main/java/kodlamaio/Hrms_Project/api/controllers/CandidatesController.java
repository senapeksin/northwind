package kodlamaio.Hrms_Project.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms_Project.business.abstracts.CandidateService;
import kodlamaio.Hrms_Project.core.utilities.results.DataResult;
import kodlamaio.Hrms_Project.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")

public class CandidatesController {

	  private CandidateService candidateService;
	  
	  
	   @Autowired
	    public CandidatesController(CandidateService candidateService) {
		   super();
	        this.candidateService = candidateService;
	    }
	   //deneme2
	   
		@GetMapping("/getall")
		public DataResult<List<Candidate>> getAll(){
			
			return this.candidateService.getAll();
		}
		
}
