package com.example.study_shopping_kotlin.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopItemUseCase(shopItem: shop_item) {
            shopListRepository.addShopItemUseCase(shopItem)
    }
}