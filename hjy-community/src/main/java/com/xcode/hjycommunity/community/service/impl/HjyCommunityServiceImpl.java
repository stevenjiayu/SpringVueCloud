package com.xcode.hjycommunity.community.service.impl;

import com.xcode.hjycommunity.community.domain.HjyCommunity;
import com.xcode.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.xcode.hjycommunity.community.mapper.HjyCommunityMapper;
import com.xcode.hjycommunity.community.service.HjyCommunityService;

import javax.annotation.Resource;
import java.util.List;

public class HjyCommunityServiceImpl implements HjyCommunityService {

    @Resource
    private HjyCommunityMapper hjyCommunityMapper;

    @Override
    public List<HjyCommunityDto> queryList(HjyCommunity hjyCommunity) {
        return hjyCommunityMapper.queryList(hjyCommunity);
    }
}
