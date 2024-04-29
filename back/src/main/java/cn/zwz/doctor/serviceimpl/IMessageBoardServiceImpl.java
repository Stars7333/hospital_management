package cn.zwz.doctor.serviceimpl;

import cn.zwz.doctor.mapper.MessageBoardMapper;
import cn.zwz.doctor.entity.MessageBoard;
import cn.zwz.doctor.service.IMessageBoardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 留言板接口实现
 *
 * @author myd
 */
@Service
@Transactional
public class IMessageBoardServiceImpl extends ServiceImpl<MessageBoardMapper, MessageBoard> implements IMessageBoardService {

}
