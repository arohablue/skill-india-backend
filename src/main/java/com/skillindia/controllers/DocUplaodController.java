

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skillindia.datajpa.candidate.model.Candidate;

@RestController
@RequestMapping("/candidate/*")
public class DocUplaodController {

	@RequestMapping(path="/new", method=RequestMethod.POST, 
					consumes="multipart/form-data",
					produces="text/plain")
	public String register(@RequestPart("customer") String Candidate,
							@RequestPart("document") MultipartFile file) throws Exception {
		
		Candidate customer = new ObjectMapper().readValue(Candidate, Candidate.class); 
		//candidate.setDocument(file.getBytes());
		
		String uploadedFolderLocation = "";
		FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(uploadedFolderLocation  +".doc"));
		
		
		return "Customer has been registered successfully";
				
	}
}
