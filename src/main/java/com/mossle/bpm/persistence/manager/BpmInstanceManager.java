package com.mossle.bpm.persistence.manager;

import com.mossle.bpm.persistence.domain.BpmInstance;

import com.mossle.core.hibernate.HibernateEntityDao;

import org.springframework.stereotype.Service;

@Service
public class BpmInstanceManager extends HibernateEntityDao<BpmInstance> {
}
