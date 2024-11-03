package com.cloud.server.service.impl;

import com.cloud.server.pojo.Oplog;
import com.cloud.server.mapper.OplogMapper;
import com.cloud.server.service.IOplogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liangzijie
 * @since 2024-10-21
 */
@Service
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}