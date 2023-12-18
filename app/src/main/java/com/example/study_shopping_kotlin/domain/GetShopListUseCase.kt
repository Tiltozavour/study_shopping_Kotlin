package com.example.study_shopping_kotlin.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopListUseCase(): List<shop_item> {
      return shopListRepository.getShopListUseCase()
    }
}