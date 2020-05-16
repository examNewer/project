/**
 * 
 */
package com.study.student.dao;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.study.api.domain.Curriculum;
import com.study.student.dao.sql.CurriculumMapperSqlBuilder;
import com.study.student.dto.CurriculumDto;

import tk.mybatis.mapper.common.Mapper;

/**
 * @author 黄达
 *
 * 2020年5月2日
 */
public interface CurriculumMapper extends Mapper<Curriculum>{
	
	@Results(value = {
            @Result(column = "username",property = "teaUser.userName"),
            @Result(column = "sign_num",property = "signNum"),
            @Result(column = "is_pay",property = "isPay"),
            @Result(column = "introduce_img",property = "introduceImg"),
            @Result(column = "cid",property = "cId",id = true),
    })
	@Select("select Curriculum.*,Tea_User.username from Curriculum INNER JOIN Tea_User on Curriculum.tid = Tea_User.tid \r\n" + 
			" where ce_id like #{ceId} and is_pay like #{isPay} and cname like #{cname}")
//    @SelectProvider(method = "buildFindCurriculumByCeIdAndIsPay",type = CurriculumMapperSqlBuilder.class)
	public List<Curriculum> findCurriculums(@Param("ceId")String ceId,@Param("isPay")String isPay,@Param("cname")String cname);
	
	
	@Results( value = {
			@Result(column = "cid",property = "cId",id=true),
			@Result(column = "is_pay",property = "isPay"),
			@Result(column = "cname",property = "cName"),
			@Result(column = "sign_num",property = "signNum"),
			@Result(column = "tid",property = "tId"),
			@Result(column = "username",property = "teaUser.userName"),
			@Result(column = "headimg",property = "teaUser.headImg"),
			@Result(column = "brief",property = "teaUser.brief"),
			@Result(column = "detail_intorduce",property = "teaUser.detailIntorduce"),
			@Result(column = "cid",property = "comments",
			many=@Many(select="com.study.student.dao.CommentMapper.findCommentsByCid")),
			@Result(column = "cid",property = "sections",
			many=@Many(select="com.study.student.dao.SectionMapper.findSectionsByCid")),
	})
	@Select("SELECT cu.ce_id,cu.cid,cu.cname,cu.introduce_img,cu.is_pay,cu.sign_num,cu.status,tu.* "
			+ "from Curriculum cu INNER JOIN Tea_User tu on cu.tid=tu.tid where cu.cid=#{cId}")
	public Curriculum findCurriculumById(Integer cId);
}
