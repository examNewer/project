package com.newer.exam.services;

import com.github.pagehelper.PageInfo;
import com.newer.exam.domain.TestPaper;
import com.newer.exam.viewmodel.testpaper.TestPaperPageRequestVM;

public interface TestPaperService extends BaseService<TestPaper> {

	/**
	 * 分页试题
	 * @param requestVM
	 * @return
	 */
	PageInfo<TestPaper> page(TestPaperPageRequestVM requestVM);
}
