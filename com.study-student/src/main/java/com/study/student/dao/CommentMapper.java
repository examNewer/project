/**
 * 
 */
package com.study.student.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.study.api.domain.Comment;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author 黄达
 *
 * 2020年5月3日
 */
public interface CommentMapper extends Mapper<Comment>{
	@Results({
		@Result(column = "id",property = "id",id=true),
		@Result(column = "username",property = "stuUser.userName"),
		@Result(column = "headimg",property = "stuUser.headImg"),
	})
	@Select("SELECT Comment.*,stu_user.username,stu_user.headimg from Comment INNER JOIN stu_user on Comment.stu_id = stu_user.stu_id where Comment.cid= #{cid}")
	public ArrayList<Comment> findCommentsByCid(Integer cid);

}
