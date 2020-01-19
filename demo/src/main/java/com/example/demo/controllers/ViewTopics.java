package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;
import com.example.demo.models.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ViewTopics {
	@RequestMapping("/topics")
	public List<Topic> viewTopics() {
		return Arrays.asList(new Topic("HIstory",34),new Topic("World War",45),new Topic("Quantum Computing",56));
	}
}
