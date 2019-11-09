package com.pmo.app.repository.search;
import com.pmo.app.domain.Region;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Region} entity.
 */
public interface RegionSearchRepository extends ElasticsearchRepository<Region, String> {
}
