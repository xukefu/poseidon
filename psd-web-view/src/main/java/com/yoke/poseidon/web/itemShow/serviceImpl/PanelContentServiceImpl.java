package com.yoke.poseidon.web.itemShow.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yoke.poseidon.web.itemShow.entity.PanelContent;
import com.yoke.poseidon.web.itemShow.mapper.PanelContentMapper;
import com.yoke.poseidon.web.itemShow.service.PanelContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ehereal
 * @since 2018-09-20
 */
@Service
public class PanelContentServiceImpl extends ServiceImpl<PanelContentMapper, PanelContent>
		implements PanelContentService {

	@Autowired
	private PanelContentMapper panelContentMapper;

	@Override
	public List<String> getItemIdByPanelId(@NonNull Integer panelId, Integer limit) {
		return panelContentMapper.selectItemIdsByPanelId(panelId, limit);
	}

}
