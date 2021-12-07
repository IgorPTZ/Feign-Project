package lab.six.client.feign.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("lab-6-subject")
public interface SubjectClient {

	@GetMapping("/")
	public String getWord();
}
