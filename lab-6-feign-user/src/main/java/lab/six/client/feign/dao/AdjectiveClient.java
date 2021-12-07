package lab.six.client.feign.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("lab-6-adjective")
public interface AdjectiveClient {

	@GetMapping("/")
	public String getWord();
}
