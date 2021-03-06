package com.zhu.service.impl;

import com.zhu.dao.RoleDao;
import com.zhu.domain.SysRole;
import com.zhu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * @author ZPM
 */
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public void save(SysRole role) {
        roleDao.save(role);
    }

    @Override
    public List<SysRole> findAll() {
        return roleDao.findAll();
    }
}
