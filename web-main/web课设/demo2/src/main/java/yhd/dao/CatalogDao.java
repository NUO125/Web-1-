package wz.dao;

import wz.vo.Catalog;

import java.util.List;

public interface CatalogDao {
    List<Catalog> selectCatalogOne(); // 查询一级栏目
    List<Catalog> selectCatalogTwoByPid(Integer pId);
}
