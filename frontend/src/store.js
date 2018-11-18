import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    viewProductNo: 0
  },
  mutations: {
    viewProductDetail(state, productNo){
      console.log('pro no'+productNo)
      state.viewProductNo = productNo
    }
  },
  actions: {

  }
})
