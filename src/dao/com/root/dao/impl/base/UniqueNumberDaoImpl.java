package com.root.dao.impl.base;

import com.root.model.bean.base.UniqueNumber;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.root.dao.base.UniqueNumberDao;

@Repository("uniqueNumberDao")
@Transactional(readOnly = true)
public class UniqueNumberDaoImpl  extends AbstractDAO<UniqueNumber, Long> implements UniqueNumberDao{

	public UniqueNumberDaoImpl() {
		super(UniqueNumber.class);
		// TODO Auto-generated constructor stub
	}


}
