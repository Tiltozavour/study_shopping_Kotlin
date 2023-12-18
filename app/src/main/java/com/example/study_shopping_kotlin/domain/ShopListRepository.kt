package com.example.study_shopping_kotlin.domain

interface ShopListRepository {
    fun addShopItemUseCase(shopItem: shop_item)

    fun deleteShopItemUseCase(shopItem: shop_item)

    fun editShopItemUseCase(shopItem: shop_item)

    fun getShopItemUseCase(shopItemId: Int): shop_item

    fun getShopListUseCase(): List<shop_item>
}
