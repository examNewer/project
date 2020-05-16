/**
 * 
 */
package com.study.student.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.api.domain.Comment;
import com.study.student.dao.CommentMapper;
import com.study.student.service.CommentService;

/**
 * @author 黄达
 *
 * 2020年5月12日
 */
@Service
public class CommentServiceImpl implements CommentService{
	@Autowired
	private CommentMapper commentMapper;
	@Override
	public boolean addComment(Comment comment) {
		// TODO Auto-generated method stub
		return this.commentMapper.insert(comment)>0 ? true:false;
	}

}
