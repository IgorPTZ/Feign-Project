package lab.six.client.feign.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lab.six.client.feign.dao.AdjectiveClient;
import lab.six.client.feign.dao.ArticleClient;
import lab.six.client.feign.dao.NounClient;
import lab.six.client.feign.dao.SubjectClient;
import lab.six.client.feign.dao.VerbClient;

@Service
public class SentenceServiceImpl implements SentenceService{
	
	private VerbClient verbService;
	
	private SubjectClient subjectService;
	
	private ArticleClient articleService;
	
	private AdjectiveClient adjectiveService;
	
	private NounClient nounService;

	@Override
	public String buildSentence() {
		
		String sentence = "There was a problem assembling the sentence!";
		
		sentence = String.format("%s %s %s %s %s",
				                 subjectService.getWord(),
				                 verbService.getWord(),
				                 articleService.getWord(),
				                 adjectiveService.getWord(),
				                 nounService.getWord());
		
		return sentence;
	}

	@Autowired
	public void setVerbService(VerbClient verbService) {
		this.verbService = verbService;
	}

	@Autowired
	public void setSubjectService(SubjectClient subjectService) {
		this.subjectService = subjectService;
	}

	@Autowired
	public void setArticleService(ArticleClient articleService) {
		this.articleService = articleService;
	}

	@Autowired
	public void setAdjectiveService(AdjectiveClient adjectiveService) {
		this.adjectiveService = adjectiveService;
	}

	@Autowired
	public void setNounService(NounClient nounService) {
		this.nounService = nounService;
	}
}
