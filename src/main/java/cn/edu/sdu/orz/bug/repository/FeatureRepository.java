package cn.edu.sdu.orz.bug.repository;

import cn.edu.sdu.orz.bug.entity.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Feature Repository
 */
@SuppressWarnings("unused")
public interface FeatureRepository extends JpaRepository<Feature, String>, JpaSpecificationExecutor<Feature> {

}