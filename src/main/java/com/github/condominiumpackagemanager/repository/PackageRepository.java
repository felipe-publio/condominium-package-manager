package com.github.condominiumpackagemanager.repository;

import com.github.condominiumpackagemanager.model.PackageEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "package", path = "package")
public interface PackageRepository extends PagingAndSortingRepository<PackageEntity, Long> {
}
