package com.example.study_shopping_kotlin.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItemUseCase(shopItem: shop_item){
            shopListRepository.editShopItemUseCase(shopItem)
    }
}