import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    viewProductNo: 0,
    cart: [],
    cartCount: 0,
    totalPrice: 0
    
  },
  mutations: {
    viewProductDetail(state, productNo){
      console.log('pro no'+productNo)
      state.viewProductNo = productNo
    },
    addToCart(state, item) {
      let found = state.cart.find(product => product.productNo == item.productNo);
      if (found) {
          found.quantity ++;
          found.totalPrice = found.quantity * found.price;
      } else {
          state.cart.push(item);
  
          Vue.set(item, 'quantity', 1);
          Vue.set(item, 'totalPrice', item.price);
      }
      state.cartCount++;
    },
    keepTotalPrice(state, total){
      state.totalPrice = total
      console.log('total'+total)
    }
  },
  actions: {

  }
})
