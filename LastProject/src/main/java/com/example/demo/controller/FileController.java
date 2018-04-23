package com.example.demo.controller;

import java.sql.Date;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.FileModel;
import com.example.demo.service.FileService;

@Controller
public class FileController {

	@Autowired
	private FileService fileService  ; 
	

	
	
	
	@GetMapping(value="/"  )
	public String addFile(Model model) throws ParseException {
	return "hello";
	}
	
	
	@RequestMapping(value="/add", method = RequestMethod.POST, params="action=store")
	public String addFile(@ModelAttribute FileModel fileModel){
		fileService.addFile(fileModel);
		 return "Added Successfully";
	}
}
