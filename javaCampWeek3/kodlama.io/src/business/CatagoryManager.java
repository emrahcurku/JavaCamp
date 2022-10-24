package business;

import core.logging.Logger;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.List;

public class CatagoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;
    private List<Category> categories;

    public CatagoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }
  public void add(Category category) throws Exception {
      for (Category category1: categories)
      {
       if (category1.getCategoryName()== category.getCategoryName())
       {
           throw new Exception("Bu isimde kategori vardır!");
       }
      }
      categoryDao.add(category);
      categories.add(category);
      for (Logger logger: loggers)
      {
          logger.log(category.getCategoryName());
      }
  }

}
