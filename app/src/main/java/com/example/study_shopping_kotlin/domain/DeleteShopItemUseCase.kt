package com.example.study_shopping_kotlin.domain

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun deleteShopItemUseCase(shopItem: shop_item){
        shopListRepository.deleteShopItemUseCase(shopItem)
    }
}