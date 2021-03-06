package com.itmuch.cloud.controller;

import java.io.File;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class FileUploadController {
	
	@RequestMapping(value="/upload" ,method=RequestMethod.POST)
	public @ResponseBody String handleFileUpload(@RequestParam(value="file" ,required=true) MultipartFile file) {
		try {
			byte[] bytes = file.getBytes();
			File fileToSave = new File(file.getOriginalFilename() );
			FileCopyUtils.copy(bytes, fileToSave);
			return fileToSave.getAbsolutePath() ;
		} catch (Exception e) {
			System.out.println(e);
		}
		return null ;
	}
}
