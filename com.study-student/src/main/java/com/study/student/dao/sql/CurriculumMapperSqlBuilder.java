
package com.study.student.dao.sql;

import org.apache.ibatis.jdbc.SQL;

import com.study.student.dto.CurriculumDto;

/**
 * @author 黄达
 *
 * 2020年5月2日
 */
public class CurriculumMapperSqlBuilder {
	private final String TABLE_NAME = "Curriculum";
	
	public String buildFindCurriculumByCeIdAndIsPay(final CurriculumDto dto) {
		return new SQL() {
			{
				SELECT("*");
				FROM(TABLE_NAME);
				if(dto!=null) {
				StringBuffer whereClause =new StringBuffer(" 1=1");
				
				if(dto.getCeId() !=null && !"".equals(dto.getCeId())) {
                    whereClause.append(" and ce_id = #{ceId}");
				}
				if(dto.getIsPay() !=null && !"".equals(dto.getIsPay())) {
                    whereClause.append(" and is_pay = #{isPay}");
				}
                WHERE(whereClause.toString());
			  }
			}
		}.toString();
	}
}
