/**
 * 
 */
package com.study.student.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.api.domain.Comment;
import com.study.student.service.CommentService;

/**
 * @author 黄达
 *
 * 2020年5月12日
 */
@RestController
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	@RequestMapping("addComment")
	public boolean addComment(@RequestBody Comment Newcomment) {
		return this.commentService.addComment(Newcomment);
	}

}
