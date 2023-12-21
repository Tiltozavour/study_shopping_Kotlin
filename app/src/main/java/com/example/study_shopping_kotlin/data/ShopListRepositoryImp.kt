package com.example.study_shopping_kotlin.data

import com.example.study_shopping_kotlin.domain.ShopListRepository
import com.example.study_shopping_kotlin.domain.shop_item

object  ShopListRepositoryImp:ShopListRepository {

    private val shopList = mutableListOf<shop_item>()

    private var autoIncrementId = 0

    init {
        for (i in 0 until 10 ) {
            val item = shop_item("Name $i", i, true)
            addShopItemUseCase(item)
        }

    }



    override fun addShopItemUseCase(shopItem: shop_item) {
        if (shopItem.id == shop_item.UNDENTIFIED_ID){
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

   override fun deleteShopItemUseCase(shopItem: shop_item) {
        shopList.remove(shopItem)

    }

    override fun editShopItemUseCase(shopItem: shop_item) {
        val oldElement = getShopItemUseCase(shopItem.id)
        shopList.remove(oldElement)
        addShopItemUseCase(shopItem)
    }

    override fun getShopItemUseCase(shopItemId: Int): shop_item {
        return  shopList.find {
            it.id==shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found}")
    }

    override fun getShopListUseCase(): List<shop_item> {
        return shopList.toList()
    }


}