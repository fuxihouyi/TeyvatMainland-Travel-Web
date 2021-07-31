package tivattravel.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tivattravel.demo.bean.Scenery;
import tivattravel.demo.mapper.SceneryMapper;
import tivattravel.demo.service.SceneryService;

@Service
public class SceneryServiceImpl extends ServiceImpl<SceneryMapper, Scenery> implements SceneryService {
}
