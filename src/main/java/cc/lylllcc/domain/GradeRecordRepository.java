package cc.lylllcc.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by lylllcc on 2017/3/30.
 */
public interface GradeRecordRepository extends CrudRepository<GradeRecord,Integer>{
    Iterable<GradeRecord> findTop30ByUsernameOrderByIdDesc(String username);
    Iterable<GradeRecord> findTop10ByUsernameOrderByIdDesc(String username);
    Iterable<GradeRecord> findByUsernameOrderByIdDesc(String username);
}
