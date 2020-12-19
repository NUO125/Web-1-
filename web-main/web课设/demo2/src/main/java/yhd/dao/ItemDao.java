package wz.dao;

import wz.vo.Item;

public interface ItemDao {
    int insertItem(Item item);
    int checkItemNo(String itemNo);
    int checkBarcode(String barcode);
}
