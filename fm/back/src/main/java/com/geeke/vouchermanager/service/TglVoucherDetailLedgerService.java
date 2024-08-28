package com.geeke.vouchermanager.service;

import com.geeke.common.constants.ActionConstants;
import com.geeke.common.data.Page;
import com.geeke.common.data.PageRequest;
import com.geeke.common.data.Parameter;
import com.geeke.common.service.CrudService;
import com.geeke.config.exception.CommonJsonException;
import com.geeke.utils.Reflections;
import com.geeke.utils.ResultUtil;
import com.geeke.utils.StringUtils;
import com.geeke.utils.constants.ErrorEnum;
import com.geeke.vouchermanager.dao.TglVoucherDetailLedgerDao;
import com.geeke.vouchermanager.entity.SysUser;
import com.geeke.vouchermanager.entity.TglVoucherDetailLedger;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 制证Service
 * @author
 * @version
 */

@Service("tglVoucherDetailLedgerService")
@Transactional(readOnly = true)
public class TglVoucherDetailLedgerService extends CrudService<TglVoucherDetailLedgerDao, TglVoucherDetailLedger> {}
