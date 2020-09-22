import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/register',
    name: 'Register',
    component: () => import('../views/register/Register.vue'),
    children: [
      {
        path: 'syarat',
        name: 'Syarat',
        component: () => import('../views/register/Syarat.vue')
      },
      {
        path: 'formulir',
        name: 'Formulir',
        component: () => import('../views/register/Formulir.vue')
      }
    ]
  },
  {
    path: '/admin',
    name: 'Login',
    component: () => import('../views/Login.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
