package com.hematac.fencingstats.repository.boutinforepository.boutrepository;

import com.hematac.fencingstats.models.boutinfos.Bout;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoutRepository extends PagingAndSortingRepository<Bout, Long> {

    boolean existsById(long id);
    Bout findById(long id);
    List<Bout> findAll();
    List<Bout> findAllByOrderByDateTimeOfBoutDesc(Pageable pageable);
    List<Bout> findDistinctByFencers_NameContainingIgnoreCaseOrderByDateTimeOfBoutDesc(String filterWord, Pageable pageable);
    List<Bout> findDistinctByFencers_NameContainingAndFencers_NameContainingAllIgnoreCaseOrderByDateTimeOfBoutDesc(String filterWord1, String filterWord2, Pageable pageable);

/*    List<Bout> filteredBouts= boutService.getAll(pageId)
            .stream()
            .filter(b -> b.getFencerOne().getBoutSchemeType().toLowerCase().contains(fencerName)
                    || b.getFencerTwo().getBoutSchemeType().toLowerCase().contains(fencerName)).collect(Collectors.toList());
            model.addAttribute("bouts", boutService.getDtosFromEntities(filteredBouts));*/
}
