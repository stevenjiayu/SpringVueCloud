package com.xcode.hjycommunity.community.service;

import com.xcode.hjycommunity.community.domain.HjyCommunity;
import com.xcode.hjycommunity.community.domain.dto.HjyCommunityDto;

import java.util.List;

public interface HjyCommunityService {



    List<HjyCommunityDto> queryList(HjyCommunity hjyCommunity);
}
