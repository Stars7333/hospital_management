package cn.zwz.doctor.serviceimpl;

import cn.zwz.doctor.mapper.HospitalOrderMapper;
import cn.zwz.doctor.entity.HospitalOrder;
import cn.zwz.doctor.service.IHospitalOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 挂号接口实现
 *
 * @author myd
 */
@Service
@Transactional
public class IHospitalOrderServiceImpl extends ServiceImpl<HospitalOrderMapper, HospitalOrder> implements IHospitalOrderService {

}
