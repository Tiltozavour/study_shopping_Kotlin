package com.example.study_shopping_kotlin.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemUseCase(shopItemId: Int): shop_item {
        return shopListRepository.getShopItemUseCase(shopItemId)
    }

}


