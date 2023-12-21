package com.example.study_shopping_kotlin.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.study_shopping_kotlin.data.ShopListRepositoryImp
import com.example.study_shopping_kotlin.domain.DeleteShopItemUseCase
import com.example.study_shopping_kotlin.domain.EditShopItemUseCase
import com.example.study_shopping_kotlin.domain.GetShopListUseCase
import com.example.study_shopping_kotlin.domain.shop_item

class MainViewModel:ViewModel() {

    private  val repository = ShopListRepositoryImp

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val  editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = MutableLiveData<List<shop_item>>()

    fun getShopList() {
       val list =   getShopListUseCase.getShopListUseCase()
        shopList.value = list
    }

    fun deleteShopList(shopItem: shop_item) {
       deleteShopItemUseCase.deleteShopItemUseCase(shopItem)
        getShopList()

    }
    fun changeEnabledItem(shopItem: shop_item){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItemUseCase(newItem)
        getShopList()
    }


}