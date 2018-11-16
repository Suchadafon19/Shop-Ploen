import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import ProductDetail from './views/ProductDetail.vue'
import Basket from './views/Basket.vue'
import AddressField from './views/Address.vue'
import Payment from './views/Payment.vue'
import PaymentSuccess from './views/PaymentSuccess.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/productDetail',
      name: 'productDetail',
      component: ProductDetail
    },
    {
      path: '/basket',
      name: 'basket',
      component: Basket
    },
    {
      path: '/addressField',
      name: 'addressField',
      component: AddressField
    },
    {
      path: '/payment',
      name: 'payment',
      component: Payment
    },
    {
      path: '/paymentSuccess',
      name: 'paymentSuccess',
      component: PaymentSuccess
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () => import(/* webpackChunkName: "about" */ './views/About.vue')
    }
  ]
})
