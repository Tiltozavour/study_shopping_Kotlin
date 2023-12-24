package com.example.study_shopping_kotlin.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopListUseCase(): LiveData<List<shop_item>> {
      return  shopListRepository.getShopListUseCase()
    }
}