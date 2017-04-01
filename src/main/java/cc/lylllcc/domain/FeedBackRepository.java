package cc.lylllcc.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by lylllcc on 2017/4/1.
 */
public interface FeedBackRepository extends CrudRepository<FeedBack,Integer>{
    Iterable<FeedBack> findByOrderByIdDesc();
}
